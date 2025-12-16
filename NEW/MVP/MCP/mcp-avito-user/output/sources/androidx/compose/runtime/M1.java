package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/collection/d;", "", "Landroidx/compose/runtime/O0;", "invoke-fVlnmYg", "()Landroidx/collection/R0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class M1 extends kotlin.jvm.internal.N implements Y41.a<androidx.compose.runtime.collection.d<Object, O0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N1 f38048l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(N1 n12) {
        super(0);
        this.f38048l = n12;
    }

    @Override // Y41.a
    public final androidx.compose.runtime.collection.d<Object, O0> invoke() {
        N1 n12 = this.f38048l;
        androidx.collection.R0 r02 = new androidx.collection.R0(n12.f38055a.size());
        ArrayList arrayList = n12.f38055a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            O0 o02 = (O0) arrayList.get(i12);
            Object obj = o02.f38064b;
            int i13 = o02.f38063a;
            androidx.compose.runtime.collection.d.a(r02, obj != null ? new N0(Integer.valueOf(i13), o02.f38064b) : Integer.valueOf(i13), o02);
        }
        return androidx.compose.runtime.collection.d.b(r02);
    }
}
