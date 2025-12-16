package Vw0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SoaStatSettingState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LVw0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f17506b;

    /* compiled from: SoaStatSettingState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LVw0/c$a;", "", "a", "b", "c", "d", "LVw0/c$a$a;", "LVw0/c$a$b;", "LVw0/c$a$c;", "LVw0/c$a$d;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: SoaStatSettingState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVw0/c$a$a;", "LVw0/c$a;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Vw0.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1215a implements a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final ApiError f17507a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Throwable f17508b;

            public C1215a(@l ApiError apiError, @l Throwable th2) {
                this.f17507a = apiError;
                this.f17508b = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1215a)) {
                    return false;
                }
                C1215a c1215a = (C1215a) obj;
                return L.f(this.f17507a, c1215a.f17507a) && L.f(this.f17508b, c1215a.f17508b);
            }

            public final int hashCode() {
                ApiError apiError = this.f17507a;
                int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
                Throwable th2 = this.f17508b;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(apiError=");
                sb2.append(this.f17507a);
                sb2.append(", throwable=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f17508b, ')');
            }
        }

        /* compiled from: SoaStatSettingState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVw0/c$a$b;", "LVw0/c$a;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f17509a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final AttributedText f17510b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Image f17511c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f17512d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f17513e;

            public b(@k PrintableText printableText, @k AttributedText attributedText, @l Image image, boolean z12, boolean z13) {
                this.f17509a = printableText;
                this.f17510b = attributedText;
                this.f17511c = image;
                this.f17512d = z12;
                this.f17513e = z13;
            }

            public static b a(b bVar, boolean z12, boolean z13) {
                PrintableText printableText = bVar.f17509a;
                AttributedText attributedText = bVar.f17510b;
                Image image = bVar.f17511c;
                bVar.getClass();
                return new b(printableText, attributedText, image, z12, z13);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f17509a.equals(bVar.f17509a) && L.f(this.f17510b, bVar.f17510b) && L.f(this.f17511c, bVar.f17511c) && this.f17512d == bVar.f17512d && this.f17513e == bVar.f17513e;
            }

            public final int hashCode() {
                int iB2 = com.avito.android.actions_sheet.a.b(this.f17509a.hashCode() * 31, 31, this.f17510b);
                Image image = this.f17511c;
                return Boolean.hashCode(this.f17513e) + r.i((iB2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f17512d);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Loaded(title=");
                sb2.append(this.f17509a);
                sb2.append(", text=");
                sb2.append(this.f17510b);
                sb2.append(", image=");
                sb2.append(this.f17511c);
                sb2.append(", switcherValue=");
                sb2.append(this.f17512d);
                sb2.append(", switcherEnabled=");
                return r.x(sb2, this.f17513e, ')');
            }
        }

        /* compiled from: SoaStatSettingState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVw0/c$a$c;", "LVw0/c$a;", "<init>", "()V", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Vw0.c$a$c, reason: collision with other inner class name */
        public static final /* data */ class C1216c implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C1216c f17514a = new C1216c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C1216c);
            }

            public final int hashCode() {
                return -736367223;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: SoaStatSettingState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVw0/c$a$d;", "LVw0/c$a;", "<init>", "()V", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f17515a = new d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -886321653;
            }

            @k
            public final String toString() {
                return "None";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f17506b, ((c) obj).f17506b);
    }

    public final int hashCode() {
        return this.f17506b.hashCode();
    }

    @k
    public final String toString() {
        return "SoaStatSettingState(viewState=" + this.f17506b + ')';
    }

    public /* synthetic */ c(a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? a.d.f17515a : aVar);
    }

    public c(@k a aVar) {
        this.f17506b = aVar;
    }
}
