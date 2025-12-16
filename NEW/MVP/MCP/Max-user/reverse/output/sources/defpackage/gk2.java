package defpackage;

import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class gk2 extends v9 {
    public final /* synthetic */ int c;
    public final /* synthetic */ BaseBottomSheetWidget d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk2(BaseBottomSheetWidget baseBottomSheetWidget, int i) {
        super(baseBottomSheetWidget, 1);
        this.c = i;
        this.d = baseBottomSheetWidget;
    }

    @Override // defpackage.v9, defpackage.i6c
    public int a() {
        switch (this.c) {
            case 2:
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.d;
                yy7[] yy7VarArr = WebAppRootScreen.R0;
                if (webAppRootScreen.P0()) {
                    return 0;
                }
                return c();
            default:
                return super.a();
        }
    }

    @Override // defpackage.i6c
    public int b() {
        switch (this.c) {
            case 2:
                return 2;
            default:
                return super.b();
        }
    }

    @Override // defpackage.v9, defpackage.i6c
    public int c() {
        switch (this.c) {
            case 2:
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.d;
                yy7[] yy7VarArr = WebAppRootScreen.R0;
                if (!webAppRootScreen.P0()) {
                    break;
                }
                break;
        }
        return super.c();
    }

    @Override // defpackage.v9, defpackage.i6c
    public m6c g(m6c m6cVar, m6c m6cVar2) {
        switch (this.c) {
            case 1:
                return ((m6cVar == m6c.c || m6cVar2 == m6c.b) && !((ConfirmationBottomSheet) this.d).G0()) ? m6cVar : m6cVar2;
            default:
                return super.g(m6cVar, m6cVar2);
        }
    }

    @Override // defpackage.v9, defpackage.i6c
    public boolean j() {
        switch (this.c) {
            case 1:
                return ((ConfirmationBottomSheet) this.d).G0();
            default:
                return super.j();
        }
    }

    @Override // defpackage.v9, defpackage.i6c
    public void k() {
        switch (this.c) {
            case 0:
                ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = (ChatMediaDownloadBottomSheet) this.d;
                yy7[] yy7VarArr = ChatMediaDownloadBottomSheet.I0;
                gw0.w(new g56(aw0.a(((yk2) chatMediaDownloadBottomSheet.C0.getValue()).v0, chatMediaDownloadBottomSheet.getViewLifecycleOwner().p(), l38.o), new fk2(null, chatMediaDownloadBottomSheet), 1), chatMediaDownloadBottomSheet.getViewLifecycleScope());
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // defpackage.v9, defpackage.i6c
    public boolean n(m6c m6cVar, float f, float f2) {
        int i = this.c;
        BaseBottomSheetWidget baseBottomSheetWidget = this.d;
        switch (i) {
            case 1:
                return ((ConfirmationBottomSheet) baseBottomSheetWidget).G0();
            case 2:
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) baseBottomSheetWidget;
                yy7[] yy7VarArr = WebAppRootScreen.R0;
                return !webAppRootScreen.P0() && webAppRootScreen.O0().c;
            default:
                return super.n(m6cVar, f, f2);
        }
    }
}
