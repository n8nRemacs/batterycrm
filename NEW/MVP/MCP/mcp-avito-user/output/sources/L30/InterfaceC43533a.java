package l30;

import J81.e;
import J81.k;
import J81.o;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: NewCarsSendLeadApi.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JD\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll30/a;", "", "", "itemId", "", "name", "phone", SearchParamsConverterKt.SOURCE, "Lcom/avito/android/remote/model/TypedResult;", "a", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_new-cars-send-lead_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: l30.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC43533a {
    @o("1/new-cars/send-lead")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @k({"X-Geo-required: true"})
    @l
    Object a(@J81.c("itemId") @l Long l12, @J81.c("name") @l String str, @J81.c("phone") @Y61.k String str2, @J81.c(SearchParamsConverterKt.SOURCE) @l String str3, @Y61.k Continuation<? super TypedResult<Object>> continuation);
}
