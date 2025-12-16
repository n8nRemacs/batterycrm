package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.platform.C22528t2;
import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: Offset.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M1 {

    /* compiled from: Offset.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/y1;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/platform/y1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C22547y1, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f28408l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ float f28409m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, float f13) {
            super(1);
            this.f28408l = f12;
            this.f28409m = f13;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C22547y1 c22547y1) {
            C22547y1 c22547y12 = c22547y1;
            c22547y12.getClass();
            androidx.compose.ui.unit.h hVarA = androidx.compose.ui.unit.h.a(this.f28408l);
            C22528t2 c22528t2 = c22547y12.f41642a;
            c22528t2.b(hVarA, "x");
            c22528t2.b(androidx.compose.ui.unit.h.a(this.f28409m), "y");
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Offset.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/y1;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/platform/y1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<C22547y1, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> f28410l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> lVar) {
            super(1);
            this.f28410l = lVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C22547y1 c22547y1) {
            C22547y1 c22547y12 = c22547y1;
            c22547y12.getClass();
            c22547y12.f41642a.b(this.f28410l, "offset");
            return kotlin.G0.f406611a;
        }
    }

    @Y61.k
    public static final androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar, @Y61.k Y41.l<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> lVar) {
        return vVar.d0(new OffsetPxElement(lVar, new b(lVar)));
    }

    @F3
    @Y61.k
    public static final androidx.compose.ui.v b(@Y61.k androidx.compose.ui.v vVar, float f12, float f13) {
        return vVar.d0(new OffsetElement(f12, f13, true, new a(f12, f13), null));
    }

    public static androidx.compose.ui.v c(float f12, float f13, int i12, androidx.compose.ui.v vVar) {
        if ((i12 & 1) != 0) {
            f12 = 0;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
        }
        if ((i12 & 2) != 0) {
            f13 = 0;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        }
        return b(vVar, f12, f13);
    }
}
