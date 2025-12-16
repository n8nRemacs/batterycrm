package YM0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.verification.verification_status_list.m;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StatusListState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LYM0/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "LYM0/b$a;", "LYM0/b$b;", "LYM0/b$c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class b extends q {

    /* compiled from: StatusListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYM0/b$a;", "LYM0/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f19456b;

        public a(@k PrintableText printableText) {
            super(null);
            this.f19456b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f19456b, ((a) obj).f19456b);
        }

        public final int hashCode() {
            return this.f19456b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("Error(message="), this.f19456b, ')');
        }
    }

    /* compiled from: StatusListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYM0/b$b;", "LYM0/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: YM0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1377b extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final m f19457b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, String> f19458c;

        public C1377b(@k m mVar, @k Map<String, String> map) {
            super(null);
            this.f19457b = mVar;
            this.f19458c = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1377b)) {
                return false;
            }
            C1377b c1377b = (C1377b) obj;
            return L.f(this.f19457b, c1377b.f19457b) && L.f(this.f19458c, c1377b.f19458c);
        }

        public final int hashCode() {
            return this.f19458c.hashCode() + (this.f19457b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(screenData=");
            sb2.append(this.f19457b);
            sb2.append(", meta=");
            return r.w(sb2, this.f19458c, ')');
        }
    }

    /* compiled from: StatusListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYM0/b$c;", "LYM0/b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f19459b = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1941191249;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    public b() {
    }
}
