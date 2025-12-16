package androidx.loader.app;

import android.os.Looper;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import defpackage.fgh;
import defpackage.j48;
import defpackage.j8j;
import defpackage.kc8;
import defpackage.lc8;
import defpackage.lii;
import defpackage.r7f;
import defpackage.vgd;
import defpackage.vid;
import defpackage.yai;
import defpackage.zid;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {
    public final j48 a;
    public final LoaderManagerImpl$LoaderViewModel b;

    public b(j48 j48Var, fgh fghVar) {
        this.a = j48Var;
        this.b = (LoaderManagerImpl$LoaderViewModel) new zid(fghVar, LoaderManagerImpl$LoaderViewModel.d).i(vid.a(LoaderManagerImpl$LoaderViewModel.class));
    }

    public final void a(String str, PrintWriter printWriter) {
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.b;
        if (loaderManagerImpl$LoaderViewModel.b.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i = 0;
        while (true) {
            r7f r7fVar = loaderManagerImpl$LoaderViewModel.b;
            if (i >= r7fVar.c) {
                return;
            }
            kc8 kc8Var = (kc8) r7fVar.b[i];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(loaderManagerImpl$LoaderViewModel.b.a[i]);
            printWriter.print(": ");
            printWriter.println(kc8Var.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(kc8Var.l);
            lii liiVar = kc8Var.l;
            String str3 = str2 + "  ";
            liiVar.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(liiVar.a);
            if (liiVar.b || liiVar.e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(liiVar.b);
                printWriter.print(" mContentChanged=");
                printWriter.print(liiVar.e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (liiVar.c || liiVar.d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(liiVar.c);
                printWriter.print(" mReset=");
                printWriter.println(liiVar.d);
            }
            if (liiVar.g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(liiVar.g);
                printWriter.print(" waiting=");
                liiVar.g.getClass();
                printWriter.println(false);
            }
            if (liiVar.h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(liiVar.h);
                printWriter.print(" waiting=");
                liiVar.h.getClass();
                printWriter.println(false);
            }
            if (kc8Var.n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(kc8Var.n);
                lc8 lc8Var = kc8Var.n;
                lc8Var.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(lc8Var.b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            lii liiVar2 = kc8Var.l;
            Object objD = kc8Var.d();
            liiVar2.getClass();
            StringBuilder sb = new StringBuilder(64);
            j8j.b(sb, objD);
            sb.append("}");
            printWriter.println(sb.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(kc8Var.c > 0);
            i++;
        }
    }

    public final lii b(vgd vgdVar) {
        j48 j48Var = this.a;
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.b;
        if (loaderManagerImpl$LoaderViewModel.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        kc8 kc8Var = (kc8) loaderManagerImpl$LoaderViewModel.b.b(0);
        if (kc8Var != null) {
            lii liiVar = kc8Var.l;
            lc8 lc8Var = new lc8(liiVar, vgdVar);
            kc8Var.e(j48Var, lc8Var);
            lc8 lc8Var2 = kc8Var.n;
            if (lc8Var2 != null) {
                kc8Var.j(lc8Var2);
            }
            kc8Var.m = j48Var;
            kc8Var.n = lc8Var;
            return liiVar;
        }
        try {
            loaderManagerImpl$LoaderViewModel.c = true;
            SignInHubActivity signInHubActivity = (SignInHubActivity) vgdVar.b;
            Set set = yai.b;
            synchronized (set) {
            }
            lii liiVar2 = new lii(signInHubActivity, set);
            if (lii.class.isMemberClass() && !Modifier.isStatic(lii.class.getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + liiVar2);
            }
            kc8 kc8Var2 = new kc8(liiVar2);
            loaderManagerImpl$LoaderViewModel.b.c(0, kc8Var2);
            loaderManagerImpl$LoaderViewModel.c = false;
            lii liiVar3 = kc8Var2.l;
            lc8 lc8Var3 = new lc8(liiVar3, vgdVar);
            kc8Var2.e(j48Var, lc8Var3);
            lc8 lc8Var4 = kc8Var2.n;
            if (lc8Var4 != null) {
                kc8Var2.j(lc8Var4);
            }
            kc8Var2.m = j48Var;
            kc8Var2.n = lc8Var3;
            return liiVar3;
        } catch (Throwable th) {
            loaderManagerImpl$LoaderViewModel.c = false;
            throw th;
        }
    }

    public final void c() {
        r7f r7fVar = this.b.b;
        int i = r7fVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((kc8) r7fVar.b[i2]).l();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        j8j.b(sb, this.a);
        sb.append("}}");
        return sb.toString();
    }
}
