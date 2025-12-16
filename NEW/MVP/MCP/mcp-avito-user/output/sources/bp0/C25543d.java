package bP0;

import Y61.k;
import Y61.l;
import bP0.AbstractC25542c;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.payment.ParametersTree;
import com.avito.android.wallet.page.topup.form.remote.dto.TopUpForm;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TopUpFormState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LbP0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bP0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C25543d extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f57061e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C25543d f57062f = new C25543d(b.C2001b.f57067a, new ParametersTree(C42784z0.f406748b), AbstractC25542c.b.f57060a);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f57063b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ParametersTree f57064c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AbstractC25542c f57065d;

    /* compiled from: TopUpFormState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbP0/d$a;", "", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bP0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TopUpFormState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LbP0/d$b;", "", "a", "b", "LbP0/d$b$a;", "LbP0/d$b$b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bP0.d$b */
    public interface b {

        /* compiled from: TopUpFormState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbP0/d$b$a;", "LbP0/d$b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: bP0.d$b$a */
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final TopUpForm f57066a;

            public a(@k TopUpForm topUpForm) {
                this.f57066a = topUpForm;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f57066a, ((a) obj).f57066a);
            }

            public final int hashCode() {
                return this.f57066a.hashCode();
            }

            @k
            public final String toString() {
                return "Content(data=" + this.f57066a + ')';
            }
        }

        /* compiled from: TopUpFormState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbP0/d$b$b;", "LbP0/d$b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: bP0.d$b$b, reason: collision with other inner class name */
        public static final /* data */ class C2001b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C2001b f57067a = new C2001b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C2001b);
            }

            public final int hashCode() {
                return -687737906;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }
    }

    public C25543d(@k b bVar, @k ParametersTree parametersTree, @k AbstractC25542c abstractC25542c) {
        this.f57063b = bVar;
        this.f57064c = parametersTree;
        this.f57065d = abstractC25542c;
    }

    public static C25543d a(C25543d c25543d, b bVar, ParametersTree parametersTree, AbstractC25542c abstractC25542c, int i12) {
        if ((i12 & 1) != 0) {
            bVar = c25543d.f57063b;
        }
        if ((i12 & 2) != 0) {
            parametersTree = c25543d.f57064c;
        }
        if ((i12 & 4) != 0) {
            abstractC25542c = c25543d.f57065d;
        }
        c25543d.getClass();
        return new C25543d(bVar, parametersTree, abstractC25542c);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25543d)) {
            return false;
        }
        C25543d c25543d = (C25543d) obj;
        return L.f(this.f57063b, c25543d.f57063b) && L.f(this.f57064c, c25543d.f57064c) && L.f(this.f57065d, c25543d.f57065d);
    }

    public final int hashCode() {
        return this.f57065d.hashCode() + ((this.f57064c.hashCode() + (this.f57063b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "TopUpFormState(loadingState=" + this.f57063b + ", parameters=" + this.f57064c + ", screenState=" + this.f57065d + ')';
    }
}
