package bo;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TreeState.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lbo/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bo.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C25686c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f57445f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C25686c f57446g = new C25686c(false, null, null, null, 15, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f57447b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f57448c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f57449d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<com.avito.android.category_items_tree.screens.tree_screen.k> f57450e;

    /* compiled from: TreeState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbo/c$a;", "", "<init>", "()V", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bo.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C25686c() {
        this(false, null, null, null, 15, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25686c)) {
            return false;
        }
        C25686c c25686c = (C25686c) obj;
        return this.f57447b == c25686c.f57447b && L.f(this.f57448c, c25686c.f57448c) && L.f(this.f57449d, c25686c.f57449d) && L.f(this.f57450e, c25686c.f57450e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f57447b) * 31;
        AttributedText attributedText = this.f57448c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f57449d;
        return this.f57450e.hashCode() + ((iHashCode2 + (attributedText2 != null ? attributedText2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TreeState(isLoading=");
        sb2.append(this.f57447b);
        sb2.append(", title=");
        sb2.append(this.f57448c);
        sb2.append(", subtitle=");
        sb2.append(this.f57449d);
        sb2.append(", items=");
        return H.p(sb2, this.f57450e, ')');
    }

    public C25686c(@k List list, @l AttributedText attributedText, boolean z12, @l AttributedText attributedText2) {
        this.f57447b = z12;
        this.f57448c = attributedText;
        this.f57449d = attributedText2;
        this.f57450e = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C25686c(boolean z12, AttributedText attributedText, AttributedText attributedText2, List list, int i12, C42822w c42822w) {
        z12 = (i12 & 1) != 0 ? false : z12;
        this((i12 & 8) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? null : attributedText, z12, (i12 & 4) != 0 ? null : attributedText2);
    }
}
