package d10;

import R2.b;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mortgage.api.model.items.application.ImmutableInfoDescription;
import com.avito.android.mortgage.api.model.items.application.ImmutableInfoDescriptionTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ImmutableInfoDescriptionState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ld10/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d10.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C39483c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f393617h = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImmutableInfoDescription f393618b;

    /* renamed from: c, reason: collision with root package name */
    public final int f393619c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f393620d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f393621e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f393622f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImmutableInfoDescriptionTab f393623g;

    /* compiled from: ImmutableInfoDescriptionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ld10/c$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d10.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C39483c(@k ImmutableInfoDescription immutableInfoDescription, int i12, @k String str, @k String str2) {
        this.f393618b = immutableInfoDescription;
        this.f393619c = i12;
        this.f393620d = str;
        this.f393621e = str2;
        List<ImmutableInfoDescriptionTab> listD = immutableInfoDescription.d();
        ArrayList arrayList = new ArrayList(C42745f0.q(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(new R2.b(new b.c.a(((ImmutableInfoDescriptionTab) it.next()).getTitle()), null, false, 6, null));
        }
        this.f393622f = arrayList;
        this.f393623g = this.f393618b.d().get(this.f393619c);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39483c)) {
            return false;
        }
        C39483c c39483c = (C39483c) obj;
        return L.f(this.f393618b, c39483c.f393618b) && this.f393619c == c39483c.f393619c && L.f(this.f393620d, c39483c.f393620d) && L.f(this.f393621e, c39483c.f393621e);
    }

    public final int hashCode() {
        return this.f393621e.hashCode() + H.d(r.e(this.f393619c, this.f393618b.hashCode() * 31, 31), 31, this.f393620d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableInfoDescriptionState(content=");
        sb2.append(this.f393618b);
        sb2.append(", selectedTabIdx=");
        sb2.append(this.f393619c);
        sb2.append(", applicationId=");
        sb2.append(this.f393620d);
        sb2.append(", currentMortgageStage=");
        return C22026a.c(sb2, this.f393621e, ')');
    }
}
