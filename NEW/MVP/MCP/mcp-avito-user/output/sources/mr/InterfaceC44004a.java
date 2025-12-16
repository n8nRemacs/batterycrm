package mR;

import J81.e;
import J81.f;
import J81.o;
import J81.s;
import J81.t;
import Y61.k;
import com.avito.android.remote.model.LeasingApplicationCreationResponse;
import com.avito.android.remote.model.LeasingOffersResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: LeasingCalculatorApi.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J9\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LmR/a;", "", "", "itemId", "", "downPayment", "term", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/LeasingOffersResponse;", "b", "(Ljava/lang/String;JJ)Lio/reactivex/rxjava3/core/I;", "data", "Lcom/avito/android/remote/model/LeasingApplicationCreationResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_leasing-calculator"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: mR.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC44004a {
    @o("1/leasing/application/create/{itemId}")
    @e
    @k
    I<TypedResult<LeasingApplicationCreationResponse>> a(@s("itemId") @k String itemId, @J81.c("data") @k String data);

    @f("1/leasing/offers/{itemId}")
    @k
    I<TypedResult<LeasingOffersResponse>> b(@s("itemId") @k String itemId, @t("downPayment") long downPayment, @t("termInMonths") long term);
}
