package u70;

import J81.f;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import v70.C49176a;

/* compiled from: PhoneProtectionInfoApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu70/a;", "", "", "itemId", "", "phone", "Lcom/avito/android/remote/model/TypedResult;", "Lv70/a;", "a", "(Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_phone-protection-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: u70.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC48811a {
    @f("1/calls/phone_protection/info_banner")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@l @t("itemId") Long l12, @l @t("phone") String str, @k Continuation<? super TypedResult<C49176a>> continuation);
}
