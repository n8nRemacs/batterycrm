package gM;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.permissions.u;
import com.avito.android.permissions.w;
import dagger.internal.x;
import dagger.internal.y;
import hM.C40851c;
import hM.InterfaceC40849a;

/* compiled from: MicAccessStartupTracker_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f396468a;

    /* renamed from: b, reason: collision with root package name */
    public final w f396469b;

    /* renamed from: c, reason: collision with root package name */
    public final C40851c f396470c;

    public h(dagger.internal.f fVar, w wVar, C40851c c40851c) {
        this.f396468a = fVar;
        this.f396469b = wVar;
        this.f396470c = c40851c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((InterfaceC28373a) this.f396468a.get(), (u) this.f396469b.get(), (InterfaceC40849a) this.f396470c.get());
    }
}
