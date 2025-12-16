package fL0;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import gL0.C40597a;
import hL0.C40846a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: VasAutoprolongApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJR\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LfL0/a;", "", "", "itemId", "", "checkoutContext", "Lcom/avito/android/remote/model/TypedResult;", "LhL0/a;", "b", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "externalId", "", "isAutoprolongEnabled", "price", "registryId", "LgL0/a;", "a", "(Ljava/lang/String;JZJJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: fL0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC40310a {
    @o("1/vas/autoprolong/set")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object a(@J81.c("checkoutContext") @k String str, @J81.c("externalId") long j12, @J81.c("isAutoprolongEnabled") boolean z12, @J81.c("itemId") long j13, @J81.c("price") long j14, @J81.c("registryId") long j15, @k Continuation<? super TypedResult<C40597a>> continuation);

    @f("1/vas/autoprolong")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@t("itemId") long j12, @t("checkoutContext") @k String str, @k Continuation<? super TypedResult<C40846a>> continuation);
}
