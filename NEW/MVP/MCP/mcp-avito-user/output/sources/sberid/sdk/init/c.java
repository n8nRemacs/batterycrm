package sberid.sdk.init;

import Y41.l;
import a.AbstractC19640f;
import a.t0;
import android.app.Application;
import i71.C41238a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import o71.e;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.logger.Level;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo71/e;", "Lkotlin/G0;", "invoke", "(Lo71/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class c extends N implements l<e, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Application f437783l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Application application) {
        super(1);
        this.f437783l = application;
    }

    @Override // Y41.l
    public final G0 invoke(e eVar) throws DefinitionOverrideException {
        e eVar2 = eVar;
        eVar2.f419401a.f419399c = new C41238a(Level.f421466c);
        org.koin.android.ext.koin.e.a(eVar2, this.f437783l);
        new I31.a();
        eVar2.b(C42756l.g0(new t71.c[]{AbstractC19640f.f20658a, t0.f20685a, E41.e.f3763a}));
        return G0.f406611a;
    }
}
