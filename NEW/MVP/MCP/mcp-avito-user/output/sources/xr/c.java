package Xr;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PreActivationState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LXr/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f19090f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final c f19091g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19092b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f19093c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<b> f19094d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f19095e;

    /* compiled from: PreActivationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXr/c$a;", "", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PreActivationState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXr/c$b;", "", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f19096a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f19097b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f19098c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f19099d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f19100e;

        public b(@k DeepLink deepLink, @k String str, @k String str2, @k String str3, boolean z12) {
            this.f19096a = str;
            this.f19097b = str2;
            this.f19098c = str3;
            this.f19099d = deepLink;
            this.f19100e = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f19096a, bVar.f19096a) && L.f(this.f19097b, bVar.f19097b) && L.f(this.f19098c, bVar.f19098c) && L.f(this.f19099d, bVar.f19099d) && this.f19100e == bVar.f19100e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f19100e) + com.avito.android.actions_sheet.a.e(this.f19099d, H.d(H.d(this.f19096a.hashCode() * 31, 31, this.f19097b), 31, this.f19098c), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Option(id=");
            sb2.append(this.f19096a);
            sb2.append(", title=");
            sb2.append(this.f19097b);
            sb2.append(", description=");
            sb2.append(this.f19098c);
            sb2.append(", deepLink=");
            sb2.append(this.f19099d);
            sb2.append(", checked=");
            return r.x(sb2, this.f19100e, ')');
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f19091g = new c("", new AttributedText("", c42784z0, 0, 4, null), c42784z0, "");
    }

    public c(@k String str, @k AttributedText attributedText, @k List<b> list, @k String str2) {
        this.f19092b = str;
        this.f19093c = attributedText;
        this.f19094d = list;
        this.f19095e = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f19092b, cVar.f19092b) && L.f(this.f19093c, cVar.f19093c) && L.f(this.f19094d, cVar.f19094d) && L.f(this.f19095e, cVar.f19095e);
    }

    public final int hashCode() {
        return this.f19095e.hashCode() + H.e(com.avito.android.actions_sheet.a.b(this.f19092b.hashCode() * 31, 31, this.f19093c), 31, this.f19094d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreActivationState(title=");
        sb2.append(this.f19092b);
        sb2.append(", description=");
        sb2.append(this.f19093c);
        sb2.append(", options=");
        sb2.append(this.f19094d);
        sb2.append(", buttonTitle=");
        return C22026a.c(sb2, this.f19095e, ')');
    }
}
