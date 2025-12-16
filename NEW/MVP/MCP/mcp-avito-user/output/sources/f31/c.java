package F31;

import Y41.l;
import a.AbstractC19640f;
import a.t0;
import android.content.Context;
import i71.C41238a;
import kotlin.G0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.logger.Level;

/* loaded from: classes8.dex */
public final class c extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f4527l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a f4528m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, Y41.a aVar) {
        super(1);
        this.f4527l = context;
        this.f4528m = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final Object invoke(Object obj) throws DefinitionOverrideException {
        o71.e eVar = (o71.e) obj;
        eVar.f419401a.f419399c = new C41238a(Level.f421466c);
        org.koin.android.ext.koin.e.a(eVar, this.f4527l);
        new I31.a();
        eVar.b(C42756l.g0(new t71.c[]{AbstractC19640f.f20658a, this.f4528m.invoke(), t0.f20685a, E41.e.f3763a}));
        return G0.f406611a;
    }
}
