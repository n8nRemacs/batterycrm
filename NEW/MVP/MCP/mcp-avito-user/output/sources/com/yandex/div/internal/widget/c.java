package com.yandex.div.internal.widget;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;

/* compiled from: DivLayoutParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/widget/c;", "Landroid/view/ViewGroup$MarginLayoutParams;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f370243a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f370244b;

    /* renamed from: c, reason: collision with root package name */
    public float f370245c;

    /* renamed from: d, reason: collision with root package name */
    public float f370246d;

    /* renamed from: e, reason: collision with root package name */
    public int f370247e;

    /* renamed from: f, reason: collision with root package name */
    public int f370248f;

    /* renamed from: g, reason: collision with root package name */
    public int f370249g;

    /* renamed from: h, reason: collision with root package name */
    public int f370250h;

    /* compiled from: DivLayoutParams.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/yandex/div/internal/widget/c$a;", "", "<init>", "()V", "", "DEFAULT_GRAVITY", "I", "DEFAULT_SPAN", "", "DEFAULT_WEIGHT", "F", "WRAP_CONTENT_CONSTRAINED", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public c(int i12, int i13) {
        super(i12, i13);
        this.f370243a = 51;
        this.f370247e = 1;
        this.f370248f = 1;
        this.f370249g = Integer.MAX_VALUE;
        this.f370250h = Integer.MAX_VALUE;
    }

    public final int a() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin + ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    public final int b() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin + ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        n0 n0Var = m0.f406844a;
        if (!n0Var.b(c.class).equals(n0Var.b(obj.getClass()))) {
            return false;
        }
        c cVar = (c) obj;
        return ((ViewGroup.MarginLayoutParams) this).width == ((ViewGroup.MarginLayoutParams) cVar).width && ((ViewGroup.MarginLayoutParams) this).height == ((ViewGroup.MarginLayoutParams) cVar).height && ((ViewGroup.MarginLayoutParams) this).leftMargin == ((ViewGroup.MarginLayoutParams) cVar).leftMargin && ((ViewGroup.MarginLayoutParams) this).rightMargin == ((ViewGroup.MarginLayoutParams) cVar).rightMargin && ((ViewGroup.MarginLayoutParams) this).topMargin == ((ViewGroup.MarginLayoutParams) cVar).topMargin && ((ViewGroup.MarginLayoutParams) this).bottomMargin == ((ViewGroup.MarginLayoutParams) cVar).bottomMargin && this.f370243a == cVar.f370243a && this.f370244b == cVar.f370244b && this.f370247e == cVar.f370247e && this.f370248f == cVar.f370248f && this.f370245c == cVar.f370245c && this.f370246d == cVar.f370246d && this.f370249g == cVar.f370249g && this.f370250h == cVar.f370250h;
    }

    public final int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.f370246d) + ((Float.floatToIntBits(this.f370245c) + (((((((((super.hashCode() * 31) + this.f370243a) * 31) + (this.f370244b ? 1 : 0)) * 31) + this.f370247e) * 31) + this.f370248f) * 31)) * 31)) * 31;
        int i12 = this.f370249g;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        int i13 = (iFloatToIntBits + i12) * 31;
        int i14 = this.f370250h;
        return i13 + (i14 != Integer.MAX_VALUE ? i14 : 0);
    }
}
