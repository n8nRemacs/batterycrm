package g10;

import Y61.k;
import Y61.l;
import a10.InterfaceC19665b;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.ApplicationHeaderStyle;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootViewState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lg10/d;", "", "a", "b", "c", "Lg10/d$a;", "Lg10/d$b;", "Lg10/d$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d {

    /* compiled from: MortgageRootViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg10/d$a;", "Lg10/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final JZ.c f396256a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<InterfaceC19665b> f396257b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final C40511a f396258c;

        /* compiled from: MortgageRootViewState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: g10.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C11184a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f396259a;

            static {
                int[] iArr = new int[ApplicationHeaderStyle.values().length];
                try {
                    iArr[ApplicationHeaderStyle.DRAFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApplicationHeaderStyle.INFO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApplicationHeaderStyle.SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f396259a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k JZ.c cVar, @k List<? extends InterfaceC19665b> list, @l C40511a c40511a) {
            this.f396256a = cVar;
            this.f396257b = list;
            this.f396258c = c40511a;
        }

        public static a a(a aVar, ArrayList arrayList, C40511a c40511a, int i12) {
            if ((i12 & 4) != 0) {
                c40511a = aVar.f396258c;
            }
            return new a(aVar.f396256a, arrayList, c40511a);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f396256a, aVar.f396256a) && L.f(this.f396257b, aVar.f396257b) && L.f(this.f396258c, aVar.f396258c);
        }

        public final int hashCode() {
            int iE2 = H.e(this.f396256a.hashCode() * 31, 31, this.f396257b);
            C40511a c40511a = this.f396258c;
            return iE2 + (c40511a == null ? 0 : c40511a.hashCode());
        }

        @k
        public final String toString() {
            return "Content(header=" + this.f396256a + ", content=" + this.f396257b + ", floatingNavConfig=" + this.f396258c + ')';
        }
    }

    /* compiled from: MortgageRootViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg10/d$b;", "Lg10/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f396260a;

        public b(@k ApiError apiError) {
            this.f396260a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f396260a, ((b) obj).f396260a);
        }

        public final int hashCode() {
            return this.f396260a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Failed(error="), this.f396260a, ')');
        }
    }

    /* compiled from: MortgageRootViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg10/d$c;", "Lg10/d;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f396261a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 459521645;
        }

        @k
        public final String toString() {
            return "InitialLoading";
        }
    }
}
