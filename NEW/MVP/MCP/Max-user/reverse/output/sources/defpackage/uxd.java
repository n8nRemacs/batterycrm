package defpackage;

import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uxd extends dtf implements sm6 {
    public final /* synthetic */ vxd X;
    public final /* synthetic */ File o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxd(File file, vxd vxdVar, Continuation continuation) {
        super(2, continuation);
        this.o = file;
        this.X = vxdVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uxd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new uxd(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        fa6 fa6Var = new fa6();
        fa6Var.b = this.o;
        fa6Var.a = Environment.DIRECTORY_MOVIES;
        fa6Var.c = uz9.s0;
        fa6Var.d = MediaStore.Video.Media.getContentUri("external_primary");
        d1e d1eVar = this.X.a;
        return d1eVar.a(fa6Var, d1eVar.c());
    }
}
