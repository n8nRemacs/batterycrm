package androidx.compose.ui.platform;

import androidx.collection.C20247y0;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.platform.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22525t extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22469e2 f41600l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f41601m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22525t(C22469e2 c22469e2, r rVar) {
        super(0);
        this.f41600l = c22469e2;
        this.f41601m = rVar;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        androidx.compose.ui.semantics.u uVar;
        LayoutNode layoutNode;
        C22469e2 c22469e2 = this.f41600l;
        androidx.compose.ui.semantics.j jVar = c22469e2.f41440f;
        androidx.compose.ui.semantics.j jVar2 = c22469e2.f41441g;
        Float f12 = c22469e2.f41438d;
        Float f13 = c22469e2.f41439e;
        float fFloatValue = (jVar == null || f12 == null) ? 0.0f : jVar.f41754a.invoke().floatValue() - f12.floatValue();
        float fFloatValue2 = (jVar2 == null || f13 == null) ? 0.0f : jVar2.f41754a.invoke().floatValue() - f13.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            C20247y0 c20247y0 = r.f41532P;
            int i12 = c22469e2.f41436b;
            r rVar = this.f41601m;
            int iA2 = rVar.A(i12);
            C22477g2 c22477g2B = rVar.s().b(rVar.f41558n);
            if (c22477g2B != null) {
                try {
                    androidx.core.view.accessibility.f fVar = rVar.f41560p;
                    if (fVar != null) {
                        fVar.j(rVar.k(c22477g2B));
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    }
                } catch (IllegalStateException unused) {
                    kotlin.G0 g03 = kotlin.G0.f406611a;
                }
            }
            C22477g2 c22477g2B2 = rVar.s().b(rVar.f41559o);
            if (c22477g2B2 != null) {
                try {
                    androidx.core.view.accessibility.f fVar2 = rVar.f41561q;
                    if (fVar2 != null) {
                        fVar2.j(rVar.k(c22477g2B2));
                        kotlin.G0 g04 = kotlin.G0.f406611a;
                    }
                } catch (IllegalStateException unused2) {
                    kotlin.G0 g05 = kotlin.G0.f406611a;
                }
            }
            rVar.f41548d.invalidate();
            C22477g2 c22477g2B3 = rVar.s().b(iA2);
            if (c22477g2B3 != null && (uVar = c22477g2B3.f41462a) != null && (layoutNode = uVar.f41796c) != null) {
                if (jVar != null) {
                    rVar.f41563s.h(iA2, jVar);
                }
                if (jVar2 != null) {
                    rVar.f41564t.h(iA2, jVar2);
                }
                rVar.w(layoutNode);
            }
        }
        if (jVar != null) {
            c22469e2.f41438d = jVar.f41754a.invoke();
        }
        if (jVar2 != null) {
            c22469e2.f41439e = jVar2.f41754a.invoke();
        }
        return kotlin.G0.f406611a;
    }
}
