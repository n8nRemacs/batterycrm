package androidx.compose.foundation;

import androidx.compose.runtime.C22061e3;
import androidx.compose.ui.node.C22421l;
import kotlin.Metadata;

/* compiled from: BasicMarquee.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class E1 extends kotlin.jvm.internal.N implements Y41.a<Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F1 f26698l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B1 f26699m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1(F1 f12, B1 b12) {
        super(0);
        this.f26698l = f12;
        this.f26699m = b12;
    }

    @Override // Y41.a
    public final Integer invoke() {
        B1 b12 = this.f26699m;
        androidx.compose.ui.unit.d dVar = C22421l.g(b12).f40608B;
        ((C22061e3) b12.f26641t).e();
        return Integer.valueOf(this.f26698l.a(((C22061e3) b12.f26642u).e()));
    }
}
