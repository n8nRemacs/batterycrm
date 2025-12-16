package Wi;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.custom.c;
import com.avito.android.beduin_shared.model.action.custom.reloadScreen.BeduinReloadScreenAction;
import com.avito.android.beduin_shared.model.form.ParamsSource;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import org.webrtc.h;

/* compiled from: BeduinReloadScreenActionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"LWi/b;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/beduin_shared/model/action/custom/reloadScreen/BeduinReloadScreenAction;", "<init>", "()V", "a", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements c<BeduinReloadScreenAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<a> f18019a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C41981q0 f18020b;

    /* compiled from: BeduinReloadScreenActionHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWi/b$a;", "", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final LinkedHashMap f18021a;

        public a(@l LinkedHashMap linkedHashMap) {
            this.f18021a = linkedHashMap;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f18021a.equals(((a) obj).f18021a);
        }

        public final int hashCode() {
            return this.f18021a.hashCode();
        }

        @k
        public final String toString() {
            return h.e(new StringBuilder("Parameters(params="), this.f18021a, ')');
        }
    }

    public b() {
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f18019a = cVar;
        this.f18020b = new C41981q0(cVar);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        BeduinReloadScreenAction beduinReloadScreenAction = (BeduinReloadScreenAction) beduinAction;
        lj.c cVarH = interfaceC40691b.h();
        LinkedHashMap linkedHashMapA = cVarH.a(beduinReloadScreenAction.getFormParamsMap());
        Map<String, Object> params = beduinReloadScreenAction.getParams();
        if (params == null) {
            params = P0.c();
        }
        List<ParamsSource> paramsSources = beduinReloadScreenAction.getParamsSources();
        if (paramsSources == null) {
            paramsSources = C42784z0.f406748b;
        }
        Map mapC = P0.c();
        Iterator<T> it = paramsSources.iterator();
        while (it.hasNext()) {
            mapC = P0.k(mapC, ((ParamsSource) it.next()).extractParams(cVarH));
        }
        this.f18019a.accept(new a(P0.k(P0.k(params, linkedHashMapA), mapC)));
    }
}
