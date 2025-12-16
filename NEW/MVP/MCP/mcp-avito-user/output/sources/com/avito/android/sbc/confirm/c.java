package com.avito.android.sbc.confirm;

import Y41.p;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.paid_services.routing.ProgressState;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: ConfirmDiscountDispatchTariffSuccessActivity.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c extends N implements p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CreateDiscountDispatchTariffSuccessArgs f259158l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ConfirmDiscountDispatchTariffSuccessActivity f259159m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CreateDiscountDispatchTariffSuccessArgs createDiscountDispatchTariffSuccessArgs, ConfirmDiscountDispatchTariffSuccessActivity confirmDiscountDispatchTariffSuccessActivity) {
        super(2);
        this.f259158l = createDiscountDispatchTariffSuccessArgs;
        this.f259159m = confirmDiscountDispatchTariffSuccessActivity;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        int iD2;
        int iD3;
        a.b bVar2 = bVar;
        CreateDiscountDispatchTariffSuccessArgs createDiscountDispatchTariffSuccessArgs = this.f259158l;
        bVar2.setTitle(createDiscountDispatchTariffSuccessArgs.f259149b);
        ConfirmDiscountDispatchTariffSuccessActivity confirmDiscountDispatchTariffSuccessActivity = this.f259159m;
        bVar2.L3(confirmDiscountDispatchTariffSuccessActivity.getString(R.string.messenger_confirm_discount_dispatch_close_dialog_title), new a(dialogInterface));
        View viewInflate = LayoutInflater.from(confirmDiscountDispatchTariffSuccessActivity).inflate(R.layout.sbc_success_sent_by_tariff_dialog_layout, (ViewGroup) null);
        ComponentContainer componentContainer = (ComponentContainer) viewInflate.findViewById(R.id.create_discount_dispatch_tariff_balance_container);
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.create_discount_dispatch_tariff_balance_progress);
        ((TextView) viewInflate.findViewById(R.id.sbc_success_sent_by_tariff_subtitle)).setText(createDiscountDispatchTariffSuccessArgs.f259150c);
        componentContainer.setTitle(createDiscountDispatchTariffSuccessArgs.f259151d);
        progressBar.setProgress(createDiscountDispatchTariffSuccessArgs.f259155h);
        ProgressState progressState = createDiscountDispatchTariffSuccessArgs.f259153f;
        int iOrdinal = progressState.ordinal();
        if (iOrdinal == 0) {
            iD2 = C35835l0.d(R.attr.green, confirmDiscountDispatchTariffSuccessActivity);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iD2 = C35835l0.d(R.attr.red700, confirmDiscountDispatchTariffSuccessActivity);
        }
        progressBar.setFillColor(iD2);
        int iOrdinal2 = progressState.ordinal();
        if (iOrdinal2 == 0) {
            iD3 = C35835l0.d(R.attr.green200, confirmDiscountDispatchTariffSuccessActivity);
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iD3 = C35835l0.d(R.attr.red200, confirmDiscountDispatchTariffSuccessActivity);
        }
        progressBar.setEmptyColor(iD3);
        int iOrdinal3 = createDiscountDispatchTariffSuccessArgs.f259154g.ordinal();
        String str = createDiscountDispatchTariffSuccessArgs.f259152e;
        if (iOrdinal3 == 0) {
            componentContainer.setMessage(str);
        } else if (iOrdinal3 == 1) {
            ComponentContainer.n(componentContainer, str, 2);
        }
        bVar2.setCustomView(viewInflate);
        bVar2.b(new b(confirmDiscountDispatchTariffSuccessActivity));
        bVar2.setCancelable(false);
        return G0.f406611a;
    }
}
