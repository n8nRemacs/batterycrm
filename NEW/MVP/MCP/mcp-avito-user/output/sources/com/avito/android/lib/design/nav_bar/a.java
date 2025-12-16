package com.avito.android.lib.design.nav_bar;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35763c0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NavBarState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/nav_bar/a;", "", "a", "b", "c", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Drawable f179828a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.a<G0> f179829b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f179830c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f179831d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final View f179832e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final List<b> f179833f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Y41.l<Integer, G0> f179834g;

    /* compiled from: NavBarState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/nav_bar/a$a;", "Lcom/avito/android/lib/design/nav_bar/a$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.nav_bar.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5289a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Drawable f179835a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C35763c0 f179836b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Drawable f179837c;

        /* renamed from: d, reason: collision with root package name */
        public final int f179838d;

        /* renamed from: e, reason: collision with root package name */
        public final int f179839e;

        /* renamed from: f, reason: collision with root package name */
        public final int f179840f;

        public C5289a(Drawable drawable, C35763c0 c35763c0, Drawable drawable2, int i12, int i13, int i14, int i15, C42822w c42822w) {
            c35763c0 = (i15 & 2) != 0 ? null : c35763c0;
            drawable2 = (i15 & 4) != 0 ? null : drawable2;
            i12 = (i15 & 8) != 0 ? 0 : i12;
            i13 = (i15 & 16) != 0 ? 0 : i13;
            i14 = (i15 & 32) != 0 ? 0 : i14;
            this.f179835a = drawable;
            this.f179836b = c35763c0;
            this.f179837c = drawable2;
            this.f179838d = i12;
            this.f179839e = i13;
            this.f179840f = i14;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5289a)) {
                return false;
            }
            C5289a c5289a = (C5289a) obj;
            return L.f(this.f179835a, c5289a.f179835a) && L.f(this.f179836b, c5289a.f179836b) && L.f(this.f179837c, c5289a.f179837c) && this.f179838d == c5289a.f179838d && this.f179839e == c5289a.f179839e && this.f179840f == c5289a.f179840f;
        }

        public final int hashCode() {
            int iHashCode = this.f179835a.hashCode() * 31;
            C35763c0 c35763c0 = this.f179836b;
            int iHashCode2 = (iHashCode + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
            Drawable drawable = this.f179837c;
            return Integer.hashCode(this.f179840f) + r.e(this.f179839e, r.e(this.f179838d, (iHashCode2 + (drawable != null ? drawable.hashCode() : 0)) * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Icon(drawable=");
            sb2.append(this.f179835a);
            sb2.append(", tint=");
            sb2.append(this.f179836b);
            sb2.append(", foreground=");
            sb2.append(this.f179837c);
            sb2.append(", marginStart=");
            sb2.append(this.f179838d);
            sb2.append(", marginEnd=");
            sb2.append(this.f179839e);
            sb2.append(", padding=");
            return r.t(sb2, this.f179840f, ')');
        }
    }

    /* compiled from: NavBarState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/nav_bar/a$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    /* compiled from: NavBarState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/nav_bar/a$c;", "Lcom/avito/android/lib/design/nav_bar/a$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f179841a;

        /* renamed from: b, reason: collision with root package name */
        public final int f179842b;

        /* renamed from: c, reason: collision with root package name */
        public final int f179843c;

        public c(PrintableText printableText, int i12, int i13, int i14, C42822w c42822w) {
            i12 = (i14 & 2) != 0 ? 0 : i12;
            i13 = (i14 & 4) != 0 ? 0 : i13;
            this.f179841a = printableText;
            this.f179842b = i12;
            this.f179843c = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f179841a, cVar.f179841a) && this.f179842b == cVar.f179842b && this.f179843c == cVar.f179843c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f179843c) + r.e(this.f179842b, this.f179841a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextButton(text=");
            sb2.append(this.f179841a);
            sb2.append(", marginStart=");
            sb2.append(this.f179842b);
            sb2.append(", marginEnd=");
            return r.t(sb2, this.f179843c, ')');
        }
    }

    public a() {
        this(null, null, false, null, null, null, null, 127, null);
    }

    public static a a(a aVar, Drawable drawable, Y41.a aVar2, String str, View view, List list, Y41.l lVar, int i12) {
        if ((i12 & 1) != 0) {
            drawable = aVar.f179828a;
        }
        Drawable drawable2 = drawable;
        if ((i12 & 2) != 0) {
            aVar2 = aVar.f179829b;
        }
        Y41.a aVar3 = aVar2;
        boolean z12 = aVar.f179830c;
        if ((i12 & 8) != 0) {
            str = aVar.f179831d;
        }
        String str2 = str;
        if ((i12 & 16) != 0) {
            view = aVar.f179832e;
        }
        View view2 = view;
        if ((i12 & 32) != 0) {
            list = aVar.f179833f;
        }
        List list2 = list;
        if ((i12 & 64) != 0) {
            lVar = aVar.f179834g;
        }
        aVar.getClass();
        return new a(drawable2, aVar3, z12, str2, view2, list2, lVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f179828a, aVar.f179828a) && L.f(this.f179829b, aVar.f179829b) && this.f179830c == aVar.f179830c && L.f(this.f179831d, aVar.f179831d) && L.f(this.f179832e, aVar.f179832e) && L.f(this.f179833f, aVar.f179833f) && L.f(this.f179834g, aVar.f179834g);
    }

    public final int hashCode() {
        Drawable drawable = this.f179828a;
        int iHashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        Y41.a<G0> aVar = this.f179829b;
        int i12 = r.i((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f179830c);
        String str = this.f179831d;
        int iHashCode2 = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        View view = this.f179832e;
        int iHashCode3 = (iHashCode2 + (view == null ? 0 : view.hashCode())) * 31;
        List<b> list = this.f179833f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Y41.l<Integer, G0> lVar = this.f179834g;
        return iHashCode4 + (lVar != null ? lVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavBarState(customBackIcon=");
        sb2.append(this.f179828a);
        sb2.append(", onBackClick=");
        sb2.append(this.f179829b);
        sb2.append(", backIconVisible=");
        sb2.append(this.f179830c);
        sb2.append(", title=");
        sb2.append(this.f179831d);
        sb2.append(", contentView=");
        sb2.append(this.f179832e);
        sb2.append(", rightButtons=");
        sb2.append(this.f179833f);
        sb2.append(", onRightButtonClick=");
        return H.l(sb2, this.f179834g, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@l Drawable drawable, @l Y41.a<G0> aVar, boolean z12, @l String str, @l View view, @l List<? extends b> list, @l Y41.l<? super Integer, G0> lVar) {
        this.f179828a = drawable;
        this.f179829b = aVar;
        this.f179830c = z12;
        this.f179831d = str;
        this.f179832e = view;
        this.f179833f = list;
        this.f179834g = lVar;
    }

    public /* synthetic */ a(Drawable drawable, Y41.a aVar, boolean z12, String str, View view, List list, Y41.l lVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : drawable, (i12 & 2) != 0 ? null : aVar, (i12 & 4) != 0 ? true : z12, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : view, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? null : lVar);
    }
}
