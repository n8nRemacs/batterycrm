package qM0;

import Y61.k;
import Y61.l;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VasUnionV2OneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LqM0/b;", "", "a", "b", "c", "LqM0/b$a;", "LqM0/b$b;", "LqM0/b$c;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qM0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC47321b {

    /* compiled from: VasUnionV2OneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqM0/b$a;", "LqM0/b;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qM0.b$a */
    public static final /* data */ class a implements InterfaceC47321b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f429217a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -331250896;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: VasUnionV2OneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqM0/b$b;", "LqM0/b;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qM0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12324b implements InterfaceC47321b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12324b f429218a = new C12324b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12324b);
        }

        public final int hashCode() {
            return 906976809;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: VasUnionV2OneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqM0/b$c;", "LqM0/b;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qM0.b$c */
    public static final /* data */ class c implements InterfaceC47321b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f429219a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f429220b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f429221c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f429222d;

        public c(@k DeepLink deepLink, @l Integer num, @l String str, @l Integer num2) {
            this.f429219a = deepLink;
            this.f429220b = num;
            this.f429221c = str;
            this.f429222d = num2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f429219a, cVar.f429219a) && L.f(this.f429220b, cVar.f429220b) && L.f(this.f429221c, cVar.f429221c) && L.f(this.f429222d, cVar.f429222d);
        }

        public final int hashCode() {
            int iHashCode = this.f429219a.hashCode() * 31;
            Integer num = this.f429220b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f429221c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.f429222d;
            return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f429219a);
            sb2.append(", buttonId=");
            sb2.append(this.f429220b);
            sb2.append(", slug=");
            sb2.append(this.f429221c);
            sb2.append(", bundleId=");
            return s.j(sb2, this.f429222d, ')');
        }

        public /* synthetic */ c(DeepLink deepLink, Integer num, String str, Integer num2, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : num2);
        }
    }
}
