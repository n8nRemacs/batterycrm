package bk0;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import ck0.C27212a;
import com.avito.android.remote.model.TypedResult;
import dk0.C39747a;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: DeliveryApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lbk0/a;", "", "Lcom/avito/android/remote/model/TypedResult;", "Lck0/a;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "key", "context", "", "itemId", "Ldk0/a;", "b", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: bk0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC25671a {
    @f("1/delivery/order/cancel/bottomsheet/show")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@k Continuation<? super TypedResult<C27212a>> continuation);

    @o("2/delivery/request/create")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@l @t("key") String str, @J81.c("context") @l String str2, @J81.c("itemId") long j12, @k Continuation<? super TypedResult<C39747a>> continuation);
}
