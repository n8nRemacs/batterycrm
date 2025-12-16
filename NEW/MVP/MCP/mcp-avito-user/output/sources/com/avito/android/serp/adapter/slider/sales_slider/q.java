package com.avito.android.serp.adapter.slider.sales_slider;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ss0.C48409a;

/* compiled from: SalesSliderStyle.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/slider/sales_slider/q;", "", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f272338a;

    /* renamed from: b, reason: collision with root package name */
    public final int f272339b;

    /* renamed from: c, reason: collision with root package name */
    public final int f272340c;

    /* renamed from: d, reason: collision with root package name */
    public final int f272341d;

    /* compiled from: SalesSliderStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/slider/sales_slider/q$a;", "LLV/c;", "Lcom/avito/android/serp/adapter/slider/sales_slider/q;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<q> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, C48409a.k.f438903b);
            q qVar = new q(typedArrayObtainStyledAttributes.getColor(3, 0), typedArrayObtainStyledAttributes.getColor(0, 0), typedArrayObtainStyledAttributes.getColor(1, 0), typedArrayObtainStyledAttributes.getColor(2, 0));
            typedArrayObtainStyledAttributes.recycle();
            return qVar;
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public q() {
        this(0, 0, 0, 0, 15, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f272338a == qVar.f272338a && this.f272339b == qVar.f272339b && this.f272340c == qVar.f272340c && this.f272341d == qVar.f272341d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f272341d) + androidx.appcompat.app.r.e(this.f272340c, androidx.appcompat.app.r.e(this.f272339b, Integer.hashCode(this.f272338a) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SalesSliderStyle(startColor=");
        sb2.append(this.f272338a);
        sb2.append(", endColor=");
        sb2.append(this.f272339b);
        sb2.append(", iconColor=");
        sb2.append(this.f272340c);
        sb2.append(", imageBackgroundColor=");
        return androidx.appcompat.app.r.t(sb2, this.f272341d, ')');
    }

    public q(int i12, int i13, int i14, int i15) {
        this.f272338a = i12;
        this.f272339b = i13;
        this.f272340c = i14;
        this.f272341d = i15;
    }

    public /* synthetic */ q(int i12, int i13, int i14, int i15, int i16, C42822w c42822w) {
        this((i16 & 1) != 0 ? 0 : i12, (i16 & 2) != 0 ? 0 : i13, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
    }
}
