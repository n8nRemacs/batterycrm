package com.avito.android.ui.status_bar;

import Y61.l;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.UniversalColor;
import j.InterfaceC42150f;
import j.InterfaceC42158n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatusBarUpdate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ui/status_bar/d;", "", "a", "_avito_status-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ThemeAppearance f304649a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f304650b;

    /* compiled from: StatusBarUpdate.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/ui/status_bar/d$a;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/ui/status_bar/d$a$a;", "Lcom/avito/android/ui/status_bar/d$a$b;", "Lcom/avito/android/ui/status_bar/d$a$c;", "Lcom/avito/android/ui/status_bar/d$a$d;", "Lcom/avito/android/ui/status_bar/d$a$e;", "_avito_status-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: StatusBarUpdate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/status_bar/d$a$a;", "Lcom/avito/android/ui/status_bar/d$a;", "_avito_status-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.ui.status_bar.d$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9356a implements a {

            /* renamed from: a, reason: collision with root package name */
            public final int f304651a;

            public C9356a(@InterfaceC42150f int i12) {
                this.f304651a = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9356a) && this.f304651a == ((C9356a) obj).f304651a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f304651a);
            }

            @Y61.k
            public final String toString() {
                return r.t(new StringBuilder("ByAttr(colorAttr="), this.f304651a, ')');
            }
        }

        /* compiled from: StatusBarUpdate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/status_bar/d$a$b;", "Lcom/avito/android/ui/status_bar/d$a;", "_avito_status-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final UniversalColor f304652a;

            /* renamed from: b, reason: collision with root package name */
            public final float f304653b;

            public b(@Y61.k UniversalColor universalColor, float f12) {
                this.f304652a = universalColor;
                this.f304653b = f12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                bVar.getClass();
                return L.f(this.f304652a, bVar.f304652a) && Float.compare(this.f304653b, bVar.f304653b) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.f304653b) + com.avito.android.actions_sheet.a.i(this.f304652a, Integer.hashCode(R.color.white) * 31, 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ByColorOffset(startColor=2131108265, endColor=");
                sb2.append(this.f304652a);
                sb2.append(", offset=");
                return r.k(')', this.f304653b, sb2);
            }
        }

        /* compiled from: StatusBarUpdate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/status_bar/d$a$c;", "Lcom/avito/android/ui/status_bar/d$a;", "_avito_status-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Drawable f304654a;

            public c(@Y61.k Drawable drawable) {
                this.f304654a = drawable;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f304654a, ((c) obj).f304654a);
            }

            public final int hashCode() {
                return this.f304654a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ByDrawable(drawable=" + this.f304654a + ')';
            }
        }

        /* compiled from: StatusBarUpdate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/status_bar/d$a$d;", "Lcom/avito/android/ui/status_bar/d$a;", "_avito_status-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.ui.status_bar.d$a$d, reason: collision with other inner class name */
        public static final /* data */ class C9357d implements a {

            /* renamed from: a, reason: collision with root package name */
            public final int f304655a;

            public C9357d(@InterfaceC42158n int i12) {
                this.f304655a = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9357d) && this.f304655a == ((C9357d) obj).f304655a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f304655a);
            }

            @Y61.k
            public final String toString() {
                return r.t(new StringBuilder("ByRes(colorRes="), this.f304655a, ')');
            }
        }

        /* compiled from: StatusBarUpdate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/status_bar/d$a$e;", "Lcom/avito/android/ui/status_bar/d$a;", "_avito_status-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final UniversalColor f304656a;

            public e(@Y61.k UniversalColor universalColor) {
                this.f304656a = universalColor;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && L.f(this.f304656a, ((e) obj).f304656a);
            }

            public final int hashCode() {
                return this.f304656a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.r(new StringBuilder("ByUniversalColor(universalColor="), this.f304656a, ')');
            }
        }
    }

    public d(@Y61.k ThemeAppearance themeAppearance, @Y61.k a aVar) {
        this.f304649a = themeAppearance;
        this.f304650b = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f304649a == dVar.f304649a && L.f(this.f304650b, dVar.f304650b);
    }

    public final int hashCode() {
        return this.f304650b.hashCode() + (this.f304649a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "StatusBarUpdate(themeAppearance=" + this.f304649a + ", color=" + this.f304650b + ')';
    }
}
