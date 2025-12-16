package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;
import one.me.mediapicker.permissions.MediaPickerPermissionWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes2.dex */
public final class i39 extends dtf implements sm6 {
    public final /* synthetic */ MediaPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i39(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.X = mediaPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        i39 i39Var = (i39) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        i39Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        i39 i39Var = new i39(continuation, this.X);
        i39Var.o = obj;
        return i39Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        MediaPickerScreen mediaPickerScreen = this.X;
        String str = mediaPickerScreen.c;
        bbd bbdVar = mediaPickerScreen.b;
        g8j.b(obj);
        p34 p34Var = (p34) this.o;
        if (p34Var instanceof l34) {
            MediaPickerScreen.y0(mediaPickerScreen, false);
            yfb yfbVarA0 = mediaPickerScreen.A0();
            CharSequence charSequenceB = ((l34) p34Var).a.b(mediaPickerScreen.getContext());
            if (charSequenceB == null) {
                charSequenceB = "";
            }
            yfbVarA0.setTitle(charSequenceB);
            c83 c83Var = (c83) bbdVar.D(mediaPickerScreen, MediaPickerScreen.B0[0]);
            ytd ytdVar = c83Var.a;
            if (!fni.a(c83Var.b(), "MEDIA_GALLERY_WIDGET_TAG")) {
                ytdVar.R(false);
                bud budVarA = l8j.a(new MediaGalleryWidget(str, mediaPickerScreen.z0(), null), null, null);
                budVarA.d("MEDIA_GALLERY_WIDGET_TAG");
                ytdVar.S(budVarA);
            }
        } else if (p34Var instanceof m34) {
            MediaPickerScreen.y0(mediaPickerScreen, true);
        } else {
            if (!(p34Var instanceof n34)) {
                throw new NoWhenBranchMatchedException();
            }
            MediaPickerScreen.y0(mediaPickerScreen, false);
            c83 c83Var2 = (c83) bbdVar.D(mediaPickerScreen, MediaPickerScreen.B0[0]);
            ytd ytdVar2 = c83Var2.a;
            if (!fni.a(c83Var2.b(), "MEDIA_GALLERY_WIDGET_PERMISSION_TAG")) {
                ytdVar2.R(false);
                bud budVarA2 = l8j.a(new MediaPickerPermissionWidget(str, null), null, null);
                budVarA2.d("MEDIA_GALLERY_WIDGET_PERMISSION_TAG");
                ytdVar2.S(budVarA2);
            }
        }
        return qqg.a;
    }
}
