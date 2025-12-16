package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.database.DatabaseIOException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class g25 extends Handler {
    public final HandlerThread a;
    public final ll4 b;
    public final ka5 c;
    public final Handler d;
    public final ArrayList e;
    public final HashMap f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public boolean l;

    public g25(HandlerThread handlerThread, ll4 ll4Var, ka5 ka5Var, Handler handler, boolean z) {
        super(handlerThread.getLooper());
        this.a = handlerThread;
        this.b = ll4Var;
        this.c = ka5Var;
        this.d = handler;
        this.i = 3;
        this.j = 5;
        this.h = z;
        this.e = new ArrayList();
        this.f = new HashMap();
    }

    public static xz4 a(xz4 xz4Var, int i, int i2) {
        return new xz4(xz4Var.a, i, xz4Var.c, System.currentTimeMillis(), xz4Var.e, i2, 0, xz4Var.h);
    }

    public final xz4 b(String str, boolean z) {
        int iC = c(str);
        if (iC != -1) {
            return (xz4) this.e.get(iC);
        }
        if (!z) {
            return null;
        }
        try {
            return this.b.d(str);
        } catch (IOException e) {
            a8i.h("DownloadManager", "Failed to load download: " + str, e);
            return null;
        }
    }

    public final int c(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((xz4) arrayList.get(i)).a.a.equals(str)) {
                return i;
            }
            i++;
        }
    }

    public final void d(xz4 xz4Var) {
        int i = xz4Var.b;
        hsi.g((i == 3 || i == 4) ? false : true);
        int iC = c(xz4Var.a.a);
        ArrayList arrayList = this.e;
        if (iC == -1) {
            arrayList.add(xz4Var);
            Collections.sort(arrayList, new o00(29));
        } else {
            boolean z = xz4Var.c != ((xz4) arrayList.get(iC)).c;
            arrayList.set(iC, xz4Var);
            if (z) {
                Collections.sort(arrayList, new o00(29));
            }
        }
        try {
            this.b.i(xz4Var);
        } catch (IOException e) {
            a8i.h("DownloadManager", "Failed to update index.", e);
        }
        this.d.obtainMessage(3, new f25(xz4Var, false, new ArrayList(arrayList), null)).sendToTarget();
    }

    public final xz4 e(xz4 xz4Var, int i, int i2) {
        hsi.g((i == 3 || i == 4) ? false : true);
        xz4 xz4VarA = a(xz4Var, i, i2);
        d(xz4VarA);
        return xz4VarA;
    }

    public final void f(xz4 xz4Var, int i) {
        if (i == 0) {
            if (xz4Var.b == 1) {
                e(xz4Var, 0, 0);
            }
        } else if (i != xz4Var.f) {
            int i2 = xz4Var.b;
            if (i2 == 0 || i2 == 2) {
                i2 = 1;
            }
            d(new xz4(xz4Var.a, i2, xz4Var.c, System.currentTimeMillis(), xz4Var.e, i, 0, xz4Var.h));
        }
    }

    public final void g() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return;
            }
            xz4 xz4Var = (xz4) arrayList.get(i);
            r25 r25Var = xz4Var.a;
            String str = r25Var.a;
            HashMap map = this.f;
            i25 i25Var = (i25) map.get(str);
            int i3 = xz4Var.b;
            ka5 ka5Var = this.c;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        i25Var.getClass();
                        hsi.g(!i25Var.d);
                        if (this.h || this.g != 0 || i2 >= this.i) {
                            e(xz4Var, 0, 0);
                            i25Var.a(false);
                        }
                    } else {
                        if (i3 != 5 && i3 != 7) {
                            throw new IllegalStateException();
                        }
                        if (i25Var != null) {
                            if (!i25Var.d) {
                                i25Var.a(false);
                            }
                        } else if (!this.l) {
                            i25 i25Var2 = new i25(xz4Var.a, ka5Var.g(r25Var), xz4Var.h, true, this.j, this);
                            map.put(r25Var.a, i25Var2);
                            this.l = true;
                            i25Var2.start();
                        }
                    }
                } else if (i25Var != null) {
                    hsi.g(!i25Var.d);
                    i25Var.a(false);
                }
            } else if (i25Var != null) {
                hsi.g(!i25Var.d);
                i25Var.a(false);
            } else if (this.h || this.g != 0 || this.k >= this.i) {
                i25Var = null;
            } else {
                xz4 xz4VarE = e(xz4Var, 2, 0);
                r25 r25Var2 = xz4VarE.a;
                i25 i25Var3 = new i25(xz4VarE.a, ka5Var.g(r25Var2), xz4VarE.h, false, this.j, this);
                map.put(r25Var2.a, i25Var3);
                int i4 = this.k;
                this.k = i4 + 1;
                if (i4 == 0) {
                    sendEmptyMessageDelayed(12, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
                }
                i25Var3.start();
                i25Var = i25Var3;
            }
            if (i25Var != null && !i25Var.d) {
                i2++;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.String] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        pk6 pk6Var;
        Cursor cursor;
        ?? arrayList;
        ll4 ll4Var;
        String str;
        int i = 7;
        pk6 pk6Var2 = null;
        pk6Var2 = null;
        pk6Var2 = null;
        pk6Var2 = null;
        pk6 pk6Var3 = null;
        pk6Var2 = null;
        pk6Var2 = null;
        pk6Var2 = null;
        pk6Var2 = null;
        pk6Var2 = null;
        pk6 pk6Var4 = null;
        pk6 pk6Var5 = null;
        i = 0;
        int i2 = 0;
        switch (message.what) {
            case 1:
                int i3 = message.arg1;
                ll4 ll4Var2 = this.b;
                ArrayList arrayList2 = this.e;
                this.g = i3;
                try {
                    try {
                        ll4Var2.k();
                        ll4Var2.b();
                        pk6Var = new pk6(i, ll4Var2.c(ll4.g(0, 1, 2, 5, 7), null));
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e) {
                    e = e;
                }
                while (true) {
                    try {
                        cursor = (Cursor) pk6Var.b;
                    } catch (IOException e2) {
                        e = e2;
                        pk6Var5 = pk6Var;
                        a8i.h("DownloadManager", "Failed to load index.", e);
                        arrayList2.clear();
                        zxg.g(pk6Var5);
                        pk6Var4 = pk6Var5;
                        this.d.obtainMessage(1, new ArrayList(arrayList2)).sendToTarget();
                        g();
                        pk6Var2 = pk6Var4;
                        i2 = 1;
                        this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        pk6Var2 = pk6Var;
                        zxg.g(pk6Var2);
                        throw th;
                    }
                    if (!cursor.moveToPosition(cursor.getPosition() + 1)) {
                        zxg.g(pk6Var);
                        this.d.obtainMessage(1, new ArrayList(arrayList2)).sendToTarget();
                        g();
                        pk6Var2 = pk6Var4;
                        i2 = 1;
                        this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                        return;
                    }
                    arrayList2.add(ll4.e((Cursor) pk6Var.b));
                }
            case 2:
                this.h = message.arg1 != 0;
                g();
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 3:
                this.g = message.arg1;
                g();
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 4:
                String str2 = (String) message.obj;
                int i4 = message.arg1;
                ll4 ll4Var3 = this.b;
                ArrayList arrayList3 = this.e;
                if (str2 == null) {
                    for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                        f((xz4) arrayList3.get(i5), i4);
                    }
                    try {
                        ll4Var3.b();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("stop_reason", Integer.valueOf(i4));
                            ll4Var3.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, ll4.d, null);
                        } catch (SQLException e3) {
                            throw new DatabaseIOException(e3);
                        }
                    } catch (IOException e4) {
                        a8i.h("DownloadManager", "Failed to set manual stop reason", e4);
                    }
                } else {
                    xz4 xz4VarB = b(str2, false);
                    if (xz4VarB != null) {
                        f(xz4VarB, i4);
                    } else {
                        try {
                            ll4Var3.m(i4, str2);
                        } catch (IOException e5) {
                            a8i.h("DownloadManager", "Failed to set manual stop reason: ".concat(str2), e5);
                        }
                    }
                }
                g();
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 5:
                this.i = message.arg1;
                g();
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 6:
                this.j = message.arg1;
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 7:
                r25 r25Var = (r25) message.obj;
                int i6 = message.arg1;
                xz4 xz4VarB2 = b(r25Var.a, true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (xz4VarB2 != null) {
                    int i7 = xz4VarB2.b;
                    long j = (i7 == 5 || i7 == 3 || i7 == 4) ? jCurrentTimeMillis : xz4VarB2.c;
                    if (i7 != 5 && i7 != 7) {
                        i = i6 != 0 ? 1 : 0;
                    }
                    r25 r25Var2 = xz4VarB2.a;
                    String str3 = r25Var2.a;
                    String str4 = r25Var.a;
                    List list = r25Var.d;
                    hsi.b(str3.equals(str4));
                    List list2 = r25Var2.d;
                    if (list2.isEmpty() || list.isEmpty()) {
                        arrayList = Collections.EMPTY_LIST;
                    } else {
                        arrayList = new ArrayList(list2);
                        for (int i8 = 0; i8 < list.size(); i8++) {
                            ilf ilfVar = (ilf) list.get(i8);
                            if (!arrayList.contains(ilfVar)) {
                                arrayList.add(ilfVar);
                            }
                        }
                    }
                    List list3 = arrayList;
                    String str5 = r25Var2.a;
                    Uri uri = r25Var.b;
                    String str6 = r25Var.c;
                    byte[] bArr = r25Var.o;
                    ?? r7 = r25Var.X;
                    d(new xz4(new r25(str5, uri, str6, list3, bArr, r7, r25Var.Y, r25Var.Z, r25Var.s0), i, j, jCurrentTimeMillis, i6));
                    pk6Var3 = r7;
                } else {
                    d(new xz4(r25Var, i6 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, i6));
                }
                g();
                pk6Var2 = pk6Var3;
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 8:
                String str7 = (String) message.obj;
                xz4 xz4VarB3 = b(str7, true);
                if (xz4VarB3 == null) {
                    a8i.g("DownloadManager", "Failed to remove nonexistent download: " + str7);
                } else {
                    e(xz4VarB3, 5, 0);
                    g();
                }
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 9:
                ll4 ll4Var4 = this.b;
                ArrayList arrayList4 = this.e;
                ArrayList arrayList5 = new ArrayList();
                try {
                    ll4Var4.b();
                    Cursor cursorC = ll4Var4.c(ll4.g(3, 4), null);
                    while (cursorC.moveToPosition(cursorC.getPosition() + 1)) {
                        try {
                            arrayList5.add(ll4.e(cursorC));
                        } finally {
                        }
                    }
                    cursorC.close();
                } catch (IOException unused) {
                    a8i.g("DownloadManager", "Failed to load downloads.");
                }
                for (int i9 = 0; i9 < arrayList4.size(); i9++) {
                    arrayList4.set(i9, a((xz4) arrayList4.get(i9), 5, 0));
                }
                for (int i10 = 0; i10 < arrayList5.size(); i10++) {
                    arrayList4.add(a((xz4) arrayList5.get(i10), 5, 0));
                }
                Collections.sort(arrayList4, new o00(29));
                try {
                    ll4Var4.l();
                } catch (IOException e6) {
                    a8i.h("DownloadManager", "Failed to update index.", e6);
                }
                ArrayList arrayList6 = new ArrayList(arrayList4);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    this.d.obtainMessage(3, new f25((xz4) arrayList4.get(i11), false, arrayList6, null)).sendToTarget();
                }
                g();
                i2 = 1;
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 10:
                i25 i25Var = (i25) message.obj;
                String str8 = i25Var.a.a;
                this.f.remove(str8);
                boolean z = i25Var.d;
                if (z) {
                    this.l = false;
                } else {
                    int i12 = this.k - 1;
                    this.k = i12;
                    if (i12 == 0) {
                        removeMessages(12);
                    }
                }
                if (i25Var.Y) {
                    g();
                } else {
                    Exception exc = i25Var.Z;
                    if (exc != null) {
                        a8i.h("DownloadManager", "Task failed: " + i25Var.a + ", " + z, exc);
                    }
                    xz4 xz4VarB4 = b(str8, false);
                    xz4VarB4.getClass();
                    int i13 = xz4VarB4.b;
                    if (i13 == 2) {
                        hsi.g(!z);
                        ArrayList arrayList7 = this.e;
                        xz4 xz4Var = new xz4(xz4VarB4.a, exc == null ? 3 : 4, xz4VarB4.c, System.currentTimeMillis(), xz4VarB4.e, xz4VarB4.f, exc == null ? 0 : 1, xz4VarB4.h);
                        arrayList7.remove(c(xz4Var.a.a));
                        try {
                            this.b.i(xz4Var);
                        } catch (IOException e7) {
                            a8i.h("DownloadManager", "Failed to update index.", e7);
                        }
                        this.d.obtainMessage(3, new f25(xz4Var, false, new ArrayList(arrayList7), exc)).sendToTarget();
                    } else {
                        if (i13 != 5 && i13 != 7) {
                            throw new IllegalStateException();
                        }
                        hsi.g(z);
                        ArrayList arrayList8 = this.e;
                        int i14 = xz4VarB4.b;
                        r25 r25Var3 = xz4VarB4.a;
                        if (i14 == 7) {
                            int i15 = xz4VarB4.f;
                            e(xz4VarB4, i15 == 0 ? 0 : 1, i15);
                            g();
                        } else {
                            arrayList8.remove(c(r25Var3.a));
                            try {
                                ll4Var = this.b;
                                str = r25Var3.a;
                                ll4Var.b();
                            } catch (IOException unused2) {
                                a8i.g("DownloadManager", "Failed to remove from database");
                            }
                            try {
                                ll4Var.a.getWritableDatabase().delete("ExoPlayerDownloads", "id = ?", new String[]{str});
                                this.d.obtainMessage(3, new f25(xz4VarB4, true, new ArrayList(arrayList8), null)).sendToTarget();
                            } catch (SQLiteException e8) {
                                throw new DatabaseIOException(e8);
                            }
                        }
                    }
                    g();
                }
                this.d.obtainMessage(2, i2, this.f.size()).sendToTarget();
                return;
            case 11:
                i25 i25Var2 = (i25) message.obj;
                int i16 = message.arg1;
                int i17 = message.arg2;
                String str9 = zxg.a;
                long j2 = ((i16 & 4294967295L) << 32) | (4294967295L & i17);
                xz4 xz4VarB5 = b(i25Var2.a.a, false);
                xz4VarB5.getClass();
                if (j2 == xz4VarB5.e || j2 == -1) {
                    return;
                }
                d(new xz4(xz4VarB5.a, xz4VarB5.b, xz4VarB5.c, System.currentTimeMillis(), j2, xz4VarB5.f, xz4VarB5.g, xz4VarB5.h));
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ArrayList arrayList9 = this.e;
                for (int i18 = 0; i18 < arrayList9.size(); i18++) {
                    xz4 xz4Var2 = (xz4) arrayList9.get(i18);
                    if (xz4Var2.b == 2) {
                        try {
                            this.b.i(xz4Var2);
                        } catch (IOException e9) {
                            a8i.h("DownloadManager", "Failed to update index.", e9);
                        }
                    }
                }
                sendEmptyMessageDelayed(12, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
                return;
            case 13:
                Iterator it = this.f.values().iterator();
                while (it.hasNext()) {
                    ((i25) it.next()).a(true);
                }
                try {
                    this.b.k();
                } catch (IOException e10) {
                    a8i.h("DownloadManager", "Failed to update index.", e10);
                }
                this.e.clear();
                this.a.quit();
                synchronized (this) {
                    notifyAll();
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
