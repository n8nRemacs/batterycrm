package com.avito.android.fees_methods.screen.fees_by_package.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FeesByPackageState.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "Button", "c", "d", "e", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeesByPackageState extends q {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final c f158024l = new c(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final FeesByPackageState f158025m = new FeesByPackageState(false, true, false, null, null, null, null, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f158026b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f158027c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f158028d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Throwable f158029e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f158030f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final e f158031g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final List<b> f158032h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final a f158033i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Button f158034j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final AttributedText f158035k;

    /* compiled from: FeesByPackageState.kt */
    @H0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageState$Button;", "", "Style", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f158036a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f158037b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Style f158038c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FeesByPackageState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageState$Button$Style;", "", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Style {

            /* renamed from: b, reason: collision with root package name */
            public static final Style f158039b;

            /* renamed from: c, reason: collision with root package name */
            public static final Style f158040c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Style[] f158041d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f158042e;

            static {
                Style style = new Style("PRIMARY", 0);
                f158039b = style;
                Style style2 = new Style("SECONDARY", 1);
                f158040c = style2;
                Style[] styleArr = {style, style2};
                f158041d = styleArr;
                f158042e = kotlin.enums.c.a(styleArr);
            }

            public Style() {
                throw null;
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) f158041d.clone();
            }
        }

        public Button(@k String str, @k DeepLink deepLink, @k Style style) {
            this.f158036a = str;
            this.f158037b = deepLink;
            this.f158038c = style;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f158036a, button.f158036a) && L.f(this.f158037b, button.f158037b) && this.f158038c == button.f158038c;
        }

        public final int hashCode() {
            return this.f158038c.hashCode() + com.avito.android.actions_sheet.a.e(this.f158037b, this.f158036a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            return "Button(title=" + this.f158036a + ", deeplink=" + this.f158037b + ", style=" + this.f158038c + ')';
        }
    }

    /* compiled from: FeesByPackageState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageState$a;", "", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f158043a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f158044b;

        public a(@l String str, @k AttributedText attributedText) {
            this.f158043a = str;
            this.f158044b = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f158043a, aVar.f158043a) && L.f(this.f158044b, aVar.f158044b);
        }

        public final int hashCode() {
            String str = this.f158043a;
            return this.f158044b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Banner(iconName=");
            sb2.append(this.f158043a);
            sb2.append(", text=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f158044b, ')');
        }
    }

    /* compiled from: FeesByPackageState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageState$b;", "", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f158045a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f158046b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final d f158047c;

        public b(@l String str, @k String str2, @l d dVar) {
            this.f158045a = str;
            this.f158046b = str2;
            this.f158047c = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f158045a, bVar.f158045a) && L.f(this.f158046b, bVar.f158046b) && L.f(this.f158047c, bVar.f158047c);
        }

        public final int hashCode() {
            String str = this.f158045a;
            int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f158046b);
            d dVar = this.f158047c;
            return iD2 + (dVar != null ? dVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "BulletItem(iconName=" + this.f158045a + ", title=" + this.f158046b + ", hint=" + this.f158047c + ')';
        }
    }

    /* compiled from: FeesByPackageState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageState$c;", "", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: FeesByPackageState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageState$d;", "", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f158048a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f158049b;

        public d(@l String str, @k DeepLink deepLink) {
            this.f158048a = str;
            this.f158049b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f158048a, dVar.f158048a) && L.f(this.f158049b, dVar.f158049b);
        }

        public final int hashCode() {
            String str = this.f158048a;
            return this.f158049b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Hint(iconName=");
            sb2.append(this.f158048a);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f158049b, ')');
        }
    }

    /* compiled from: FeesByPackageState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageState$e;", "", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Image f158050a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f158051b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f158052c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f158053d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f158054e;

        public e(@l Image image, @k String str, @l String str2, @k String str3, @k String str4) {
            this.f158050a = image;
            this.f158051b = str;
            this.f158052c = str2;
            this.f158053d = str3;
            this.f158054e = str4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f158050a, eVar.f158050a) && L.f(this.f158051b, eVar.f158051b) && L.f(this.f158052c, eVar.f158052c) && L.f(this.f158053d, eVar.f158053d) && L.f(this.f158054e, eVar.f158054e);
        }

        public final int hashCode() {
            Image image = this.f158050a;
            int iD2 = H.d((image == null ? 0 : image.hashCode()) * 31, 31, this.f158051b);
            String str = this.f158052c;
            return this.f158054e.hashCode() + H.d((iD2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f158053d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Snippet(image=");
            sb2.append(this.f158050a);
            sb2.append(", title=");
            sb2.append(this.f158051b);
            sb2.append(", price=");
            sb2.append(this.f158052c);
            sb2.append(", category=");
            sb2.append(this.f158053d);
            sb2.append(", region=");
            return C22026a.c(sb2, this.f158054e, ')');
        }
    }

    public FeesByPackageState(boolean z12, boolean z13, boolean z14, @l Throwable th2, @l String str, @l e eVar, @l List<b> list, @l a aVar, @l Button button, @l AttributedText attributedText) {
        this.f158026b = z12;
        this.f158027c = z13;
        this.f158028d = z14;
        this.f158029e = th2;
        this.f158030f = str;
        this.f158031g = eVar;
        this.f158032h = list;
        this.f158033i = aVar;
        this.f158034j = button;
        this.f158035k = attributedText;
    }

    public static FeesByPackageState a(FeesByPackageState feesByPackageState, boolean z12, boolean z13, boolean z14, ApiException apiException, String str, e eVar, ArrayList arrayList, a aVar, Button button, AttributedText attributedText, int i12) {
        boolean z15 = (i12 & 1) != 0 ? feesByPackageState.f158026b : z12;
        boolean z16 = (i12 & 2) != 0 ? feesByPackageState.f158027c : z13;
        boolean z17 = (i12 & 4) != 0 ? feesByPackageState.f158028d : z14;
        Throwable th2 = (i12 & 8) != 0 ? feesByPackageState.f158029e : apiException;
        String str2 = (i12 & 16) != 0 ? feesByPackageState.f158030f : str;
        e eVar2 = (i12 & 32) != 0 ? feesByPackageState.f158031g : eVar;
        List<b> list = (i12 & 64) != 0 ? feesByPackageState.f158032h : arrayList;
        a aVar2 = (i12 & 128) != 0 ? feesByPackageState.f158033i : aVar;
        Button button2 = (i12 & 256) != 0 ? feesByPackageState.f158034j : button;
        AttributedText attributedText2 = (i12 & 512) != 0 ? feesByPackageState.f158035k : attributedText;
        feesByPackageState.getClass();
        return new FeesByPackageState(z15, z16, z17, th2, str2, eVar2, list, aVar2, button2, attributedText2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeesByPackageState)) {
            return false;
        }
        FeesByPackageState feesByPackageState = (FeesByPackageState) obj;
        return this.f158026b == feesByPackageState.f158026b && this.f158027c == feesByPackageState.f158027c && this.f158028d == feesByPackageState.f158028d && L.f(this.f158029e, feesByPackageState.f158029e) && L.f(this.f158030f, feesByPackageState.f158030f) && L.f(this.f158031g, feesByPackageState.f158031g) && L.f(this.f158032h, feesByPackageState.f158032h) && L.f(this.f158033i, feesByPackageState.f158033i) && L.f(this.f158034j, feesByPackageState.f158034j) && L.f(this.f158035k, feesByPackageState.f158035k);
    }

    public final int hashCode() {
        int i12 = r.i(r.i(Boolean.hashCode(this.f158026b) * 31, 31, this.f158027c), 31, this.f158028d);
        Throwable th2 = this.f158029e;
        int iHashCode = (i12 + (th2 == null ? 0 : th2.hashCode())) * 31;
        String str = this.f158030f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.f158031g;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List<b> list = this.f158032h;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        a aVar = this.f158033i;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Button button = this.f158034j;
        int iHashCode6 = (iHashCode5 + (button == null ? 0 : button.hashCode())) * 31;
        AttributedText attributedText = this.f158035k;
        return iHashCode6 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeesByPackageState(isClosable=");
        sb2.append(this.f158026b);
        sb2.append(", isMainLoading=");
        sb2.append(this.f158027c);
        sb2.append(", isNextLoading=");
        sb2.append(this.f158028d);
        sb2.append(", error=");
        sb2.append(this.f158029e);
        sb2.append(", title=");
        sb2.append(this.f158030f);
        sb2.append(", snippet=");
        sb2.append(this.f158031g);
        sb2.append(", bullets=");
        sb2.append(this.f158032h);
        sb2.append(", banner=");
        sb2.append(this.f158033i);
        sb2.append(", button=");
        sb2.append(this.f158034j);
        sb2.append(", offerInfo=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f158035k, ')');
    }
}
