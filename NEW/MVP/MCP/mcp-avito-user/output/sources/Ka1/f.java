package ka1;

import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class f extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.result.g f406397l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ru.mts.biometry.sdk.feature.recognition.ui.result.g gVar) {
        super(0);
        this.f406397l = gVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        ru.mts.biometry.sdk.feature.recognition.ui.result.g gVar = this.f406397l;
        gVar.requireContext();
        z91.e eVar = z91.e.f443907a;
        E91.c cVar = C91.a.f2018e.f3818d;
        gVar.requireContext();
        fa1.d dVar = new fa1.d(cVar, z91.e.a().a().f436313b);
        gVar.requireContext();
        return new j(dVar, z91.e.a().b());
    }
}
