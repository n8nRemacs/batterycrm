package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.partialmediaaccess.PartialMediaAccessWidget;

/* loaded from: classes2.dex */
public final class dv8 extends dtf implements sm6 {
    public final /* synthetic */ MediaBarWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = mediaBarWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dv8 dv8Var = (dv8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dv8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dv8 dv8Var = new dv8(continuation, this.X);
        dv8Var.o = obj;
        return dv8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        MediaBarWidget mediaBarWidget = this.X;
        bbd bbdVar = mediaBarWidget.z0;
        g8j.b(obj);
        if (((Boolean) this.o).booleanValue()) {
            c83 c83Var = (c83) bbdVar.D(mediaBarWidget, MediaBarWidget.c1[8]);
            ytd ytdVar = c83Var.a;
            if (!fni.a(c83Var.b(), "partial_media_access_widget")) {
                ytdVar.R(false);
                bud budVarA = l8j.a(new PartialMediaAccessWidget(null, 1, null), null, null);
                budVarA.d("partial_media_access_widget");
                ytdVar.S(budVarA);
            }
        } else {
            ((c83) bbdVar.D(mediaBarWidget, MediaBarWidget.c1[8])).a();
        }
        MediaBarWidget.A0(mediaBarWidget);
        return qqg.a;
    }
}
