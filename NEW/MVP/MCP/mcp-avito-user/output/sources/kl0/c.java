package KL0;

import FL0.d;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StickersBuyState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LKL0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c extends q {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f9403j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final c f9404k = new c(true, null, null, C42784z0.f406748b, null, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9405b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ApiError f9406c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final d f9407d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f9408e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Float f9409f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final b f9410g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final C0568c f9411h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final DeepLink f9412i;

    /* compiled from: StickersBuyState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKL0/c$a;", "", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StickersBuyState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKL0/c$c;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: KL0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0568c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f9419a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f9420b;

        public C0568c(@l AttributedText attributedText, @InterfaceC42150f @l Integer num) {
            this.f9419a = num;
            this.f9420b = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0568c)) {
                return false;
            }
            C0568c c0568c = (C0568c) obj;
            return L.f(this.f9419a, c0568c.f9419a) && L.f(this.f9420b, c0568c.f9420b);
        }

        public final int hashCode() {
            Integer num = this.f9419a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            AttributedText attributedText = this.f9420b;
            return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InfoSection(iconDrawableAttr=");
            sb2.append(this.f9419a);
            sb2.append(", description=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f9420b, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z12, @l ApiError apiError, @l d dVar, @k List<? extends com.avito.conveyor_item.a> list, @l Float f12, @l b bVar, @l C0568c c0568c, @l DeepLink deepLink) {
        this.f9405b = z12;
        this.f9406c = apiError;
        this.f9407d = dVar;
        this.f9408e = list;
        this.f9409f = f12;
        this.f9410g = bVar;
        this.f9411h = c0568c;
        this.f9412i = deepLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c a(c cVar, boolean z12, ApiError apiError, ArrayList arrayList, b bVar, int i12) {
        if ((i12 & 1) != 0) {
            z12 = cVar.f9405b;
        }
        boolean z13 = z12;
        if ((i12 & 2) != 0) {
            apiError = cVar.f9406c;
        }
        ApiError apiError2 = apiError;
        d dVar = cVar.f9407d;
        List list = arrayList;
        if ((i12 & 8) != 0) {
            list = cVar.f9408e;
        }
        List list2 = list;
        Float f12 = cVar.f9409f;
        if ((i12 & 32) != 0) {
            bVar = cVar.f9410g;
        }
        C0568c c0568c = cVar.f9411h;
        DeepLink deepLink = cVar.f9412i;
        cVar.getClass();
        return new c(z13, apiError2, dVar, list2, f12, bVar, c0568c, deepLink);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9405b == cVar.f9405b && L.f(this.f9406c, cVar.f9406c) && L.f(this.f9407d, cVar.f9407d) && L.f(this.f9408e, cVar.f9408e) && L.f(this.f9409f, cVar.f9409f) && L.f(this.f9410g, cVar.f9410g) && L.f(this.f9411h, cVar.f9411h) && L.f(this.f9412i, cVar.f9412i);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f9405b) * 31;
        ApiError apiError = this.f9406c;
        int iHashCode2 = (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
        d dVar = this.f9407d;
        int iE2 = H.e((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f9408e);
        Float f12 = this.f9409f;
        int iHashCode3 = (iE2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        b bVar = this.f9410g;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C0568c c0568c = this.f9411h;
        int iHashCode5 = (iHashCode4 + (c0568c == null ? 0 : c0568c.hashCode())) * 31;
        DeepLink deepLink = this.f9412i;
        return iHashCode5 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StickersBuyState(isLoading=");
        sb2.append(this.f9405b);
        sb2.append(", error=");
        sb2.append(this.f9406c);
        sb2.append(", result=");
        sb2.append(this.f9407d);
        sb2.append(", items=");
        sb2.append(this.f9408e);
        sb2.append(", navigationProgress=");
        sb2.append(this.f9409f);
        sb2.append(", footerState=");
        sb2.append(this.f9410g);
        sb2.append(", infoSection=");
        sb2.append(this.f9411h);
        sb2.append(", noSelectedStickersDeepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f9412i, ')');
    }

    /* compiled from: StickersBuyState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LKL0/c$b;", "", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final MnzFloatingFooter f9413a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final a f9414b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f9415c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f9416d;

        /* compiled from: StickersBuyState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKL0/c$b$a;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f9417a;

            /* renamed from: b, reason: collision with root package name */
            public final int f9418b;

            public a(@k String str, @InterfaceC42150f int i12) {
                this.f9417a = str;
                this.f9418b = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f9417a, aVar.f9417a) && this.f9418b == aVar.f9418b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f9418b) + (this.f9417a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ContinueButtonState(title=");
                sb2.append(this.f9417a);
                sb2.append(", attrRes=");
                return r.t(sb2, this.f9418b, ')');
            }
        }

        static {
            Parcelable.Creator<MnzFloatingFooter> creator = MnzFloatingFooter.CREATOR;
        }

        public b(@l MnzFloatingFooter mnzFloatingFooter, @l a aVar, boolean z12, @l Integer num) {
            this.f9413a = mnzFloatingFooter;
            this.f9414b = aVar;
            this.f9415c = z12;
            this.f9416d = num;
        }

        public static b a(b bVar, MnzFloatingFooter mnzFloatingFooter, a aVar, boolean z12, Integer num, int i12) {
            if ((i12 & 1) != 0) {
                mnzFloatingFooter = bVar.f9413a;
            }
            if ((i12 & 2) != 0) {
                aVar = bVar.f9414b;
            }
            if ((i12 & 4) != 0) {
                z12 = bVar.f9415c;
            }
            if ((i12 & 8) != 0) {
                num = bVar.f9416d;
            }
            bVar.getClass();
            return new b(mnzFloatingFooter, aVar, z12, num);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f9413a, bVar.f9413a) && L.f(this.f9414b, bVar.f9414b) && this.f9415c == bVar.f9415c && L.f(this.f9416d, bVar.f9416d);
        }

        public final int hashCode() {
            MnzFloatingFooter mnzFloatingFooter = this.f9413a;
            int iHashCode = (mnzFloatingFooter == null ? 0 : mnzFloatingFooter.hashCode()) * 31;
            a aVar = this.f9414b;
            int i12 = r.i((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f9415c);
            Integer num = this.f9416d;
            return i12 + (num != null ? num.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FooterState(bblFooter=");
            sb2.append(this.f9413a);
            sb2.append(", continueButtonState=");
            sb2.append(this.f9414b);
            sb2.append(", showLoading=");
            sb2.append(this.f9415c);
            sb2.append(", buttonId=");
            return s.j(sb2, this.f9416d, ')');
        }

        public /* synthetic */ b(MnzFloatingFooter mnzFloatingFooter, a aVar, boolean z12, Integer num, int i12, C42822w c42822w) {
            this(mnzFloatingFooter, aVar, z12, (i12 & 8) != 0 ? null : num);
        }
    }
}
