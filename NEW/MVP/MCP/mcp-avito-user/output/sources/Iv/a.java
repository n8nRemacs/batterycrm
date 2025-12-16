package IV;

import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ToastBarUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {
    public static final void a(@k com.avito.android.lib.design.toast_bar.k kVar) {
        kVar.setState(new ToastBarState(null, null, null, null, null, null, null, 0, false, false, null, ToastBarState.State.f181136c, 2047, null));
    }

    @k
    public static final Button b(@k HV.a aVar, @k String str, @k Context context, @l Y41.a aVar2) {
        Button button = new Button(context, null, 0, 0);
        b bVar = aVar.f7103c;
        if (bVar != null) {
            button.setStyle(bVar);
        }
        button.setState(new UU.a(str, null, false, false, false, aVar2, null, null, null, false, 990, null));
        return button;
    }

    @k
    public static final com.avito.android.lib.design.toast_bar.k c(@k Context context, @k ToastBarState toastBarState, @k HV.a aVar) {
        com.avito.android.lib.design.toast_bar.k kVar = new com.avito.android.lib.design.toast_bar.k(context, null, 0, 6, null);
        kVar.setStyle(aVar);
        kVar.setState(toastBarState);
        return kVar;
    }

    @k
    public static final com.avito.android.lib.design.toast_bar.k d(@k View view, @k ToastBarState toastBarState, @k HV.a aVar) {
        return c(view.getContext(), ToastBarState.a(toastBarState, null, view, 4093), aVar);
    }

    @k
    public static final void e(@k d dVar, @k ToastBarState toastBarState, @k HV.a aVar) {
        c(dVar.getContext(), ToastBarState.a(toastBarState, null, dVar.v(), 4093), aVar);
    }
}
