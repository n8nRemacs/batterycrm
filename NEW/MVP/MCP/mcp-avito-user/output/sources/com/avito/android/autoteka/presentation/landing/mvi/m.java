package com.avito.android.autoteka.presentation.landing.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.autoteka.presentation.landing.mvi.entity.AutotekaLandingInternalAction;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaLandingOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/landing/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingInternalAction;", "LLf/b;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements t<AutotekaLandingInternalAction, Lf.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f97380b;

    @Inject
    public m(@Y61.k InterfaceC40691b interfaceC40691b) {
        this.f97380b = interfaceC40691b;
    }

    @Override // com.avito.android.arch.mvi.t
    public final Lf.b b(AutotekaLandingInternalAction autotekaLandingInternalAction) {
        AutotekaLandingInternalAction autotekaLandingInternalAction2 = autotekaLandingInternalAction;
        if (!(autotekaLandingInternalAction2 instanceof AutotekaLandingInternalAction.ContentLoaded)) {
            return null;
        }
        com.avito.android.beduin_shared.model.utils.a.a(this.f97380b, ((AutotekaLandingInternalAction.ContentLoaded) autotekaLandingInternalAction2).f97353d);
        return null;
    }
}
