package MF0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsConfigureOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LMF0/c;", "", "a", "b", "c", "LMF0/c$a;", "LMF0/c$b;", "LMF0/c$c;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: TrxPromoGoodsConfigureOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMF0/c$a;", "LMF0/c;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f10505a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1915471628;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TrxPromoGoodsConfigureOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMF0/c$b;", "LMF0/c;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f10506a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1635703859;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: TrxPromoGoodsConfigureOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMF0/c$c;", "LMF0/c;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: MF0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0669c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f10507a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f10508b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f10509c;

        public C0669c(@k DeepLink deepLink, @l Integer num, @l String str) {
            this.f10507a = deepLink;
            this.f10508b = num;
            this.f10509c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0669c)) {
                return false;
            }
            C0669c c0669c = (C0669c) obj;
            return L.f(this.f10507a, c0669c.f10507a) && L.f(this.f10508b, c0669c.f10508b) && L.f(this.f10509c, c0669c.f10509c);
        }

        public final int hashCode() {
            int iHashCode = this.f10507a.hashCode() * 31;
            Integer num = this.f10508b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f10509c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f10507a);
            sb2.append(", commission=");
            sb2.append(this.f10508b);
            sb2.append(", date=");
            return C22026a.c(sb2, this.f10509c, ')');
        }

        public /* synthetic */ C0669c(DeepLink deepLink, Integer num, String str, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : str);
        }
    }
}
