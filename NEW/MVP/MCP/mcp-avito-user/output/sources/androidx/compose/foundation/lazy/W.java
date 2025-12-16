package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.lazy.layout.N0;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.InterfaceC22264l0;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: LazyList.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/Q;", "Landroidx/compose/ui/unit/b;", "containerConstraints", "Landroidx/compose/foundation/lazy/f0;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/Q;J)Landroidx/compose/foundation/lazy/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class W extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.foundation.lazy.layout.Q, C22712b, f0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0 f28868l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f28869m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T1 f28870n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f28871o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.o f28872p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C20585k.m f28873q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20585k.e f28874r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f28875s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22264l0 f28876t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ N0.a.C1593a f28877u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f.b f28878v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f.c f28879w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(w0 w0Var, boolean z12, T1 t12, boolean z13, kotlin.reflect.o oVar, C20585k.m mVar, C20585k.e eVar, kotlinx.coroutines.T t13, InterfaceC22264l0 interfaceC22264l0, N0.a.C1593a c1593a, InterfaceC22215f.b bVar, InterfaceC22215f.c cVar) {
        super(2);
        this.f28868l = w0Var;
        this.f28869m = z12;
        this.f28870n = t12;
        this.f28871o = z13;
        this.f28872p = oVar;
        this.f28873q = mVar;
        this.f28874r = eVar;
        this.f28875s = t13;
        this.f28876t = interfaceC22264l0;
        this.f28877u = c1593a;
        this.f28878v = bVar;
        this.f28879w = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06cb A[LOOP:15: B:304:0x06c9->B:305:0x06cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x09b2  */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v72, types: [kotlin.ranges.j] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46, types: [int] */
    /* JADX WARN: Type inference failed for: r4v88 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [int] */
    /* JADX WARN: Type inference failed for: r5v80 */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.lazy.f0 invoke(androidx.compose.foundation.lazy.layout.Q r59, androidx.compose.ui.unit.C22712b r60) {
        /*
            Method dump skipped, instructions count: 2557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.W.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
