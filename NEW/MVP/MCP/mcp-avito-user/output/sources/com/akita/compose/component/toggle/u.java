package com.akita.compose.component.toggle;

import androidx.compose.animation.core.N;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: ToggleStyle.kt */
@P
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/akita/compose/component/toggle/u;", "", "Landroidx/compose/ui/unit/h;", "width", "height", "borderWidth", "cornerRadius", "thumbSize", "Lcom/akita/compose/foundation/c;", "backgroundColor", "backgroundColorChecked", "toggleColor", "toggleColorChecked", "borderColorChecked", "borderColor", "", "isHaptic", "", "animationDurationMillis", "", "scaleFrom", "scaleTo", "Landroidx/compose/animation/core/N;", "easing", "<init>", "(FFFFFLcom/akita/compose/foundation/c;Lcom/akita/compose/foundation/c;Lcom/akita/compose/foundation/c;Lcom/akita/compose/foundation/c;Lcom/akita/compose/foundation/c;Lcom/akita/compose/foundation/c;ZIFFLandroidx/compose/animation/core/N;Lkotlin/jvm/internal/w;)V", "toggle_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class u {

    /* renamed from: a, reason: collision with root package name */
    public final float f63436a;

    /* renamed from: b, reason: collision with root package name */
    public final float f63437b;

    /* renamed from: c, reason: collision with root package name */
    public final float f63438c;

    /* renamed from: d, reason: collision with root package name */
    public final float f63439d;

    /* renamed from: e, reason: collision with root package name */
    public final float f63440e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.c f63441f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.c f63442g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.c f63443h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.c f63444i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.c f63445j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.c f63446k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f63447l;

    /* renamed from: m, reason: collision with root package name */
    public final int f63448m;

    /* renamed from: n, reason: collision with root package name */
    public final float f63449n;

    /* renamed from: o, reason: collision with root package name */
    public final float f63450o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final N f63451p;

    public u(float f12, float f13, float f14, float f15, float f16, com.akita.compose.foundation.c cVar, com.akita.compose.foundation.c cVar2, com.akita.compose.foundation.c cVar3, com.akita.compose.foundation.c cVar4, com.akita.compose.foundation.c cVar5, com.akita.compose.foundation.c cVar6, boolean z12, int i12, float f17, float f18, N n12, int i13, C42822w c42822w) {
        this(f12, f13, f14, f15, f16, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, z12, (i13 & 4096) != 0 ? 120 : i12, (i13 & 8192) != 0 ? 0.67f : f17, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 1.0f : f18, (i13 & 32768) != 0 ? t.f63435a : n12, null);
    }

    public static u a(u uVar, float f12, com.akita.compose.foundation.c cVar, int i12) {
        float f13 = uVar.f63436a;
        float f14 = uVar.f63437b;
        float f15 = uVar.f63438c;
        float f16 = (i12 & 8) != 0 ? uVar.f63439d : f12;
        float f17 = uVar.f63440e;
        com.akita.compose.foundation.c cVar2 = (i12 & 32) != 0 ? uVar.f63441f : cVar;
        com.akita.compose.foundation.c cVar3 = uVar.f63442g;
        com.akita.compose.foundation.c cVar4 = uVar.f63443h;
        com.akita.compose.foundation.c cVar5 = uVar.f63444i;
        com.akita.compose.foundation.c cVar6 = uVar.f63445j;
        com.akita.compose.foundation.c cVar7 = uVar.f63446k;
        boolean z12 = uVar.f63447l;
        int i13 = uVar.f63448m;
        float f18 = uVar.f63449n;
        float f19 = uVar.f63450o;
        N n12 = uVar.f63451p;
        uVar.getClass();
        return new u(f13, f14, f15, f16, f17, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, z12, i13, f18, f19, n12, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return androidx.compose.ui.unit.h.b(this.f63436a, uVar.f63436a) && androidx.compose.ui.unit.h.b(this.f63437b, uVar.f63437b) && androidx.compose.ui.unit.h.b(this.f63438c, uVar.f63438c) && androidx.compose.ui.unit.h.b(this.f63439d, uVar.f63439d) && androidx.compose.ui.unit.h.b(this.f63440e, uVar.f63440e) && L.f(this.f63441f, uVar.f63441f) && L.f(this.f63442g, uVar.f63442g) && L.f(this.f63443h, uVar.f63443h) && L.f(this.f63444i, uVar.f63444i) && L.f(this.f63445j, uVar.f63445j) && L.f(this.f63446k, uVar.f63446k) && this.f63447l == uVar.f63447l && this.f63448m == uVar.f63448m && Float.compare(this.f63449n, uVar.f63449n) == 0 && Float.compare(this.f63450o, uVar.f63450o) == 0 && L.f(this.f63451p, uVar.f63451p);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f63451p.hashCode() + androidx.appcompat.app.r.d(this.f63450o, androidx.appcompat.app.r.d(this.f63449n, androidx.appcompat.app.r.e(this.f63448m, androidx.appcompat.app.r.i((this.f63446k.hashCode() + ((this.f63445j.hashCode() + ((this.f63444i.hashCode() + ((this.f63443h.hashCode() + ((this.f63442g.hashCode() + ((this.f63441f.hashCode() + androidx.appcompat.app.r.d(this.f63440e, androidx.appcompat.app.r.d(this.f63439d, androidx.appcompat.app.r.d(this.f63438c, androidx.appcompat.app.r.d(this.f63437b, Float.hashCode(this.f63436a) * 31, 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f63447l), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToggleStyle(width=");
        H.u(this.f63436a, ", height=", sb2);
        H.u(this.f63437b, ", borderWidth=", sb2);
        H.u(this.f63438c, ", cornerRadius=", sb2);
        H.u(this.f63439d, ", thumbSize=", sb2);
        H.u(this.f63440e, ", backgroundColor=", sb2);
        sb2.append(this.f63441f);
        sb2.append(", backgroundColorChecked=");
        sb2.append(this.f63442g);
        sb2.append(", toggleColor=");
        sb2.append(this.f63443h);
        sb2.append(", toggleColorChecked=");
        sb2.append(this.f63444i);
        sb2.append(", borderColorChecked=");
        sb2.append(this.f63445j);
        sb2.append(", borderColor=");
        sb2.append(this.f63446k);
        sb2.append(", isHaptic=");
        sb2.append(this.f63447l);
        sb2.append(", animationDurationMillis=");
        sb2.append(this.f63448m);
        sb2.append(", scaleFrom=");
        sb2.append(this.f63449n);
        sb2.append(", scaleTo=");
        sb2.append(this.f63450o);
        sb2.append(", easing=");
        sb2.append(this.f63451p);
        sb2.append(')');
        return sb2.toString();
    }

    public u(float f12, float f13, float f14, float f15, float f16, com.akita.compose.foundation.c cVar, com.akita.compose.foundation.c cVar2, com.akita.compose.foundation.c cVar3, com.akita.compose.foundation.c cVar4, com.akita.compose.foundation.c cVar5, com.akita.compose.foundation.c cVar6, boolean z12, int i12, float f17, float f18, N n12, C42822w c42822w) {
        this.f63436a = f12;
        this.f63437b = f13;
        this.f63438c = f14;
        this.f63439d = f15;
        this.f63440e = f16;
        this.f63441f = cVar;
        this.f63442g = cVar2;
        this.f63443h = cVar3;
        this.f63444i = cVar4;
        this.f63445j = cVar5;
        this.f63446k = cVar6;
        this.f63447l = z12;
        this.f63448m = i12;
        this.f63449n = f17;
        this.f63450o = f18;
        this.f63451p = n12;
    }
}
