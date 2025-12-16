package iK0;

import J81.k;
import J81.o;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import jK0.C42271a;
import jK0.C42272b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: UserViewedApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LiK0/a;", "", "LjK0/b;", "request", "Lcom/avito/android/remote/model/TypedResult;", "LjK0/a;", "a", "(LjK0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: iK0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC41310a {
    @o("1/user-habits/viewed-items/enrich")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @k({"X-Geo-required: true"})
    @l
    Object a(@J81.a @Y61.k C42272b c42272b, @Y61.k Continuation<? super TypedResult<C42271a>> continuation);
}
