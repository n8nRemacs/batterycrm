package com.avito.android.publish.draft_onboarding;

import Cq0.C13343b;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.maybe.C41917k;
import io.reactivex.rxjava3.internal.operators.maybe.c0;
import io.reactivex.rxjava3.internal.operators.maybe.g0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DraftOnboardingInteractorImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/draft_onboarding/c;", "Lcom/avito/android/publish/draft_onboarding/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f235304a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f235305b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e f235306c;

    @Inject
    public c(@Y61.k i iVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k e eVar) {
        this.f235304a = iVar;
        this.f235305b = interfaceC35745a5;
        this.f235306c = eVar;
    }

    @Override // com.avito.android.publish.draft_onboarding.a
    @Y61.k
    public final c0 a() {
        g0 g0VarC = new C41917k(new C13343b(this, 9)).c(new b(this));
        InterfaceC35745a5 interfaceC35745a5 = this.f235305b;
        return g0VarC.p(interfaceC35745a5.a()).k(interfaceC35745a5.e());
    }
}
