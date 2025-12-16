package com.avito.android.select.group_clearance_select;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GroupClearanceParams.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/select/group_clearance_select/a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lcom/avito/android/select/group_clearance_select/a$a;", "Lcom/avito/android/select/group_clearance_select/a$b;", "Lcom/avito/android/select/group_clearance_select/a$c;", "Lcom/avito/android/select/group_clearance_select/a$d;", "Lcom/avito/android/select/group_clearance_select/a$e;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a {

    /* compiled from: GroupClearanceParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/group_clearance_select/a$a;", "Lcom/avito/android/select/group_clearance_select/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.select.group_clearance_select.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7927a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f265450a;

        /* renamed from: b, reason: collision with root package name */
        public final int f265451b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f265452c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f265453d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f265454e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ClearanceTitle f265455f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f265456g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7927a(int i12, int i13, String str, String str2, String str3, ClearanceTitle clearanceTitle, boolean z12, int i14, C42822w c42822w) {
            super(null);
            clearanceTitle = (i14 & 32) != 0 ? ClearanceTitle.f265412f : clearanceTitle;
            z12 = (i14 & 64) != 0 ? false : z12;
            this.f265450a = i12;
            this.f265451b = i13;
            this.f265452c = str;
            this.f265453d = str2;
            this.f265454e = str3;
            this.f265455f = clearanceTitle;
            this.f265456g = z12;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF265481d() {
            return this.f265453d;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF265482e() {
            return this.f265454e;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        /* renamed from: c, reason: from getter */
        public final int getF265479b() {
            return this.f265451b;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF265480c() {
            return this.f265452c;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        /* renamed from: e, reason: from getter */
        public final int getF265478a() {
            return this.f265450a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7927a)) {
                return false;
            }
            C7927a c7927a = (C7927a) obj;
            return this.f265450a == c7927a.f265450a && this.f265451b == c7927a.f265451b && L.f(this.f265452c, c7927a.f265452c) && L.f(this.f265453d, c7927a.f265453d) && L.f(this.f265454e, c7927a.f265454e) && this.f265455f == c7927a.f265455f && this.f265456g == c7927a.f265456g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f265456g) + ((this.f265455f.hashCode() + H.d(H.d(H.d(r.e(this.f265451b, Integer.hashCode(this.f265450a) * 31, 31), 31, this.f265452c), 31, this.f265453d), 31, this.f265454e)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("High(to=");
            sb2.append(this.f265450a);
            sb2.append(", from=");
            sb2.append(this.f265451b);
            sb2.append(", title=");
            sb2.append(this.f265452c);
            sb2.append(", buttonTitle=");
            sb2.append(this.f265453d);
            sb2.append(", description=");
            sb2.append(this.f265454e);
            sb2.append(", type=");
            sb2.append(this.f265455f);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f265456g, ')');
        }
    }

    /* compiled from: GroupClearanceParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/group_clearance_select/a$b;", "Lcom/avito/android/select/group_clearance_select/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f265457a;

        /* renamed from: b, reason: collision with root package name */
        public final int f265458b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f265459c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f265460d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f265461e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ClearanceTitle f265462f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f265463g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, int i13, String str, String str2, String str3, ClearanceTitle clearanceTitle, boolean z12, int i14, C42822w c42822w) {
            super(null);
            clearanceTitle = (i14 & 32) != 0 ? ClearanceTitle.f265410d : clearanceTitle;
            z12 = (i14 & 64) != 0 ? false : z12;
            this.f265457a = i12;
            this.f265458b = i13;
            this.f265459c = str;
            this.f265460d = str2;
            this.f265461e = str3;
            this.f265462f = clearanceTitle;
            this.f265463g = z12;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF265481d() {
            return this.f265460d;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF265482e() {
            return this.f265461e;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        /* renamed from: c, reason: from getter */
        public final int getF265479b() {
            return this.f265458b;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF265480c() {
            return this.f265459c;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        /* renamed from: e, reason: from getter */
        public final int getF265478a() {
            return this.f265457a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f265457a == bVar.f265457a && this.f265458b == bVar.f265458b && L.f(this.f265459c, bVar.f265459c) && L.f(this.f265460d, bVar.f265460d) && L.f(this.f265461e, bVar.f265461e) && this.f265462f == bVar.f265462f && this.f265463g == bVar.f265463g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f265463g) + ((this.f265462f.hashCode() + H.d(H.d(H.d(r.e(this.f265458b, Integer.hashCode(this.f265457a) * 31, 31), 31, this.f265459c), 31, this.f265460d), 31, this.f265461e)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Low(to=");
            sb2.append(this.f265457a);
            sb2.append(", from=");
            sb2.append(this.f265458b);
            sb2.append(", title=");
            sb2.append(this.f265459c);
            sb2.append(", buttonTitle=");
            sb2.append(this.f265460d);
            sb2.append(", description=");
            sb2.append(this.f265461e);
            sb2.append(", type=");
            sb2.append(this.f265462f);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f265463g, ')');
        }
    }

    /* compiled from: GroupClearanceParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/group_clearance_select/a$c;", "Lcom/avito/android/select/group_clearance_select/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f265464a;

        /* renamed from: b, reason: collision with root package name */
        public final int f265465b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f265466c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f265467d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f265468e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ClearanceTitle f265469f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f265470g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, int i13, String str, String str2, String str3, ClearanceTitle clearanceTitle, boolean z12, int i14, C42822w c42822w) {
            super(null);
            clearanceTitle = (i14 & 32) != 0 ? ClearanceTitle.f265411e : clearanceTitle;
            z12 = (i14 & 64) != 0 ? false : z12;
            this.f265464a = i12;
            this.f265465b = i13;
            this.f265466c = str;
            this.f265467d = str2;
            this.f265468e = str3;
            this.f265469f = clearanceTitle;
            this.f265470g = z12;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF265481d() {
            return this.f265467d;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF265482e() {
            return this.f265468e;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        /* renamed from: c, reason: from getter */
        public final int getF265479b() {
            return this.f265465b;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF265480c() {
            return this.f265466c;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        /* renamed from: e, reason: from getter */
        public final int getF265478a() {
            return this.f265464a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f265464a == cVar.f265464a && this.f265465b == cVar.f265465b && L.f(this.f265466c, cVar.f265466c) && L.f(this.f265467d, cVar.f265467d) && L.f(this.f265468e, cVar.f265468e) && this.f265469f == cVar.f265469f && this.f265470g == cVar.f265470g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f265470g) + ((this.f265469f.hashCode() + H.d(H.d(H.d(r.e(this.f265465b, Integer.hashCode(this.f265464a) * 31, 31), 31, this.f265466c), 31, this.f265467d), 31, this.f265468e)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Medium(to=");
            sb2.append(this.f265464a);
            sb2.append(", from=");
            sb2.append(this.f265465b);
            sb2.append(", title=");
            sb2.append(this.f265466c);
            sb2.append(", buttonTitle=");
            sb2.append(this.f265467d);
            sb2.append(", description=");
            sb2.append(this.f265468e);
            sb2.append(", type=");
            sb2.append(this.f265469f);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f265470g, ')');
        }
    }

    /* compiled from: GroupClearanceParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/group_clearance_select/a$d;", "Lcom/avito/android/select/group_clearance_select/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f265471a;

        /* renamed from: b, reason: collision with root package name */
        public final int f265472b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f265473c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f265474d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f265475e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ClearanceTitle f265476f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f265477g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i12, int i13, String str, String str2, String str3, ClearanceTitle clearanceTitle, boolean z12, int i14, C42822w c42822w) {
            super(null);
            clearanceTitle = (i14 & 32) != 0 ? ClearanceTitle.f265413g : clearanceTitle;
            z12 = (i14 & 64) != 0 ? false : z12;
            this.f265471a = i12;
            this.f265472b = i13;
            this.f265473c = str;
            this.f265474d = str2;
            this.f265475e = str3;
            this.f265476f = clearanceTitle;
            this.f265477g = z12;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF265481d() {
            return this.f265474d;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF265482e() {
            return this.f265475e;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        /* renamed from: c, reason: from getter */
        public final int getF265479b() {
            return this.f265472b;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF265480c() {
            return this.f265473c;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        /* renamed from: e, reason: from getter */
        public final int getF265478a() {
            return this.f265471a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f265471a == dVar.f265471a && this.f265472b == dVar.f265472b && L.f(this.f265473c, dVar.f265473c) && L.f(this.f265474d, dVar.f265474d) && L.f(this.f265475e, dVar.f265475e) && this.f265476f == dVar.f265476f && this.f265477g == dVar.f265477g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f265477g) + ((this.f265476f.hashCode() + H.d(H.d(H.d(r.e(this.f265472b, Integer.hashCode(this.f265471a) * 31, 31), 31, this.f265473c), 31, this.f265474d), 31, this.f265475e)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OffRoad(to=");
            sb2.append(this.f265471a);
            sb2.append(", from=");
            sb2.append(this.f265472b);
            sb2.append(", title=");
            sb2.append(this.f265473c);
            sb2.append(", buttonTitle=");
            sb2.append(this.f265474d);
            sb2.append(", description=");
            sb2.append(this.f265475e);
            sb2.append(", type=");
            sb2.append(this.f265476f);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f265477g, ')');
        }
    }

    /* compiled from: GroupClearanceParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/group_clearance_select/a$e;", "Lcom/avito/android/select/group_clearance_select/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f265478a;

        /* renamed from: b, reason: collision with root package name */
        public final int f265479b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f265480c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f265481d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f265482e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ClearanceTitle f265483f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f265484g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i12, int i13, String str, String str2, String str3, ClearanceTitle clearanceTitle, boolean z12, int i14, C42822w c42822w) {
            super(null);
            clearanceTitle = (i14 & 32) != 0 ? ClearanceTitle.f265409c : clearanceTitle;
            z12 = (i14 & 64) != 0 ? false : z12;
            this.f265478a = i12;
            this.f265479b = i13;
            this.f265480c = str;
            this.f265481d = str2;
            this.f265482e = str3;
            this.f265483f = clearanceTitle;
            this.f265484g = z12;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF265481d() {
            return this.f265481d;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getF265482e() {
            return this.f265482e;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        /* renamed from: c, reason: from getter */
        public final int getF265479b() {
            return this.f265479b;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF265480c() {
            return this.f265480c;
        }

        @Override // com.avito.android.select.group_clearance_select.a
        /* renamed from: e, reason: from getter */
        public final int getF265478a() {
            return this.f265478a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f265478a == eVar.f265478a && this.f265479b == eVar.f265479b && L.f(this.f265480c, eVar.f265480c) && L.f(this.f265481d, eVar.f265481d) && L.f(this.f265482e, eVar.f265482e) && this.f265483f == eVar.f265483f && this.f265484g == eVar.f265484g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f265484g) + ((this.f265483f.hashCode() + H.d(H.d(H.d(r.e(this.f265479b, Integer.hashCode(this.f265478a) * 31, 31), 31, this.f265480c), 31, this.f265481d), 31, this.f265482e)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Sport(to=");
            sb2.append(this.f265478a);
            sb2.append(", from=");
            sb2.append(this.f265479b);
            sb2.append(", title=");
            sb2.append(this.f265480c);
            sb2.append(", buttonTitle=");
            sb2.append(this.f265481d);
            sb2.append(", description=");
            sb2.append(this.f265482e);
            sb2.append(", type=");
            sb2.append(this.f265483f);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f265484g, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    @Y61.k
    /* renamed from: a */
    public abstract String getF265481d();

    @Y61.k
    /* renamed from: b */
    public abstract String getF265482e();

    /* renamed from: c */
    public abstract int getF265479b();

    @Y61.k
    /* renamed from: d */
    public abstract String getF265480c();

    /* renamed from: e */
    public abstract int getF265478a();

    public a() {
    }
}
