package xq;

import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ComfortableDealInviteApi.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J|\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lxq/a;", "", "", "additionalComments", "clientId", "commissionSize", "", "hasContractWithSeller", "hasMinorsAmongSellers", "hasPropertyEncumbrances", "hasSellerAcceptsProgramTerms", "hasSellerConsentsToCall", "hasSellerConsentsToPD", "itemUrl", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: xq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC49982a {
    @o("1/lead/create")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object a(@J81.c("additionalComments") @l String str, @J81.c("clientId") @k String str2, @J81.c("commissionSize") @k String str3, @J81.c("hasContractWithSeller") boolean z12, @J81.c("hasMinorsAmongSellers") boolean z13, @J81.c("hasPropertyEncumbrances") boolean z14, @J81.c("hasSellerAcceptsProgramTerms") boolean z15, @J81.c("hasSellerConsentsToCall") boolean z16, @J81.c("hasSellerConsentsToPD") boolean z17, @J81.c("itemUrl") @k String str4, @k Continuation<? super TypedResult<com.avito.android.comfortable_deal_invite.generated.api.lead_create_api_v_1.a>> continuation);
}
