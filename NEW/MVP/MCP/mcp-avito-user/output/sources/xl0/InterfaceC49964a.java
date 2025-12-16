package xl0;

import J81.f;
import J81.s;
import J81.t;
import Y61.k;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.reseller.model.MessageLinkResponse;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: AutoResellerApi.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxl0/a;", "", "", "itemId", "", "writeOffConfirmed", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/reseller/model/MessageLinkResponse;", "a", "(Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_auto-reseller"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: xl0.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC49964a {
    @f("1/items/{itemId}/chat")
    @k
    I<TypedResult<MessageLinkResponse>> a(@s("itemId") @k String itemId, @t("writeOffConfirmed") boolean writeOffConfirmed);
}
