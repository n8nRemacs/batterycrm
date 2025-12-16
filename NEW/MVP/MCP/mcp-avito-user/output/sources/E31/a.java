package E31;

import D31.g;
import O41.e;
import Y41.l;
import cc1.C27176a;
import kotlin.G0;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* loaded from: classes8.dex */
public final class a extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f3718l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar) {
        super(1);
        this.f3718l = dVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        String id2;
        C27176a c27176a = (C27176a) obj;
        if (c27176a != null && (id2 = c27176a.getId()) != null && !C43066x.K(id2)) {
            d dVar = this.f3718l;
            if (dVar.f3724e.equals(id2)) {
                if (dVar.f3724e.equals("")) {
                    dVar.f3724e = id2;
                }
                long expiresTime = c27176a.getExpiresTime() - System.currentTimeMillis();
                if (expiresTime > 0) {
                    Q51.a.a(dVar.f3722c, expiresTime);
                } else if (dVar.f3721b.getBoolean("sber_id_session_id_app_enabled_key", false)) {
                    e eVar = dVar.f3720a;
                    C43259k.d((T) ((g) eVar.f11970d).f2880a.getValue(), null, null, new O41.d(eVar, id2, null), 3);
                }
            }
        }
        return G0.f406611a;
    }
}
