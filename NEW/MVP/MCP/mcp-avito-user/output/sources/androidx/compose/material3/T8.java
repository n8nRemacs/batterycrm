package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;

/* compiled from: Label.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/T8;", "Landroidx/compose/material3/Q0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class T8 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f35483a;

    public T8() {
        this(false, false, 3, null);
    }

    @Override // androidx.compose.material3.Q0
    @Y61.l
    public final Object a(@Y61.k MutatePriority mutatePriority, @Y61.k SuspendLambda suspendLambda) {
        return kotlin.G0.f406611a;
    }

    @Override // androidx.compose.material3.Q0
    /* renamed from: isVisible, reason: from getter */
    public final boolean getF35483a() {
        return this.f35483a;
    }

    public T8(boolean z12, boolean z13, int i12, C42822w c42822w) {
        this.f35483a = (i12 & 1) != 0 ? true : z12;
    }

    @Override // androidx.compose.material3.Q0
    public final void b() {
    }

    @Override // androidx.compose.material3.Q0
    public final void dismiss() {
    }
}
