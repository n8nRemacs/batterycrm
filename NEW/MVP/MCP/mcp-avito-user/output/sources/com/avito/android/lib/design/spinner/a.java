package com.avito.android.lib.design.spinner;

import LV.c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SpinnerStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/spinner/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C5301a f180560d = new C5301a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C35763c0 f180561a;

    /* renamed from: b, reason: collision with root package name */
    public final int f180562b;

    /* renamed from: c, reason: collision with root package name */
    public final int f180563c;

    /* compiled from: SpinnerStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/spinner/a$a;", "LLV/c;", "Lcom/avito/android/lib/design/spinner/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.spinner.a$a, reason: collision with other inner class name */
    public static final class C5301a implements c<a> {
        public /* synthetic */ C5301a(C42822w c42822w) {
            this();
        }

        @k
        public static a b(@f0 int i12, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178923H);
            a aVarC = c(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return aVarC;
        }

        @k
        public static a c(@k TypedArray typedArray, @k Context context) {
            ColorStateList colorStateListA = x.a(typedArray, context, 4);
            return new a(colorStateListA != null ? C35771d0.b(colorStateListA) : null, typedArray.getDimensionPixelSize(2, 0), typedArray.getDimensionPixelSize(3, 0));
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public C5301a() {
        }
    }

    public a(@l C35763c0 c35763c0, int i12, int i13) {
        this.f180561a = c35763c0;
        this.f180562b = i12;
        this.f180563c = i13;
    }

    public static a a(a aVar, C35763c0 c35763c0, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            c35763c0 = aVar.f180561a;
        }
        if ((i14 & 2) != 0) {
            i12 = aVar.f180562b;
        }
        if ((i14 & 4) != 0) {
            i13 = aVar.f180563c;
        }
        aVar.getClass();
        return new a(c35763c0, i12, i13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f180561a, aVar.f180561a) && this.f180562b == aVar.f180562b && this.f180563c == aVar.f180563c;
    }

    public final int hashCode() {
        C35763c0 c35763c0 = this.f180561a;
        return Integer.hashCode(this.f180563c) + r.e(this.f180562b, (c35763c0 == null ? 0 : c35763c0.hashCode()) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpinnerStyle(spinnerColor=");
        sb2.append(this.f180561a);
        sb2.append(", minWidth=");
        sb2.append(this.f180562b);
        sb2.append(", minHeight=");
        return r.t(sb2, this.f180563c, ')');
    }
}
