package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.InterfaceC20717f;
import kotlin.Metadata;

/* compiled from: IntervalList.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/C0;", "T", "Landroidx/compose/foundation/lazy/layout/f;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C0<T> implements InterfaceC20717f<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<InterfaceC20717f.a<T>> f29257a = new androidx.compose.runtime.collection.e<>(new InterfaceC20717f.a[16], 0);

    /* renamed from: b, reason: collision with root package name */
    public int f29258b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public InterfaceC20717f.a<? extends T> f29259c;

    public final void a(int i12, T t12) {
        if (i12 < 0) {
            androidx.compose.foundation.internal.e.a("size should be >=0");
        }
        if (i12 == 0) {
            return;
        }
        InterfaceC20717f.a aVar = new InterfaceC20717f.a(this.f29258b, i12, t12);
        this.f29258b += i12;
        this.f29257a.b(aVar);
    }

    @Y61.k
    public final InterfaceC20717f.a<T> b(int i12) {
        if (i12 < 0 || i12 >= this.f29258b) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Index ", ", size ");
            sbJ.append(this.f29258b);
            androidx.compose.foundation.internal.e.e(sbJ.toString());
        }
        InterfaceC20717f.a<? extends T> aVar = this.f29259c;
        if (aVar != null) {
            int i13 = aVar.f29411a;
            if (i12 < aVar.f29412b + i13 && i13 <= i12) {
                return aVar;
            }
        }
        androidx.compose.runtime.collection.e<InterfaceC20717f.a<T>> eVar = this.f29257a;
        InterfaceC20717f.a aVar2 = (InterfaceC20717f.a<? extends T>) eVar.f38260b[C20719g.a(i12, eVar)];
        this.f29259c = aVar2;
        return aVar2;
    }
}
