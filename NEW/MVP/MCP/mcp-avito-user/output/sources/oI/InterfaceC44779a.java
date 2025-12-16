package oi;

import J81.d;
import J81.e;
import J81.f;
import J81.o;
import J81.p;
import J81.u;
import J81.y;
import Y61.k;
import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.avito.android.beduin_shared.model.action.BeduinActionsResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import kotlin.Metadata;
import pi.C47091b;

/* compiled from: BeduinApi.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ;\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\nJ;\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\nJ;\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u0011\u0010\nJ%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00070\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Loi/a;", "", "", "nextPage", "", "extraParameters", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "d", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "path", "query", "Lcom/avito/android/beduin_shared/model/action/BeduinActionsResponse;", "c", "body", "e", "b", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", ContextActionHandler.Link.URL, "Lpi/b;", "f", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: oi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC44779a {
    @J81.b
    @k
    I<TypedResult<BeduinActionsResponse>> a(@y @k String path);

    @e
    @p
    @k
    I<TypedResult<BeduinActionsResponse>> b(@y @k String path, @d @k Map<String, String> body);

    @f
    @k
    I<TypedResult<BeduinActionsResponse>> c(@y @k String path, @u @k Map<String, String> query);

    @f
    @k
    I<TypedResult<BeduinUniversalPageContent>> d(@y @k String nextPage, @u @k Map<String, String> extraParameters);

    @o
    @e
    @k
    I<TypedResult<BeduinActionsResponse>> e(@y @k String path, @d @k Map<String, String> body);

    @f
    @k
    I<TypedResult<C47091b>> f(@y @k String url);
}
