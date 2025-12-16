package sR;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import sR.AbstractC48101d;

/* compiled from: LegalRequestState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LsR/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sR.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C48100c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f437655d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C48100c f437656e = new C48100c(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC40048c f437657b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC48101d f437658c;

    /* compiled from: LegalRequestState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsR/c$a;", "", "<init>", "()V", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C48100c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48100c)) {
            return false;
        }
        C48100c c48100c = (C48100c) obj;
        return L.f(this.f437657b, c48100c.f437657b) && L.f(this.f437658c, c48100c.f437658c);
    }

    public final int hashCode() {
        return this.f437658c.hashCode() + (this.f437657b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "LegalRequestState(beduinState=" + this.f437657b + ", viewState=" + this.f437658c + ')';
    }

    public /* synthetic */ C48100c(AbstractC40048c abstractC40048c, AbstractC48101d abstractC48101d, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? AbstractC40048c.C11084c.f395217b : abstractC40048c, (i12 & 2) != 0 ? AbstractC48101d.c.f437661a : abstractC48101d);
    }

    public C48100c(@k AbstractC40048c abstractC40048c, @k AbstractC48101d abstractC48101d) {
        this.f437657b = abstractC40048c;
        this.f437658c = abstractC48101d;
    }
}
