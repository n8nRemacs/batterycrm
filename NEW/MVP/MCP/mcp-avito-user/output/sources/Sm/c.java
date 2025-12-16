package SM;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.important_addresses_selection.domain.model.ImportantAddressesSelectionData;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ImportantAddressesSelectionState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LSM/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f14928d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final c f14929e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImportantAddressesSelectionData f14930b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f14931c;

    /* compiled from: ImportantAddressesSelectionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSM/c$a;", "", "<init>", "()V", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        ImportantAddressesSelectionData importantAddressesSelectionData = new ImportantAddressesSelectionData("", null, C42784z0.f406748b, 0, new ImportantAddressesSelectionData.AdditionalAction(null, new ImportantAddressesSelectionData.AdditionalAction.Button(ImportantAddressesSelectionData.AdditionalAction.Button.ButtonType.f169772b, "", new NoMatchLink())), new ImportantAddressesSelectionData.Button("", ""), "");
        d.f14932c.getClass();
        f14929e = new c(importantAddressesSelectionData, d.f14933d);
    }

    public c(@k ImportantAddressesSelectionData importantAddressesSelectionData, @k d dVar) {
        this.f14930b = importantAddressesSelectionData;
        this.f14931c = dVar;
    }

    public static c a(c cVar, ImportantAddressesSelectionData importantAddressesSelectionData, d dVar, int i12) {
        if ((i12 & 1) != 0) {
            importantAddressesSelectionData = cVar.f14930b;
        }
        if ((i12 & 2) != 0) {
            dVar = cVar.f14931c;
        }
        cVar.getClass();
        return new c(importantAddressesSelectionData, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f14930b, cVar.f14930b) && L.f(this.f14931c, cVar.f14931c);
    }

    public final int hashCode() {
        return this.f14931c.f14934b.hashCode() + (this.f14930b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ImportantAddressesSelectionState(data=" + this.f14930b + ", viewState=" + this.f14931c + ')';
    }
}
