package com.avito.android.lib.design.selector_card.style;

import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.switcher.a;
import com.avito.android.lib.design.toggle.a;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35835l0;
import hw.InterfaceC41176a;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCardStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/selector_card/style/c;", "", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f180435l = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.toggle.a f180436a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.switcher.a f180437b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.selector_card.style.a f180438c;

    /* renamed from: d, reason: collision with root package name */
    public final float f180439d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.selector_card.style.a f180440e;

    /* renamed from: f, reason: collision with root package name */
    public final float f180441f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final n f180442g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final n f180443h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final b f180444i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final b f180445j;

    /* renamed from: k, reason: collision with root package name */
    public final int f180446k;

    /* compiled from: SelectorCardStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/selector_card/style/c$a;", "LLV/c;", "Lcom/avito/android/lib/design/selector_card/style/c;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<c> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static c b(@k TypedArray typedArray, @k Context context) {
            a.C5326a c5326a = com.avito.android.lib.design.toggle.a.f181173m;
            int resourceId = typedArray.getResourceId(3, 0);
            c5326a.getClass();
            com.avito.android.lib.design.toggle.a aVarB = a.C5326a.b(resourceId, context);
            a.C5304a c5304a = com.avito.android.lib.design.switcher.a.f180669j;
            int resourceId2 = typedArray.getResourceId(5, 0);
            c5304a.getClass();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, d.n.f178926I0);
            com.avito.android.lib.design.switcher.a aVarB2 = a.C5304a.b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            ColorStateList colorStateListA = x.a(typedArray, context, 0);
            com.avito.android.lib.design.selector_card.style.a aVarB3 = colorStateListA != null ? com.avito.android.lib.design.selector_card.style.b.b(colorStateListA) : null;
            float dimension = typedArray.getDimension(4, 0.0f);
            ColorStateList colorStateListA2 = x.a(typedArray, context, 1);
            com.avito.android.lib.design.selector_card.style.a aVarB4 = colorStateListA2 != null ? com.avito.android.lib.design.selector_card.style.b.b(colorStateListA2) : null;
            float dimension2 = typedArray.getDimension(2, 0.0f);
            com.avito.android.lib.design.text_view.d dVar = com.avito.android.lib.design.text_view.d.f180938a;
            int iJ2 = C35835l0.j(R.attr.textH30, context);
            dVar.getClass();
            return new c(aVarB, aVarB2, aVarB3, dimension, aVarB4, dimension2, com.avito.android.lib.design.text_view.d.a(iJ2, context), com.avito.android.lib.design.text_view.d.a(C35835l0.j(R.attr.textM10, context), context), null, null, 0, 1792, null);
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f179003x0);
            c.f180435l.getClass();
            c cVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return cVarB;
        }

        public a() {
        }
    }

    /* compiled from: SelectorCardStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/style/c$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f180447a;

        /* renamed from: b, reason: collision with root package name */
        public final int f180448b;

        /* renamed from: c, reason: collision with root package name */
        public final int f180449c;

        /* renamed from: d, reason: collision with root package name */
        public final int f180450d;

        public b(@U int i12, @U int i13, @U int i14, @U int i15) {
            this.f180447a = i12;
            this.f180448b = i13;
            this.f180449c = i14;
            this.f180450d = i15;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f180447a == bVar.f180447a && this.f180448b == bVar.f180448b && this.f180449c == bVar.f180449c && this.f180450d == bVar.f180450d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f180450d) + r.e(this.f180449c, r.e(this.f180448b, Integer.hashCode(this.f180447a) * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Insets(start=");
            sb2.append(this.f180447a);
            sb2.append(", top=");
            sb2.append(this.f180448b);
            sb2.append(", end=");
            sb2.append(this.f180449c);
            sb2.append(", bottom=");
            return r.t(sb2, this.f180450d, ')');
        }
    }

    public c() {
        this(null, null, null, 0.0f, null, 0.0f, null, null, null, null, 0, 2047, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f180436a, cVar.f180436a) && L.f(this.f180437b, cVar.f180437b) && L.f(this.f180438c, cVar.f180438c) && Float.compare(this.f180439d, cVar.f180439d) == 0 && L.f(this.f180440e, cVar.f180440e) && Float.compare(this.f180441f, cVar.f180441f) == 0 && L.f(this.f180442g, cVar.f180442g) && L.f(this.f180443h, cVar.f180443h) && L.f(this.f180444i, cVar.f180444i) && L.f(this.f180445j, cVar.f180445j) && this.f180446k == cVar.f180446k;
    }

    public final int hashCode() {
        com.avito.android.lib.design.toggle.a aVar = this.f180436a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        com.avito.android.lib.design.switcher.a aVar2 = this.f180437b;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        com.avito.android.lib.design.selector_card.style.a aVar3 = this.f180438c;
        int iD2 = r.d(this.f180439d, (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31, 31);
        com.avito.android.lib.design.selector_card.style.a aVar4 = this.f180440e;
        int iD3 = r.d(this.f180441f, (iD2 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31, 31);
        n nVar = this.f180442g;
        int iHashCode3 = (iD3 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        n nVar2 = this.f180443h;
        int iHashCode4 = (iHashCode3 + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
        b bVar = this.f180444i;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f180445j;
        return Integer.hashCode(this.f180446k) + ((iHashCode5 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectorCardStyle(checkmarkStyle=");
        sb2.append(this.f180436a);
        sb2.append(", switcherStyle=");
        sb2.append(this.f180437b);
        sb2.append(", backgroundColor=");
        sb2.append(this.f180438c);
        sb2.append(", cornerRadius=");
        sb2.append(this.f180439d);
        sb2.append(", borderColor=");
        sb2.append(this.f180440e);
        sb2.append(", borderWidth=");
        sb2.append(this.f180441f);
        sb2.append(", titleStyle=");
        sb2.append(this.f180442g);
        sb2.append(", subtitleStyle=");
        sb2.append(this.f180443h);
        sb2.append(", contentInsets=");
        sb2.append(this.f180444i);
        sb2.append(", indicatorInsets=");
        sb2.append(this.f180445j);
        sb2.append(", spaceBetweenTitleAndSubtitle=");
        return r.t(sb2, this.f180446k, ')');
    }

    public c(@l com.avito.android.lib.design.toggle.a aVar, @l com.avito.android.lib.design.switcher.a aVar2, @l com.avito.android.lib.design.selector_card.style.a aVar3, float f12, @l com.avito.android.lib.design.selector_card.style.a aVar4, float f13, @l n nVar, @l n nVar2, @l b bVar, @l b bVar2, @U int i12) {
        this.f180436a = aVar;
        this.f180437b = aVar2;
        this.f180438c = aVar3;
        this.f180439d = f12;
        this.f180440e = aVar4;
        this.f180441f = f13;
        this.f180442g = nVar;
        this.f180443h = nVar2;
        this.f180444i = bVar;
        this.f180445j = bVar2;
        this.f180446k = i12;
    }

    public /* synthetic */ c(com.avito.android.lib.design.toggle.a aVar, com.avito.android.lib.design.switcher.a aVar2, com.avito.android.lib.design.selector_card.style.a aVar3, float f12, com.avito.android.lib.design.selector_card.style.a aVar4, float f13, n nVar, n nVar2, b bVar, b bVar2, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : aVar2, (i13 & 4) != 0 ? null : aVar3, (i13 & 8) != 0 ? 0.0f : f12, (i13 & 16) != 0 ? null : aVar4, (i13 & 32) == 0 ? f13 : 0.0f, (i13 & 64) != 0 ? null : nVar, (i13 & 128) != 0 ? null : nVar2, (i13 & 256) != 0 ? null : bVar, (i13 & 512) == 0 ? bVar2 : null, (i13 & 1024) != 0 ? 0 : i12);
    }
}
