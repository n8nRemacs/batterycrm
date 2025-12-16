package androidx.compose.foundation.text;

import androidx.compose.ui.text.C22602e;
import kotlin.Metadata;

/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/e;", "invoke", "()Landroidx/compose/ui/text/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Z extends kotlin.jvm.internal.N implements Y41.a<C22602e> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S2 f30626l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22602e f30627m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(S2 s22, C22602e c22602e) {
        super(0);
        this.f30626l = s22;
        this.f30627m = c22602e;
    }

    @Override // Y41.a
    public final C22602e invoke() {
        C22602e c22602e;
        S2 s22 = this.f30626l;
        if (s22 != null) {
            androidx.compose.runtime.snapshots.D<Y41.l<R1, kotlin.G0>> d12 = s22.f30524c;
            if (d12.isEmpty()) {
                c22602e = s22.f30523b;
            } else {
                R1 r12 = new R1(s22.f30523b);
                int size = d12.size();
                for (int i12 = 0; i12 < size; i12++) {
                    d12.get(i12).invoke(r12);
                }
                c22602e = r12.f30518b;
            }
            s22.f30523b = c22602e;
            if (c22602e != null) {
                return c22602e;
            }
        }
        return this.f30627m;
    }
}
