package defpackage;

import android.view.View;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* loaded from: classes2.dex */
public final class a08 implements yhd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a08(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(View view) {
    }

    private final void c(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    private final void h(View view) {
    }

    @Override // defpackage.yhd
    public final void b(View view) {
        int i = this.a;
    }

    @Override // defpackage.yhd
    public final void d(View view) {
        qk8 qk8Var;
        switch (this.a) {
            case 0:
                qk8 qk8Var2 = ((KeyboardStickersWidget) this.b).c;
                if (qk8Var2 != null) {
                    sk8 sk8Var = view instanceof sk8 ? (sk8) view : null;
                    if (sk8Var != null) {
                        sk8Var.b(qk8Var2);
                    }
                    e1i e1iVar = view instanceof e1i ? (e1i) view : null;
                    if (e1iVar != null) {
                        e1iVar.b(qk8Var2);
                        break;
                    }
                }
                break;
            case 1:
                uh9 uh9Var = view instanceof uh9 ? (uh9) view : null;
                View contentView$message_list_release = uh9Var != null ? uh9Var.getContentView$message_list_release() : null;
                if ((contentView$message_list_release instanceof dff) && (qk8Var = ((MessagesListWidget) this.b).L0) != null) {
                    ((dff) contentView$message_list_release).b(qk8Var);
                    break;
                }
                break;
            case 2:
                qk8 qk8Var3 = ((StickerSetBottomSheet) this.b).y0;
                if (qk8Var3 != null) {
                    sk8 sk8Var2 = view instanceof sk8 ? (sk8) view : null;
                    if (sk8Var2 != null) {
                        sk8Var2.b(qk8Var3);
                    }
                    e1i e1iVar2 = view instanceof e1i ? (e1i) view : null;
                    if (e1iVar2 != null) {
                        e1iVar2.b(qk8Var3);
                        break;
                    }
                }
                break;
            case 3:
                StickersScreen stickersScreen = (StickersScreen) this.b;
                sk8 sk8Var3 = view instanceof sk8 ? (sk8) view : null;
                if (sk8Var3 != null) {
                    sk8Var3.b(stickersScreen.s0);
                }
                e1i e1iVar3 = view instanceof e1i ? (e1i) view : null;
                if (e1iVar3 != null) {
                    e1iVar3.b(stickersScreen.s0);
                    break;
                }
                break;
            case 4:
                StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.b;
                sk8 sk8Var4 = view instanceof sk8 ? (sk8) view : null;
                if (sk8Var4 != null) {
                    sk8Var4.b(stickersSearchScreen.d);
                }
                e1i e1iVar4 = view instanceof e1i ? (e1i) view : null;
                if (e1iVar4 != null) {
                    e1iVar4.b(stickersSearchScreen.d);
                    break;
                }
                break;
            default:
                qk8 qk8Var4 = (qk8) this.b;
                sk8 sk8Var5 = view instanceof sk8 ? (sk8) view : null;
                if (sk8Var5 != null) {
                    sk8Var5.b(qk8Var4);
                }
                e1i e1iVar5 = view instanceof e1i ? (e1i) view : null;
                if (e1iVar5 != null) {
                    e1iVar5.b(qk8Var4);
                    break;
                }
                break;
        }
    }
}
