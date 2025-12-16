package Nc;

import J81.o;
import J81.s;
import Oc.C14670a;
import Pc.C14766a;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AnalyticsCallApi.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LNc/a;", "", "", "itemId", "LOc/a;", "request", "Lcom/avito/android/remote/model/TypedResult;", "a", "(JLOc/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LPc/a;", "b", "(JLPc/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_analytics-call_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Nc.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14558a {
    @o("3/items/{itemId}/call")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@s("itemId") long j12, @J81.a @k C14670a c14670a, @k Continuation<? super TypedResult<Object>> continuation);

    @o("3/items/{itemId}/call/confirm")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@s("itemId") long j12, @J81.a @k C14766a c14766a, @k Continuation<? super TypedResult<Object>> continuation);
}
