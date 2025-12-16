package com.avito.android.tariff_lf_constructor.configure.checkbox_selector;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.toggle.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CheckBoxItem.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d;", "Lcom/avito/conveyor_item/a;", "a", "b", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$a;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$b;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f299460b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final State f299461c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f299462d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f299463e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Boolean f299464f;

    /* compiled from: CheckBoxItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$a;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final String f299465g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final String f299466h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public State f299467i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final String f299468j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final Integer f299469k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f299470l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final Boolean f299471m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final String f299472n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.l
        public final List<com.avito.conveyor_item.a> f299473o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f299474p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f299475q;

        public /* synthetic */ a(String str, String str2, State state, String str3, Integer num, boolean z12, Boolean bool, String str4, List list, boolean z13, boolean z14, int i12, C42822w c42822w) {
            this(str, str2, state, str3, num, (i12 & 32) != 0 ? true : z12, bool, str4, list, (i12 & 512) != 0 ? false : z13, (i12 & 1024) != 0 ? true : z14);
        }

        public static a Q(a aVar, State state, boolean z12, int i12) {
            String str = aVar.f299465g;
            String str2 = aVar.f299466h;
            if ((i12 & 4) != 0) {
                state = aVar.f299467i;
            }
            State state2 = state;
            String str3 = aVar.f299468j;
            Integer num = aVar.f299469k;
            boolean z13 = aVar.f299470l;
            Boolean bool = aVar.f299471m;
            String str4 = aVar.f299472n;
            List<com.avito.conveyor_item.a> list = aVar.f299473o;
            if ((i12 & 512) != 0) {
                z12 = aVar.f299474p;
            }
            boolean z14 = aVar.f299475q;
            aVar.getClass();
            return new a(str, str2, state2, str3, num, z13, bool, str4, list, z12, z14);
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d
        /* renamed from: L, reason: from getter */
        public final boolean getF299463e() {
            return this.f299470l;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d
        @Y61.l
        /* renamed from: P, reason: from getter */
        public final Boolean getF299464f() {
            return this.f299471m;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final State getF299461c() {
            return this.f299467i;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f299465g, aVar.f299465g) && L.f(this.f299466h, aVar.f299466h) && this.f299467i == aVar.f299467i && L.f(this.f299468j, aVar.f299468j) && L.f(this.f299469k, aVar.f299469k) && this.f299470l == aVar.f299470l && L.f(this.f299471m, aVar.f299471m) && L.f(this.f299472n, aVar.f299472n) && L.f(this.f299473o, aVar.f299473o) && this.f299474p == aVar.f299474p && this.f299475q == aVar.f299475q;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d
        @Y61.l
        /* renamed from: f, reason: from getter */
        public final String getF299462d() {
            return this.f299468j;
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF298960b() {
            return this.f299465g;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d
        @Y61.k
        /* renamed from: getTitle, reason: from getter */
        public final String getF299460b() {
            return this.f299466h;
        }

        public final int hashCode() {
            int iHashCode = (this.f299467i.hashCode() + H.d(this.f299465g.hashCode() * 31, 31, this.f299466h)) * 31;
            String str = this.f299468j;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f299469k;
            int i12 = r.i((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f299470l);
            Boolean bool = this.f299471m;
            int iHashCode3 = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.f299472n;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<com.avito.conveyor_item.a> list = this.f299473o;
            return Boolean.hashCode(this.f299475q) + r.i((iHashCode4 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f299474p);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GroupCheckBoxItem(stringId=");
            sb2.append(this.f299465g);
            sb2.append(", title=");
            sb2.append(this.f299466h);
            sb2.append(", checkboxState=");
            sb2.append(this.f299467i);
            sb2.append(", parentId=");
            sb2.append(this.f299468j);
            sb2.append(", level=");
            sb2.append(this.f299469k);
            sb2.append(", isEnabled=");
            sb2.append(this.f299470l);
            sb2.append(", isRoot=");
            sb2.append(this.f299471m);
            sb2.append(", subtitle=");
            sb2.append(this.f299472n);
            sb2.append(", subItems=");
            sb2.append(this.f299473o);
            sb2.append(", isExpanded=");
            sb2.append(this.f299474p);
            sb2.append(", areGroupsCollapsibleIconAvailable=");
            return r.x(sb2, this.f299475q, ')');
        }

        public a(@Y61.k String str, @Y61.k String str2, @Y61.k State state, @Y61.l String str3, @Y61.l Integer num, boolean z12, @Y61.l Boolean bool, @Y61.l String str4, @Y61.l List<com.avito.conveyor_item.a> list, boolean z13, boolean z14) {
            super(str2, state, str3, num, z12, bool, str4, null);
            this.f299465g = str;
            this.f299466h = str2;
            this.f299467i = state;
            this.f299468j = str3;
            this.f299469k = num;
            this.f299470l = z12;
            this.f299471m = bool;
            this.f299472n = str4;
            this.f299473o = list;
            this.f299474p = z13;
            this.f299475q = z14;
        }
    }

    /* compiled from: CheckBoxItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$b;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final String f299476g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final String f299477h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final State f299478i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final String f299479j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final Integer f299480k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f299481l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final Boolean f299482m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final String f299483n;

        public /* synthetic */ b(String str, String str2, State state, String str3, Integer num, boolean z12, Boolean bool, String str4, int i12, C42822w c42822w) {
            this(str, str2, state, str3, num, (i12 & 32) != 0 ? true : z12, bool, str4);
        }

        public static b Q(b bVar, State state) {
            String str = bVar.f299476g;
            String str2 = bVar.f299477h;
            String str3 = bVar.f299479j;
            Integer num = bVar.f299480k;
            boolean z12 = bVar.f299481l;
            Boolean bool = bVar.f299482m;
            String str4 = bVar.f299483n;
            bVar.getClass();
            return new b(str, str2, state, str3, num, z12, bool, str4);
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d
        /* renamed from: L, reason: from getter */
        public final boolean getF299463e() {
            return this.f299481l;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d
        @Y61.l
        /* renamed from: P, reason: from getter */
        public final Boolean getF299464f() {
            return this.f299482m;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d
        @Y61.k
        /* renamed from: b, reason: from getter */
        public final State getF299461c() {
            return this.f299478i;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f299476g, bVar.f299476g) && L.f(this.f299477h, bVar.f299477h) && this.f299478i == bVar.f299478i && L.f(this.f299479j, bVar.f299479j) && L.f(this.f299480k, bVar.f299480k) && this.f299481l == bVar.f299481l && L.f(this.f299482m, bVar.f299482m) && L.f(this.f299483n, bVar.f299483n);
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d
        @Y61.l
        /* renamed from: f, reason: from getter */
        public final String getF299462d() {
            return this.f299479j;
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF300101b() {
            return this.f299476g;
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d
        @Y61.k
        /* renamed from: getTitle, reason: from getter */
        public final String getF299460b() {
            return this.f299477h;
        }

        public final int hashCode() {
            int iHashCode = (this.f299478i.hashCode() + H.d(this.f299476g.hashCode() * 31, 31, this.f299477h)) * 31;
            String str = this.f299479j;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f299480k;
            int i12 = r.i((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f299481l);
            Boolean bool = this.f299482m;
            int iHashCode3 = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.f299483n;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SingleCheckBoxItem(stringId=");
            sb2.append(this.f299476g);
            sb2.append(", title=");
            sb2.append(this.f299477h);
            sb2.append(", checkboxState=");
            sb2.append(this.f299478i);
            sb2.append(", parentId=");
            sb2.append(this.f299479j);
            sb2.append(", level=");
            sb2.append(this.f299480k);
            sb2.append(", isEnabled=");
            sb2.append(this.f299481l);
            sb2.append(", isRoot=");
            sb2.append(this.f299482m);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.f299483n, ')');
        }

        public b(@Y61.k String str, @Y61.k String str2, @Y61.k State state, @Y61.l String str3, @Y61.l Integer num, boolean z12, @Y61.l Boolean bool, @Y61.l String str4) {
            super(str2, state, str3, num, z12, bool, str4, null);
            this.f299476g = str;
            this.f299477h = str2;
            this.f299478i = state;
            this.f299479j = str3;
            this.f299480k = num;
            this.f299481l = z12;
            this.f299482m = bool;
            this.f299483n = str4;
        }
    }

    /* compiled from: CheckBoxItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                State state = State.f181147b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                State state2 = State.f181147b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(String str, State state, String str2, Integer num, boolean z12, Boolean bool, String str3, C42822w c42822w) {
        this.f299460b = str;
        this.f299461c = state;
        this.f299462d = str2;
        this.f299463e = z12;
        this.f299464f = bool;
    }

    /* renamed from: L, reason: from getter */
    public boolean getF299463e() {
        return this.f299463e;
    }

    @Y61.l
    /* renamed from: P, reason: from getter */
    public Boolean getF299464f() {
        return this.f299464f;
    }

    @Y61.k
    public final State a() {
        int iOrdinal = getF299461c().ordinal();
        if (iOrdinal == 0) {
            return State.f181148c;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return State.f181147b;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public State getF299461c() {
        return this.f299461c;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public String getF299462d() {
        return this.f299462d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269930b() {
        return getF300101b().hashCode();
    }

    @Y61.k
    /* renamed from: getTitle, reason: from getter */
    public String getF299460b() {
        return this.f299460b;
    }
}
