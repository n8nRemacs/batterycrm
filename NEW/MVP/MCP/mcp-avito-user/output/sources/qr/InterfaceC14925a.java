package Qr;

import J81.e;
import J81.o;
import Rr.g;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CptApi.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0001\u0010\t\u001a\u00020\u0003H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LQr/a;", "", "", "", "itemIds", "Lcom/avito/android/remote/model/TypedResult;", "LRr/g;", "b", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "itemId", "LSr/o;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Qr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14925a {
    @o("3/cpt/estimate/activate")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object a(@J81.c("itemId") long j12, @k Continuation<? super TypedResult<Sr.o>> continuation);

    @o("2/cpt/estimate/activate/bulk")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@J81.c("itemIds") @k List<Long> list, @k Continuation<? super TypedResult<g>> continuation);
}
