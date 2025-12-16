package vB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoLimitsState.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LvB0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f440521g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c f440522h = new c(true, null, null, 0, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f440523b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Throwable f440524c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f440525d;

    /* renamed from: e, reason: collision with root package name */
    public final int f440526e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final List<b> f440527f;

    /* compiled from: TariffCpxInfoLimitsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvB0/c$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ c(boolean z12, Throwable th2, AttributedText attributedText, int i12, List list, int i13, C42822w c42822w) {
        this(z12, th2, attributedText, (i13 & 8) != 0 ? 0 : i12, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static c a(c cVar, boolean z12, ApiException apiException, int i12, int i13) {
        if ((i13 & 1) != 0) {
            z12 = cVar.f440523b;
        }
        boolean z13 = z12;
        ApiException apiException2 = apiException;
        if ((i13 & 2) != 0) {
            apiException2 = cVar.f440524c;
        }
        ApiException apiException3 = apiException2;
        AttributedText attributedText = cVar.f440525d;
        if ((i13 & 8) != 0) {
            i12 = cVar.f440526e;
        }
        List<b> list = cVar.f440527f;
        cVar.getClass();
        return new c(z13, apiException3, attributedText, i12, list);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f440523b == cVar.f440523b && L.f(this.f440524c, cVar.f440524c) && L.f(this.f440525d, cVar.f440525d) && this.f440526e == cVar.f440526e && L.f(this.f440527f, cVar.f440527f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f440523b) * 31;
        Throwable th2 = this.f440524c;
        int iHashCode2 = (iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
        AttributedText attributedText = this.f440525d;
        int iE2 = r.e(this.f440526e, (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31);
        List<b> list = this.f440527f;
        return iE2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoLimitsState(isLoading=");
        sb2.append(this.f440523b);
        sb2.append(", error=");
        sb2.append(this.f440524c);
        sb2.append(", title=");
        sb2.append(this.f440525d);
        sb2.append(", selectedTabIndex=");
        sb2.append(this.f440526e);
        sb2.append(", tabsItem=");
        return H.p(sb2, this.f440527f, ')');
    }

    /* compiled from: TariffCpxInfoLimitsState.kt */
    @H0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LvB0/c$b;", "", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f440528a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f440529b;

        public b(@k String str, @k ArrayList arrayList) {
            this.f440528a = str;
            this.f440529b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f440528a, bVar.f440528a) && this.f440529b.equals(bVar.f440529b);
        }

        public final int hashCode() {
            return this.f440529b.hashCode() + (this.f440528a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TabsItem(name=");
            sb2.append(this.f440528a);
            sb2.append(", categories=");
            return e.p(sb2, this.f440529b, ')');
        }

        /* compiled from: TariffCpxInfoLimitsState.kt */
        @H0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LvB0/c$b$a;", "", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f440530a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f440531b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f440532c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final ArrayList f440533d;

            public a(@k String str, @l String str2, @l String str3, @k ArrayList arrayList) {
                this.f440530a = str;
                this.f440531b = str2;
                this.f440532c = str3;
                this.f440533d = arrayList;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f440530a, aVar.f440530a) && L.f(this.f440531b, aVar.f440531b) && L.f(this.f440532c, aVar.f440532c) && this.f440533d.equals(aVar.f440533d);
            }

            public final int hashCode() {
                int iHashCode = this.f440530a.hashCode() * 31;
                String str = this.f440531b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f440532c;
                return this.f440533d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("CategoriesItem(title=");
                sb2.append(this.f440530a);
                sb2.append(", counter=");
                sb2.append(this.f440531b);
                sb2.append(", subtitle=");
                sb2.append(this.f440532c);
                sb2.append(", subCategories=");
                return e.p(sb2, this.f440533d, ')');
            }

            /* compiled from: TariffCpxInfoLimitsState.kt */
            @H0
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvB0/c$b$a$a;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: vB0.c$b$a$a, reason: collision with other inner class name */
            public static final /* data */ class C12750a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f440534a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f440535b;

                /* renamed from: c, reason: collision with root package name */
                public final boolean f440536c;

                public C12750a(@k String str, @k String str2, boolean z12) {
                    this.f440534a = str;
                    this.f440535b = str2;
                    this.f440536c = z12;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C12750a)) {
                        return false;
                    }
                    C12750a c12750a = (C12750a) obj;
                    return L.f(this.f440534a, c12750a.f440534a) && L.f(this.f440535b, c12750a.f440535b) && this.f440536c == c12750a.f440536c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f440536c) + H.d(this.f440534a.hashCode() * 31, 31, this.f440535b);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("SubCategoriesItem(leftText=");
                    sb2.append(this.f440534a);
                    sb2.append(", rightText=");
                    sb2.append(this.f440535b);
                    sb2.append(", needSpacing=");
                    return r.x(sb2, this.f440536c, ')');
                }

                public /* synthetic */ C12750a(String str, String str2, boolean z12, int i12, C42822w c42822w) {
                    this(str, str2, (i12 & 4) != 0 ? false : z12);
                }
            }
        }
    }

    public c(boolean z12, @l Throwable th2, @l AttributedText attributedText, int i12, @l List<b> list) {
        this.f440523b = z12;
        this.f440524c = th2;
        this.f440525d = attributedText;
        this.f440526e = i12;
        this.f440527f = list;
    }
}
