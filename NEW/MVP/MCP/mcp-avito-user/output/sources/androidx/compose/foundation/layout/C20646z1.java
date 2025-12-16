package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Intrinsic.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20646z1 {

    /* compiled from: InspectableValue.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/y1;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/platform/y1;)V", "androidx/compose/ui/platform/w1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.z1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C22547y1, kotlin.G0> {
        @Override // Y41.l
        public final kotlin.G0 invoke(C22547y1 c22547y1) {
            c22547y1.getClass();
            throw null;
        }
    }

    /* compiled from: InspectableValue.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/y1;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/platform/y1;)V", "androidx/compose/ui/platform/w1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.z1$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<C22547y1, kotlin.G0> {
        @Override // Y41.l
        public final kotlin.G0 invoke(C22547y1 c22547y1) {
            c22547y1.getClass();
            throw null;
        }
    }

    @F3
    @Y61.k
    public static final androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar, @Y61.k IntrinsicSize intrinsicSize) {
        return vVar.d0(new IntrinsicHeightElement(intrinsicSize, C22535v1.f41625a));
    }

    @F3
    @Y61.k
    public static final androidx.compose.ui.v b(@Y61.k v.a aVar) {
        IntrinsicWidthElement intrinsicWidthElement = new IntrinsicWidthElement(IntrinsicSize.f28333b, false, C22535v1.f41625a);
        aVar.getClass();
        return intrinsicWidthElement;
    }

    @F3
    @Y61.k
    public static final androidx.compose.ui.v c(@Y61.k androidx.compose.ui.v vVar, @Y61.k IntrinsicSize intrinsicSize) {
        return vVar.d0(new IntrinsicWidthElement(intrinsicSize, true, C22535v1.f41625a));
    }
}
