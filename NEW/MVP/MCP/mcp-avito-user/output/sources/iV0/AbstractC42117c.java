package iv0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.AdvertAction;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PortfolioProjectBuyerState.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Liv0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "Liv0/c$b;", "Liv0/c$c;", "Liv0/c$d;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iv0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC42117c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f405373b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final d f405374c = d.f405379d;

    /* compiled from: PortfolioProjectBuyerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liv0/c$a;", "", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iv0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PortfolioProjectBuyerState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liv0/c$b;", "Liv0/c;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iv0.c$b */
    public static final /* data */ class b extends AbstractC42117c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final C42118d f405375d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AdvertAction.Messenger f405376e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final AdvertAction.Phone f405377f;

        public b(@k C42118d c42118d, @l AdvertAction.Messenger messenger, @l AdvertAction.Phone phone) {
            super(null);
            this.f405375d = c42118d;
            this.f405376e = messenger;
            this.f405377f = phone;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f405375d, bVar.f405375d) && L.f(this.f405376e, bVar.f405376e) && L.f(this.f405377f, bVar.f405377f);
        }

        public final int hashCode() {
            int iHashCode = this.f405375d.hashCode() * 31;
            AdvertAction.Messenger messenger = this.f405376e;
            int iHashCode2 = (iHashCode + (messenger == null ? 0 : messenger.hashCode())) * 31;
            AdvertAction.Phone phone = this.f405377f;
            return iHashCode2 + (phone != null ? phone.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ContentLoaded(projectBuyer=" + this.f405375d + ", messageAction=" + this.f405376e + ", phoneAction=" + this.f405377f + ')';
        }
    }

    /* compiled from: PortfolioProjectBuyerState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liv0/c$c;", "Liv0/c;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iv0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11542c extends AbstractC42117c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ApiError f405378d;

        public C11542c(@k ApiError apiError) {
            super(null);
            this.f405378d = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11542c) && L.f(this.f405378d, ((C11542c) obj).f405378d);
        }

        public final int hashCode() {
            return this.f405378d.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f405378d, ')');
        }
    }

    /* compiled from: PortfolioProjectBuyerState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liv0/c$d;", "Liv0/c;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iv0.c$d */
    public static final /* data */ class d extends AbstractC42117c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final d f405379d = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1654197998;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ AbstractC42117c(C42822w c42822w) {
        this();
    }

    public AbstractC42117c() {
    }
}
