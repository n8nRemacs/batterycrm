package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import one.me.android.media.service.OneMeMediaSessionService;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class bj implements v5, mhd, iw8, d4h, ohh {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ bj(int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = 0;
    }

    @Override // defpackage.d4h
    public void O() {
        f7a f7aVar = (f7a) this.c;
        int i = this.b;
        ir4 ir4Var = f7aVar.p;
        ir4Var.getClass();
        synchronized (ir4Var) {
            try {
                hsi.g(zxg.k(ir4Var.f, i));
                boolean z = false;
                hsi.g(ir4Var.o != -1);
                ((hr4) ir4Var.f.get(i)).b = true;
                int i2 = 0;
                while (true) {
                    if (i2 >= ir4Var.f.size()) {
                        z = true;
                        break;
                    } else if (!((hr4) ir4Var.f.valueAt(i2)).b) {
                        break;
                    } else {
                        i2++;
                    }
                }
                ir4Var.g = z;
                if (((hr4) ir4Var.f.get(ir4Var.o)).a.isEmpty()) {
                    if (i == ir4Var.o) {
                        ir4Var.d();
                    }
                    if (z) {
                        ir4Var.a.y();
                        return;
                    }
                }
                if (i != ir4Var.o && ((hr4) ir4Var.f.get(i)).a.size() == 1) {
                    ir4Var.e.g(new er4(ir4Var, 1), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(InputStream inputStream, OutputStream outputStream) {
        dr6 dr6Var = (dr6) this.c;
        int i = this.b;
        byte[] bArr = (byte[]) dr6Var.get(i);
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, i);
                if (i2 == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i2);
                }
            } finally {
                dr6Var.b(bArr);
            }
        }
    }

    public int b() {
        int i = this.b;
        p91 p91Var = (p91) this.c;
        if (p91Var.K0.a != 0) {
            return i;
        }
        if (p91Var.H0.j() == 0 || p91Var.H0.j() == 1) {
            return 1;
        }
        if (p91Var.H0.j() == 2) {
            return 2;
        }
        return i;
    }

    @Override // defpackage.ohh
    public lda c(int i) {
        lda ldaVar = (lda) ((SparseArray) this.c).get(i);
        if (ldaVar != null) {
            return ldaVar;
        }
        throw new IllegalArgumentException(ho7.f(i, "Cannot find the wrapper for global view type "));
    }

    @Override // defpackage.d4h
    public void d(VideoFrameProcessingException videoFrameProcessingException) {
        f7a f7aVar = (f7a) this.c;
        f7aVar.f.execute(new k79(f7aVar, 9, videoFrameProcessingException));
    }

    @Override // defpackage.iw8
    public kw8 e(lz9 lz9Var) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.b;
        if (i2 != 1 && (i2 != 0 || (i < 31 && ((context = (Context) this.c) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))))) {
            return new ewf().e(lz9Var);
        }
        int iH = xz9.h(((hf6) lz9Var.c).n);
        a8i.j("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + zxg.I(iH));
        return new py0(new ay(iH, 1), 2, new ay(iH, 3)).e(lz9Var);
    }

    public void f(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public Intent g(w69 w69Var, int i) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(w69Var.a.b);
        OneMeMediaSessionService oneMeMediaSessionService = (OneMeMediaSessionService) this.c;
        intent.setComponent(new ComponentName(oneMeMediaSessionService, oneMeMediaSessionService.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        return intent;
    }

    @Override // defpackage.v5
    public boolean h(View view) {
        ((BottomSheetBehavior) this.c).K(this.b);
        return true;
    }

    public boolean i() {
        return this.b < ((ArrayList) this.c).size();
    }

    @Override // defpackage.ohh
    public nhh j(lda ldaVar) {
        fde fdeVar = new fde();
        fdeVar.d = this;
        fdeVar.a = new SparseIntArray(1);
        fdeVar.b = new SparseIntArray(1);
        fdeVar.c = ldaVar;
        return fdeVar;
    }

    public long k(mm4 mm4Var) {
        qyg qygVar = (qyg) this.c;
        int i = 0;
        mm4Var.n(qygVar.a, 0, 1, false);
        int i2 = qygVar.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        mm4Var.n(qygVar.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (qygVar.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public long m(ip5 ip5Var) {
        umb umbVar = (umb) this.c;
        int i = 0;
        ip5Var.i(0, umbVar.a, 1);
        int i2 = umbVar.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        ip5Var.i(1, umbVar.a, i4);
        while (i < i4) {
            i++;
            i5 = (umbVar.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public synchronized boolean n(String str) {
        for (String str2 : (String[]) this.c) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        r(sb);
        Log.w("SoLoader", sb.toString());
        String[] strArr = (String[]) this.c;
        int i = this.b;
        strArr[i % strArr.length] = str;
        this.b = i + 1;
        return true;
    }

    public void o() {
        va2 va2Var = va2.c;
        char[] cArr = (char[]) this.c;
        synchronized (va2Var) {
            int i = va2Var.a;
            if (cArr.length + i < vs.a) {
                va2Var.a = i + cArr.length;
                ((js) va2Var.b).addLast(cArr);
            }
        }
    }

    @Override // defpackage.mhd
    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, h6f[] h6fVarArr) {
        int i;
        mhd[] mhdVarArr;
        do {
            i = this.b;
            mhdVarArr = (mhd[]) this.c;
            if (i >= 6) {
                return false;
            }
            this.b = i + 1;
        } while (!mhdVarArr[i].q(unsatisfiedLinkError, h6fVarArr));
        return true;
    }

    public synchronized void r(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.b);
            sb.append(" base apk paths.");
            if (this.b > 0) {
                sb.append(" Most recent ones:");
            }
            int i = 0;
            while (true) {
                String[] strArr = (String[]) this.c;
                if (i < strArr.length) {
                    int i2 = (this.b - i) - 1;
                    if (i2 >= 0) {
                        String str = strArr[i2 % strArr.length];
                        sb.append("\n");
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(")");
                    }
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void s(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        f(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public String toString() {
        switch (this.a) {
            case 9:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ bj(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ bj(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ bj(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public bj(int i, byte[] bArr) {
        this.a = 16;
        if (bArr == null) {
            throw new IllegalArgumentException("Illegal 'value' value: null");
        }
        if (i != 0) {
            this.c = bArr;
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("Illegal 'format' value: null");
    }

    public bj(es3 es3Var, int i) {
        this.a = 20;
        s5j.g(es3Var);
        this.c = es3Var;
        this.b = i;
    }

    public bj(int i) {
        this.a = i;
        switch (i) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                this.b = 50;
                break;
            case LangUtils.HASH_SEED /* 17 */:
                this.c = new qyg(8);
                break;
            case 18:
                this.c = new umb(8);
                break;
            default:
                this.c = new String[5];
                this.b = 0;
                break;
        }
    }

    public bj(dr6 dr6Var) {
        this.a = 13;
        l5j.a(true);
        this.b = 16384;
        this.c = dr6Var;
    }

    public bj(bj bjVar, boolean z) {
        this.a = 11;
        this.c = (Instant) bjVar.c;
        this.b = bjVar.b;
    }

    public bj(ArrayList arrayList) {
        this.a = 15;
        this.c = arrayList;
    }
}
