package androidx.compose.foundation.pager;

import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: Pager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class D extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m0 f29805l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f29806m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(m0 m0Var, kotlinx.coroutines.T t12) {
        super(0);
        this.f29805l = m0Var;
        this.f29806m = t12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        boolean z12;
        m0 m0Var = this.f29805l;
        if (m0Var.b()) {
            C43259k.d(this.f29806m, null, null, new I(m0Var, null), 3);
            z12 = true;
        } else {
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}
