package aw;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import bw.C25727a;
import com.avito.android.remote.model.TypedResult;
import cw.C39420a;
import dw.C39809a;
import dw.C39810b;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: DeliveryTarifikatorApi.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Law/a;", "", "", "deliveryType", "", "id", "Lcom/avito/android/remote/model/TypedResult;", "Lbw/a;", "b", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcw/a;", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldw/b;", "request", "Ldw/a;", "a", "(Ldw/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: aw.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC24182a {
    @o("2/logistics/seller/tariff/update")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@J81.a @k C39810b c39810b, @k Continuation<? super TypedResult<C39809a>> continuation);

    @o("2/logistics/seller/custom/tariff/delete")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@J81.c("deliveryType") @l String str, @J81.c("id") @l Long l12, @k Continuation<? super TypedResult<C25727a>> continuation);

    @f("2/logistics/seller/tariff")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@t("deliveryType") @k String str, @k Continuation<? super TypedResult<C39420a>> continuation);
}
