package I6;

import AK0.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;

/* compiled from: AdvertSafeDealStorage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI6/b;", "LI6/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f7952a;

    @Inject
    public b(@k l lVar) {
        this.f7952a = lVar;
    }

    @Override // I6.a
    public final void a(@k String str) {
        l lVar = this.f7952a;
        Set<String> setF = lVar.f("safe_deal_item_labels_was_shown");
        if (setF == null) {
            setF = B0.f406639b;
        }
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(setF);
        linkedHashSetO0.add(str);
        lVar.putStringSet("safe_deal_item_labels_was_shown", linkedHashSetO0);
    }

    @Override // I6.a
    @k
    public final Set<String> b() {
        Set<String> setF = this.f7952a.f("safe_deal_item_labels_was_shown");
        return setF == null ? B0.f406639b : setF;
    }
}
