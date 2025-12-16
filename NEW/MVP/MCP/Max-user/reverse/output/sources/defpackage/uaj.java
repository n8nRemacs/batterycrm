package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class uaj implements mua {
    public static uaj f;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ uaj(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    public static void a(uaj uajVar, boolean z, Enum r6) {
        boolean z2;
        uajVar.getClass();
        if (z) {
            return;
        }
        Log.e("AssertionTracker", "Assertion failed", new AssertionError("Assertion failed"));
        String string = r6.toString();
        synchronized (uajVar.d) {
            try {
                Integer num = (Integer) ((LinkedHashMap) uajVar.e).get(string);
                ((LinkedHashMap) uajVar.e).put(string, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                int i = uajVar.b + 1;
                uajVar.b = i;
                z2 = i >= 1000;
            } catch (Throwable th) {
                throw th;
            }
        }
        ((Handler) uajVar.c).removeCallbacksAndMessages(null);
        if (!z2) {
            ((Handler) uajVar.c).postDelayed(new o3(8, uajVar), BuildConfig.SILENCE_TIME_TO_UPLOAD);
            return;
        }
        synchronized (uajVar.d) {
            uajVar.e = new LinkedHashMap();
            uajVar.b = 0;
        }
    }

    public static uaj d(tm9 tm9Var) throws IOException {
        int iM = efi.m(tm9Var);
        if (iM == 0) {
            return null;
        }
        ArrayList arrayList = null;
        String strO = null;
        String strO2 = null;
        int i = 0;
        for (int i2 = 0; i2 < iM; i2++) {
            String strW0 = tm9Var.w0();
            strW0.getClass();
            switch (strW0) {
                case "credential":
                    strO2 = efi.o(tm9Var);
                    break;
                case "username":
                    strO = efi.o(tm9Var);
                    break;
                case "urls":
                    int iF = efi.f(tm9Var);
                    arrayList = new ArrayList(iF);
                    for (int i3 = 0; i3 < iF; i3++) {
                        arrayList.add(efi.o(tm9Var));
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (str.startsWith("stun:") || str.startsWith("stuns:")) {
                                i = 3;
                                break;
                            } else if (str.startsWith("turn:") || str.startsWith("turns:")) {
                                i = 2;
                                break;
                            }
                        }
                        i = 1;
                        break;
                    } else {
                        i = 1;
                    }
                    break;
                default:
                    tm9Var.v();
                    break;
            }
        }
        return new uaj(arrayList, strO, strO2, i, 4);
    }

    public static synchronized uaj e(Context context) {
        try {
            if (f == null) {
                f = new uaj(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new pc4("MessengerIpcClient", 2))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public e2f b(Resources resources, m0g m0gVar) {
        hf0 hf0Var = (hf0) this.e;
        if (hf0Var != null) {
            return e2f.g(hf0Var);
        }
        Drawable drawable = (Drawable) this.d;
        if (drawable != null) {
            hf0 hf0Var2 = new hf0(drawable);
            this.e = hf0Var2;
            return e2f.g(hf0Var2);
        }
        if (((Uri) this.c) == null) {
            hf0 hf0Var3 = new hf0(new ColorDrawable(this.b));
            this.e = hf0Var3;
            return e2f.g(hf0Var3);
        }
        m2f m2fVarH = new wk3(5, new tv0(10, this)).h(new xu9(11, resources));
        m0gVar.getClass();
        n0g n0gVar = (n0g) m0gVar;
        return new k2f(m2fVarH.m(n0gVar.a()).i(n0gVar.b()), new xu9(12, this), 1);
    }

    public int c() {
        int i = this.b;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public synchronized ybj f(m6j m6jVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(m6jVar.toString()));
            }
            if (!((o4j) this.e).d(m6jVar)) {
                o4j o4jVar = new o4j(this);
                this.e = o4jVar;
                o4jVar.d(m6jVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return m6jVar.b.a;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                List list = (List) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                int i = this.b;
                StringBuilder sb = new StringBuilder("{urls=");
                sb.append(list);
                sb.append(", username='");
                sb.append(str);
                sb.append("', credential='");
                sb.append(str2);
                sb.append("', type=");
                sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "STUN" : "TURN" : "UNKNOWN");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public uaj(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.a = 0;
        this.e = new o4j(this);
        this.b = 1;
        this.d = scheduledExecutorService;
        this.c = context.getApplicationContext();
    }

    public uaj(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = 20;
                break;
            case 5:
                this.b = -1;
                this.c = null;
                this.d = null;
                break;
            default:
                Looper looperMyLooper = Looper.myLooper();
                this.c = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
                this.d = new Object();
                this.e = new LinkedHashMap();
                break;
        }
    }

    public uaj(Uri uri) {
        this.a = 5;
        this.c = uri;
        this.d = null;
        this.b = 0;
    }

    public uaj(Drawable drawable) {
        this.a = 5;
        this.d = drawable;
        this.c = null;
        this.b = 0;
    }

    public uaj(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.a = 8;
        this.c = str;
        this.b = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.d = listUnmodifiableList;
        this.e = bArr;
    }

    public uaj(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.a = 6;
        this.c = uuid;
        this.b = i;
        this.d = bArr;
        this.e = uuidArr;
    }
}
