package ZE;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import aF.C19762a;
import bF.C25506a;
import cF.C27031a;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: FreemiumApi.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"LZE/a;", "", "", "checkoutContext", "currentFlow", "", "itemId", "Lcom/avito/android/remote/model/TypedResult;", "LaF/a;", "c", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LbF/a;", "b", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LcF/a;", "a", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes13.dex */
public interface a {
    @f("1/freemium/rules")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@t("itemId") long j12, @k Continuation<? super TypedResult<C27031a>> continuation);

    @f("1/freemium/contact-history")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@t("itemId") long j12, @k Continuation<? super TypedResult<C25506a>> continuation);

    @o("1/freemium/accept-rules")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object c(@J81.c("checkoutContext") @l String str, @J81.c("currentFlow") @k String str2, @J81.c("itemId") long j12, @k Continuation<? super TypedResult<C19762a>> continuation);
}
