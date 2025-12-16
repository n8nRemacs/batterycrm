package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/d;", "Landroidx/compose/foundation/gestures/snapping/u;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20442d implements androidx.compose.foundation.gestures.snapping.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C20501s<Object> f27598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Float, Float> f27599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f27600c;

    /* JADX WARN: Multi-variable type inference failed */
    public C20442d(C20501s<Object> c20501s, Y41.l<? super Float, Float> lVar, Y41.a<Float> aVar) {
        this.f27598a = c20501s;
        this.f27599b = lVar;
        this.f27600c = aVar;
    }

    @Override // androidx.compose.foundation.gestures.snapping.u
    public final float a(float f12) {
        C20501s<Object> c20501s = this.f27598a;
        float f13 = c20501s.f();
        return c20501s.c().c(C20438c.c(c20501s.c(), f13, f12, this.f27599b, this.f27600c)) - f13;
    }

    @Override // androidx.compose.foundation.gestures.snapping.u
    public final float b(float f12, float f13) {
        return 0.0f;
    }
}
