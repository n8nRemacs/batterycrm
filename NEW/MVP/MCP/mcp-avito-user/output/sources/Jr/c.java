package JR;

import VU.b;
import VU.d;
import Y61.k;
import android.content.Context;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.button.state.l;
import com.avito.beduin.v2.avito.component.common.i;
import com.avito.beduin.v2.render.android_view.F;
import com.avito.beduin.v2.theme.f;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ButtonStyleComposer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LJR/c;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/button/state/l;", "LVU/b;", "_design-modules_beduin-v2_renderer_component_button"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC42628a<l, VU.b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final VU.b f8993c;

    public c(@k Context context, @InterfaceC42150f int i12) {
        super(context);
        b.a aVar = VU.b.f17147t;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        aVar.getClass();
        this.f8993c = b.a.c(iJ2, context);
    }

    public static d i(AbstractC42628a.C11616a c11616a, d dVar, f fVar) {
        if (fVar.isEmpty()) {
            return dVar;
        }
        i iVar = (i) fVar.get();
        f<Float> fVar2 = iVar.f334133a;
        c11616a.getClass();
        Integer numB = AbstractC42628a.C11616a.b(fVar2);
        int iIntValue = numB != null ? numB.intValue() : dVar.f17173a;
        Integer numB2 = AbstractC42628a.C11616a.b(iVar.f334134b);
        int iIntValue2 = numB2 != null ? numB2.intValue() : dVar.f17174b;
        Integer numA = F.a(iVar.f334136d, c11616a.f337938b, c11616a.f337939c);
        int iIntValue3 = numA != null ? numA.intValue() : dVar.f17175c;
        Integer numB3 = AbstractC42628a.C11616a.b(iVar.f334135c);
        int iIntValue4 = numB3 != null ? numB3.intValue() : dVar.f17176d;
        dVar.getClass();
        return new d(iIntValue, iIntValue2, iIntValue3, iIntValue4);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f8993c;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0031 A[PHI: r3
  0x0031: PHI (r3v20 java.lang.Integer) = (r3v5 java.lang.Integer), (r3v7 java.lang.Integer) binds: [B:3:0x002f, B:8:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.avito.beduin.v2.render.android_view.AbstractC36331a.C10471a r32, java.lang.Object r33, com.avito.beduin.v2.theme.m r34) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: JR.c.h(com.avito.beduin.v2.render.android_view.a$a, java.lang.Object, com.avito.beduin.v2.theme.m):java.lang.Object");
    }
}
