package com.avito.android.home.default_search_location;

import com.avito.android.main_start_onboarding.MainStartOnboardingStep;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.maybe.e0;
import io.reactivex.rxjava3.internal.operators.maybe.g0;
import java.util.Objects;
import kotlin.Metadata;
import org.funktionale.option.a;

/* compiled from: DefaultSearchLocationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "permissionsGranted", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f162384b;

    public g(s sVar) {
        this.f162384b = sVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        z<T> zVarF;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        s sVar = this.f162384b;
        sVar.f162404i.c(MainStartOnboardingStep.LocationPermission.f184216b);
        if (zBooleanValue) {
            sVar.f162413r = sVar.f162402g.now();
            g0 g0VarC = sVar.f162397b.a().k(new i(sVar)).i(new j(sVar)).r(k.f162388b).k(new n(sVar)).m(new o(sVar)).j(new p(sVar)).c(new q(sVar));
            l41.o oVar = r.f162395b;
            Objects.requireNonNull(oVar, "fallbackSupplier is null");
            zVarF = new e0(g0VarC, oVar).q();
        } else {
            sVar.f162398c.d(null, "PERMISSION DENIED");
            sVar.f162409n = true;
            sVar.f162401f.a();
            zVarF = I.q(new a.c(Boolean.FALSE)).F();
        }
        sVar.f162407l.b(zVarF.v0(sVar.f162406k, io.reactivex.rxjava3.internal.functions.a.f401994d, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
