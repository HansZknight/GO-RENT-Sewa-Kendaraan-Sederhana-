<!doctype html>
<html lang="id">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width,initial-scale=1" />
  <title>GO-RENT — Cyberpunk Neon README</title>
  <link href="https://fonts.googleapis.com/css2?family=Orbitron:wght@400;700;900&family=Inter:wght@300;400;600;700&display=swap" rel="stylesheet">
  <meta name="theme-color" content="#030315">
  <style>
    :root{
      --bg:#06060a;
      --glass: rgba(255,255,255,0.03);
      --neon1:#00f0ff; /* cyan */
      --neon2:#ff00f7; /* pink */
      --neon3:#8a2be2; /* purple */
      --card:#0b0b12;
      --accent-grad: linear-gradient(90deg,var(--neon1),var(--neon2),var(--neon3));
      --mono: 'Orbitron', sans-serif;
      --ui: 'Inter', sans-serif;
    }
    *{box-sizing:border-box}
    html,body{height:100%;background:radial-gradient(ellipse at 20% 10%, rgba(0,240,255,0.03), transparent 8%), radial-gradient(ellipse at 90% 90%, rgba(255,0,247,0.03), transparent 8%), var(--bg);color:#dbeafe;font-family:var(--ui);margin:0}
    .wrap{max-width:1100px;margin:32px auto;padding:28px;border-radius:16px;background:linear-gradient(180deg, rgba(255,255,255,0.02), rgba(255,255,255,0.01));box-shadow: 0 6px 30px rgba(2,6,23,0.7);border:1px solid rgba(255,255,255,0.03)}
    header{display:flex;gap:18px;align-items:center}
    .logo{width:96px;height:96px;border-radius:12px;background:linear-gradient(135deg, rgba(0,240,255,0.12), rgba(255,0,247,0.09));display:flex;align-items:center;justify-content:center;flex-shrink:0;box-shadow: 0 6px 30px rgba(0,0,0,0.6);border:1px solid rgba(255,255,255,0.04)}
    .logo h1{font-family:var(--mono);font-size:18px;color:var(--neon1);margin:0;letter-spacing:1px;text-shadow:0 0 10px rgba(0,240,255,0.18)}
    .title{flex:1}
    .title h2{margin:0;font-family:var(--mono);font-weight:700;letter-spacing:1px;font-size:26px;color:transparent;background:var(--accent-grad);-webkit-background-clip:text;background-clip:text}
    .title p{margin:6px 0 0;color:#9fb0d9;font-size:13px}

    .meta{display:flex;gap:12px;flex-wrap:wrap;margin-top:14px}
    .chip{padding:8px 12px;border-radius:999px;background:linear-gradient(90deg, rgba(255,255,255,0.02), rgba(255,255,255,0.01));border:1px solid rgba(255,255,255,0.03);font-size:13px;color:#cfefff}

    .grid{display:grid;grid-template-columns:1fr 340px;gap:20px;margin-top:22px}

    .card{background:var(--card);border-radius:12px;padding:18px;border:1px solid rgba(255,255,255,0.03);box-shadow:inset 0 1px 0 rgba(255,255,255,0.02)}
    h3{margin:0 0 10px;font-family:var(--mono);font-weight:700;color:var(--neon2)}
    p.lead{color:#c8dff7;line-height:1.5}

    .menu{display:flex;flex-direction:column;gap:8px}
    .menu .item{display:flex;justify-content:space-between;align-items:center;padding:10px 12px;border-radius:8px;background:linear-gradient(90deg, rgba(255,255,255,0.01), transparent);border:1px solid rgba(255,255,255,0.02)}
    .menu .item .label{font-weight:600}
    .menu .item .badge{padding:5px 8px;border-radius:6px;background:linear-gradient(90deg,var(--neon1),var(--neon2));font-weight:700;color:#041024}

    pre.code{background:linear-gradient(180deg, rgba(2,6,23,0.6), rgba(2,6,23,0.5));padding:16px;border-radius:10px;overflow:auto;border:1px solid rgba(255,255,255,0.02);font-family:ui-monospace, SFMono-Regular, Menlo, Monaco, "Roboto Mono", monospace;font-size:13px;color:#e6f6ff}
    code{color:#bfefff}

    .split{display:grid;grid-template-columns:1fr 1fr;gap:10px}

    .glow{position:relative}
    .glow:after{content:'';position:absolute;inset:-2px;border-radius:12px;filter:blur(12px);background:linear-gradient(90deg,var(--neon1),var(--neon2));opacity:0.12;pointer-events:none}

    footer{margin-top:18px;display:flex;justify-content:space-between;align-items:center;gap:10px}
    .cta{padding:10px 14px;border-radius:10px;background:linear-gradient(90deg,var(--neon2),var(--neon1));font-weight:700;color:#021024;border:none;cursor:pointer}

    .tagline{font-size:12px;color:#9fb0d9}

    /* responsive */
    @media (max-width:940px){.grid{grid-template-columns:1fr}.logo{width:72px;height:72px}.title h2{font-size:20px}}

    /* animated glitch heading */
    .cyber-title{font-family:var(--mono);font-size:28px;line-height:1;margin:0;position:relative}
    .cyber-title span{position:relative;display:inline-block}
    .cyber-title .g1{color:var(--neon1);transform:translateX(0);mix-blend-mode:screen}
    .cyber-title .g2{color:var(--neon2);position:absolute;left:2px;top:-2px;clip-path:inset(0 0 50% 0);opacity:0.9;animation:glitch 2.8s infinite}
    @keyframes glitch{0%{transform:translate(0,0)}20%{transform:translate(-2px,1px)}40%{transform:translate(2px,-1px)}60%{transform:translate(-1px,2px)}80%{transform:translate(1px,-2px)}100%{transform:translate(0,0)}}

    /* glowing divider */
    .divider{height:3px;border-radius:4px;background:var(--accent-grad);box-shadow:0 6px 30px rgba(122,0,255,0.12);margin:18px 0}

    .ks{font-size:13px;color:#9fb0d9}

    .download{display:inline-flex;gap:8px;align-items:center;padding:8px 12px;border-radius:10px;background:transparent;border:1px solid rgba(255,255,255,0.04);cursor:pointer}
  </style>
</head>
<body>
  <div class="wrap">
    <header>
      <div class="logo">
        <h1>GO-RENT</h1>
      </div>
      <div class="title">
        <h2 class="cyber-title"><span class="g1">GO-RENT</span> <span class="g2">NEON</span></h2>
        <p class="ks">Java Console · Smart Rental Engine · Cyberpunk Themed README</p>
        <div class="meta">
          <div class="chip">Status: <strong>Alpha · Demo</strong></div>
          <div class="chip">Language: Java</div>
          <div class="chip">License: MIT</div>
        </div>
      </div>
      <div style="width:120px;text-align:right">
        <button class="cta" onclick="document.getElementById('preview').scrollIntoView({behavior:'smooth'})">Preview</button>
      </div>
    </header>

    <div class="divider"></div>

    <div class="grid">
      <main>
        <section class="card glow">
          <h3>🚀 Ringkasan</h3>
          <p class="lead">GO-RENT adalah aplikasi rental kendaraan (mobil & motor) berbasis Java console. Ringkas, cepat, dan dirancang sebagai pondasi untuk sistem rental skala besar. Cocok untuk tugas, prototipe, atau porting ke aplikasi GUI/WEB.</p>

          <div style="margin-top:12px">
            <h3>⚙️ Fitur Utama</h3>
            <div class="split">
              <div>
                <ul>
                  <li>Menu navigasi interaktif (console)</li>
                  <li>Penyewaan mobil & motor</li>
                  <li>Perhitungan diskon otomatis (>=3 hari = 10%, >=7 hari = 15%)</li>
                  <li>Validasi input & stok</li>
                </ul>
              </div>
              <div>
                <ul>
                  <li>Hitung tanggal kembali manual (tanpa library)</li>
                  <li>Riwayat transaksi (max 100 entry)</li>
                  <li>Struk pembayaran dengan detail</li>
                </ul>
              </div>
            </div>
          </div>

        </section>

        <section class="card" style="margin-top:14px">
          <h3>📥 Cara Kompilasi & Menjalankan</h3>
          <pre class="code">$ git clone https://github.com/yourusername/GoRent.git
$ cd GoRent
$ javac TBPDDPUAS.java
$ java TBPDDPUAS</pre>
        </section>

        <section id="preview" class="card" style="margin-top:14px">
          <h3>🖥️ Preview CLI</h3>
          <pre class="code">==============================
   GO-RENT — NEON TERMINAL
==============================

[1] SEWA MOBIL
[2] SEWA MOTOR
[3] CEK STOK UNIT
[4] RIWAYAT TRANSAKSI
[5] KELUAR
==============================
</pre>
          <p class="ks">Tip: Jalankan di terminal dengan font monospaced (contoh: "Fira Code" atau "JetBrains Mono") untuk hasil paling estetis.</p>
        </section>

        <section class="card" style="margin-top:14px">
          <h3>🧭 Roadmap</h3>
          <ul>
            <li>Integrasi database (MySQL / SQLite)</li>
            <li>Export struk ke PDF</li>
            <li>GUI Neon (JavaFX) dengan tema cyber</li>
            <li>API untuk integrasi pembayaran</li>
          </ul>
        </section>

      </main>

      <aside>
        <div class="card">
          <h3>📌 Quick Menu</h3>
          <div class="menu" style="margin-top:8px">
            <div class="item"><div class="label">1. SEWA MOBIL</div><div class="badge">CORE</div></div>
            <div class="item"><div class="label">2. SEWA MOTOR</div><div class="badge">CORE</div></div>
            <div class="item"><div class="label">3. CEK STOK UNIT</div><div class="badge">UTIL</div></div>
            <div class="item"><div class="label">4. RIWAYAT TRANSAKSI</div><div class="badge">LOG</div></div>
            <div class="item"><div class="label">5. KELUAR</div><div class="badge">UX</div></div>
          </div>

          <div style="margin-top:12px">
            <button class="download" id="copyBtn">Copy README (HTML)</button>
          </div>

        </div>

        <div class="card" style="margin-top:12px">
          <h3>🔒 License</h3>
          <p class="ks">MIT — bebas digunakan, dimodifikasi, dan didistribusikan. Sertakan atribusi.</p>
        </div>

        <div class="card" style="margin-top:12px">
          <h3>👤 Author</h3>
          <p class="ks">Hans / Sirhan Muzaffar — Mahasiswa TI · Cyberpunk Aesthetic Lover</p>
          <div style="margin-top:8px;display:flex;gap:8px">
            <a href="#" class="chip">GitHub</a>
            <a href="#" class="chip">Instagram</a>
          </div>
        </div>
      </aside>
    </div>

    <footer>
      <div class="tagline">Made with ♥︎ · Neon vibes · Java Console</div>
      <div style="display:flex;gap:8px">
        <button class="cta" onclick="downloadHTML()">Download HTML</button>
      </div>
    </footer>
  </div>

  <script>
    // copy current HTML to clipboard
    document.getElementById('copyBtn').addEventListener('click', async ()=>{
      try{
        const html = document.documentElement.outerHTML;
        await navigator.clipboard.writeText(html);
        alert('HTML README copied to clipboard — paste into a .html file!');
      }catch(e){
        alert('Gagal menyalin. Silakan gunakan Save Page As.');
      }
    });

    // download as file
    function downloadHTML(){
      const blob = new Blob([document.documentElement.outerHTML], {type: 'text/html'});
      const url = URL.createObjectURL(blob);
      const a = document.createElement('a');
      a.href = url;
      a.download = 'README_GoRent_Cyberpunk.html';
      document.body.appendChild(a);
      a.click();
      a.remove();
      URL.revokeObjectURL(url);
    }
  </script>
</body>
</html>
