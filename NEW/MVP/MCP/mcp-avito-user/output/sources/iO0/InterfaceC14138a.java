package Io0;

import J81.k;
import J81.p;
import J81.s;
import Jo0.C14232c;
import Jo0.d;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SavedSearchesCoreApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LIo0/a;", "", "", "filterId", "LJo0/d;", "request", "Lcom/avito/android/remote/model/TypedResult;", "LJo0/c;", "a", "(JLJo0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_saved-searches-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Io0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14138a {
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    @p("4/subscriptions/{filterId}")
    Object a(@s("filterId") long j12, @J81.a @Y61.k d dVar, @Y61.k Continuation<? super TypedResult<C14232c>> continuation);
}
