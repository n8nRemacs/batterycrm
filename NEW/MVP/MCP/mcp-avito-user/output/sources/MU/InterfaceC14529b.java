package Mu;

import J81.f;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: DeeplinkApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LMu/b;", "", "", ContextActionHandler.Link.URL, "referrerUrl", "Lio/reactivex/rxjava3/core/z;", "Lcom/avito/android/remote/model/TypedResult;", "LMu/a;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/z;", "_avito-discouraged_avito-api_deep-linking"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Mu.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14529b {
    @f("1/app_link")
    @k
    z<TypedResult<C14528a>> a(@t(ContextActionHandler.Link.URL) @k String url, @l @t("referrerUrl") String referrerUrl);
}
