package iE0;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.settings.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ThemeSettingsLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: iE0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41276b implements h<C41275a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f398455a;

    /* renamed from: b, reason: collision with root package name */
    public final d f398456b;

    public C41276b(dv.b bVar, d dVar) {
        this.f398455a = bVar;
        this.f398456b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C41275a((a.InterfaceC4053a) this.f398455a.get(), (com.avito.android.settings.b) this.f398456b.get());
    }
}
