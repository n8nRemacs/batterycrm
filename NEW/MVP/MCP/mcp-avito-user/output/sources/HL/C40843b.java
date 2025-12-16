package hL;

import android.app.Application;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacLauncherIntentLinkHandler_Factory.java */
@e
@y
@x
/* renamed from: hL.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40843b implements h<C40842a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f397179a;

    /* renamed from: b, reason: collision with root package name */
    public final l f397180b;

    public C40843b(dv.b bVar, l lVar) {
        this.f397179a = bVar;
        this.f397180b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C40842a((a.InterfaceC4053a) this.f397179a.get(), (Application) this.f397180b.f393949a);
    }
}
