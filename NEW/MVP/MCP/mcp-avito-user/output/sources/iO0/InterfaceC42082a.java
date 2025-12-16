package io0;

import J81.e;
import J81.f;
import J81.k;
import J81.o;
import J81.t;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import jo0.C42408d;
import ko0.C42722a;
import ko0.InterfaceC42723b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import lo0.InterfaceC43811a;
import mo0.InterfaceC44112a;
import no0.InterfaceC44459b;
import oo0.InterfaceC44834b;

/* compiled from: SafetyApi.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00072\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\b\b\u0001\u0010\u001c\u001a\u00020\u0005H§@¢\u0006\u0004\b\u001e\u0010\u0016¨\u0006\u001f"}, d2 = {"Lio0/a;", "", "", "timezone", "cursor", "", SearchParamsConverterKt.SOURCE, "Lcom/avito/android/remote/model/TypedResult;", "Ljo0/d;", "e", "(JLjava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lko0/a;", "request", "Lko0/b;", "b", "(Lko0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmo0/a;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "phone", "Lno0/b;", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "code", "hash", "Loo0/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "src", "Llo0/a;", "c", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: io0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC42082a {
    @o("2/tfa/enable/confirm")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @k({"X-Geo-required: true"})
    @l
    Object a(@J81.c("code") @l String str, @J81.c("hash") @l String str2, @Y61.k Continuation<? super TypedResult<InterfaceC44834b>> continuation);

    @o("2/tfa/disable/confirm")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object b(@J81.a @Y61.k C42722a c42722a, @Y61.k Continuation<? super TypedResult<InterfaceC42723b>> continuation);

    @o("3/tfa/disable")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object c(@J81.c("src") @Y61.k String str, @Y61.k Continuation<? super TypedResult<InterfaceC43811a>> continuation);

    @o("2/tfa/enable/code/request")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object d(@J81.c("phone") @Y61.k String str, @Y61.k Continuation<? super TypedResult<InterfaceC44459b>> continuation);

    @f("1/safety/settings")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object e(@t("timezone") long j12, @l @t("cursor") Long l12, @l @t(SearchParamsConverterKt.SOURCE) String str, @Y61.k Continuation<? super TypedResult<C42408d>> continuation);

    @o("2/tfa/enable")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object f(@Y61.k Continuation<? super TypedResult<InterfaceC44112a>> continuation);
}
