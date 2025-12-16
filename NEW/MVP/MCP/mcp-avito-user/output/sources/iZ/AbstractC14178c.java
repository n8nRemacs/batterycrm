package Iz;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EsiaRedirectInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LIz/c;", "", "<init>", "()V", "a", "b", "c", "d", "e", "LIz/c$a;", "LIz/c$b;", "LIz/c$c;", "LIz/c$d;", "LIz/c$e;", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Iz.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC14178c {

    /* compiled from: EsiaRedirectInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIz/c$a;", "LIz/c;", "<init>", "()V", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iz.c$a */
    public static final /* data */ class a extends AbstractC14178c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f8673a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1674811958;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: EsiaRedirectInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIz/c$b;", "LIz/c;", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iz.c$b */
    public static final /* data */ class b extends AbstractC14178c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f8674a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f8675b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<String> f8676c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f8677d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final DeepLink f8678e;

        public b(@k String str, @k String str2, @k List list, @k ArrayList arrayList, @l DeepLink deepLink) {
            super(null);
            this.f8674a = str;
            this.f8675b = str2;
            this.f8676c = list;
            this.f8677d = arrayList;
            this.f8678e = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f8674a, bVar.f8674a) && L.f(this.f8675b, bVar.f8675b) && L.f(this.f8676c, bVar.f8676c) && L.f(this.f8677d, bVar.f8677d) && L.f(this.f8678e, bVar.f8678e);
        }

        public final int hashCode() {
            int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f8677d, H.e(H.d(this.f8674a.hashCode() * 31, 31, this.f8675b), 31, this.f8676c), 31);
            DeepLink deepLink = this.f8678e;
            return iG2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(title=");
            sb2.append(this.f8674a);
            sb2.append(", logoUrl=");
            sb2.append(this.f8675b);
            sb2.append(", requirements=");
            sb2.append(this.f8676c);
            sb2.append(", buttons=");
            sb2.append(this.f8677d);
            sb2.append(", supportButtonDeeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f8678e, ')');
        }
    }

    /* compiled from: EsiaRedirectInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIz/c$c;", "LIz/c;", "<init>", "()V", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iz.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0498c extends AbstractC14178c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0498c f8679a = new C0498c();

        public C0498c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0498c);
        }

        public final int hashCode() {
            return 1676840518;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: EsiaRedirectInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIz/c$d;", "LIz/c;", "<init>", "()V", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iz.c$d */
    public static final /* data */ class d extends AbstractC14178c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f8680a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1455228028;
        }

        @k
        public final String toString() {
            return "StartLoading";
        }
    }

    /* compiled from: EsiaRedirectInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIz/c$e;", "LIz/c;", "<init>", "()V", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iz.c$e */
    public static final /* data */ class e extends AbstractC14178c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f8681a = new e();

        public e() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1873935094;
        }

        @k
        public final String toString() {
            return "Unauthorized";
        }
    }

    public /* synthetic */ AbstractC14178c(C42822w c42822w) {
        this();
    }

    public AbstractC14178c() {
    }
}
