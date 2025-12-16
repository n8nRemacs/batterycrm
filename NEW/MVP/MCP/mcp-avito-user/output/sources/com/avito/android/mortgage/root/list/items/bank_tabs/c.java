package com.avito.android.mortgage.root.list.items.bank_tabs;

import Y61.k;
import Y61.l;
import a10.InterfaceC19664a;
import a10.InterfaceC19665b;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.badge.g;
import com.avito.android.lib.design.chips.g;
import com.avito.android.util.C35835l0;
import com.avito.conveyor_item.a;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BankTabsItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank_tabs/c;", "La10/b;", "La10/a;", "a", "b", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b, InterfaceC19664a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202409b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<a> f202410c;

    /* renamed from: d, reason: collision with root package name */
    public final int f202411d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f202412e;

    /* compiled from: BankTabsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank_tabs/c$b;", "Lcom/avito/android/lib/design/chips/h;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CharSequence f202417b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f202418c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f202419d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final Context f202420e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f202421f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f202422g;

        public b(CharSequence charSequence, String str, boolean z12, Context context, boolean z13, boolean z14, int i12, C42822w c42822w) {
            z13 = (i12 & 16) != 0 ? false : z13;
            z14 = (i12 & 32) != 0 ? true : z14;
            this.f202417b = charSequence;
            this.f202418c = str;
            this.f202419d = z12;
            this.f202420e = context;
            this.f202421f = z13;
            this.f202422g = z14;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.g Q1() {
            if (!this.f202419d) {
                return null;
            }
            int iJ2 = C35835l0.j(R.attr.badgeEmptyBlackS, this.f202420e);
            Badge badge = new Badge(this.f202420e, null, 0, 0, 14, null);
            badge.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            g.a aVar = com.avito.android.lib.design.badge.g.f178395r;
            Context context = badge.getContext();
            aVar.getClass();
            badge.setStyle(g.a.b(iJ2, context));
            return new g.a(badge, null, null, false, 14, null);
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@k Object obj) {
            return obj.equals(this);
        }

        @Override // com.avito.android.lib.design.chips.h
        @k
        /* renamed from: W, reason: from getter */
        public final CharSequence getF6557d() {
            return this.f202417b;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f202417b, bVar.f202417b) && L.f(this.f202418c, bVar.f202418c) && this.f202419d == bVar.f202419d && L.f(this.f202420e, bVar.f202420e) && this.f202421f == bVar.f202421f && this.f202422g == bVar.f202422g;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0, reason: from getter */
        public final boolean getF16599c() {
            return this.f202421f;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f202422g) + r.i((this.f202420e.hashCode() + r.i(H.d(this.f202417b.hashCode() * 31, 31, this.f202418c), 31, this.f202419d)) * 31, 31, this.f202421f);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled, reason: from getter */
        public final boolean getF178769i() {
            return this.f202422g;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BankTab(chipTitle=");
            sb2.append((Object) this.f202417b);
            sb2.append(", value=");
            sb2.append(this.f202418c);
            sb2.append(", hasBadge=");
            sb2.append(this.f202419d);
            sb2.append(", context=");
            sb2.append(this.f202420e);
            sb2.append(", isSelectedChip=");
            sb2.append(this.f202421f);
            sb2.append(", isEnabled=");
            return r.x(sb2, this.f202422g, ')');
        }
    }

    public c(@k String str, @k List<a> list, int i12) {
        this.f202409b = str;
        this.f202410c = list;
        this.f202411d = i12;
        List<a> list2 = list;
        boolean z12 = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((a) it.next()).f202416d) {
                    z12 = true;
                    break;
                }
            }
        }
        this.f202412e = z12;
    }

    @Override // a10.InterfaceC19664a
    @k
    public final InterfaceC19665b N() {
        List<a> list = this.f202410c;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (a aVar : list) {
            Y41.l<Context, CharSequence> lVar = aVar.f202413a;
            String str = aVar.f202414b;
            boolean z12 = aVar.f202415c;
            aVar.getClass();
            arrayList.add(new a(lVar, str, z12, false));
        }
        return new c(this.f202409b, arrayList, this.f202411d);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202409b, cVar.f202409b) && L.f(this.f202410c, cVar.f202410c) && this.f202411d == cVar.f202411d;
    }

    @Override // a10.InterfaceC19664a
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF202526h() {
        return this.f202412e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84654b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183509b() {
        return this.f202409b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f202411d) + H.e(this.f202409b.hashCode() * 31, 31, this.f202410c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BankTabsItem(stringId=");
        sb2.append(this.f202409b);
        sb2.append(", tabs=");
        sb2.append(this.f202410c);
        sb2.append(", selectedTabIdx=");
        return r.t(sb2, this.f202411d, ')');
    }

    /* compiled from: BankTabsItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank_tabs/c$a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Y41.l<Context, CharSequence> f202413a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f202414b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f202415c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f202416d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k Y41.l<? super Context, ? extends CharSequence> lVar, @k String str, boolean z12, boolean z13) {
            this.f202413a = lVar;
            this.f202414b = str;
            this.f202415c = z12;
            this.f202416d = z13;
        }

        public final boolean equals(@l Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f202414b, aVar.f202414b) && this.f202415c == aVar.f202415c && this.f202416d == aVar.f202416d;
        }

        public final int hashCode() {
            return r.i(Boolean.hashCode(this.f202415c) + this.f202414b.hashCode(), 31, this.f202416d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BankLazyTab(chipTitleProvider=");
            sb2.append(this.f202413a);
            sb2.append(", value=");
            sb2.append(this.f202414b);
            sb2.append(", hasBadge=");
            sb2.append(this.f202415c);
            sb2.append(", isEnabled=");
            return r.x(sb2, this.f202416d, ')');
        }

        public /* synthetic */ a(Y41.l lVar, String str, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(lVar, str, z12, (i12 & 8) != 0 ? true : z13);
        }
    }
}
