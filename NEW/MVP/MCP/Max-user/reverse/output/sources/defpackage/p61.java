package defpackage;

import android.os.Bundle;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.calls.ui.bottomsheet.unkowncontact.UnknownContactBottomSheet;

/* loaded from: classes.dex */
public final class p61 implements mi4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ p61(Bundle bundle, int i) {
        this.a = i;
        this.b = bundle;
    }

    @Override // defpackage.mi4
    public final Object a() {
        switch (this.a) {
            case 0:
                Bundle bundle = this.b;
                return new CallRateBottomSheet(l8j.k("call_id", bundle), l8j.f("is_group", bundle), l8j.f("is_video", bundle), bundle.containsKey("sdk_reasons") ? vmf.S(l8j.k("sdk_reasons", bundle), new String[]{","}, 4) : null);
            default:
                Bundle bundle2 = this.b;
                return new UnknownContactBottomSheet(l8j.k("call_id", bundle2), l8j.i("caller_id", bundle2));
        }
    }
}
