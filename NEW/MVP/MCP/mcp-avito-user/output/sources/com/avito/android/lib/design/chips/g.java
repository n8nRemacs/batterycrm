package com.avito.android.lib.design.chips;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChipOverlay.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/g;", "", "a", "b", "Lcom/avito/android/lib/design/chips/g$a;", "Lcom/avito/android/lib/design/chips/g$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f178740a;

    /* compiled from: ChipOverlay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/g$a;", "Lcom/avito/android/lib/design/chips/g;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends g {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final View f178741b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f178742c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f178743d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f178744e;

        public /* synthetic */ a(View view, Integer num, Integer num2, boolean z12, int i12, C42822w c42822w) {
            this(view, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : num2, (i12 & 8) != 0 ? false : z12);
        }

        @Override // com.avito.android.lib.design.chips.g
        /* renamed from: a, reason: from getter */
        public final boolean getF178740a() {
            return this.f178744e;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f178741b, aVar.f178741b) && L.f(this.f178742c, aVar.f178742c) && L.f(this.f178743d, aVar.f178743d) && this.f178744e == aVar.f178744e;
        }

        public final int hashCode() {
            int iHashCode = this.f178741b.hashCode() * 31;
            Integer num = this.f178742c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f178743d;
            return Boolean.hashCode(this.f178744e) + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CustomView(view=");
            sb2.append(this.f178741b);
            sb2.append(", overlayCustomRightPadding=");
            sb2.append(this.f178742c);
            sb2.append(", overlayCustomTopPadding=");
            sb2.append(this.f178743d);
            sb2.append(", addMargin=");
            return androidx.appcompat.app.r.x(sb2, this.f178744e, ')');
        }

        public a(@Y61.k View view, @Y61.l Integer num, @Y61.l Integer num2, boolean z12) {
            super(z12, null);
            this.f178741b = view;
            this.f178742c = num;
            this.f178743d = num2;
            this.f178744e = z12;
        }
    }

    /* compiled from: ChipOverlay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/g$b;", "Lcom/avito/android/lib/design/chips/g;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends g {

        /* renamed from: b, reason: collision with root package name */
        public final int f178745b;

        public b() {
            super(true, null);
            this.f178745b = R.attr.ic_buyerBonuses16;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f178745b == ((b) obj).f178745b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f178745b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("Icon(res="), this.f178745b, ')');
        }
    }

    public g(boolean z12, C42822w c42822w) {
        this.f178740a = z12;
    }

    /* renamed from: a, reason: from getter */
    public boolean getF178740a() {
        return this.f178740a;
    }
}
