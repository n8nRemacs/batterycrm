package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.C22040c3;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PullRefreshIndicator.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class i extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f33943l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f33944m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z12, t tVar) {
        super(0);
        this.f33943l = z12;
        this.f33944m = tVar;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.f33943l || ((C22040c3) this.f33944m.f33972e).f() > 0.5f);
    }
}
