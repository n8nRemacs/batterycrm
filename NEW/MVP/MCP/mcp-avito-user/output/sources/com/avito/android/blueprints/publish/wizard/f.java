package com.avito.android.blueprints.publish.wizard;

import Y61.k;
import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WizardItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/publish/wizard/f;", "Lcom/avito/android/blueprints/publish/wizard/d;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<WizardItem> f106507b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f106508c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<WizardItem> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106507b = cVar;
        this.f106508c = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        WizardItem wizardItem = (WizardItem) aVar;
        hVar.D(wizardItem.f106496b);
        hVar.J0(new e(this, wizardItem));
        hVar.f(wizardItem.f106497c);
    }

    @Override // com.avito.android.blueprints.publish.wizard.d
    @k
    public final z<WizardItem> d() {
        return this.f106508c;
    }
}
