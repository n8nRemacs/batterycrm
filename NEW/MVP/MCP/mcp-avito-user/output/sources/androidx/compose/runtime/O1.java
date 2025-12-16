package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import kotlin.Metadata;

/* compiled from: CompositionLocalMap.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u00052\u00020\u0006:\u0001\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/O1;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "Landroidx/compose/runtime/O;", "", "Landroidx/compose/runtime/T3;", "Landroidx/compose/runtime/U;", "Landroidx/compose/runtime/P;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface O1 extends androidx.compose.runtime.external.kotlinx.collections.immutable.h<O<Object>, T3<Object>>, U, P {

    /* compiled from: CompositionLocalMap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/O1$a;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h$a;", "Landroidx/compose/runtime/O;", "", "Landroidx/compose/runtime/T3;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends h.a<O<Object>, T3<Object>> {
    }

    @Y61.k
    androidx.compose.runtime.internal.J P3(@Y61.k X1 x12, @Y61.k T3 t32);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.h
    @Y61.k
    h.a<O<Object>, T3<Object>> builder();

    @Override // androidx.compose.runtime.P
    default Object i(@Y61.k X1 x12) {
        return V.a(this, x12);
    }
}
