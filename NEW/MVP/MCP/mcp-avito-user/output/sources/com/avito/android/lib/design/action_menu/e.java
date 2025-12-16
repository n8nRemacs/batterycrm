package com.avito.android.lib.design.action_menu;

import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.spinner.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ActionMenuStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/action_menu/e;", "", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f178241h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f178242a;

    /* renamed from: b, reason: collision with root package name */
    public final int f178243b;

    /* renamed from: c, reason: collision with root package name */
    public final int f178244c;

    /* renamed from: d, reason: collision with root package name */
    public final int f178245d;

    /* renamed from: e, reason: collision with root package name */
    public final int f178246e;

    /* renamed from: f, reason: collision with root package name */
    public final int f178247f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final b f178248g;

    /* compiled from: ActionMenuStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/action_menu/e$a;", "LLV/c;", "Lcom/avito/android/lib/design/action_menu/e;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<e> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static e b(@k TypedArray typedArray, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedArray.getResourceId(0, 0), d.n.f178960c);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
            n nVarD = AK.c.d(typedArrayObtainStyledAttributes, 9, 0, com.avito.android.lib.design.text_view.d.f180938a, context);
            int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
            a.C5301a c5301a = com.avito.android.lib.design.spinner.a.f180560d;
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(7, 0);
            c5301a.getClass();
            b bVar = new b(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, color, dimensionPixelSize5, nVarD, dimensionPixelSize6, a.C5301a.b(resourceId, context), typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
            typedArrayObtainStyledAttributes.recycle();
            return new e(typedArray.getDimensionPixelSize(6, 0), typedArray.getColor(5, 0), typedArray.getDimensionPixelSize(4, 0), typedArray.getDimensionPixelSize(1, 0), typedArray.getDimensionPixelSize(3, 0), typedArray.getDimensionPixelSize(2, 0), bVar);
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178958b);
            e eVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return eVarB;
        }

        public a() {
        }
    }

    public e(int i12, int i13, int i14, int i15, int i16, int i17, @k b bVar) {
        this.f178242a = i12;
        this.f178243b = i13;
        this.f178244c = i14;
        this.f178245d = i15;
        this.f178246e = i16;
        this.f178247f = i17;
        this.f178248g = bVar;
    }

    public /* synthetic */ e(int i12, int i13, int i14, int i15, int i16, int i17, b bVar, int i18, C42822w c42822w) {
        this((i18 & 1) != 0 ? 0 : i12, (i18 & 2) != 0 ? 0 : i13, (i18 & 4) != 0 ? 0 : i14, (i18 & 8) != 0 ? 0 : i15, (i18 & 16) != 0 ? 0 : i16, (i18 & 32) != 0 ? 0 : i17, bVar);
    }

    /* compiled from: ActionMenuStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/action_menu/e$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f178249a;

        /* renamed from: b, reason: collision with root package name */
        public final int f178250b;

        /* renamed from: c, reason: collision with root package name */
        public final int f178251c;

        /* renamed from: d, reason: collision with root package name */
        public final int f178252d;

        /* renamed from: e, reason: collision with root package name */
        public final int f178253e;

        /* renamed from: f, reason: collision with root package name */
        public final int f178254f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final n f178255g;

        /* renamed from: h, reason: collision with root package name */
        public final int f178256h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final com.avito.android.lib.design.spinner.a f178257i;

        /* renamed from: j, reason: collision with root package name */
        public final int f178258j;

        public b(int i12, int i13, int i14, int i15, int i16, int i17, @k n nVar, int i18, @k com.avito.android.lib.design.spinner.a aVar, int i19) {
            this.f178249a = i12;
            this.f178250b = i13;
            this.f178251c = i14;
            this.f178252d = i15;
            this.f178253e = i16;
            this.f178254f = i17;
            this.f178255g = nVar;
            this.f178256h = i18;
            this.f178257i = aVar;
            this.f178258j = i19;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f178249a == bVar.f178249a && this.f178250b == bVar.f178250b && this.f178251c == bVar.f178251c && this.f178252d == bVar.f178252d && this.f178253e == bVar.f178253e && this.f178254f == bVar.f178254f && L.f(this.f178255g, bVar.f178255g) && this.f178256h == bVar.f178256h && L.f(this.f178257i, bVar.f178257i) && this.f178258j == bVar.f178258j;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f178258j) + ((this.f178257i.hashCode() + r.e(this.f178256h, (this.f178255g.hashCode() + r.e(this.f178254f, r.e(this.f178253e, r.e(this.f178252d, r.e(this.f178251c, r.e(this.f178250b, Integer.hashCode(this.f178249a) * 31, 31), 31), 31), 31), 31)) * 31, 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ItemStyle(contentInsetTop=");
            sb2.append(this.f178249a);
            sb2.append(", contentInsetBottom=");
            sb2.append(this.f178250b);
            sb2.append(", contentInsetStart=");
            sb2.append(this.f178251c);
            sb2.append(", contentInsetEnd=");
            sb2.append(this.f178252d);
            sb2.append(", contentColor=");
            sb2.append(this.f178253e);
            sb2.append(", iconSize=");
            sb2.append(this.f178254f);
            sb2.append(", textStyle=");
            sb2.append(this.f178255g);
            sb2.append(", textBottomSpacing=");
            sb2.append(this.f178256h);
            sb2.append(", spinnerStyle=");
            sb2.append(this.f178257i);
            sb2.append(", iconToTextOffset=");
            return r.t(sb2, this.f178258j, ')');
        }

        public /* synthetic */ b(int i12, int i13, int i14, int i15, int i16, int i17, n nVar, int i18, com.avito.android.lib.design.spinner.a aVar, int i19, int i22, C42822w c42822w) {
            this((i22 & 1) != 0 ? 0 : i12, (i22 & 2) != 0 ? 0 : i13, (i22 & 4) != 0 ? 0 : i14, (i22 & 8) != 0 ? 0 : i15, (i22 & 16) != 0 ? 0 : i16, (i22 & 32) != 0 ? 0 : i17, nVar, (i22 & 128) != 0 ? 0 : i18, aVar, (i22 & 512) != 0 ? 0 : i19);
        }
    }
}
