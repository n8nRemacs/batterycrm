package Nd0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import nF.C44245a;

/* compiled from: HistoricalSuggestModule_ProvideHistoricalSuggestItemFactoryFactory.java */
@e
@y
@x
/* renamed from: Nd0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14563b implements h<com.avito.android.publish.details.historical_suggest.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f11655a;

    public C14563b(u uVar) {
        this.f11655a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C44245a c44245a = (C44245a) this.f11655a.get();
        C14562a.f11654a.getClass();
        return new com.avito.android.publish.details.historical_suggest.a(c44245a);
    }
}
