package com.avito.android.lib.design.strikethrough;

import LV.c;
import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.text_view.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrikethroughTextStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/strikethrough/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C5303a f180653c = new C5303a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C35763c0 f180654a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final n f180655b;

    /* compiled from: StrikethroughTextStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/strikethrough/a$a;", "LLV/c;", "Lcom/avito/android/lib/design/strikethrough/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.strikethrough.a$a, reason: collision with other inner class name */
    public static final class C5303a implements c<a> {
        public /* synthetic */ C5303a(C42822w c42822w) {
            this();
        }

        @k
        public static a b(@k TypedArray typedArray, @k Context context) {
            n nVarD = AK.c.d(typedArray, 1, 0, d.f180938a, context);
            ColorStateList colorStateListA = x.a(typedArray, context, 2);
            return new a(colorStateListA != null ? C35771d0.b(colorStateListA) : null, nVarD);
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178924H0);
            a aVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return aVarB;
        }

        public C5303a() {
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
        return L.f(this.f180654a, aVar.f180654a) && L.f(this.f180655b, aVar.f180655b);
    }

    public final int hashCode() {
        C35763c0 c35763c0 = this.f180654a;
        int iHashCode = (c35763c0 == null ? 0 : c35763c0.hashCode()) * 31;
        n nVar = this.f180655b;
        return iHashCode + (nVar != null ? nVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "StrikethroughTextStyle(strikethroughTint=" + this.f180654a + ", textStyle=" + this.f180655b + ')';
    }

    public a(@l C35763c0 c35763c0, @l n nVar) {
        this.f180654a = c35763c0;
        this.f180655b = nVar;
    }

    public /* synthetic */ a(C35763c0 c35763c0, n nVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : c35763c0, (i12 & 2) != 0 ? null : nVar);
    }
}
