package kv0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PortfolioProjectSellerOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lkv0/c;", "", "a", "b", "c", "Lkv0/c$a;", "Lkv0/c$b;", "Lkv0/c$c;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: PortfolioProjectSellerOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkv0/c$a;", "Lkv0/c;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f413272a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2015849152;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: PortfolioProjectSellerOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkv0/c$c;", "Lkv0/c;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kv0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11763c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f413275a;

        public C11763c(@k String str) {
            this.f413275a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11763c) && L.f(this.f413275a, ((C11763c) obj).f413275a);
        }

        public final int hashCode() {
            return this.f413275a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowError(error="), this.f413275a, ')');
        }
    }

    /* compiled from: PortfolioProjectSellerOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkv0/c$b;", "Lkv0/c;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Image> f413273a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f413274b;

        public b(@k List<Image> list, @l Integer num) {
            this.f413273a = list;
            this.f413274b = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f413273a, bVar.f413273a) && L.f(this.f413274b, bVar.f413274b);
        }

        public final int hashCode() {
            int iHashCode = this.f413273a.hashCode() * 31;
            Integer num = this.f413274b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenGallery(images=");
            sb2.append(this.f413273a);
            sb2.append(", startPosition=");
            return s.j(sb2, this.f413274b, ')');
        }

        public /* synthetic */ b(List list, Integer num, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? 0 : num);
        }
    }
}
