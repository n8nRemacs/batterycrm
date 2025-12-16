package Tw0;

import com.avito.android.deep_linking.links.IncomeSettingsLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IncomeSettingsDeeplinkHandlerModule_ProvideIncomeSettingsDeeplinkHandlerFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f16024a;

    public c(d dVar) {
        this.f16024a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f16024a;
        C15420b.f16023a.getClass();
        return new C43834a(IncomeSettingsLink.class, null, new C43834a.b.C11809b(dVar));
    }
}
