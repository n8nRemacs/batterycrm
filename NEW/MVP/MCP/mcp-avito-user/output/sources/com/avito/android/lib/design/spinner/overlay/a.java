package com.avito.android.lib.design.spinner.overlay;

import LV.c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.spinner.a;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import hw.InterfaceC41176a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SpinnerOverlayStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/spinner/overlay/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C5302a f180566c = new C5302a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.spinner.a f180567a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C35763c0 f180568b;

    /* compiled from: SpinnerOverlayStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/spinner/overlay/a$a;", "LLV/c;", "Lcom/avito/android/lib/design/spinner/overlay/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.spinner.overlay.a$a, reason: collision with other inner class name */
    public static final class C5302a implements c<a> {
        public /* synthetic */ C5302a(C42822w c42822w) {
            this();
        }

        @k
        public static a b(@k TypedArray typedArray, @k Context context) throws Resources.NotFoundException {
            a.C5301a c5301a = com.avito.android.lib.design.spinner.a.f180560d;
            int resourceId = typedArray.getResourceId(1, 0);
            c5301a.getClass();
            com.avito.android.lib.design.spinner.a aVarB = a.C5301a.b(resourceId, context);
            ColorStateList colorStateListA = x.a(typedArray, context, 0);
            return new a(aVarB, colorStateListA != null ? C35771d0.b(colorStateListA) : null);
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178920F0);
            a aVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return aVarB;
        }

        public C5302a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f180567a, aVar.f180567a) && L.f(this.f180568b, aVar.f180568b);
    }

    public final int hashCode() {
        com.avito.android.lib.design.spinner.a aVar = this.f180567a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        C35763c0 c35763c0 = this.f180568b;
        return iHashCode + (c35763c0 != null ? c35763c0.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SpinnerOverlayStyle(spinnerStyle=" + this.f180567a + ", background=" + this.f180568b + ')';
    }

    public a(@l com.avito.android.lib.design.spinner.a aVar, @l C35763c0 c35763c0) {
        this.f180567a = aVar;
        this.f180568b = c35763c0;
    }

    public /* synthetic */ a(com.avito.android.lib.design.spinner.a aVar, C35763c0 c35763c0, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : aVar, (i12 & 2) != 0 ? null : c35763c0);
    }
}
