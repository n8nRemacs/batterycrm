package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.lazy.layout.N0;
import androidx.compose.ui.graphics.InterfaceC22264l0;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: LazyGrid.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/Q;", "Landroidx/compose/ui/unit/b;", "containerConstraints", "Landroidx/compose/foundation/lazy/grid/o0;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/Q;J)Landroidx/compose/foundation/lazy/grid/o0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.lazy.grid.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20671f0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.foundation.lazy.layout.Q, C22712b, C20689o0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I0 f29121l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f29122m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T1 f29123n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f29124o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.o f29125p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ F0 f29126q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20585k.m f29127r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C20585k.e f29128s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f29129t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22264l0 f29130u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ N0.a.C1593a f29131v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20671f0(I0 i02, boolean z12, T1 t12, boolean z13, kotlin.reflect.o oVar, F0 f02, C20585k.m mVar, C20585k.e eVar, kotlinx.coroutines.T t13, InterfaceC22264l0 interfaceC22264l0, N0.a.C1593a c1593a) {
        super(2);
        this.f29121l = i02;
        this.f29122m = z12;
        this.f29123n = t12;
        this.f29124o = z13;
        this.f29125p = oVar;
        this.f29126q = f02;
        this.f29127r = mVar;
        this.f29128s = eVar;
        this.f29129t = t13;
        this.f29130u = interfaceC22264l0;
        this.f29131v = c1593a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0694 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x071e A[LOOP:12: B:330:0x071c->B:331:0x071e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0508 A[EDGE_INSN: B:450:0x0508->B:213:0x0508 BREAK  A[LOOP:4: B:201:0x04b2->B:212:0x04fe], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v74, types: [kotlin.ranges.j] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object] */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.lazy.grid.C20689o0 invoke(androidx.compose.foundation.lazy.layout.Q r70, androidx.compose.ui.unit.C22712b r71) {
        /*
            Method dump skipped, instructions count: 2505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.C20671f0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
