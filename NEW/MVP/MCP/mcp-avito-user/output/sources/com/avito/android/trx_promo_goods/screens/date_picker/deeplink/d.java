package com.avito.android.trx_promo_goods.screens.date_picker.deeplink;

import Y41.p;
import Y61.k;
import android.os.Build;
import android.os.Bundle;
import androidx.core.os.C22777e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.trx_promo_goods.screens.date_picker.TrxPromoGoodsDatePickerFragment;
import com.avito.android.trx_promo_goods.screens.date_picker.deeplink.TrxPromoGoodsConfigureDatePickerLink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import java.io.Serializable;
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

/* compiled from: TrxPromoGoodsConfigureDatePickerDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/d;", "Lev/a;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/TrxPromoGoodsConfigureDatePickerLink;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends AbstractC40161a<TrxPromoGoodsConfigureDatePickerLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.f f303674f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.d f303675g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43238h f303676h;

    /* compiled from: TrxPromoGoodsConfigureDatePickerDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            d dVar = (d) this.receiver;
            dVar.getClass();
            Bundle bundle = c47919b.f437159b;
            if (bundle != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = bundle.getSerializable("trx_promo_goods_key_date_picker_result", LocalDate.class);
                } else {
                    Serializable serializable = bundle.getSerializable("trx_promo_goods_key_date_picker_result");
                    serializable = (LocalDate) (serializable instanceof LocalDate ? serializable : null);
                }
            }
            LocalDate localDate = (LocalDate) serializable;
            if (localDate != null) {
                dVar.j(new TrxPromoGoodsConfigureDatePickerLink.b.C9302b(localDate));
            } else {
                dVar.j(TrxPromoGoodsConfigureDatePickerLink.b.a.f303669b);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@k a.d dVar, @k a.f fVar, @k R0 r02) {
        this.f303674f = fVar;
        this.f303675g = dVar;
        this.f303676h = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        TrxPromoGoodsConfigureDatePickerLink trxPromoGoodsConfigureDatePickerLink = (TrxPromoGoodsConfigureDatePickerLink) deepLink;
        String string = bundle != null ? bundle.getString("trx_promo_goods_key_date_picker_start_date") : null;
        TrxPromoGoodsDatePickerFragment.f303624p0.getClass();
        TrxPromoGoodsDatePickerFragment trxPromoGoodsDatePickerFragment = new TrxPromoGoodsDatePickerFragment();
        trxPromoGoodsDatePickerFragment.setArguments(C22777e.b(new Q("trx_promo_goods_extra_date_picker_content", trxPromoGoodsConfigureDatePickerLink.f303668b), new Q("trx_promo_goods_extra_start_date", string)));
        this.f303675g.w1(trxPromoGoodsDatePickerFragment, "TrxPromoGoodsDatePickerDeeplinkHandler_" + this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new a(2, this, d.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V", 4), y.a(this.f303674f.l1("TrxPromoGoodsDatePickerDeeplinkHandler_" + this.f395444b))), this.f303676h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f303676h, null);
    }
}
