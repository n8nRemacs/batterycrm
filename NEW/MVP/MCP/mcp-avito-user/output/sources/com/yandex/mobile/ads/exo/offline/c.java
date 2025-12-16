package com.yandex.mobile.ads.exo.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.yandex.mobile.ads.exo.offline.a;
import com.yandex.mobile.ads.exo.offline.d;
import com.yandex.mobile.ads.exo.scheduler.Requirements;
import com.yandex.mobile.ads.impl.Cif;
import com.yandex.mobile.ads.impl.ch;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.fz0;
import com.yandex.mobile.ads.impl.gn;
import com.yandex.mobile.ads.impl.il1;
import com.yandex.mobile.ads.impl.ka0;
import com.yandex.mobile.ads.impl.om1;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.pr;
import com.yandex.mobile.ads.impl.qo;
import com.yandex.mobile.ads.impl.qr;
import com.yandex.mobile.ads.impl.rr;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.yg;
import j.P;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: j, reason: collision with root package name */
    public static final Requirements f383102j = new Requirements(1);

    /* renamed from: a, reason: collision with root package name */
    private final b f383103a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArraySet<InterfaceC10972c> f383104b;

    /* renamed from: c, reason: collision with root package name */
    private int f383105c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f383106d;

    /* renamed from: e, reason: collision with root package name */
    private int f383107e;

    /* renamed from: f, reason: collision with root package name */
    private int f383108f;

    /* renamed from: g, reason: collision with root package name */
    private int f383109g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f383110h;

    /* renamed from: i, reason: collision with root package name */
    private List<com.yandex.mobile.ads.exo.offline.b> f383111i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.yandex.mobile.ads.exo.offline.b f383112a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f383113b;

        /* renamed from: c, reason: collision with root package name */
        public final List<com.yandex.mobile.ads.exo.offline.b> f383114c;

        public a(com.yandex.mobile.ads.exo.offline.b bVar, boolean z12, ArrayList arrayList, @P Exception exc) {
            this.f383112a = bVar;
            this.f383113b = z12;
            this.f383114c = arrayList;
        }
    }

    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final HandlerThread f383115a;

        /* renamed from: b, reason: collision with root package name */
        private final om1 f383116b;

        /* renamed from: c, reason: collision with root package name */
        private final rr f383117c;

        /* renamed from: d, reason: collision with root package name */
        private final Handler f383118d;

        /* renamed from: e, reason: collision with root package name */
        private final ArrayList<com.yandex.mobile.ads.exo.offline.b> f383119e;

        /* renamed from: f, reason: collision with root package name */
        private final HashMap<String, d> f383120f;

        /* renamed from: g, reason: collision with root package name */
        private int f383121g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f383122h;

        /* renamed from: i, reason: collision with root package name */
        private int f383123i;

        /* renamed from: j, reason: collision with root package name */
        private int f383124j;

        /* renamed from: k, reason: collision with root package name */
        private int f383125k;

        public b(HandlerThread handlerThread, com.yandex.mobile.ads.exo.offline.a aVar, qo qoVar, Handler handler, int i12, int i13, boolean z12) {
            super(handlerThread.getLooper());
            this.f383115a = handlerThread;
            this.f383116b = aVar;
            this.f383117c = qoVar;
            this.f383118d = handler;
            this.f383123i = i12;
            this.f383124j = i13;
            this.f383122h = z12;
            this.f383119e = new ArrayList<>();
            this.f383120f = new HashMap<>();
        }

        private void a() {
            ArrayList arrayList = new ArrayList();
            try {
                pr prVarA = ((com.yandex.mobile.ads.exo.offline.a) this.f383116b).a(3, 4);
                while (true) {
                    try {
                        a.C10971a c10971a = (a.C10971a) prVarA;
                        if (!c10971a.moveToPosition(c10971a.getPosition() + 1)) {
                            break;
                        } else {
                            arrayList.add(((a.C10971a) prVarA).a());
                        }
                    } finally {
                    }
                }
                ((a.C10971a) prVarA).close();
            } catch (IOException unused) {
                ka0.b("DownloadManager", "Failed to load downloads.");
            }
            for (int i12 = 0; i12 < this.f383119e.size(); i12++) {
                ArrayList<com.yandex.mobile.ads.exo.offline.b> arrayList2 = this.f383119e;
                com.yandex.mobile.ads.exo.offline.b bVar = arrayList2.get(i12);
                arrayList2.set(i12, new com.yandex.mobile.ads.exo.offline.b(bVar.f383094a, 5, bVar.f383096c, System.currentTimeMillis(), bVar.f383098e, 0, 0, bVar.f383101h));
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ArrayList<com.yandex.mobile.ads.exo.offline.b> arrayList3 = this.f383119e;
                com.yandex.mobile.ads.exo.offline.b bVar2 = (com.yandex.mobile.ads.exo.offline.b) arrayList.get(i13);
                arrayList3.add(new com.yandex.mobile.ads.exo.offline.b(bVar2.f383094a, 5, bVar2.f383096c, System.currentTimeMillis(), bVar2.f383098e, 0, 0, bVar2.f383101h));
            }
            Collections.sort(this.f383119e, new g());
            try {
                ((com.yandex.mobile.ads.exo.offline.a) this.f383116b).c();
            } catch (IOException e12) {
                ka0.a("DownloadManager", "Failed to update index.", e12);
            }
            ArrayList arrayList4 = new ArrayList(this.f383119e);
            for (int i14 = 0; i14 < this.f383119e.size(); i14++) {
                this.f383118d.obtainMessage(2, new a(this.f383119e.get(i14), false, arrayList4, null)).sendToTarget();
            }
            b();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public final void handleMessage(Message message) throws IOException {
            pr prVarA = null;
            i = 0;
            int i12 = 0;
            switch (message.what) {
                case 0:
                    this.f383121g = message.arg1;
                    try {
                        ((com.yandex.mobile.ads.exo.offline.a) this.f383116b).b();
                        prVarA = ((com.yandex.mobile.ads.exo.offline.a) this.f383116b).a(0, 1, 2, 5, 7);
                    } catch (IOException e12) {
                        ka0.a("DownloadManager", "Failed to load index.", e12);
                        this.f383119e.clear();
                    } finally {
                        pc1.a((Closeable) prVarA);
                    }
                    while (true) {
                        a.C10971a c10971a = (a.C10971a) prVarA;
                        if (!c10971a.moveToPosition(c10971a.getPosition() + 1)) {
                            this.f383118d.obtainMessage(0, new ArrayList(this.f383119e)).sendToTarget();
                            b();
                            i12 = 1;
                            this.f383118d.obtainMessage(1, i12, this.f383120f.size()).sendToTarget();
                            return;
                        }
                        this.f383119e.add(((a.C10971a) prVarA).a());
                    }
                case 1:
                    this.f383122h = message.arg1 != 0;
                    b();
                    i12 = 1;
                    this.f383118d.obtainMessage(1, i12, this.f383120f.size()).sendToTarget();
                    return;
                case 2:
                    this.f383121g = message.arg1;
                    b();
                    i12 = 1;
                    this.f383118d.obtainMessage(1, i12, this.f383120f.size()).sendToTarget();
                    return;
                case 3:
                    String str = (String) message.obj;
                    int i13 = message.arg1;
                    if (str == null) {
                        for (int i14 = 0; i14 < this.f383119e.size(); i14++) {
                            com.yandex.mobile.ads.exo.offline.b bVar = this.f383119e.get(i14);
                            if (i13 == 0) {
                                if (bVar.f383095b == 1) {
                                    a(bVar, 0, 0);
                                }
                            } else if (i13 != bVar.f383099f) {
                                int i15 = bVar.f383095b;
                                a(new com.yandex.mobile.ads.exo.offline.b(bVar.f383094a, (i15 == 0 || i15 == 2) ? 1 : i15, bVar.f383096c, System.currentTimeMillis(), bVar.f383098e, i13, 0, bVar.f383101h));
                            }
                        }
                        try {
                            ((com.yandex.mobile.ads.exo.offline.a) this.f383116b).a(i13);
                        } catch (IOException e13) {
                            ka0.a("DownloadManager", "Failed to set manual stop reason", e13);
                        }
                    } else {
                        com.yandex.mobile.ads.exo.offline.b bVarA = a(str, false);
                        if (bVarA == null) {
                            try {
                                ((com.yandex.mobile.ads.exo.offline.a) this.f383116b).a(i13, str);
                            } catch (IOException e14) {
                                ka0.a("DownloadManager", "Failed to set manual stop reason: ".concat(str), e14);
                            }
                        } else if (i13 == 0) {
                            if (bVarA.f383095b == 1) {
                                a(bVarA, 0, 0);
                            }
                        } else if (i13 != bVarA.f383099f) {
                            int i16 = bVarA.f383095b;
                            a(new com.yandex.mobile.ads.exo.offline.b(bVarA.f383094a, (i16 == 0 || i16 == 2) ? 1 : i16, bVarA.f383096c, System.currentTimeMillis(), bVarA.f383098e, i13, 0, bVarA.f383101h));
                        }
                    }
                    b();
                    i12 = 1;
                    this.f383118d.obtainMessage(1, i12, this.f383120f.size()).sendToTarget();
                    return;
                case 4:
                    this.f383123i = message.arg1;
                    b();
                    i12 = 1;
                    this.f383118d.obtainMessage(1, i12, this.f383120f.size()).sendToTarget();
                    return;
                case 5:
                    this.f383124j = message.arg1;
                    i12 = 1;
                    this.f383118d.obtainMessage(1, i12, this.f383120f.size()).sendToTarget();
                    return;
                case 6:
                    DownloadRequest downloadRequest = (DownloadRequest) message.obj;
                    int i17 = message.arg1;
                    com.yandex.mobile.ads.exo.offline.b bVarA2 = a(downloadRequest.f383070a, true);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (bVarA2 != null) {
                        int i18 = bVarA2.f383095b;
                        a(new com.yandex.mobile.ads.exo.offline.b(bVarA2.f383094a.a(downloadRequest), (i18 == 5 || i18 == 7) ? 7 : i17 != 0 ? 1 : 0, (i18 == 5 || i18 == 3 || i18 == 4) ? jCurrentTimeMillis : bVarA2.f383096c, jCurrentTimeMillis, i17));
                    } else {
                        a(new com.yandex.mobile.ads.exo.offline.b(downloadRequest, i17 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, i17));
                    }
                    b();
                    i12 = 1;
                    this.f383118d.obtainMessage(1, i12, this.f383120f.size()).sendToTarget();
                    return;
                case 7:
                    String str2 = (String) message.obj;
                    com.yandex.mobile.ads.exo.offline.b bVarA3 = a(str2, true);
                    if (bVarA3 == null) {
                        ka0.b("DownloadManager", "Failed to remove nonexistent download: " + str2);
                    } else {
                        a(bVarA3, 5, 0);
                        b();
                    }
                    i12 = 1;
                    this.f383118d.obtainMessage(1, i12, this.f383120f.size()).sendToTarget();
                    return;
                case 8:
                    a();
                    i12 = 1;
                    this.f383118d.obtainMessage(1, i12, this.f383120f.size()).sendToTarget();
                    return;
                case 9:
                    d dVar = (d) message.obj;
                    String str3 = dVar.f383126b.f383070a;
                    this.f383120f.remove(str3);
                    boolean z12 = dVar.f383129e;
                    if (!z12) {
                        int i19 = this.f383125k - 1;
                        this.f383125k = i19;
                        if (i19 == 0) {
                            removeMessages(11);
                        }
                    }
                    if (dVar.f383132h) {
                        b();
                    } else {
                        Exception exc = dVar.f383133i;
                        if (exc != null) {
                            StringBuilder sbA = Cif.a("Task failed: ");
                            sbA.append(dVar.f383126b);
                            sbA.append(", ");
                            sbA.append(z12);
                            ka0.a("DownloadManager", sbA.toString(), exc);
                        }
                        com.yandex.mobile.ads.exo.offline.b bVarA4 = a(str3, false);
                        bVarA4.getClass();
                        int i22 = bVarA4.f383095b;
                        if (i22 == 2) {
                            db.b(!z12);
                            com.yandex.mobile.ads.exo.offline.b bVar2 = new com.yandex.mobile.ads.exo.offline.b(bVarA4.f383094a, exc == null ? 3 : 4, bVarA4.f383096c, System.currentTimeMillis(), bVarA4.f383098e, bVarA4.f383099f, exc == null ? 0 : 1, bVarA4.f383101h);
                            this.f383119e.remove(a(bVar2.f383094a.f383070a));
                            try {
                                ((com.yandex.mobile.ads.exo.offline.a) this.f383116b).a(bVar2);
                            } catch (IOException e15) {
                                ka0.a("DownloadManager", "Failed to update index.", e15);
                            }
                            this.f383118d.obtainMessage(2, new a(bVar2, false, new ArrayList(this.f383119e), exc)).sendToTarget();
                        } else {
                            if (i22 != 5 && i22 != 7) {
                                throw new IllegalStateException();
                            }
                            db.b(z12);
                            if (bVarA4.f383095b == 7) {
                                int i23 = bVarA4.f383099f;
                                a(bVarA4, i23 == 0 ? 0 : 1, i23);
                                b();
                            } else {
                                this.f383119e.remove(a(bVarA4.f383094a.f383070a));
                                try {
                                    ((com.yandex.mobile.ads.exo.offline.a) this.f383116b).c(bVarA4.f383094a.f383070a);
                                } catch (IOException unused) {
                                    ka0.b("DownloadManager", "Failed to remove from database");
                                }
                                this.f383118d.obtainMessage(2, new a(bVarA4, true, new ArrayList(this.f383119e), null)).sendToTarget();
                            }
                        }
                        b();
                    }
                    this.f383118d.obtainMessage(1, i12, this.f383120f.size()).sendToTarget();
                    return;
                case 10:
                    d dVar2 = (d) message.obj;
                    int i24 = message.arg1;
                    int i25 = message.arg2;
                    int i26 = pc1.f388768a;
                    long j12 = ((i24 & 4294967295L) << 32) | (4294967295L & i25);
                    com.yandex.mobile.ads.exo.offline.b bVarA5 = a(dVar2.f383126b.f383070a, false);
                    bVarA5.getClass();
                    if (j12 == bVarA5.f383098e || j12 == -1) {
                        return;
                    }
                    a(new com.yandex.mobile.ads.exo.offline.b(bVarA5.f383094a, bVarA5.f383095b, bVarA5.f383096c, System.currentTimeMillis(), j12, bVarA5.f383099f, bVarA5.f383100g, bVarA5.f383101h));
                    return;
                case 11:
                    for (int i27 = 0; i27 < this.f383119e.size(); i27++) {
                        com.yandex.mobile.ads.exo.offline.b bVar3 = this.f383119e.get(i27);
                        if (bVar3.f383095b == 2) {
                            try {
                                ((com.yandex.mobile.ads.exo.offline.a) this.f383116b).a(bVar3);
                            } catch (IOException e16) {
                                ka0.a("DownloadManager", "Failed to update index.", e16);
                            }
                        }
                    }
                    sendEmptyMessageDelayed(11, 5000L);
                    return;
                case 12:
                    Iterator<d> it = this.f383120f.values().iterator();
                    while (it.hasNext()) {
                        it.next().a(true);
                    }
                    try {
                        ((com.yandex.mobile.ads.exo.offline.a) this.f383116b).b();
                    } catch (IOException e17) {
                        ka0.a("DownloadManager", "Failed to update index.", e17);
                    }
                    this.f383119e.clear();
                    this.f383115a.quit();
                    synchronized (this) {
                        notifyAll();
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        private void b() {
            int i12 = 0;
            for (int i13 = 0; i13 < this.f383119e.size(); i13++) {
                com.yandex.mobile.ads.exo.offline.b bVar = this.f383119e.get(i13);
                d dVar = this.f383120f.get(bVar.f383094a.f383070a);
                int i14 = bVar.f383095b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            dVar.getClass();
                            db.b(!dVar.f383129e);
                            if (this.f383122h || this.f383121g != 0 || i12 >= this.f383123i) {
                                a(bVar, 0, 0);
                                dVar.a(false);
                            }
                        } else {
                            if (i14 != 5 && i14 != 7) {
                                throw new IllegalStateException();
                            }
                            if (dVar == null) {
                                d dVar2 = new d(bVar.f383094a, ((qo) this.f383117c).a(bVar.f383094a), bVar.f383101h, true, this.f383124j, this, 0);
                                this.f383120f.put(bVar.f383094a.f383070a, dVar2);
                                dVar2.start();
                            } else if (!dVar.f383129e) {
                                dVar.a(false);
                            }
                        }
                    } else if (dVar != null) {
                        db.b(!dVar.f383129e);
                        dVar.a(false);
                    }
                } else if (dVar != null) {
                    db.b(!dVar.f383129e);
                    dVar.a(false);
                } else if (this.f383122h || this.f383121g != 0 || this.f383125k >= this.f383123i) {
                    dVar = null;
                } else {
                    com.yandex.mobile.ads.exo.offline.b bVarA = a(bVar, 2, 0);
                    dVar = new d(bVarA.f383094a, ((qo) this.f383117c).a(bVarA.f383094a), bVarA.f383101h, false, this.f383124j, this, 0);
                    this.f383120f.put(bVarA.f383094a.f383070a, dVar);
                    int i15 = this.f383125k;
                    this.f383125k = i15 + 1;
                    if (i15 == 0) {
                        sendEmptyMessageDelayed(11, 5000L);
                    }
                    dVar.start();
                }
                if (dVar != null && !dVar.f383129e) {
                    i12++;
                }
            }
        }

        private com.yandex.mobile.ads.exo.offline.b a(com.yandex.mobile.ads.exo.offline.b bVar, int i12, int i13) {
            db.b((i12 == 3 || i12 == 4) ? false : true);
            return a(new com.yandex.mobile.ads.exo.offline.b(bVar.f383094a, i12, bVar.f383096c, System.currentTimeMillis(), bVar.f383098e, i13, 0, bVar.f383101h));
        }

        private com.yandex.mobile.ads.exo.offline.b a(com.yandex.mobile.ads.exo.offline.b bVar) {
            int i12 = bVar.f383095b;
            db.b((i12 == 3 || i12 == 4) ? false : true);
            int iA2 = a(bVar.f383094a.f383070a);
            if (iA2 == -1) {
                this.f383119e.add(bVar);
                Collections.sort(this.f383119e, new g());
            } else {
                boolean z12 = bVar.f383096c != this.f383119e.get(iA2).f383096c;
                this.f383119e.set(iA2, bVar);
                if (z12) {
                    Collections.sort(this.f383119e, new g());
                }
            }
            try {
                ((com.yandex.mobile.ads.exo.offline.a) this.f383116b).a(bVar);
            } catch (IOException e12) {
                ka0.a("DownloadManager", "Failed to update index.", e12);
            }
            this.f383118d.obtainMessage(2, new a(bVar, false, new ArrayList(this.f383119e), null)).sendToTarget();
            return bVar;
        }

        @P
        private com.yandex.mobile.ads.exo.offline.b a(String str, boolean z12) {
            int iA2 = a(str);
            if (iA2 != -1) {
                return this.f383119e.get(iA2);
            }
            if (!z12) {
                return null;
            }
            try {
                return ((com.yandex.mobile.ads.exo.offline.a) this.f383116b).b(str);
            } catch (IOException e12) {
                ka0.a("DownloadManager", "Failed to load download: " + str, e12);
                return null;
            }
        }

        private int a(String str) {
            for (int i12 = 0; i12 < this.f383119e.size(); i12++) {
                if (this.f383119e.get(i12).f383094a.f383070a.equals(str)) {
                    return i12;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int a(com.yandex.mobile.ads.exo.offline.b bVar, com.yandex.mobile.ads.exo.offline.b bVar2) {
            long j12 = bVar.f383096c;
            long j13 = bVar2.f383096c;
            int i12 = pc1.f388768a;
            if (j12 < j13) {
                return -1;
            }
            return j12 == j13 ? 0 : 1;
        }
    }

    public static class d extends Thread implements d.a {

        /* renamed from: b, reason: collision with root package name */
        private final DownloadRequest f383126b;

        /* renamed from: c, reason: collision with root package name */
        private final com.yandex.mobile.ads.exo.offline.d f383127c;

        /* renamed from: d, reason: collision with root package name */
        private final qr f383128d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f383129e;

        /* renamed from: f, reason: collision with root package name */
        private final int f383130f;

        /* renamed from: g, reason: collision with root package name */
        @P
        private volatile b f383131g;

        /* renamed from: h, reason: collision with root package name */
        private volatile boolean f383132h;

        /* renamed from: i, reason: collision with root package name */
        @P
        private Exception f383133i;

        /* renamed from: j, reason: collision with root package name */
        private long f383134j;

        public /* synthetic */ d(DownloadRequest downloadRequest, com.yandex.mobile.ads.exo.offline.d dVar, qr qrVar, boolean z12, int i12, b bVar, int i13) {
            this(downloadRequest, dVar, qrVar, z12, i12, bVar);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws InterruptedException, IOException {
            try {
                if (this.f383129e) {
                    this.f383127c.remove();
                } else {
                    long j12 = -1;
                    int i12 = 0;
                    while (!this.f383132h) {
                        try {
                            this.f383127c.a(this);
                            break;
                        } catch (IOException e12) {
                            if (!this.f383132h) {
                                long j13 = this.f383128d.f389282a;
                                if (j13 != j12) {
                                    i12 = 0;
                                    j12 = j13;
                                }
                                int i13 = i12 + 1;
                                if (i13 > this.f383130f) {
                                    throw e12;
                                }
                                Thread.sleep(Math.min(i12 * 1000, 5000));
                                i12 = i13;
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e13) {
                this.f383133i = e13;
            }
            b bVar = this.f383131g;
            if (bVar != null) {
                bVar.obtainMessage(9, this).sendToTarget();
            }
        }

        private d(DownloadRequest downloadRequest, com.yandex.mobile.ads.exo.offline.d dVar, qr qrVar, boolean z12, int i12, b bVar) {
            this.f383126b = downloadRequest;
            this.f383127c = dVar;
            this.f383128d = qrVar;
            this.f383129e = z12;
            this.f383130f = i12;
            this.f383131g = bVar;
            this.f383134j = -1L;
        }

        public final void a(boolean z12) {
            if (z12) {
                this.f383131g = null;
            }
            if (this.f383132h) {
                return;
            }
            this.f383132h = true;
            this.f383127c.cancel();
            interrupt();
        }

        public final void a(long j12, long j13, float f12) {
            this.f383128d.f389282a = j13;
            this.f383128d.f389283b = f12;
            if (j12 != this.f383134j) {
                this.f383134j = j12;
                b bVar = this.f383131g;
                if (bVar != null) {
                    bVar.obtainMessage(10, (int) (j12 >> 32), (int) j12, this).sendToTarget();
                }
            }
        }
    }

    public c(Context context, t61 t61Var, yg ygVar, gn.a aVar, ExecutorService executorService) {
        this(context, new com.yandex.mobile.ads.exo.offline.a(t61Var), new qo(new ch.b().a(ygVar).a(aVar), executorService));
    }

    private boolean b() {
        boolean z12;
        if (this.f383106d || this.f383109g == 0) {
            z12 = false;
        } else {
            for (int i12 = 0; i12 < this.f383111i.size(); i12++) {
                if (this.f383111i.get(i12).f383095b == 0) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        }
        boolean z13 = this.f383110h != z12;
        this.f383110h = z12;
        return z13;
    }

    public final void a(il1 il1Var) {
        this.f383104b.add(il1Var);
    }

    public final void a(InterfaceC10972c interfaceC10972c) {
        this.f383104b.remove(interfaceC10972c);
    }

    public final void a(DownloadRequest downloadRequest) {
        this.f383105c++;
        this.f383103a.obtainMessage(6, 0, 0, downloadRequest).sendToTarget();
    }

    public c(Context context, com.yandex.mobile.ads.exo.offline.a aVar, qo qoVar) {
        context.getApplicationContext();
        this.f383107e = 3;
        this.f383108f = 5;
        this.f383106d = true;
        this.f383111i = Collections.emptyList();
        this.f383104b = new CopyOnWriteArraySet<>();
        Handler handlerB = pc1.b(new Handler.Callback() { // from class: com.yandex.mobile.ads.exo.offline.f
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f383143b.a(message);
            }
        });
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        b bVar = new b(handlerThread, aVar, qoVar, handlerB, this.f383107e, this.f383108f, this.f383106d);
        this.f383103a = bVar;
        int iA2 = new fz0(context, new com.my.target.ads.a(this, 5)).a();
        this.f383109g = iA2;
        this.f383105c = 1;
        bVar.obtainMessage(0, iA2, 0).sendToTarget();
    }

    public final void a(String str) {
        this.f383105c++;
        this.f383103a.obtainMessage(7, str).sendToTarget();
    }

    public final void a() {
        if (this.f383106d) {
            this.f383106d = false;
            this.f383105c++;
            this.f383103a.obtainMessage(1, 0, 0).sendToTarget();
            boolean zB2 = b();
            Iterator<InterfaceC10972c> it = this.f383104b.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            if (zB2) {
                Iterator<InterfaceC10972c> it2 = this.f383104b.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(fz0 fz0Var, int i12) {
        fz0Var.getClass();
        if (this.f383109g != i12) {
            this.f383109g = i12;
            this.f383105c++;
            this.f383103a.obtainMessage(2, i12, 0).sendToTarget();
        }
        boolean zB2 = b();
        Iterator<InterfaceC10972c> it = this.f383104b.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        if (zB2) {
            Iterator<InterfaceC10972c> it2 = this.f383104b.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message) {
        int i12 = message.what;
        if (i12 == 0) {
            this.f383111i = Collections.unmodifiableList((List) message.obj);
            boolean zB2 = b();
            Iterator<InterfaceC10972c> it = this.f383104b.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            if (zB2) {
                Iterator<InterfaceC10972c> it2 = this.f383104b.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        } else if (i12 == 1) {
            int i13 = message.arg1;
            int i14 = message.arg2;
            int i15 = this.f383105c - i13;
            this.f383105c = i15;
            if (i14 == 0 && i15 == 0) {
                Iterator<InterfaceC10972c> it3 = this.f383104b.iterator();
                while (it3.hasNext()) {
                    it3.next().getClass();
                }
            }
        } else if (i12 == 2) {
            a aVar = (a) message.obj;
            this.f383111i = Collections.unmodifiableList(aVar.f383114c);
            com.yandex.mobile.ads.exo.offline.b bVar = aVar.f383112a;
            boolean zB3 = b();
            if (aVar.f383113b) {
                Iterator<InterfaceC10972c> it4 = this.f383104b.iterator();
                while (it4.hasNext()) {
                    it4.next().getClass();
                }
            } else {
                Iterator<InterfaceC10972c> it5 = this.f383104b.iterator();
                while (it5.hasNext()) {
                    it5.next().a(this, bVar);
                }
            }
            if (zB3) {
                Iterator<InterfaceC10972c> it6 = this.f383104b.iterator();
                while (it6.hasNext()) {
                    it6.next().getClass();
                }
            }
        } else {
            throw new IllegalStateException();
        }
        return true;
    }

    /* renamed from: com.yandex.mobile.ads.exo.offline.c$c, reason: collision with other inner class name */
    public interface InterfaceC10972c {
        default void a(c cVar, com.yandex.mobile.ads.exo.offline.b bVar) {
        }
    }
}
