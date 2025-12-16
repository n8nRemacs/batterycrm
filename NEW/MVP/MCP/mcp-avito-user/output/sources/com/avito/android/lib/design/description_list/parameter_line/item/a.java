package com.avito.android.lib.design.description_list.parameter_line.item;

import AK.c;
import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import com.akita.compose.component.accordion.s;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DescriptionParameterItemState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/description_list/parameter_line/item/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C5266a f179087a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CharSequence f179088b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CharSequence f179089c;

    /* compiled from: DescriptionParameterItemState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/description_list/parameter_line/item/a$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.description_list.parameter_line.item.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5266a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Drawable f179090a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Y41.a<G0> f179091b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f179092c;

        public C5266a() {
            throw null;
        }

        public C5266a(Drawable drawable, Y41.a aVar, Integer num, int i12, C42822w c42822w) {
            aVar = (i12 & 2) != 0 ? null : aVar;
            num = (i12 & 4) != 0 ? null : num;
            this.f179090a = drawable;
            this.f179091b = aVar;
            this.f179092c = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5266a)) {
                return false;
            }
            C5266a c5266a = (C5266a) obj;
            return L.f(this.f179090a, c5266a.f179090a) && L.f(this.f179091b, c5266a.f179091b) && L.f(this.f179092c, c5266a.f179092c);
        }

        public final int hashCode() {
            int iHashCode = this.f179090a.hashCode() * 31;
            Y41.a<G0> aVar = this.f179091b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Integer num = this.f179092c;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LeftIconState(icon=");
            sb2.append(this.f179090a);
            sb2.append(", iconOnClick=");
            sb2.append(this.f179091b);
            sb2.append(", iconTouchExtraSpace=");
            return s.j(sb2, this.f179092c, ')');
        }
    }

    public a(C5266a c5266a, CharSequence charSequence, CharSequence charSequence2, int i12, C42822w c42822w) {
        this.f179087a = (i12 & 1) != 0 ? null : c5266a;
        this.f179088b = charSequence;
        this.f179089c = charSequence2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f179087a, aVar.f179087a) && L.f(this.f179088b, aVar.f179088b) && L.f(this.f179089c, aVar.f179089c);
    }

    public final int hashCode() {
        C5266a c5266a = this.f179087a;
        return this.f179089c.hashCode() + com.avito.android.advert.item.delivery_suggests.l.c((c5266a == null ? 0 : c5266a.hashCode()) * 31, 31, this.f179088b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DescriptionParameterItemState(iconState=");
        sb2.append(this.f179087a);
        sb2.append(", leftText=");
        sb2.append((Object) this.f179088b);
        sb2.append(", rightText=");
        return c.r(sb2, this.f179089c, ')');
    }
}
