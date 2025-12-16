package E31;

import D31.g;
import O41.e;
import kotlin.G0;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* loaded from: classes8.dex */
public final class b extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f3719l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(0);
        this.f3719l = dVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        d dVar = this.f3719l;
        String str = dVar.f3724e;
        if (dVar.f3721b.getBoolean("sber_id_session_id_app_enabled_key", false)) {
            e eVar = dVar.f3720a;
            C43259k.d((T) ((g) eVar.f11970d).f2880a.getValue(), null, null, new O41.d(eVar, str, null), 3);
        }
        return G0.f406611a;
    }
}
