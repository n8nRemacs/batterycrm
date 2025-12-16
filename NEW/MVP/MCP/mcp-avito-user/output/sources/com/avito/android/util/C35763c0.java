package com.avito.android.util;

import android.R;
import android.content.res.ColorStateList;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ColorStateListProps.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/c0;", "", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C35763c0 {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final int[] f318844f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final int[] f318845g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final int[] f318846h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final int[] f318847i;

    /* renamed from: a, reason: collision with root package name */
    public final int f318848a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f318849b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f318850c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f318851d;

    /* renamed from: e, reason: collision with root package name */
    public final ColorStateList f318852e;

    /* compiled from: ColorStateListProps.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/c0$a;", "", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.c0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f318844f = new int[]{R.attr.state_pressed, R.attr.state_enabled};
        f318845g = new int[]{-16842910};
        f318846h = new int[]{com.avito.android.R.attr.state_error};
        f318847i = new int[0];
    }

    public C35763c0(@InterfaceC42156l int i12, @Y61.l @InterfaceC42156l Integer num, @Y61.l @InterfaceC42156l Integer num2, @Y61.l @InterfaceC42156l Integer num3) {
        this.f318848a = i12;
        this.f318849b = num;
        this.f318850c = num2;
        this.f318851d = num3;
    }

    public static C35763c0 a(C35763c0 c35763c0, int i12) {
        Integer num = c35763c0.f318849b;
        Integer num2 = c35763c0.f318850c;
        Integer num3 = c35763c0.f318851d;
        c35763c0.getClass();
        return new C35763c0(i12, num, num2, num3);
    }

    @Y61.k
    public final ColorStateList b() {
        ColorStateList colorStateList = this.f318852e;
        if (colorStateList != null) {
            if (colorStateList == null) {
                return null;
            }
            return colorStateList;
        }
        int[][] iArr = {f318845g, f318844f, f318846h, f318847i};
        int i12 = this.f318848a;
        Integer num = this.f318850c;
        int iIntValue = num != null ? num.intValue() : i12;
        Integer num2 = this.f318849b;
        int iIntValue2 = num2 != null ? num2.intValue() : i12;
        Integer num3 = this.f318851d;
        return new ColorStateList(iArr, new int[]{iIntValue, iIntValue2, num3 != null ? num3.intValue() : i12, i12});
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35763c0)) {
            return false;
        }
        C35763c0 c35763c0 = (C35763c0) obj;
        return this.f318848a == c35763c0.f318848a && kotlin.jvm.internal.L.f(this.f318849b, c35763c0.f318849b) && kotlin.jvm.internal.L.f(this.f318850c, c35763c0.f318850c) && kotlin.jvm.internal.L.f(this.f318851d, c35763c0.f318851d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f318848a) * 31;
        Integer num = this.f318849b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f318850c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f318851d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorStateListProps(default=");
        sb2.append(this.f318848a);
        sb2.append(", pressed=");
        sb2.append(this.f318849b);
        sb2.append(", disabled=");
        sb2.append(this.f318850c);
        sb2.append(", error=");
        return com.akita.compose.component.accordion.s.j(sb2, this.f318851d, ')');
    }

    public /* synthetic */ C35763c0(int i12, Integer num, Integer num2, Integer num3, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : num2, (i13 & 8) != 0 ? null : num3);
    }

    public /* synthetic */ C35763c0(ColorStateList colorStateList, boolean z12, int i12, C42822w c42822w) {
        this(colorStateList, (i12 & 2) != 0 ? false : z12);
    }

    public C35763c0(@Y61.k ColorStateList colorStateList, boolean z12) {
        this(colorStateList.getDefaultColor(), com.akita.compose.theme.re23.style.C0.e(colorStateList, f318844f), com.akita.compose.theme.re23.style.C0.e(colorStateList, f318845g), com.akita.compose.theme.re23.style.C0.e(colorStateList, f318846h));
        if (z12) {
            this.f318852e = colorStateList;
        }
    }
}
