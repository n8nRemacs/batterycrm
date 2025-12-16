package defpackage;

import java.io.File;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException;

/* loaded from: classes2.dex */
public final class j8h extends dtf implements sm6 {
    public final /* synthetic */ q8h X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8h(q8h q8hVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = q8hVar;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((j8h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new j8h(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        lg8 lg8Var = lg8.d;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            hbd hbdVar = this.X.E;
            i8h i8hVar = new i8h(2, null);
            this.o = 1;
            obj = gw0.r(hbdVar, i8hVar, this);
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        Boolean bool = (Boolean) obj;
        String str = this.X.h;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, "VideoMessage Recording. Camera preview was bind successfully", null);
        }
        if (!fni.a(bool, Boolean.TRUE)) {
            throw new VideoMessageRecordDelegate$PreviewRenderException(0);
        }
        q8h q8hVar = this.X;
        File fileL = ((iz5) ((qx5) q8hVar.b.getValue())).l(String.valueOf(this.Y));
        fileL.createNewFile();
        q8hVar.t = fileL;
        q8h q8hVar2 = this.X;
        String str2 = q8hVar2.h;
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            File file = q8hVar2.t;
            l6bVar2.c(lg8Var, str2, wy1.h("VideoMessage Recording. Prepare to start recording. Output file - ", file != null ? file.getName() : null), null);
        }
        this.X.u(this.X.o(String.valueOf(System.currentTimeMillis())));
        return qqg.a;
    }
}
