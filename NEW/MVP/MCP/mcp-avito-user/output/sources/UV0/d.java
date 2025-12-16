package Uv0;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShiftListDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<C15573a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f16780a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.shift_list.ui.d f16781b;

    public d(dv.b bVar, com.avito.android.shift_list.ui.d dVar) {
        this.f16780a = bVar;
        this.f16781b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C15573a((a.InterfaceC4053a) this.f16780a.get(), (com.avito.android.shift_list.ui.b) this.f16781b.get());
    }
}
