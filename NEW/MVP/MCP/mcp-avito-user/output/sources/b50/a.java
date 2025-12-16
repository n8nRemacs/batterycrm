package B50;

import A50.b;
import Y61.k;
import Y61.l;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;

/* compiled from: PaidServicesCompositeFragmentFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LB50/a;", "LA50/b;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_paid-services_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements b<DeepLink> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f876a;

    public a(@k LinkedHashMap linkedHashMap) {
        this.f876a = linkedHashMap;
    }

    @Override // A50.b
    @l
    public final Fragment a(@k DeepLink deepLink) {
        A50.a aVar = (A50.a) this.f876a.get(m0.f406844a.b(deepLink.getClass()));
        b<? extends DeepLink> bVar = aVar != null ? aVar.f99b : null;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar.a(deepLink);
        }
        return null;
    }
}
