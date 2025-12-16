package com.avito.android.trx_promo_impl.date_range_picker.deeplink;

import Y41.p;
import Y61.k;
import android.os.Build;
import android.os.Bundle;
import androidx.core.os.C22777e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.trx_promo_impl.date_range_picker.TrxPromoDateRangePickerFragment;
import com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureDateRangePickerLink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import java.time.LocalDate;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import rv.C47919b;

/* compiled from: TrxPromoConfigureDateRangePickerDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_range_picker/deeplink/d;", "Lev/a;", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLink;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends AbstractC40161a<TrxPromoConfigureDateRangePickerLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.f f303993f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.d f303994g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43238h f303995h;

    /* compiled from: TrxPromoConfigureDateRangePickerDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            Object serializable;
            C47919b c47919b2 = c47919b;
            d dVar = (d) this.receiver;
            dVar.getClass();
            Bundle bundle = c47919b2.f437159b;
            if (bundle == null) {
                serializable = null;
            } else if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable("trx_promo_key_date_range_picker_result_from", LocalDate.class);
            } else {
                Object serializable2 = bundle.getSerializable("trx_promo_key_date_range_picker_result_from");
                if (!(serializable2 instanceof LocalDate)) {
                    serializable2 = null;
                }
                serializable = (LocalDate) serializable2;
            }
            LocalDate localDate = (LocalDate) serializable;
            Bundle bundle2 = c47919b2.f437159b;
            if (bundle2 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = bundle2.getSerializable("trx_promo_key_date_range_picker_result_to", LocalDate.class);
                } else {
                    Object serializable3 = bundle2.getSerializable("trx_promo_key_date_range_picker_result_to");
                    serializable = (LocalDate) (serializable3 instanceof LocalDate ? serializable3 : null);
                }
            }
            LocalDate localDate2 = (LocalDate) serializable;
            if (localDate == null || localDate2 == null) {
                dVar.j(TrxPromoConfigureDateRangePickerLink.b.a.f304498b);
            } else {
                dVar.j(new TrxPromoConfigureDateRangePickerLink.b.C9351b(localDate, localDate2));
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@k a.d dVar, @k a.f fVar, @k R0 r02) {
        this.f303993f = fVar;
        this.f303994g = dVar;
        this.f303995h = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        TrxPromoConfigureDateRangePickerLink trxPromoConfigureDateRangePickerLink = (TrxPromoConfigureDateRangePickerLink) deepLink;
        String string = bundle != null ? bundle.getString("trx_promo_key_date_range_picker_date_from") : null;
        String string2 = bundle != null ? bundle.getString("trx_promo_key_date_range_picker_date_to") : null;
        TrxPromoDateRangePickerFragment.f303953r0.getClass();
        TrxPromoDateRangePickerFragment trxPromoDateRangePickerFragment = new TrxPromoDateRangePickerFragment();
        trxPromoDateRangePickerFragment.setArguments(C22777e.b(new Q("trx_promo_date_range_picker_content", trxPromoConfigureDateRangePickerLink.f304497b), new Q("trx_promo_date_range_picker_date_from", string), new Q("trx_promo_date_range_picker_date_to", string2)));
        this.f303994g.w1(trxPromoDateRangePickerFragment, "TrxPromoConfigureDateRangePickerDeeplinkHandler_" + this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new a(2, this, d.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V", 4), y.a(this.f303993f.l1("TrxPromoConfigureDateRangePickerDeeplinkHandler_" + this.f395444b))), this.f303995h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f303995h, null);
    }
}
