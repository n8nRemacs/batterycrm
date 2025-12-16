package Ve;

import J81.f;
import J81.i;
import J81.s;
import J81.t;
import We.q;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AutoResellerContactsApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\\\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVe/a;", "", "", "userAgent", "", "itemId", "context", "networkType", "scenario", "", "writeOffConfirmed", "Lcom/avito/android/remote/model/TypedResult;", "LWe/q;", "a", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Ve.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC15669a {
    @f("3/items/{itemId}/chat")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@i("User-Agent") @l String str, @s("itemId") long j12, @l @t("context") String str2, @l @t("networkType") String str3, @l @t("scenario") String str4, @l @t("writeOffConfirmed") Boolean bool, @k Continuation<? super TypedResult<q>> continuation);
}
