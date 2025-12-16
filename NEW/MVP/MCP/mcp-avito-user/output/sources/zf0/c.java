package ZF0;

import RF0.f;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LZF0/c;", "", "a", "b", "c", "d", "e", "LZF0/c$a;", "LZF0/c$b;", "LZF0/c$c;", "LZF0/c$d;", "LZF0/c$e;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: TrxPromoOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZF0/c$a;", "LZF0/c;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f20033a = new a();
    }

    /* compiled from: TrxPromoOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZF0/c$b;", "LZF0/c;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f20034a = new b();
    }

    /* compiled from: TrxPromoOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZF0/c$c;", "LZF0/c;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ZF0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1433c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f20035a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f20036b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f20037c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f20038d;

        public C1433c(@l Integer num, @l String str, @l String str2, @k DeepLink deepLink) {
            this.f20035a = deepLink;
            this.f20036b = num;
            this.f20037c = str;
            this.f20038d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1433c)) {
                return false;
            }
            C1433c c1433c = (C1433c) obj;
            return L.f(this.f20035a, c1433c.f20035a) && L.f(this.f20036b, c1433c.f20036b) && L.f(this.f20037c, c1433c.f20037c) && L.f(this.f20038d, c1433c.f20038d);
        }

        public final int hashCode() {
            int iHashCode = this.f20035a.hashCode() * 31;
            Integer num = this.f20036b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f20037c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f20038d;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f20035a);
            sb2.append(", commission=");
            sb2.append(this.f20036b);
            sb2.append(", dateFrom=");
            sb2.append(this.f20037c);
            sb2.append(", dateTo=");
            return C22026a.c(sb2, this.f20038d, ')');
        }
    }

    /* compiled from: TrxPromoOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZF0/c$d;", "LZF0/c;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final f f20039a;

        public d(@k f fVar) {
            this.f20039a = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f20039a, ((d) obj).f20039a);
        }

        public final int hashCode() {
            return this.f20039a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenDatePicker(datePickerInfo=" + this.f20039a + ')';
        }
    }

    /* compiled from: TrxPromoOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZF0/c$e;", "LZF0/c;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowError(error=null)";
        }
    }
}
