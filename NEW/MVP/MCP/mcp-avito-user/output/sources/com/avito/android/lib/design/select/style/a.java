package com.avito.android.lib.design.select.style;

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
import kotlin.jvm.internal.s0;

/* compiled from: BaseSelectColorStateListProps.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/select/style/a;", "", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final b f180276f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final int[] f180277g = {-16842910};

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final int[] f180278h = {R.attr.state_enabled, com.avito.android.R.attr.state_error};

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final int[] f180279i = {R.attr.state_enabled, com.avito.android.R.attr.state_warning};

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final int[] f180280j = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f180281a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f180282b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f180283c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f180284d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f180285e;

    /* compiled from: BaseSelectColorStateListProps.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/select/style/a$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.select.style.a$a, reason: collision with other inner class name */
    public static final class C5293a {
    }

    /* compiled from: BaseSelectColorStateListProps.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/select/style/a$b;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: BaseSelectColorStateListProps.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/res/ColorStateList;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<ColorStateList> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final ColorStateList invoke() {
            a.f180276f.getClass();
            int[][] iArr = {a.f180277g, a.f180278h, a.f180279i, a.f180280j};
            a aVar = a.this;
            Integer num = aVar.f180282b;
            int i12 = aVar.f180281a;
            int iIntValue = num != null ? num.intValue() : i12;
            Integer num2 = aVar.f180283c;
            int iIntValue2 = num2 != null ? num2.intValue() : i12;
            Integer num3 = aVar.f180284d;
            return new ColorStateList(iArr, new int[]{iIntValue, iIntValue2, num3 != null ? num3.intValue() : i12, i12});
        }
    }

    public a(@InterfaceC42156l int i12, @l @InterfaceC42156l Integer num, @l @InterfaceC42156l Integer num2, @l @InterfaceC42156l Integer num3) {
        this.f180281a = i12;
        this.f180282b = num;
        this.f180283c = num2;
        this.f180284d = num3;
        this.f180285e = C42727D.c(new c());
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f180281a == aVar.f180281a && L.f(this.f180282b, aVar.f180282b) && L.f(this.f180283c, aVar.f180283c) && L.f(this.f180284d, aVar.f180284d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f180281a) * 31;
        Integer num = this.f180282b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f180283c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f180284d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseSelectColorStateListProps(default=");
        sb2.append(this.f180281a);
        sb2.append(", disabled=");
        sb2.append(this.f180282b);
        sb2.append(", error=");
        sb2.append(this.f180283c);
        sb2.append(", warning=");
        return s.j(sb2, this.f180284d, ')');
    }

    public /* synthetic */ a(int i12, Integer num, Integer num2, Integer num3, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : num2, (i13 & 8) != 0 ? null : num3);
    }
}
