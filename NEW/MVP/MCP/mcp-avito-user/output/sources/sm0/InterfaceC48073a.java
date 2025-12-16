package sM0;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import tM0.g;

/* compiled from: VasUnionApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJB\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LsM0/a;", "", "", "itemId", "checkoutContext", "Lcom/avito/android/remote/model/TypedResult;", "LtM0/g;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "slug", "", "bundleId", "Lcom/avito/android/remote/model/DeepLinkResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: sM0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC48073a {
    @f("3/vas/union")
    @l
    Object a(@t("itemId") @k String str, @t("checkoutContext") @k String str2, @k Continuation<? super TypedResult<g>> continuation);

    @o("1/vas/union/context")
    @e
    @l
    Object b(@J81.c("itemId") @k String str, @J81.c("checkoutContext") @k String str2, @J81.c("purchase[slug]") @l String str3, @J81.c("purchase[bundleId]") @l Integer num, @k Continuation<? super TypedResult<DeepLinkResponse>> continuation);
}
