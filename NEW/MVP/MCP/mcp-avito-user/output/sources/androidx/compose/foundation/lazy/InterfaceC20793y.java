package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.R0;
import androidx.compose.animation.core.b2;
import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: LazyItemScope.kt */
@F3
@D0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC20793y {

    /* compiled from: LazyItemScope.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.y$a */
    public static final class a {
    }

    static /* synthetic */ androidx.compose.ui.v b(InterfaceC20793y interfaceC20793y, androidx.compose.ui.v vVar) {
        R0 r0D = C20310q.d(400.0f, 5, null);
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        return interfaceC20793y.d(vVar, r0D, C20310q.d(400.0f, 1, androidx.compose.ui.unit.q.a(b2.a())), C20310q.d(400.0f, 5, null));
    }

    @Y61.k
    androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar);

    @Y61.k
    androidx.compose.ui.v c(@Y61.k androidx.compose.ui.v vVar);

    @Y61.k
    androidx.compose.ui.v e(@Y61.k v.a aVar);

    @Y61.k
    default androidx.compose.ui.v d(@Y61.k androidx.compose.ui.v vVar, @Y61.l R0 r02, @Y61.l R0 r03, @Y61.l R0 r04) {
        return vVar;
    }
}
