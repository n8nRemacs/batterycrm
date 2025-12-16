package ks0;

import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ls0.C43825a;
import ms0.C44127a;
import ms0.C44128b;
import ns0.C44473a;

/* compiled from: SerpApi.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0019\b\u0001\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00110\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lks0/a;", "", "", "token", "Lcom/avito/android/remote/model/TypedResult;", "Lns0/a;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lms0/b;", "request", "Lms0/a;", "a", "(Lms0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "categoryId", "context", "", "LX41/o;", "Lls0/a;", "c", "(JLjava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: ks0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC43493a {
    @o("1/user-habits/viewed-items/tooltip")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@J81.a @k C44128b c44128b, @k Continuation<? super TypedResult<C44127a>> continuation);

    @f("1/favorites/items_ids/price_was_lowered")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true"})
    @l
    Object b(@l @t("token") String str, @k Continuation<? super TypedResult<C44473a>> continuation);

    @o("3/user-habits/last-filters-saved/tooltip")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@t("categoryId") long j12, @l @t("context") String str, @J81.a @k Map<String, Object> map, @k Continuation<? super TypedResult<C43825a>> continuation);
}
