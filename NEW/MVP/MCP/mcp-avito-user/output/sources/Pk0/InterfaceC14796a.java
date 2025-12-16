package Pk0;

import J81.f;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: OwnershipCostApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J=\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LPk0/a;", "", "", "itemId", "distance", "region", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/OwnershipCostResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "_avito-discouraged_avito-api_ownership-cost"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Pk0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC14796a {
    @f("1/owncost/wizard")
    @k
    z<TypedResult<OwnershipCostResponse>> a(@t("itemId") @k String itemId, @l @t("distance") String distance, @l @t("region") String region);
}
