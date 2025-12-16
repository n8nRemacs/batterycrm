package com.avito.android.lib.design.select.style;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import hw.InterfaceC41176a;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/select/style/d;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f180318f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f180319a;

    /* renamed from: b, reason: collision with root package name */
    public final int f180320b;

    /* renamed from: c, reason: collision with root package name */
    public final int f180321c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Drawable f180322d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ColorStateList f180323e;

    /* compiled from: SelectStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/select/style/d$a;", "LLV/c;", "Lcom/avito/android/lib/design/select/style/d;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<d> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v0 com.avito.android.lib.design.select.style.d, still in use, count: 2, list:
              (r6v0 com.avito.android.lib.design.select.style.d) from 0x00d8: MOVE (r36v0 com.avito.android.lib.design.select.style.d) = (r6v0 com.avito.android.lib.design.select.style.d) (LINE:217)
              (r6v0 com.avito.android.lib.design.select.style.d) from 0x00d2: MOVE (r36v2 com.avito.android.lib.design.select.style.d) = (r6v0 com.avito.android.lib.design.select.style.d) (LINE:211)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        @Y61.k
        public static com.avito.android.lib.design.select.style.d b(@Y61.k android.content.res.TypedArray r37, @Y61.k android.content.Context r38) throws android.content.res.Resources.NotFoundException {
            /*
                Method dump skipped, instructions count: 315
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.select.style.d.a.b(android.content.res.TypedArray, android.content.Context):com.avito.android.lib.design.select.style.d");
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f179001w0);
            d dVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return dVarB;
        }

        public a() {
        }
    }

    public d(@k c cVar, @f0 int i12, @f0 int i13, @l Drawable drawable, @l ColorStateList colorStateList) {
        this.f180319a = cVar;
        this.f180320b = i12;
        this.f180321c = i13;
        this.f180322d = drawable;
        this.f180323e = colorStateList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f180319a, dVar.f180319a) && this.f180320b == dVar.f180320b && this.f180321c == dVar.f180321c && L.f(this.f180322d, dVar.f180322d) && L.f(this.f180323e, dVar.f180323e);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f180321c, r.e(this.f180320b, this.f180319a.hashCode() * 31, 31), 31);
        Drawable drawable = this.f180322d;
        int iHashCode = (iE2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        ColorStateList colorStateList = this.f180323e;
        return iHashCode + (colorStateList != null ? colorStateList.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SelectStyle(baseSelectStyle=" + this.f180319a + ", listItemStyle=" + this.f180320b + ", bottomSheetStyle=" + this.f180321c + ", bottomSheetLeftItemImage=" + this.f180322d + ", bottomSheetLeftImageColor=" + this.f180323e + ')';
    }

    public /* synthetic */ d(c cVar, int i12, int i13, Drawable drawable, ColorStateList colorStateList, int i14, C42822w c42822w) {
        this(cVar, i12, i13, (i14 & 8) != 0 ? null : drawable, (i14 & 16) != 0 ? null : colorStateList);
    }
}
