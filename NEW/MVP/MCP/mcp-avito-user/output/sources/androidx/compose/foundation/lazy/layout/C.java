package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* compiled from: LazyLayoutItemContentFactory.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class C extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f29254l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f29255m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f29256n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(int i12, F f12, Object obj) {
        super(2);
        this.f29254l = f12;
        this.f29255m = i12;
        this.f29256n = obj;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.f29254l.e(this.f29255m, a13, this.f29256n);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
