package com.avito.android.cpx_promo.priceinput.deeplink;

import Y41.p;
import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputFragment;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputResult;
import com.avito.android.cpx_promo.priceinput.deeplink.CpxPromoPriceInputDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
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

/* compiled from: CpxPromoPriceInputDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/deeplink/b;", "Lev/a;", "Lcom/avito/android/cpx_promo/priceinput/deeplink/CpxPromoPriceInputDeepLink;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends AbstractC40161a<CpxPromoPriceInputDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f127298f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f127299g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43238h f127300h;

    /* compiled from: CpxPromoPriceInputDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            b bVar = (b) this.receiver;
            bVar.getClass();
            Bundle bundle = c47919b.f437159b;
            CpxPromoPriceInputResult cpxPromoPriceInputResult = (CpxPromoPriceInputResult) (bundle == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("cpx_promo_price_input_result", CpxPromoPriceInputResult.class) : bundle.getParcelable("cpx_promo_price_input_result"));
            if (cpxPromoPriceInputResult != null) {
                bVar.j(new CpxPromoPriceInputDeepLink.b.a(cpxPromoPriceInputResult.f127292b, cpxPromoPriceInputResult.f127293c));
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k a.d dVar, @k a.f fVar, @k R0 r02) {
        this.f127298f = dVar;
        this.f127299g = fVar;
        this.f127300h = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        CpxPromoPriceInputContent cpxPromoPriceInputContent;
        if (bundle != null) {
            cpxPromoPriceInputContent = (CpxPromoPriceInputContent) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("cpx_promo_price_input_content", CpxPromoPriceInputContent.class) : bundle.getParcelable("cpx_promo_price_input_content"));
        } else {
            cpxPromoPriceInputContent = null;
        }
        if (cpxPromoPriceInputContent != null) {
            CpxPromoPriceInputFragment.f127271s0.getClass();
            this.f127298f.w1(CpxPromoPriceInputFragment.a.a(cpxPromoPriceInputContent), "CpxPromoPriceInputDeeplinkHandler_" + this.f395444b);
        }
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new a(2, this, b.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V", 4), y.a(this.f127299g.l1("CpxPromoPriceInputDeeplinkHandler_" + this.f395444b))), this.f127300h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f127300h, null);
    }
}
