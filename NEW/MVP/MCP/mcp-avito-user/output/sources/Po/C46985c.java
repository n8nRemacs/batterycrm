package pO;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ItemMapAnalyticsInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: pO.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C46985c implements h<C46984b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f428519a;

    /* renamed from: b, reason: collision with root package name */
    public final l f428520b;

    public C46985c(f fVar, l lVar) {
        this.f428519a = fVar;
        this.f428520b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C46984b((InterfaceC28373a) this.f428519a.get(), (TreeClickStreamParent) this.f428520b.f393949a);
    }
}
