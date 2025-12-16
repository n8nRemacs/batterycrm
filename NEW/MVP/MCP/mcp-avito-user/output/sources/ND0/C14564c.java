package Nd0;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.publish.details.historical_suggest.f;
import com.avito.android.publish.details.historical_suggest.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HistoricalSuggestModule_ProvideHistoricalSuggestViewModelFactory.java */
@e
@y
@x
/* renamed from: Nd0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14564c implements h<com.avito.android.publish.details.historical_suggest.e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f11656a;

    /* renamed from: b, reason: collision with root package name */
    public final g f11657b;

    public C14564c(l lVar, g gVar) {
        this.f11656a = lVar;
        this.f11657b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f11656a.f393949a;
        f fVar = (f) this.f11657b.get();
        C14562a.f11654a.getClass();
        return (com.avito.android.publish.details.historical_suggest.e) new P0(fragment, fVar).a(com.avito.android.publish.details.historical_suggest.e.class);
    }
}
