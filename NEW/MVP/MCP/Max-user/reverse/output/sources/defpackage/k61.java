package defpackage;

import android.os.Bundle;
import one.me.calls.ui.ui.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.main.MainScreen;
import one.me.settings.twofa.creation.TwoFACreationScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class k61 implements mi4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k61(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.mi4
    public final Object a() {
        switch (this.a) {
            case 0:
                return new CallJoinLinkPreviewWidget((String) this.b, (Boolean) this.c);
            case 1:
                return new ComplaintBottomSheet((Long) this.b, (long[]) this.c);
            case 2:
                gi4 gi4Var = (gi4) this.b;
                return new MainScreen(oi4.a(gi4Var.a), (Bundle) this.c);
            default:
                return new TwoFACreationScreen("CREATE", "CREATE_PASSWORD", (String) this.b, (String) this.c, null, 16, null);
        }
    }
}
