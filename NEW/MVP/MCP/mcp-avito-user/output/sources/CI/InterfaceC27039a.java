package cI;

import J81.f;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import dI.C39584a;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: GsmS2BCallActionApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LcI/a;", "", "", "buyerHash", "", "itemId", SearchParamsConverterKt.SOURCE, "Lcom/avito/android/remote/model/TypedResult;", "LdI/a;", "a", "(Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_gsm-s2b-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: cI.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC27039a {
    @f("1/calltracking/getS2BCallAction")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@t("buyerHash") @k String str, @t("itemId") long j12, @t(SearchParamsConverterKt.SOURCE) @k String str2, @k Continuation<? super TypedResult<C39584a>> continuation);
}
