package qk0;

import J81.f;
import J81.s;
import Y61.k;
import Y61.l;
import com.avito.android.remote.imv_cars_details.models.ImvCarsDetailsResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ImvCarsDetailsApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqk0/a;", "", "", "itemId", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/imv_cars_details/models/ImvCarsDetailsResponse;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "case", "imvId", "b", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_imv-cars-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: qk0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC47409a {
    @f("1/interpretation/{itemId}")
    @l
    Object a(@s("itemId") @k String str, @k Continuation<? super TypedResult<ImvCarsDetailsResponse>> continuation);

    @f("2/interpretation/{case}/{imvId}")
    @l
    Object b(@s("case") @k String str, @s("imvId") @k String str2, @k Continuation<? super TypedResult<ImvCarsDetailsResponse>> continuation);
}
