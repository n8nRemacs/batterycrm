package com.avito.android.replace_main.onboarding.view;

import Cm0.InterfaceC13325b;
import Cm0.InterfaceC13326c;
import androidx.compose.runtime.internal.P;
import com.avito.android.replace_main.onboarding.view.v;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReplaceMainOnboardingViewFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/onboarding/view/s;", "LCm0/c;", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class s implements InterfaceC13326c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final W20.f f254575a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final v.a f254576b;

    @Inject
    public s(@Y61.k W20.f fVar, @Y61.k v.a aVar) {
        this.f254575a = fVar;
        this.f254576b = aVar;
    }

    @Override // Cm0.InterfaceC13326c
    @Y61.k
    public final InterfaceC13325b a(@Y61.k InterfaceC13326c.a aVar) {
        return !this.f254575a.e() ? new D(aVar) : this.f254576b.a(aVar);
    }
}
