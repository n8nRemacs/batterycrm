package sF0;

import J81.d;
import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import tF0.C48548a;
import uF0.C48890a;

/* compiled from: TravelSearchApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0019\b\u0001\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00040\u0002H§@¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0019\b\u0001\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00040\u0002H§@¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"LsF0/a;", "", "", "", "LX41/o;", "body", "Lcom/avito/android/remote/model/TypedResult;", "LtF0/a;", "a", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LuF0/a;", "b", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: sF0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC48043a {
    @o("1/travel/search/favorites/header")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object a(@d @k Map<String, Object> map, @k Continuation<? super TypedResult<C48548a>> continuation);

    @o("1/travel/search/favorites/items")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@d @k Map<String, Object> map, @k Continuation<? super TypedResult<C48890a>> continuation);
}
