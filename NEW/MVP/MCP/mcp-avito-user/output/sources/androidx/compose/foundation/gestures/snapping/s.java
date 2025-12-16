package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C20304o;
import androidx.compose.animation.core.C20318t;
import androidx.compose.foundation.N0;
import androidx.compose.foundation.gestures.G1;
import androidx.compose.runtime.C22082i3;
import java.util.concurrent.CancellationException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/o;", "", "Landroidx/compose/animation/core/t;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class s extends N implements Y41.l<C20304o<Float, C20318t>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f28050l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.e f28051m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G1 f28052n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f28053o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(float f12, l0.e eVar, G1 g12, Y41.l<? super Float, G0> lVar) {
        super(1);
        this.f28050l = f12;
        this.f28051m = eVar;
        this.f28052n = g12;
        this.f28053o = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(C20304o<Float, C20318t> c20304o) {
        float fA2;
        C20304o<Float, C20318t> c20304o2 = c20304o;
        float fD2 = t.d(((Number) ((C22082i3) c20304o2.f26389e).getF42167b()).floatValue(), this.f28050l);
        l0.e eVar = this.f28051m;
        float f12 = fD2 - eVar.f406839b;
        boolean z12 = N0.f26803a;
        G1 g12 = this.f28052n;
        if (z12) {
            try {
                fA2 = g12.a(f12);
            } catch (CancellationException unused) {
                c20304o2.a();
                fA2 = 0.0f;
            }
        } else {
            fA2 = g12.a(f12);
        }
        this.f28053o.invoke(Float.valueOf(fA2));
        if (Math.abs(f12 - fA2) > 0.5f || fD2 != ((Number) ((C22082i3) c20304o2.f26389e).getF42167b()).floatValue()) {
            c20304o2.a();
        }
        eVar.f406839b += fA2;
        return G0.f406611a;
    }
}
