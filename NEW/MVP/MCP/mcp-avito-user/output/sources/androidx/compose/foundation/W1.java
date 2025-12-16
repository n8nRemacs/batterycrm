package androidx.compose.foundation;

import androidx.compose.runtime.F3;
import kotlin.Metadata;

/* compiled from: ProgressSemantics.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W1 {

    /* compiled from: ProgressSemantics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f26896l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlin.ranges.f<Float> f26897m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f26898n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, kotlin.ranges.f<Float> fVar, int i12) {
            super(1);
            this.f26896l = f12;
            this.f26897m = fVar;
            this.f26898n = i12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
            Float fValueOf = Float.valueOf(this.f26896l);
            kotlin.ranges.f<Float> fVar = this.f26897m;
            androidx.compose.ui.semantics.C.r(f12, new androidx.compose.ui.semantics.h(((Number) kotlin.ranges.s.j(fValueOf, fVar)).floatValue(), fVar, this.f26898n));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ProgressSemantics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f26899l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
            androidx.compose.ui.semantics.h.f41739d.getClass();
            androidx.compose.ui.semantics.C.r(f12, androidx.compose.ui.semantics.h.f41740e);
            return kotlin.G0.f406611a;
        }
    }

    @F3
    @Y61.k
    public static final androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar) {
        return androidx.compose.ui.semantics.r.b(vVar, true, b.f26899l);
    }

    @F3
    @Y61.k
    public static final androidx.compose.ui.v b(@Y61.k androidx.compose.ui.v vVar, float f12, @Y61.k kotlin.ranges.f<Float> fVar, @j.F int i12) {
        return androidx.compose.ui.semantics.r.b(vVar, true, new a(f12, fVar, i12));
    }
}
