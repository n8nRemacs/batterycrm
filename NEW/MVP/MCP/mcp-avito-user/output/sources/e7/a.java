package E7;

import H7.d;
import H7.e;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AdvertCollectionApi.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LE7/a;", "", "", "fromPage", "LF7/a;", "request", "Lcom/avito/android/remote/model/TypedResult;", "LF7/b;", "c", "(Ljava/lang/String;LF7/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LG7/a;", "LG7/b;", "a", "(Ljava/lang/String;LG7/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LH7/d;", "LH7/e;", "b", "(Ljava/lang/String;LH7/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes10.dex */
public interface a {
    @o("1/favorites/collections/remove")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@l @t("fromPage") String str, @J81.a @k G7.a aVar, @k Continuation<? super TypedResult<G7.b>> continuation);

    @o("1/favorites/collections/update")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@l @t("fromPage") String str, @J81.a @k d dVar, @k Continuation<? super TypedResult<e>> continuation);

    @o("1/favorites/collections/add")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@l @t("fromPage") String str, @J81.a @k F7.a aVar, @k Continuation<? super TypedResult<F7.b>> continuation);
}
