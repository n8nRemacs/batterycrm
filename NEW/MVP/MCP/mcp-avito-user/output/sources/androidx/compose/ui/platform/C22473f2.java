package androidx.compose.ui.platform;

import java.util.List;
import kotlin.Metadata;

/* compiled from: SemanticsUtils.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/f2;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22473f2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.semantics.l f41446a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.B0 f41447b;

    public C22473f2(@Y61.k androidx.compose.ui.semantics.u uVar, @Y61.k androidx.collection.J<C22477g2> j12) {
        this.f41446a = uVar.f41797d;
        this.f41447b = new androidx.collection.B0(androidx.compose.ui.semantics.u.h(4, uVar).size());
        List listH = androidx.compose.ui.semantics.u.h(4, uVar);
        int size = listH.size();
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.semantics.u uVar2 = (androidx.compose.ui.semantics.u) listH.get(i12);
            if (j12.a(uVar2.f41800g)) {
                this.f41447b.b(uVar2.f41800g);
            }
        }
    }
}
