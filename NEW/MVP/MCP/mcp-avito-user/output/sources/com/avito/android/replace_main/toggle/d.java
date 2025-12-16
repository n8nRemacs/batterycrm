package com.avito.android.replace_main.toggle;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReplaceMainToggle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/replace_main/toggle/d;", "", "a", "b", "c", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BottomNavigationSpace f254616a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f254617b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f254618c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f254619d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f254620e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f254621f;

    /* compiled from: ReplaceMainToggle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/toggle/d$a;", "", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final c f254622a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final c f254623b;

        public a(@Y61.k c cVar, @Y61.k c cVar2) {
            this.f254622a = cVar;
            this.f254623b = cVar2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f254622a, aVar.f254622a) && L.f(this.f254623b, aVar.f254623b);
        }

        public final int hashCode() {
            return this.f254623b.hashCode() + (this.f254622a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "Toast(avito=" + this.f254622a + ", business360=" + this.f254623b + ')';
        }
    }

    /* compiled from: ReplaceMainToggle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/toggle/d$b;", "", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f254624a;

        public b(@Y61.k String str) {
            this.f254624a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f254624a, ((b) obj).f254624a);
        }

        public final int hashCode() {
            return this.f254624a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ToastButton(text="), this.f254624a, ')');
        }
    }

    /* compiled from: ReplaceMainToggle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/toggle/d$c;", "", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f254625a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final b f254626b;

        public c(@Y61.k String str, @Y61.k b bVar) {
            this.f254625a = str;
            this.f254626b = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f254625a, cVar.f254625a) && L.f(this.f254626b, cVar.f254626b);
        }

        public final int hashCode() {
            return this.f254626b.f254624a.hashCode() + (this.f254625a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ToastData(text=" + this.f254625a + ", button=" + this.f254626b + ')';
        }
    }

    public d(@Y61.k BottomNavigationSpace bottomNavigationSpace, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k a aVar, boolean z12) {
        this.f254616a = bottomNavigationSpace;
        this.f254617b = str;
        this.f254618c = str2;
        this.f254619d = str3;
        this.f254620e = aVar;
        this.f254621f = z12;
    }

    public static d a(d dVar, BottomNavigationSpace bottomNavigationSpace, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            bottomNavigationSpace = dVar.f254616a;
        }
        BottomNavigationSpace bottomNavigationSpace2 = bottomNavigationSpace;
        String str = dVar.f254617b;
        String str2 = dVar.f254618c;
        String str3 = dVar.f254619d;
        a aVar = dVar.f254620e;
        if ((i12 & 32) != 0) {
            z12 = dVar.f254621f;
        }
        dVar.getClass();
        return new d(bottomNavigationSpace2, str, str2, str3, aVar, z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f254616a == dVar.f254616a && L.f(this.f254617b, dVar.f254617b) && L.f(this.f254618c, dVar.f254618c) && L.f(this.f254619d, dVar.f254619d) && L.f(this.f254620e, dVar.f254620e) && this.f254621f == dVar.f254621f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254621f) + ((this.f254620e.hashCode() + H.d(H.d(H.d(this.f254616a.hashCode() * 31, 31, this.f254617b), 31, this.f254618c), 31, this.f254619d)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReplaceMainToggle(main=");
        sb2.append(this.f254616a);
        sb2.append(", title=");
        sb2.append(this.f254617b);
        sb2.append(", subtitle=");
        sb2.append(this.f254618c);
        sb2.append(", clearShowId=");
        sb2.append(this.f254619d);
        sb2.append(", toast=");
        sb2.append(this.f254620e);
        sb2.append(", isLoading=");
        return androidx.appcompat.app.r.x(sb2, this.f254621f, ')');
    }
}
