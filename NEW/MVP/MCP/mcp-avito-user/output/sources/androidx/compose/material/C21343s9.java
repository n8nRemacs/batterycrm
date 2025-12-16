package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.s9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21343s9 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U8 f34182l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21343s9(U8 u82) {
        super(2);
        this.f34182l = u82;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            dc.b(this.f34182l.getMessage(), null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, null, a13, 0, 0, 131070);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
