package hB;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.extended_profile_universal_widget_edit.create.adapter.section.UniversalWidgetCreateSectionItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetCreateState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhB/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hB.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C40800c extends q {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f397099b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<UniversalWidgetCreateSectionItem> f397100c;

    public C40800c() {
        this(false, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C40800c a(C40800c c40800c, boolean z12, ArrayList arrayList, int i12) {
        if ((i12 & 1) != 0) {
            z12 = c40800c.f397099b;
        }
        List list = arrayList;
        if ((i12 & 2) != 0) {
            list = c40800c.f397100c;
        }
        c40800c.getClass();
        return new C40800c(z12, list);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40800c)) {
            return false;
        }
        C40800c c40800c = (C40800c) obj;
        return this.f397099b == c40800c.f397099b && L.f(this.f397100c, c40800c.f397100c);
    }

    public final int hashCode() {
        return this.f397100c.hashCode() + (Boolean.hashCode(this.f397099b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalWidgetCreateState(isLoading=");
        sb2.append(this.f397099b);
        sb2.append(", items=");
        return H.p(sb2, this.f397100c, ')');
    }

    public C40800c(boolean z12, @k List<UniversalWidgetCreateSectionItem> list) {
        this.f397099b = z12;
        this.f397100c = list;
    }

    public C40800c(boolean z12, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? C42784z0.f406748b : list);
    }
}
