package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* loaded from: classes2.dex */
public final class fk2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaDownloadBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk2(Continuation continuation, ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet) {
        super(2, continuation);
        this.X = chatMediaDownloadBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fk2 fk2Var = (fk2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fk2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fk2 fk2Var = new fk2(continuation, this.X);
        fk2Var.o = obj;
        return fk2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        g8j.b(obj);
        u05 u05Var = (u05) this.o;
        boolean z = u05Var instanceof t05;
        ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = this.X;
        if (z) {
            chatMediaDownloadBottomSheet.E0(false);
            t05 t05Var = (t05) u05Var;
            Uri uri = t05Var.a;
            o05 o05Var = t05Var.b;
            switch (o05Var.ordinal()) {
                case 0:
                    if (uri != null) {
                        String str = ap7.a;
                        ap7.h(chatMediaDownloadBottomSheet.getContext(), uri, "video/*");
                        break;
                    }
                    break;
                case 1:
                    chatMediaDownloadBottomSheet.O0(m3d.media_share_dialog_download_video_success, yud.o);
                    break;
                case 2:
                case 4:
                    if (uri != null) {
                        String str2 = ap7.a;
                        ap7.h(chatMediaDownloadBottomSheet.getContext(), uri, "image/*");
                        break;
                    }
                    break;
                case 3:
                case 5:
                    chatMediaDownloadBottomSheet.O0(o05Var == o05.o ? m3d.media_share_dialog_download_gif_success : m3d.media_share_dialog_download_photo_success, yud.A);
                    break;
                case 6:
                    if (uri != null) {
                        String str3 = ap7.a;
                        ap7.h(chatMediaDownloadBottomSheet.getContext(), uri, "*/*");
                        break;
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(u05Var instanceof s05)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = ((s05) u05Var).a;
            int i2 = yud.J;
            yy7[] yy7VarArr = ChatMediaDownloadBottomSheet.I0;
            chatMediaDownloadBottomSheet.O0(i, i2);
            chatMediaDownloadBottomSheet.E0(true);
        }
        ts4 ts4Var = chatMediaDownloadBottomSheet.F0;
        if (ts4Var != null) {
            ts4Var.a();
        }
        return qqg.a;
    }
}
