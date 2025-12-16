package G00;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PersonFormViewState.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LG00/e;", "", "<init>", "()V", "a", "b", "c", "LG00/e$a;", "LG00/e$b;", "LG00/e$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class e {

    /* compiled from: PersonFormViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG00/e$a;", "LG00/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final d f6164a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<PersonFormItem> f6165b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final G00.a f6166c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f6167d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k d dVar, @k List<? extends PersonFormItem> list, @l G00.a aVar, boolean z12) {
            super(null);
            this.f6164a = dVar;
            this.f6165b = list;
            this.f6166c = aVar;
            this.f6167d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f6164a, aVar.f6164a) && L.f(this.f6165b, aVar.f6165b) && L.f(this.f6166c, aVar.f6166c) && this.f6167d == aVar.f6167d;
        }

        public final int hashCode() {
            int iE2 = H.e(this.f6164a.hashCode() * 31, 31, this.f6165b);
            G00.a aVar = this.f6166c;
            return Boolean.hashCode(this.f6167d) + ((iE2 + (aVar == null ? 0 : aVar.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(staticContent=");
            sb2.append(this.f6164a);
            sb2.append(", form=");
            sb2.append(this.f6165b);
            sb2.append(", errorsCounterState=");
            sb2.append(this.f6166c);
            sb2.append(", scrollToNextError=");
            return r.x(sb2, this.f6167d, ')');
        }
    }

    /* compiled from: PersonFormViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG00/e$b;", "LG00/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final d f6168a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f6169b;

        public b(@k d dVar, @k ApiError apiError) {
            super(null);
            this.f6168a = dVar;
            this.f6169b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f6168a, bVar.f6168a) && L.f(this.f6169b, bVar.f6169b);
        }

        public final int hashCode() {
            return this.f6169b.hashCode() + (this.f6168a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InitialFailed(staticContent=");
            sb2.append(this.f6168a);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f6169b, ')');
        }
    }

    /* compiled from: PersonFormViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG00/e$c;", "LG00/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final d f6170a;

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f6170a, ((c) obj).f6170a);
        }

        public final int hashCode() {
            return this.f6170a.hashCode();
        }

        @k
        public final String toString() {
            return "InitialLoading(staticContent=" + this.f6170a + ')';
        }

        public /* synthetic */ c(d dVar, int i12, C42822w c42822w) {
            if ((i12 & 1) != 0) {
                dVar = new d(null, 0, 0, false, 15, null);
            }
            this(dVar);
        }

        public c(@k d dVar) {
            super(null);
            this.f6170a = dVar;
        }
    }

    public /* synthetic */ e(C42822w c42822w) {
        this();
    }

    public e() {
    }
}
