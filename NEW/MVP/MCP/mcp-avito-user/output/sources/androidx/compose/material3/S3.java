package androidx.compose.material3;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: DateInput.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class S3 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<String> f35393l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3(InterfaceC22204y1<String> interfaceC22204y1) {
        super(2);
        this.f35393l = interfaceC22204y1;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            InterfaceC22204y1<String> interfaceC22204y1 = this.f35393l;
            if (!C43066x.K(interfaceC22204y1.getF42167b())) {
                C21914uj.b(interfaceC22204y1.getF42167b(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, a13, 0, 0, 131070);
            }
        }
        return kotlin.G0.f406611a;
    }
}
