package kT;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.util.M5;
import com.avito.android.util.y6;
import com.avito.beduin.v2.avito.component.common.e;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.F;
import com.avito.beduin.v2.theme.f;
import com.avito.beduin.v2.theme.g;
import com.avito.beduin.v2.theme.m;
import j.U;
import kotlin.Metadata;

/* compiled from: BaseAvitoAndroidComposer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"LkT/a;", "Lcom/avito/beduin/v2/theme/m;", "P", "O", "Lcom/avito/beduin/v2/render/android_view/a;", "LkT/a$a;", "a", "_design-modules_beduin-v2_renderer_component_base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kT.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC42628a<P extends m, O> extends AbstractC36331a<P, O, C11616a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f406282b;

    /* compiled from: BaseAvitoAndroidComposer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkT/a$a;", "Lcom/avito/beduin/v2/render/android_view/a$a;", "_design-modules_beduin-v2_renderer_component_base"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kT.a$a, reason: collision with other inner class name */
    public static final class C11616a extends AbstractC36331a.C10471a {
        @U
        @l
        public static Integer b(@k f fVar) {
            Float f12 = (Float) fVar.a();
            if (f12 != null) {
                return Integer.valueOf(y6.a(f12.floatValue()));
            }
            return null;
        }

        @U
        @l
        public static Integer c(@k f fVar) {
            Integer num = (Integer) fVar.a();
            if (num != null) {
                return Integer.valueOf(y6.b(num.intValue()));
            }
            return null;
        }

        public static M5 e(C11616a c11616a, M5 m52, f fVar, f fVar2) {
            return c11616a.d(m52, fVar, fVar2, new g(), new g());
        }

        @l
        public final M5 d(@l M5 m52, @k f<e> fVar, @k f<e> fVar2, @k f<e> fVar3, @k f<e> fVar4) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            e eVarA = fVar.a();
            com.avito.beduin.v2.theme.k kVar = this.f337938b;
            boolean z12 = this.f337939c;
            Integer numA = eVarA != null ? F.a(eVarA.f334122a, kVar, z12) : null;
            e eVarA2 = fVar.a();
            Integer numA2 = eVarA2 != null ? F.a(eVarA2.f334122a, kVar, z12) : null;
            e eVarA3 = fVar3.a();
            Integer numA3 = eVarA3 != null ? F.a(eVarA3.f334122a, kVar, z12) : null;
            e eVarA4 = fVar.a();
            Integer numA4 = eVarA4 != null ? F.a(eVarA4.f334124c, kVar, z12) : null;
            e eVarA5 = fVar3.a();
            Integer numA5 = eVarA5 != null ? F.a(eVarA5.f334124c, kVar, z12) : null;
            e eVarA6 = fVar.a();
            Integer numA6 = eVarA6 != null ? F.a(eVarA6.f334123b, kVar, z12) : null;
            e eVarA7 = fVar3.a();
            Integer numA7 = eVarA7 != null ? F.a(eVarA7.f334123b, kVar, z12) : null;
            e eVarA8 = fVar2.a();
            Integer numA8 = eVarA8 != null ? F.a(eVarA8.f334122a, kVar, z12) : null;
            e eVarA9 = fVar4.a();
            Integer numA9 = eVarA9 != null ? F.a(eVarA9.f334122a, kVar, z12) : null;
            e eVarA10 = fVar2.a();
            Integer numA10 = eVarA10 != null ? F.a(eVarA10.f334124c, kVar, z12) : null;
            e eVarA11 = fVar4.a();
            Integer numA11 = eVarA11 != null ? F.a(eVarA11.f334124c, kVar, z12) : null;
            e eVarA12 = fVar2.a();
            Integer numA12 = eVarA12 != null ? F.a(eVarA12.f334123b, kVar, z12) : null;
            e eVarA13 = fVar4.a();
            Integer numA13 = eVarA13 != null ? F.a(eVarA13.f334123b, kVar, z12) : null;
            if (m52 == null) {
                if (numA == null) {
                    return null;
                }
                return new M5(numA.intValue(), numA2, numA3, numA4, numA5, numA6, numA7, numA8, numA9, numA10, numA11, numA12, numA13);
            }
            int iIntValue = numA != null ? numA.intValue() : m52.f318675a;
            Integer num6 = (numA2 == null && (numA2 = m52.f318676b) == null) ? numA : numA2;
            Integer num7 = (numA3 == null && (numA3 = m52.f318677c) == null) ? numA : numA3;
            Integer num8 = (numA4 == null && (numA4 = m52.f318678d) == null) ? numA : numA4;
            Integer num9 = (numA5 == null && (numA5 = m52.f318679e) == null) ? numA : numA5;
            Integer num10 = (numA6 == null && (numA6 = m52.f318680f) == null) ? numA : numA6;
            Integer num11 = (numA7 == null && (numA7 = m52.f318681g) == null) ? numA : numA7;
            Integer num12 = (numA8 == null && (numA8 = m52.f318682h) == null) ? numA : numA8;
            if (numA9 == null) {
                Integer num13 = m52.f318683i;
                num = num13 == null ? numA : num13;
            } else {
                num = numA9;
            }
            if (numA10 == null) {
                Integer num14 = m52.f318684j;
                num2 = num14 == null ? numA : num14;
            } else {
                num2 = numA10;
            }
            if (numA11 == null) {
                Integer num15 = m52.f318685k;
                num3 = num15 == null ? numA : num15;
            } else {
                num3 = numA11;
            }
            if (numA12 == null) {
                Integer num16 = m52.f318686l;
                num4 = num16 == null ? numA : num16;
            } else {
                num4 = numA12;
            }
            if (numA13 == null) {
                Integer num17 = m52.f318687m;
                num5 = num17 == null ? numA : num17;
            } else {
                num5 = numA13;
            }
            return new M5(iIntValue, num6, num7, num8, num9, num10, num11, num12, num, num2, num3, num4, num5);
        }
    }

    public AbstractC42628a(@k Context context) {
        super(context);
        this.f406282b = context;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final AbstractC36331a.C10471a g(com.avito.beduin.v2.theme.k kVar) {
        return new C11616a(this.f406282b, kVar);
    }
}
