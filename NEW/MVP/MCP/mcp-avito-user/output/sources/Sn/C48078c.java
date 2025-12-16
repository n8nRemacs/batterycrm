package sN;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.serp.adapter.l1;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImvSimilarAdvertsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LsN/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sN.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C48078c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f437631c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C48078c f437632d = new C48078c(P2.c.f318721a);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final P2<UV0.c<l1>> f437633b;

    /* compiled from: ImvSimilarAdvertsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsN/c$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sN.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C48078c(@k P2<? super UV0.c<l1>> p22) {
        this.f437633b = p22;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C48078c) && L.f(this.f437633b, ((C48078c) obj).f437633b);
    }

    public final int hashCode() {
        return this.f437633b.hashCode();
    }

    @k
    public final String toString() {
        return "ImvSimilarAdvertsState(data=" + this.f437633b + ')';
    }
}
