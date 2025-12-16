package Do;

import J81.d;
import J81.e;
import J81.o;
import Y61.k;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ClientEventBusApi.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LDo/a;", "", "", "", "topics", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "a", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/I;", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Do.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC13423a {
    @o("2/client-event-bus/subscribe")
    @e
    @k
    I<TypedResult<G0>> a(@d @k Map<String, String> topics);
}
