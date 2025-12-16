package com.akita.compose.component.description_list;

import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import com.akita.compose.foundation.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DescriptionListStyle.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/akita/compose/component/description_list/j;", "", "Lcom/akita/compose/foundation/r;", "leadingTextStyle", "leadingTextSecondaryStyle", "trailingTextStyle", "boldTextStyle", "Landroidx/compose/ui/unit/h;", "linesSpacing", "Lcom/akita/compose/component/description_list/j$a;", "dashStyle", "<init>", "(Lcom/akita/compose/foundation/r;Lcom/akita/compose/foundation/r;Lcom/akita/compose/foundation/r;Lcom/akita/compose/foundation/r;FLcom/akita/compose/component/description_list/j$a;Lkotlin/jvm/internal/w;)V", "a", "description-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f61490a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final r f61491b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final r f61492c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final r f61493d;

    /* renamed from: e, reason: collision with root package name */
    public final float f61494e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a f61495f;

    /* compiled from: DescriptionListStyle.kt */
    @P
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/akita/compose/component/description_list/j$a;", "", "Landroidx/compose/ui/unit/h;", "minWidth", "height", "Lcom/akita/compose/foundation/p;", "color", "dashWidth", "gapWidth", "paddingHorizontal", "<init>", "(FFLcom/akita/compose/foundation/p;FFFLkotlin/jvm/internal/w;)V", "description-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f61496a;

        /* renamed from: b, reason: collision with root package name */
        public final float f61497b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final p f61498c;

        /* renamed from: d, reason: collision with root package name */
        public final float f61499d;

        /* renamed from: e, reason: collision with root package name */
        public final float f61500e;

        /* renamed from: f, reason: collision with root package name */
        public final float f61501f;

        public a(float f12, float f13, p pVar, float f14, float f15, float f16, C42822w c42822w) {
            this.f61496a = f12;
            this.f61497b = f13;
            this.f61498c = pVar;
            this.f61499d = f14;
            this.f61500e = f15;
            this.f61501f = f16;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return androidx.compose.ui.unit.h.b(this.f61496a, aVar.f61496a) && androidx.compose.ui.unit.h.b(this.f61497b, aVar.f61497b) && L.f(this.f61498c, aVar.f61498c) && androidx.compose.ui.unit.h.b(this.f61499d, aVar.f61499d) && androidx.compose.ui.unit.h.b(this.f61500e, aVar.f61500e) && androidx.compose.ui.unit.h.b(this.f61501f, aVar.f61501f);
        }

        public final int hashCode() {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            return Float.hashCode(this.f61501f) + androidx.appcompat.app.r.d(this.f61500e, androidx.appcompat.app.r.d(this.f61499d, s.b(this.f61498c, androidx.appcompat.app.r.d(this.f61497b, Float.hashCode(this.f61496a) * 31, 31), 31), 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DashStyle(minWidth=");
            H.u(this.f61496a, ", height=", sb2);
            H.u(this.f61497b, ", color=", sb2);
            sb2.append(this.f61498c);
            sb2.append(", dashWidth=");
            H.u(this.f61499d, ", gapWidth=", sb2);
            H.u(this.f61500e, ", paddingHorizontal=", sb2);
            return H.h(')', this.f61501f, sb2);
        }
    }

    public j(r rVar, r rVar2, r rVar3, r rVar4, float f12, a aVar, C42822w c42822w) {
        this.f61490a = rVar;
        this.f61491b = rVar2;
        this.f61492c = rVar3;
        this.f61493d = rVar4;
        this.f61494e = f12;
        this.f61495f = aVar;
    }

    public static j a(j jVar, r rVar, int i12) {
        if ((i12 & 1) != 0) {
            rVar = jVar.f61490a;
        }
        r rVar2 = jVar.f61491b;
        r rVar3 = jVar.f61492c;
        r rVar4 = jVar.f61493d;
        float f12 = jVar.f61494e;
        a aVar = jVar.f61495f;
        jVar.getClass();
        return new j(rVar, rVar2, rVar3, rVar4, f12, aVar, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f61490a, jVar.f61490a) && L.f(this.f61491b, jVar.f61491b) && L.f(this.f61492c, jVar.f61492c) && L.f(this.f61493d, jVar.f61493d) && androidx.compose.ui.unit.h.b(this.f61494e, jVar.f61494e) && L.f(this.f61495f, jVar.f61495f);
    }

    public final int hashCode() {
        int iA2 = s.a(s.a(s.a(this.f61490a.hashCode() * 31, 31, this.f61491b), 31, this.f61492c), 31, this.f61493d);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f61495f.hashCode() + androidx.appcompat.app.r.d(this.f61494e, iA2, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DescriptionListStyle(leadingTextStyle=");
        sb2.append(this.f61490a);
        sb2.append(", leadingTextSecondaryStyle=");
        sb2.append(this.f61491b);
        sb2.append(", trailingTextStyle=");
        sb2.append(this.f61492c);
        sb2.append(", boldTextStyle=");
        sb2.append(this.f61493d);
        sb2.append(", linesSpacing=");
        H.u(this.f61494e, ", dashStyle=", sb2);
        sb2.append(this.f61495f);
        sb2.append(')');
        return sb2.toString();
    }
}
