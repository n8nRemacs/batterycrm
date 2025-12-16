package NB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxLimitState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"LNB0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f11306o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final c f11307p = new c(null, null, null, null, null, null, null, null, null, null, false, false, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f11308b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final b f11309c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f11310d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C0724c f11311e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f11312f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f11313g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final d f11314h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final d f11315i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ButtonAction f11316j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final ButtonAction f11317k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11318l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f11319m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f11320n;

    /* compiled from: TariffCpxLimitState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNB0/c$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffCpxLimitState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNB0/c$b;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f11321a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f11322b;

        public b(@l Integer num, @l String str) {
            this.f11321a = num;
            this.f11322b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f11321a, bVar.f11321a) && L.f(this.f11322b, bVar.f11322b);
        }

        public final int hashCode() {
            Integer num = this.f11321a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f11322b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LimitField(value=");
            sb2.append(this.f11321a);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f11322b, ')');
        }
    }

    /* compiled from: TariffCpxLimitState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNB0/c$c;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: NB0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0724c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f11323a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f11324b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Double f11325c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f11326d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f11327e;

        public C0724c(@l Integer num, boolean z12, @l Double d12, @k String str, @l String str2) {
            this.f11323a = num;
            this.f11324b = z12;
            this.f11325c = d12;
            this.f11326d = str;
            this.f11327e = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0724c)) {
                return false;
            }
            C0724c c0724c = (C0724c) obj;
            return L.f(this.f11323a, c0724c.f11323a) && this.f11324b == c0724c.f11324b && L.f(this.f11325c, c0724c.f11325c) && L.f(this.f11326d, c0724c.f11326d) && L.f(this.f11327e, c0724c.f11327e);
        }

        public final int hashCode() {
            Integer num = this.f11323a;
            int i12 = r.i((num == null ? 0 : num.hashCode()) * 31, 31, this.f11324b);
            Double d12 = this.f11325c;
            int iD2 = H.d((i12 + (d12 == null ? 0 : d12.hashCode())) * 31, 31, this.f11326d);
            String str = this.f11327e;
            return iD2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemainField(value=");
            sb2.append(this.f11323a);
            sb2.append(", isPointNeed=");
            sb2.append(this.f11324b);
            sb2.append(", valuePenny=");
            sb2.append(this.f11325c);
            sb2.append(", titlePenny=");
            sb2.append(this.f11326d);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f11327e, ')');
        }
    }

    /* compiled from: TariffCpxLimitState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNB0/c$d;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f11328a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f11329b;

        public d(@l AttributedText attributedText, @l Integer num) {
            this.f11328a = num;
            this.f11329b = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f11328a, dVar.f11328a) && L.f(this.f11329b, dVar.f11329b);
        }

        public final int hashCode() {
            Integer num = this.f11328a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            AttributedText attributedText = this.f11329b;
            return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ValidationField(value=");
            sb2.append(this.f11328a);
            sb2.append(", hint=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f11329b, ')');
        }
    }

    public c(@l AttributedText attributedText, @l b bVar, @l Integer num, @l C0724c c0724c, @l AttributedText attributedText2, @l AttributedText attributedText3, @l d dVar, @l d dVar2, @l ButtonAction buttonAction, @l ButtonAction buttonAction2, boolean z12, boolean z13, boolean z14) {
        this.f11308b = attributedText;
        this.f11309c = bVar;
        this.f11310d = num;
        this.f11311e = c0724c;
        this.f11312f = attributedText2;
        this.f11313g = attributedText3;
        this.f11314h = dVar;
        this.f11315i = dVar2;
        this.f11316j = buttonAction;
        this.f11317k = buttonAction2;
        this.f11318l = z12;
        this.f11319m = z13;
        this.f11320n = z14;
    }

    public static c a(c cVar, b bVar, C0724c c0724c, AttributedText attributedText, boolean z12, boolean z13, int i12) {
        AttributedText attributedText2 = cVar.f11308b;
        b bVar2 = (i12 & 2) != 0 ? cVar.f11309c : bVar;
        Integer num = cVar.f11310d;
        C0724c c0724c2 = (i12 & 8) != 0 ? cVar.f11311e : c0724c;
        AttributedText attributedText3 = (i12 & 16) != 0 ? cVar.f11312f : attributedText;
        AttributedText attributedText4 = cVar.f11313g;
        d dVar = cVar.f11314h;
        d dVar2 = cVar.f11315i;
        ButtonAction buttonAction = cVar.f11316j;
        ButtonAction buttonAction2 = cVar.f11317k;
        boolean z14 = (i12 & 1024) != 0 ? cVar.f11318l : z12;
        boolean z15 = (i12 & 2048) != 0 ? cVar.f11319m : z13;
        boolean z16 = (i12 & 4096) != 0 ? cVar.f11320n : true;
        cVar.getClass();
        return new c(attributedText2, bVar2, num, c0724c2, attributedText3, attributedText4, dVar, dVar2, buttonAction, buttonAction2, z14, z15, z16);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f11308b, cVar.f11308b) && L.f(this.f11309c, cVar.f11309c) && L.f(this.f11310d, cVar.f11310d) && L.f(this.f11311e, cVar.f11311e) && L.f(this.f11312f, cVar.f11312f) && L.f(this.f11313g, cVar.f11313g) && L.f(this.f11314h, cVar.f11314h) && L.f(this.f11315i, cVar.f11315i) && L.f(this.f11316j, cVar.f11316j) && L.f(this.f11317k, cVar.f11317k) && this.f11318l == cVar.f11318l && this.f11319m == cVar.f11319m && this.f11320n == cVar.f11320n;
    }

    public final int hashCode() {
        AttributedText attributedText = this.f11308b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        b bVar = this.f11309c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Integer num = this.f11310d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        C0724c c0724c = this.f11311e;
        int iHashCode4 = (iHashCode3 + (c0724c == null ? 0 : c0724c.hashCode())) * 31;
        AttributedText attributedText2 = this.f11312f;
        int iHashCode5 = (iHashCode4 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        AttributedText attributedText3 = this.f11313g;
        int iHashCode6 = (iHashCode5 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        d dVar = this.f11314h;
        int iHashCode7 = (iHashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f11315i;
        int iHashCode8 = (iHashCode7 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        ButtonAction buttonAction = this.f11316j;
        int iHashCode9 = (iHashCode8 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        ButtonAction buttonAction2 = this.f11317k;
        return Boolean.hashCode(this.f11320n) + r.i(r.i((iHashCode9 + (buttonAction2 != null ? buttonAction2.hashCode() : 0)) * 31, 31, this.f11318l), 31, this.f11319m);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxLimitState(title=");
        sb2.append(this.f11308b);
        sb2.append(", limit=");
        sb2.append(this.f11309c);
        sb2.append(", activeLimit=");
        sb2.append(this.f11310d);
        sb2.append(", remains=");
        sb2.append(this.f11311e);
        sb2.append(", hint=");
        sb2.append(this.f11312f);
        sb2.append(", recommendation=");
        sb2.append(this.f11313g);
        sb2.append(", minChangeValidation=");
        sb2.append(this.f11314h);
        sb2.append(", minLimitValidation=");
        sb2.append(this.f11315i);
        sb2.append(", primaryAction=");
        sb2.append(this.f11316j);
        sb2.append(", secondaryAction=");
        sb2.append(this.f11317k);
        sb2.append(", shouldShowError=");
        sb2.append(this.f11318l);
        sb2.append(", isLoading=");
        sb2.append(this.f11319m);
        sb2.append(", isInputInitialized=");
        return r.x(sb2, this.f11320n, ')');
    }
}
