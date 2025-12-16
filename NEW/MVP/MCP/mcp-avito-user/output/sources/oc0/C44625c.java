package oC0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.foundation.p;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import iC0.f;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptConfigureLandingState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LoC0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oC0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C44625c extends q {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f419596k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final C44625c f419597l;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f419598b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<b> f419599c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f419600d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<C12178c> f419601e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ButtonAction f419602f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f419603g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f419604h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Throwable f419605i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f419606j;

    /* compiled from: TariffCptConfigureLandingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoC0/c$a;", "", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oC0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffCptConfigureLandingState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoC0/c$b;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oC0.c$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AttributedText f419607a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f419608b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final f f419609c;

        public b(@k AttributedText attributedText, @k AttributedText attributedText2, @l f fVar) {
            this.f419607a = attributedText;
            this.f419608b = attributedText2;
            this.f419609c = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f419607a, bVar.f419607a) && L.f(this.f419608b, bVar.f419608b) && L.f(this.f419609c, bVar.f419609c);
        }

        public final int hashCode() {
            int iB2 = com.avito.android.actions_sheet.a.b(this.f419607a.hashCode() * 31, 31, this.f419608b);
            f fVar = this.f419609c;
            return iB2 + (fVar == null ? 0 : fVar.hashCode());
        }

        @k
        public final String toString() {
            return "FeatureItem(title=" + this.f419607a + ", subtitle=" + this.f419608b + ", image=" + this.f419609c + ')';
        }
    }

    /* compiled from: TariffCptConfigureLandingState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoC0/c$c;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oC0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12178c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AttributedText f419610a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f419611b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final p f419612c;

        public C12178c(@k AttributedText attributedText, @InterfaceC42150f @l Integer num, @k p pVar) {
            this.f419610a = attributedText;
            this.f419611b = num;
            this.f419612c = pVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12178c)) {
                return false;
            }
            C12178c c12178c = (C12178c) obj;
            return L.f(this.f419610a, c12178c.f419610a) && L.f(this.f419611b, c12178c.f419611b) && L.f(this.f419612c, c12178c.f419612c);
        }

        public final int hashCode() {
            int iHashCode = this.f419610a.hashCode() * 31;
            Integer num = this.f419611b;
            return this.f419612c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        @k
        public final String toString() {
            return "TermsItem(title=" + this.f419610a + ", iconAttr=" + this.f419611b + ", iconColor=" + this.f419612c + ')';
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f419597l = new C44625c("", c42784z0, "", c42784z0, null, null, false, null, false);
    }

    public C44625c(@k String str, @k List<b> list, @k String str2, @k List<C12178c> list2, @l ButtonAction buttonAction, @l AttributedText attributedText, boolean z12, @l Throwable th2, boolean z13) {
        this.f419598b = str;
        this.f419599c = list;
        this.f419600d = str2;
        this.f419601e = list2;
        this.f419602f = buttonAction;
        this.f419603g = attributedText;
        this.f419604h = z12;
        this.f419605i = th2;
        this.f419606j = z13;
    }

    public static C44625c a(C44625c c44625c, String str, ArrayList arrayList, String str2, ArrayList arrayList2, ButtonAction buttonAction, AttributedText attributedText, boolean z12, ApiException apiException, boolean z13, int i12) {
        String str3 = (i12 & 1) != 0 ? c44625c.f419598b : str;
        List<b> list = (i12 & 2) != 0 ? c44625c.f419599c : arrayList;
        String str4 = (i12 & 4) != 0 ? c44625c.f419600d : str2;
        List<C12178c> list2 = (i12 & 8) != 0 ? c44625c.f419601e : arrayList2;
        ButtonAction buttonAction2 = (i12 & 16) != 0 ? c44625c.f419602f : buttonAction;
        AttributedText attributedText2 = (i12 & 32) != 0 ? c44625c.f419603g : attributedText;
        boolean z14 = (i12 & 64) != 0 ? c44625c.f419604h : z12;
        Throwable th2 = (i12 & 128) != 0 ? c44625c.f419605i : apiException;
        boolean z15 = (i12 & 256) != 0 ? c44625c.f419606j : z13;
        c44625c.getClass();
        return new C44625c(str3, list, str4, list2, buttonAction2, attributedText2, z14, th2, z15);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44625c)) {
            return false;
        }
        C44625c c44625c = (C44625c) obj;
        return L.f(this.f419598b, c44625c.f419598b) && L.f(this.f419599c, c44625c.f419599c) && L.f(this.f419600d, c44625c.f419600d) && L.f(this.f419601e, c44625c.f419601e) && L.f(this.f419602f, c44625c.f419602f) && L.f(this.f419603g, c44625c.f419603g) && this.f419604h == c44625c.f419604h && L.f(this.f419605i, c44625c.f419605i) && this.f419606j == c44625c.f419606j;
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(H.e(this.f419598b.hashCode() * 31, 31, this.f419599c), 31, this.f419600d), 31, this.f419601e);
        ButtonAction buttonAction = this.f419602f;
        int iHashCode = (iE2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        AttributedText attributedText = this.f419603g;
        int i12 = r.i((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f419604h);
        Throwable th2 = this.f419605i;
        return Boolean.hashCode(this.f419606j) + ((i12 + (th2 != null ? th2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCptConfigureLandingState(title=");
        sb2.append(this.f419598b);
        sb2.append(", featureItems=");
        sb2.append(this.f419599c);
        sb2.append(", termsTitle=");
        sb2.append(this.f419600d);
        sb2.append(", termsItems=");
        sb2.append(this.f419601e);
        sb2.append(", action=");
        sb2.append(this.f419602f);
        sb2.append(", agreement=");
        sb2.append(this.f419603g);
        sb2.append(", isShowButtonProgress=");
        sb2.append(this.f419604h);
        sb2.append(", error=");
        sb2.append(this.f419605i);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f419606j, ')');
    }
}
