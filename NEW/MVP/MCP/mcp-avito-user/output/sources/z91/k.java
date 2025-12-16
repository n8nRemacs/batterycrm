package z91;

import Ba1.E;
import android.content.Context;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class k extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f443913l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        super(0);
        this.f443913l = context;
    }

    @Override // Y41.a
    public final Object invoke() {
        Context context = this.f443913l;
        return new ru.mts.biometry.api.repo.b(Ba1.q.a(context), E.a(context), context);
    }
}
