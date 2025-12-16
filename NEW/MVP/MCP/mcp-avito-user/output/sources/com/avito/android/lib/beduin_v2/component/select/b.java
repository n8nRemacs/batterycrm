package com.avito.android.lib.beduin_v2.component.select;

import PK0.n;
import Y61.k;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.select.style.c;
import com.avito.android.lib.design.spinner.a;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.theme.g;
import com.avito.beduin.v2.theme.m;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: BaseSelectStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/select/b;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/baseSelect/state/a;", "Lcom/avito/android/lib/design/select/style/c;", "_design-modules_beduin-v2_renderer_component_select"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC42628a<com.avito.beduin.v2.avito.component.baseSelect.state.a, com.avito.android.lib.design.select.style.c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.select.style.c f175885c;

    public b(@k androidx.appcompat.view.d dVar, @InterfaceC42150f int i12) throws Resources.NotFoundException {
        super(dVar);
        c.b bVar = com.avito.android.lib.design.select.style.c.f180287A;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        bVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(iJ2, d.n.f178939P);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        com.avito.android.lib.design.text_view.d dVar2 = com.avito.android.lib.design.text_view.d.f180938a;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        dVar2.getClass();
        n nVarA = com.avito.android.lib.design.text_view.d.a(resourceId, dVar);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(26, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(33, 0);
        int integer = typedArrayObtainStyledAttributes.getInteger(11, Integer.MAX_VALUE);
        ColorStateList colorStateListA = x.a(typedArrayObtainStyledAttributes, dVar, 1);
        ColorStateList colorStateListA2 = x.a(typedArrayObtainStyledAttributes, dVar, 2);
        ColorStateList colorStateListA3 = x.a(typedArrayObtainStyledAttributes, dVar, 23);
        ColorStateList colorStateListA4 = x.a(typedArrayObtainStyledAttributes, dVar, 25);
        ColorStateList colorStateListA5 = x.a(typedArrayObtainStyledAttributes, dVar, 39);
        ColorStateList colorStateListA6 = x.a(typedArrayObtainStyledAttributes, dVar, 44);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(19, 0);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, 0);
        int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        int dimensionPixelSize7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        int dimensionPixelSize8 = typedArrayObtainStyledAttributes.getDimensionPixelSize(59, 0);
        int dimensionPixelSize9 = typedArrayObtainStyledAttributes.getDimensionPixelSize(40, 0);
        int dimensionPixelSize10 = typedArrayObtainStyledAttributes.getDimensionPixelSize(41, 0);
        int dimensionPixelSize11 = typedArrayObtainStyledAttributes.getDimensionPixelSize(45, 0);
        int dimensionPixelSize12 = typedArrayObtainStyledAttributes.getDimensionPixelSize(46, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(16);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(28, 0);
        a.C5301a c5301a = com.avito.android.lib.design.spinner.a.f180560d;
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        c5301a.getClass();
        com.avito.android.lib.design.spinner.a aVarB = a.C5301a.b(resourceId3, dVar);
        int dimensionPixelSize13 = typedArrayObtainStyledAttributes.getDimensionPixelSize(36, 0);
        TypedArray typedArrayObtainStyledAttributes2 = dVar.obtainStyledAttributes(resourceId2, d.n.f178941Q);
        ColorStateList colorStateListA7 = x.a(typedArrayObtainStyledAttributes2, dVar, 3);
        C35763c0 c35763c0B = colorStateListA7 != null ? C35771d0.b(colorStateListA7) : null;
        ColorStateList colorStateListA8 = x.a(typedArrayObtainStyledAttributes2, dVar, 1);
        C35763c0 c35763c0B2 = colorStateListA8 != null ? C35771d0.b(colorStateListA8) : null;
        int dimensionPixelOffset = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(0, 0);
        ColorStateList colorStateListA9 = x.a(typedArrayObtainStyledAttributes2, dVar, 2);
        c.a aVar = new c.a(c35763c0B, c35763c0B2, dimensionPixelOffset, colorStateListA9 != null ? C35771d0.b(colorStateListA9) : null);
        FormatterType.f179288e.getClass();
        FormatterType formatterTypeA = FormatterType.a.a(typedArrayObtainStyledAttributes.getInt(35, FormatterType.f179289f.f179300b));
        typedArrayObtainStyledAttributes2.recycle();
        com.avito.android.lib.design.select.style.c cVar = new com.avito.android.lib.design.select.style.c(dimensionPixelSize, nVarA, colorStateListA, colorStateListA2, colorStateListA3, colorStateListA4, dimensionPixelSize2, colorStateListA5, colorStateListA6, null, dimensionPixelSize3, integer, dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize6, dimensionPixelSize7, dimensionPixelSize8, dimensionPixelSize9, dimensionPixelSize10, dimensionPixelSize11, dimensionPixelSize12, drawable, aVarB, dimensionPixelSize13, aVar, formatterTypeA, 512, null);
        typedArrayObtainStyledAttributes.recycle();
        this.f175885c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[PHI: r5
  0x0009: PHI (r5v8 java.lang.Integer) = (r5v1 java.lang.Integer), (r5v3 java.lang.Integer) binds: [B:3:0x0007, B:8:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList i(kT.AbstractC42628a.C11616a r3, com.avito.android.lib.design.select.style.a r4, com.avito.beduin.v2.theme.f r5, com.avito.beduin.v2.theme.f r6, com.avito.beduin.v2.theme.f r7, com.avito.beduin.v2.theme.f r8) {
        /*
            com.avito.android.lib.design.select.style.a r0 = new com.avito.android.lib.design.select.style.a
            java.lang.Integer r5 = com.avito.beduin.v2.render.android_view.AbstractC36331a.C10471a.a(r3, r5)
            r1 = 0
            if (r5 == 0) goto Le
        L9:
            int r5 = r5.intValue()
            goto L1c
        Le:
            if (r4 == 0) goto L17
            int r5 = r4.f180281a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L18
        L17:
            r5 = r1
        L18:
            if (r5 == 0) goto L1b
            goto L9
        L1b:
            r5 = 0
        L1c:
            com.avito.beduin.v2.theme.k r2 = r3.f337938b
            boolean r3 = r3.f337939c
            java.lang.Integer r6 = com.avito.beduin.v2.render.android_view.F.a(r6, r2, r3)
            if (r6 != 0) goto L2c
            if (r4 == 0) goto L2b
            java.lang.Integer r6 = r4.f180282b
            goto L2c
        L2b:
            r6 = r1
        L2c:
            java.lang.Integer r7 = com.avito.beduin.v2.render.android_view.F.a(r7, r2, r3)
            if (r7 != 0) goto L38
            if (r4 == 0) goto L37
            java.lang.Integer r7 = r4.f180283c
            goto L38
        L37:
            r7 = r1
        L38:
            java.lang.Integer r3 = com.avito.beduin.v2.render.android_view.F.a(r8, r2, r3)
            if (r3 != 0) goto L43
            if (r4 == 0) goto L44
            java.lang.Integer r1 = r4.f180284d
            goto L44
        L43:
            r1 = r3
        L44:
            r0.<init>(r5, r6, r7, r1)
            kotlin.C r3 = r0.f180285e
            java.lang.Object r3 = r3.getValue()
            android.content.res.ColorStateList r3 = (android.content.res.ColorStateList) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.select.b.i(kT.a$a, com.avito.android.lib.design.select.style.a, com.avito.beduin.v2.theme.f, com.avito.beduin.v2.theme.f, com.avito.beduin.v2.theme.f, com.avito.beduin.v2.theme.f):android.content.res.ColorStateList");
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175885c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        com.avito.android.lib.design.select.style.c cVar = (com.avito.android.lib.design.select.style.c) obj;
        com.avito.beduin.v2.avito.component.baseSelect.state.a aVar = (com.avito.beduin.v2.avito.component.baseSelect.state.a) mVar;
        n nVar = (n) D.b(aVar.f333844d, c11616a.f337938b, cVar.f180289b);
        com.avito.android.lib.design.spinner.a aVar2 = (com.avito.android.lib.design.spinner.a) D.b(aVar.f333835D, c11616a.f337938b, cVar.f180310w);
        Integer numA = aVar.f333843c.a();
        int iB2 = numA != null ? y6.b(numA.intValue()) : cVar.f180288a;
        ColorStateList colorStateList = cVar.f180290c;
        ColorStateList colorStateListI = i(c11616a, colorStateList != null ? com.avito.android.lib.design.select.style.b.a(colorStateList) : null, aVar.f333845e, aVar.f333846f, aVar.f333847g, aVar.f333848h);
        ColorStateList colorStateList2 = cVar.f180291d;
        ColorStateList colorStateListI2 = i(c11616a, colorStateList2 != null ? com.avito.android.lib.design.select.style.b.a(colorStateList2) : null, aVar.f333849i, aVar.f333850j, aVar.f333851k, aVar.f333852l);
        ColorStateList colorStateList3 = cVar.f180292e;
        ColorStateList colorStateListI3 = i(c11616a, colorStateList3 != null ? com.avito.android.lib.design.select.style.b.a(colorStateList3) : null, aVar.f333853m, aVar.f333856p, aVar.f333854n, aVar.f333855o);
        ColorStateList colorStateList4 = cVar.f180293f;
        ColorStateList colorStateListI4 = i(c11616a, colorStateList4 != null ? com.avito.android.lib.design.select.style.b.a(colorStateList4) : null, aVar.f333858r, aVar.f333861u, aVar.f333859s, aVar.f333860t);
        Integer numA2 = aVar.f333857q.a();
        int iB3 = numA2 != null ? y6.b(numA2.intValue()) : cVar.f180294g;
        ColorStateList colorStateList5 = cVar.f180295h;
        ColorStateList colorStateListI5 = i(c11616a, colorStateList5 != null ? com.avito.android.lib.design.select.style.b.a(colorStateList5) : null, aVar.f333862v, aVar.f333865y, aVar.f333863w, aVar.f333864x);
        ColorStateList colorStateList6 = cVar.f180296i;
        ColorStateList colorStateListI6 = i(c11616a, colorStateList6 != null ? com.avito.android.lib.design.select.style.b.a(colorStateList6) : null, aVar.f333866z, aVar.f333834C, aVar.f333832A, aVar.f333833B);
        ColorStateList colorStateList7 = cVar.f180297j;
        ColorStateList colorStateListI7 = i(c11616a, colorStateList7 != null ? com.avito.android.lib.design.select.style.b.a(colorStateList7) : null, new g(), aVar.f333838G, aVar.f333836E, aVar.f333837F);
        Integer numA3 = aVar.f333839H.a();
        return new com.avito.android.lib.design.select.style.c(iB2, nVar, colorStateListI, colorStateListI2, colorStateListI3, colorStateListI4, iB3, colorStateListI5, colorStateListI6, colorStateListI7, numA3 != null ? y6.b(numA3.intValue()) : cVar.f180298k, aVar.f333840I.c(a.f175884l).intValue(), cVar.f180300m, cVar.f180301n, cVar.f180302o, cVar.f180303p, cVar.f180304q, cVar.f180305r, cVar.f180306s, cVar.f180307t, cVar.f180308u, cVar.f180309v, aVar2, cVar.f180311x, cVar.f180312y, cVar.f180313z);
    }
}
