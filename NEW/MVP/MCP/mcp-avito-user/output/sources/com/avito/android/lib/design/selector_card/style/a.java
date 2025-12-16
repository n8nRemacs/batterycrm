package com.avito.android.lib.design.selector_card.style;

import Y61.k;
import Y61.l;
import android.R;
import android.content.res.ColorStateList;
import com.akita.compose.component.accordion.s;
import j.InterfaceC42156l;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SelectorCardColorStateListProps.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/selector_card/style/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C5294a f180424f = new C5294a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final int[] f180425g = {-16842910};

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final int[] f180426h = {R.attr.state_enabled, com.avito.android.R.attr.state_error};

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final int[] f180427i = {R.attr.state_selected};

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final int[] f180428j = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f180429a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f180430b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f180431c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f180432d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f180433e;

    /* compiled from: SelectorCardColorStateListProps.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/selector_card/style/a$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.selector_card.style.a$a, reason: collision with other inner class name */
    public static final class C5294a {
        public /* synthetic */ C5294a(C42822w c42822w) {
            this();
        }

        public C5294a() {
        }
    }

    /* compiled from: SelectorCardColorStateListProps.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/res/ColorStateList;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ColorStateList> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ColorStateList invoke() {
            a.f180424f.getClass();
            int[][] iArr = {a.f180425g, a.f180426h, a.f180427i, a.f180428j};
            a aVar = a.this;
            Integer num = aVar.f180431c;
            int i12 = aVar.f180429a;
            int iIntValue = num != null ? num.intValue() : i12;
            Integer num2 = aVar.f180432d;
            int iIntValue2 = num2 != null ? num2.intValue() : i12;
            Integer num3 = aVar.f180430b;
            return new ColorStateList(iArr, new int[]{iIntValue, iIntValue2, num3 != null ? num3.intValue() : i12, i12});
        }
    }

    public a(@InterfaceC42156l int i12, @l @InterfaceC42156l Integer num, @l @InterfaceC42156l Integer num2, @l @InterfaceC42156l Integer num3) {
        this.f180429a = i12;
        this.f180430b = num;
        this.f180431c = num2;
        this.f180432d = num3;
        this.f180433e = C42727D.c(new b());
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f180429a == aVar.f180429a && L.f(this.f180430b, aVar.f180430b) && L.f(this.f180431c, aVar.f180431c) && L.f(this.f180432d, aVar.f180432d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f180429a) * 31;
        Integer num = this.f180430b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f180431c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f180432d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectorCardColorStateListProps(default=");
        sb2.append(this.f180429a);
        sb2.append(", selected=");
        sb2.append(this.f180430b);
        sb2.append(", disabled=");
        sb2.append(this.f180431c);
        sb2.append(", error=");
        return s.j(sb2, this.f180432d, ')');
    }

    public /* synthetic */ a(int i12, Integer num, Integer num2, Integer num3, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : num2, (i13 & 8) != 0 ? null : num3);
    }
}
