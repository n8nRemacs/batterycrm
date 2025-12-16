package J20;

import J81.e;
import J81.o;
import J81.s;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: MultiUrgencyApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LJ20/a;", "", "", "itemId", "", "isActive", "urgencyTypeID", "Lcom/avito/android/remote/model/TypedResult;", "LK20/c;", "a", "(JZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_multi-urgency_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes15.dex */
public interface a {
    @o("2/items/{itemId}/setTypedUrgency")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object a(@s("itemId") long j12, @J81.c("isActive") boolean z12, @J81.c("urgencyTypeID") long j13, @k Continuation<? super TypedResult<K20.c>> continuation);
}
