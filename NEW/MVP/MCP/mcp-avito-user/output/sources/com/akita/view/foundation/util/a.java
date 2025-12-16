package com.akita.view.foundation.util;

import Y61.k;
import Y61.l;
import android.R;
import android.content.res.ColorStateList;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ColorStateListProps.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/view/foundation/util/a;", "", "a", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final int[] f67010f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final int[] f67011g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final int[] f67012h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final int[] f67013i;

    /* renamed from: a, reason: collision with root package name */
    public final int f67014a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f67015b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f67016c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f67017d;

    /* renamed from: e, reason: collision with root package name */
    public final ColorStateList f67018e;

    /* compiled from: ColorStateListProps.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/view/foundation/util/a$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.view.foundation.util.a$a, reason: collision with other inner class name */
    public static final class C2121a {
    }

    /* compiled from: ColorStateListProps.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/view/foundation/util/a$b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        f67010f = new int[]{R.attr.state_pressed, R.attr.state_enabled};
        f67011g = new int[]{-16842910};
        f67012h = new int[]{com.avito.android.R.attr.state_error};
        f67013i = new int[0];
    }

    public a(@InterfaceC42156l int i12, @l @InterfaceC42156l Integer num, @l @InterfaceC42156l Integer num2, @l @InterfaceC42156l Integer num3) {
        this.f67014a = i12;
        this.f67015b = num;
        this.f67016c = num2;
        this.f67017d = num3;
    }

    @k
    public final ColorStateList a() {
        ColorStateList colorStateList = this.f67018e;
        if (colorStateList != null) {
            if (colorStateList == null) {
                return null;
            }
            return colorStateList;
        }
        int[][] iArr = {f67011g, f67010f, f67012h, f67013i};
        int i12 = this.f67014a;
        Integer num = this.f67016c;
        int iIntValue = num != null ? num.intValue() : i12;
        Integer num2 = this.f67015b;
        int iIntValue2 = num2 != null ? num2.intValue() : i12;
        Integer num3 = this.f67017d;
        return new ColorStateList(iArr, new int[]{iIntValue, iIntValue2, num3 != null ? num3.intValue() : i12, i12});
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f67014a == aVar.f67014a && L.f(this.f67015b, aVar.f67015b) && L.f(this.f67016c, aVar.f67016c) && L.f(this.f67017d, aVar.f67017d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f67014a) * 31;
        Integer num = this.f67015b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f67016c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f67017d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorStateListProps(default=");
        sb2.append(this.f67014a);
        sb2.append(", pressed=");
        sb2.append(this.f67015b);
        sb2.append(", disabled=");
        sb2.append(this.f67016c);
        sb2.append(", error=");
        return s.j(sb2, this.f67017d, ')');
    }

    public /* synthetic */ a(int i12, Integer num, Integer num2, Integer num3, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : num2, (i13 & 8) != 0 ? null : num3);
    }

    public /* synthetic */ a(ColorStateList colorStateList, boolean z12, int i12, C42822w c42822w) {
        this(colorStateList, (i12 & 2) != 0 ? false : z12);
    }

    public a(@k ColorStateList colorStateList, boolean z12) {
        this(colorStateList.getDefaultColor(), C0.e(colorStateList, f67010f), C0.e(colorStateList, f67011g), C0.e(colorStateList, f67012h));
        if (z12) {
            this.f67018e = colorStateList;
        }
    }
}
