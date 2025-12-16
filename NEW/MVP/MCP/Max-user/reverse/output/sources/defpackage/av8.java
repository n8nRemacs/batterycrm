package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes2.dex */
public final class av8 extends dtf implements sm6 {
    public final /* synthetic */ MediaBarWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = mediaBarWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        av8 av8Var = (av8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        av8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        av8 av8Var = new av8(continuation, this.X);
        av8Var.o = obj;
        return av8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int iOrdinal = ((d9c) this.o).ordinal();
        MediaBarWidget mediaBarWidget = this.X;
        if (iOrdinal == 0) {
            yy7[] yy7VarArr = MediaBarWidget.c1;
            c83 c83VarK0 = mediaBarWidget.K0();
            ytd ytdVar = c83VarK0.a;
            if (!fni.a(c83VarK0.b(), "media_gallery_widget")) {
                ytdVar.R(false);
                bud budVarA = l8j.a(new MediaGalleryWidget(mediaBarWidget.a, null, 2, null), null, null);
                budVarA.d("media_gallery_widget");
                ytdVar.S(budVarA);
            }
            mediaBarWidget.M0().setVisibility(0);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr2 = MediaBarWidget.c1;
            c83 c83VarK02 = mediaBarWidget.K0();
            ytd ytdVar2 = c83VarK02.a;
            if (!fni.a(c83VarK02.b(), "permissions_widget")) {
                ytdVar2.R(false);
                bud budVarA2 = l8j.a(new MediaBarPermissionWidget(), null, null);
                budVarA2.d("permissions_widget");
                ytdVar2.S(budVarA2);
            }
            mediaBarWidget.M0().setVisibility(8);
        }
        return qqg.a;
    }
}
