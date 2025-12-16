package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rme extends dtf implements sm6 {
    public tme X;
    public InputStream Y;
    public int Z;
    public File o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ tme t0;
    public final /* synthetic */ Uri u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rme(tme tmeVar, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.t0 = tmeVar;
        this.u0 = uri;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rme) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rme rmeVar = new rme(this.t0, this.u0, continuation);
        rmeVar.s0 = obj;
        return rmeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        Object ipdVar;
        f84 f84Var;
        tme tmeVar;
        File file;
        InputStream inputStreamOpenInputStream;
        InputStream inputStream;
        File file2;
        Throwable th;
        int i = this.Z;
        qqg qqgVar = qqg.a;
        try {
        } catch (Throwable th2) {
            ipdVar = new ipd(th2);
        }
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.s0;
            yy7[] yy7VarArr = tme.z0;
            tmeVar = this.t0;
            Uri uri = this.u0;
            q34 q34VarU = tmeVar.u(uri);
            if (q34VarU != null) {
                iz5 iz5Var = (iz5) tmeVar.d.getValue();
                String str = q34VarU.c;
                iz5Var.getClass();
                file = new File(iz5.g(iz5.b(iz5Var.c), "ringtones"), xpi.a(str));
                if (!file.exists() && (inputStreamOpenInputStream = ((Context) tmeVar.o.getValue()).getContentResolver().openInputStream(uri)) != null) {
                    try {
                        b6a b6aVar = b6a.v0;
                        this.s0 = f84Var;
                        this.o = file;
                        this.X = tmeVar;
                        this.Y = inputStreamOpenInputStream;
                        this.Z = 1;
                        Object objT = b6aVar.T(file, inputStreamOpenInputStream, this);
                        g84 g84Var = g84.a;
                        if (objT == g84Var) {
                            return g84Var;
                        }
                        inputStream = inputStreamOpenInputStream;
                        file2 = file;
                        r4j.a(inputStream, null);
                        file = file2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
            }
            return qqgVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        inputStream = this.Y;
        tmeVar = this.X;
        file2 = this.o;
        f84Var = (f84) this.s0;
        try {
            g8j.b(obj);
            r4j.a(inputStream, null);
            file = file2;
        } catch (Throwable th4) {
            th = th4;
            inputStreamOpenInputStream = inputStream;
            th = th;
            try {
                throw th;
            } catch (Throwable th5) {
                r4j.a(inputStreamOpenInputStream, th);
                throw th5;
            }
        }
        tmeVar.v0.put(file.getAbsolutePath(), file);
        yx1 yx1Var = (yx1) tmeVar.X.getValue();
        yx1Var.getClass();
        yx1.d(yx1Var, "CALL_ADD_RINGTONE", null, null, null, null, null, false, 238);
        tmeVar.y(new kqd(file.getAbsolutePath()));
        ipdVar = qqgVar;
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e(f84Var.getClass().getName(), "failed to copy ringtone, e:", thA);
        }
        return qqgVar;
    }
}
