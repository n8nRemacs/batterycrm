package com.avito.android.services_transportation_widget.cargo_capacity_sheet;

import Av0.C13089e;
import Y61.k;
import Y61.l;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlinx.coroutines.U;

/* compiled from: ServiceTransportationCardSelectSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_transportation_widget/cargo_capacity_sheet/j;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "Lcom/avito/android/services_transportation_widget/cargo_capacity_sheet/f;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.android.lib.design.bottom_sheet.d implements f {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f280488J = 0;

    /* renamed from: E, reason: collision with root package name */
    @l
    public final String f280489E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final e f280490F;

    /* renamed from: G, reason: collision with root package name */
    @l
    public RecyclerView f280491G;

    /* renamed from: H, reason: collision with root package name */
    @l
    public Button f280492H;

    /* renamed from: I, reason: collision with root package name */
    @k
    public final C13089e f280493I;

    public j(@k Activity activity, @k String str, @l String str2, @k e eVar) {
        super(activity, 0, 2, null);
        this.f280489E = str2;
        this.f280490F = eVar;
        this.f280493I = new C13089e(new i(this));
        B(R.layout.service_transportation_widget_card_select_sheet, R.layout.service_transportation_widget_card_select_sheet_footer, new g(1, this, j.class, "onInflated", "onInflated(Landroid/view/View;)V", 0), new h(1, this, j.class, "onFooterInflated", "onFooterInflated(Landroid/view/View;)V", 0), false);
        com.avito.android.lib.design.bottom_sheet.d.M(this, str, true, false, 10);
        J(true);
        t();
        eVar.f280484g = this;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.f280490F;
        eVar.f280484g = null;
        U.b(eVar.f280483f, null);
    }
}
