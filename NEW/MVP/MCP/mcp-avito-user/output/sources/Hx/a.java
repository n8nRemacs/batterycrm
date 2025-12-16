package HX;

import J81.o;
import J81.s;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: MachineryRentalApi.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LHX/a;", "", "", "itemId", "Lcom/avito/android/remote/model/TypedResult;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "c", "_avito_machinery-rental_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes14.dex */
public interface a {
    @o("1/machinery-rental/inventory/{itemId}/enable")
    @l
    Object a(@s("itemId") @k String str, @k Continuation<? super TypedResult<Object>> continuation);

    @o("1/machinery-rental/inventory/{itemId}/ignore-banner")
    @l
    Object b(@s("itemId") @k String str, @k Continuation<? super TypedResult<Object>> continuation);

    @o("1/machinery-rental/inventory/{itemId}/disable")
    @l
    Object c(@s("itemId") @k String str, @k Continuation<? super TypedResult<Object>> continuation);
}
