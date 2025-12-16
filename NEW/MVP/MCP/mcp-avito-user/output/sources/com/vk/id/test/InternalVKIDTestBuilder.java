package com.vk.id.test;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupMembersData;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: InternalVKIDTestBuilder.kt */
@P
@InternalVKIDApi
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/vk/id/test/InternalVKIDTestBuilder;", "", "Lkotlin/Z;", "Lcom/vk/id/test/InternalVKIDTokenPayloadResponse;", "getTokenResponse", "Ljava/lang/Object;", "refreshTokenResponse", "Lcom/vk/id/test/InternalVKIDCodePayloadResponse;", "exchangeTokenResponse", "", "Lcom/vk/id/test/InternalVKIDUserInfoPayloadResponse;", "getUserInfoResponses", "Ljava/util/List;", "Lcom/vk/id/test/InternalVKIDLogoutPayloadResponse;", "logoutResponse", "Lcom/vk/id/test/InternalVKIDSilentAuthProvidersResponse;", "getSilentAuthProvidersResponse", "", "shouldShowSubscriptionResponse", "isServiceAccountResponse", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;", "getGroupResponse", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;", "getMembersResponses", "Lkotlin/G0;", "subscribeToGroupResponses", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVKIDTestBuilder {

    @k
    private Object exchangeTokenResponse;

    @k
    private Object getGroupResponse;

    @k
    private List<Z<InternalVKIDGroupMembersData>> getMembersResponses;

    @k
    private Object getSilentAuthProvidersResponse;

    @k
    private Object getTokenResponse;

    @k
    private List<Z<InternalVKIDUserInfoPayloadResponse>> getUserInfoResponses;

    @k
    private Object isServiceAccountResponse;

    @k
    private Object logoutResponse;

    @k
    private Object refreshTokenResponse;

    @k
    private Object shouldShowSubscriptionResponse;

    @k
    private List<Z<G0>> subscribeToGroupResponses;
}
