package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;

/* compiled from: LazyGridMeasure.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/foundation/lazy/grid/p0;", "invoke", "(I)Landroidx/compose/foundation/lazy/grid/p0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.lazy.grid.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20685m0 extends kotlin.jvm.internal.N implements Y41.l<Integer, C20691p0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20667d0 f29177l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C20665c0 f29178m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20685m0(C20667d0 c20667d0, C20665c0 c20665c0) {
        super(1);
        this.f29177l = c20667d0;
        this.f29178m = c20665c0;
    }

    @Override // Y41.l
    public final C20691p0 invoke(Integer num) {
        int iIntValue = num.intValue();
        C20667d0 c20667d0 = this.f29177l;
        H0 h02 = c20667d0.f29239f;
        int iE2 = h02.e(iIntValue, h02.f29008i);
        long jA2 = c20667d0.a(0, iE2);
        C20665c0 c20665c0 = this.f29178m;
        return c20665c0.c(iIntValue, 0, iE2, c20665c0.f29225c, jA2);
    }
}
