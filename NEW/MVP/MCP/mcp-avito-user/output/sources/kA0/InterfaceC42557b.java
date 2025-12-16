package kA0;

import J81.o;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SuggestApi.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LkA0/b;", "", "", "query", "", "categoryId", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "LkA0/e;", "a", "(Ljava/lang/CharSequence;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "b", "(Ljava/lang/CharSequence;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_suggest"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: kA0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC42557b {
    @o("1/suggest/vertical")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @k
    z<TypedResult<C42560e>> a(@J81.c("query") @k CharSequence query, @J81.c("category_id") @l String categoryId);

    @o("1/suggest/vertical")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @J81.e
    @SuppressLint({"ApiWithoutContracts"})
    @l
    Object b(@J81.c("query") @k CharSequence charSequence, @J81.c("category_id") @l String str, @k Continuation<? super TypedResult<C42560e>> continuation);
}
