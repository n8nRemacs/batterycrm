package Km;

import J81.d;
import J81.e;
import J81.o;
import Lm.C14412c;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import j.F;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CartApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J_\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKm/a;", "", "", "isBundle", "", "", "changedItems", "withComplementary", "context", "", "needDiscountOnDelivery", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "LLm/c;", "a", "(Ljava/lang/Boolean;Ljava/util/Map;ZLjava/lang/String;Ljava/lang/Integer;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_cart"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Km.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14327a {
    @o("1/cart/items/update")
    @e
    @k
    I<TypedResult<C14412c>> a(@J81.c("isBundle") @l Boolean isBundle, @d @k Map<String, String> changedItems, @J81.c("withComplementary") boolean withComplementary, @J81.c("context") @l String context, @J81.c("needDiscountOnDelivery") @F @l Integer needDiscountOnDelivery);
}
