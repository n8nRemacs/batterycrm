package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AbstractSignatureParts.kt */
@s0
/* loaded from: classes8.dex */
final class b extends N implements Y41.l<Integer, h> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f408324l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h[] f408325m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v vVar, h[] hVarArr) {
        super(1);
        this.f408324l = vVar;
        this.f408325m = hVarArr;
    }

    @Override // Y41.l
    public final h invoke(Integer num) {
        h hVar;
        int iIntValue = num.intValue();
        v vVar = this.f408324l;
        if (vVar != null && (hVar = (h) vVar.f408404a.get(Integer.valueOf(iIntValue))) != null) {
            return hVar;
        }
        if (iIntValue >= 0) {
            h[] hVarArr = this.f408325m;
            if (iIntValue <= hVarArr.length - 1) {
                return hVarArr[iIntValue];
            }
        }
        h.f408338e.getClass();
        return h.f408339f;
    }
}
