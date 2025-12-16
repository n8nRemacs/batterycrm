package leakcanary;

import android.os.Handler;
import kotlin.G0;
import kotlin.Metadata;
import leakcanary.M;

/* compiled from: ServiceWatcher.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
final class O extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M.e f414023l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Handler.Callback f414024m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(M.e eVar, Handler.Callback callback) {
        super(0);
        this.f414023l = eVar;
        this.f414024m = callback;
    }

    @Override // Y41.a
    public final G0 invoke() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        M.e eVar = this.f414023l;
        N n12 = new N(this);
        int i12 = M.f414009h;
        M.this.c(n12);
        return G0.f406611a;
    }
}
