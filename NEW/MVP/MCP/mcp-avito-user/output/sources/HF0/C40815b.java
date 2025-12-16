package hF0;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentSelectorDeeplinkHandler_Factory.java */
@e
@y
@x
/* renamed from: hF0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40815b implements h<C40814a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f397128a;

    public C40815b(dv.b bVar) {
        this.f397128a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C40814a((a.d) this.f397128a.get());
    }
}
