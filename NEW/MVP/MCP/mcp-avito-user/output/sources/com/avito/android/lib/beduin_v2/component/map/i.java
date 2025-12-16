package com.avito.android.lib.beduin_v2.component.map;

import android.content.res.Resources;
import android.content.res.TypedArray;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.map.state.style.LogoAlignment;
import kT.AbstractC42628a;
import kotlin.Metadata;
import oV.C44694a;

/* compiled from: MapStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/map/i;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/map/state/style/a;", "LoV/a;", "_design-modules_beduin-v2_renderer_component_map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends AbstractC42628a<com.avito.beduin.v2.avito.component.map.state.style.a, C44694a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C44694a f175853c;

    /* compiled from: MapStyleComposer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LogoAlignment.Horizontal.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LogoAlignment.Horizontal[] horizontalArr = LogoAlignment.Horizontal.f334717c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[LogoAlignment.Vertical.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LogoAlignment.Vertical[] verticalArr = LogoAlignment.Vertical.f334720c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public i(@Y61.k androidx.appcompat.view.d dVar) throws Resources.NotFoundException {
        super(dVar);
        C44694a.b bVar = C44694a.f419779o;
        int iJ2 = C35835l0.j(R.attr.mapDefault, this.f406282b);
        bVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(iJ2, d.n.f178954Y);
        C44694a c44694aB = C44694a.b.b(typedArrayObtainStyledAttributes, dVar);
        typedArrayObtainStyledAttributes.recycle();
        this.f175853c = c44694aB;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175853c;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[PHI: r6
  0x0049: PHI (r6v14 java.lang.Integer) = (r6v10 java.lang.Integer), (r6v12 java.lang.Integer) binds: [B:17:0x0047, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[PHI: r7
  0x0067: PHI (r7v7 java.lang.Integer) = (r7v3 java.lang.Integer), (r7v5 java.lang.Integer) binds: [B:25:0x0065, B:30:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[PHI: r10
  0x0083: PHI (r10v10 java.lang.Float) = (r10v5 java.lang.Float), (r10v7 java.lang.Float) binds: [B:33:0x0081, B:38:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4 A[PHI: r6
  0x00d4: PHI (r6v6 java.lang.Integer) = (r6v2 java.lang.Integer), (r6v4 java.lang.Integer) binds: [B:57:0x00d2, B:62:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2 A[PHI: r0
  0x00f2: PHI (r0v24 java.lang.Integer) = (r0v20 java.lang.Integer), (r0v22 java.lang.Integer) binds: [B:65:0x00f0, B:70:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e A[PHI: r4
  0x010e: PHI (r4v25 java.lang.Float) = (r4v20 java.lang.Float), (r4v22 java.lang.Float) binds: [B:73:0x010c, B:78:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012c  */
    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.avito.beduin.v2.render.android_view.AbstractC36331a.C10471a r21, java.lang.Object r22, com.avito.beduin.v2.theme.m r23) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.map.i.h(com.avito.beduin.v2.render.android_view.a$a, java.lang.Object, com.avito.beduin.v2.theme.m):java.lang.Object");
    }
}
