package Ge;

import com.avito.android.auto_loans_cabinet.InterfaceC28699d;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoLoanCabinetLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: Ge.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13870b implements h<C13869a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f6626a;

    /* renamed from: b, reason: collision with root package name */
    public final f f6627b;

    public C13870b(dv.b bVar, f fVar) {
        this.f6626a = bVar;
        this.f6627b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13869a((a.InterfaceC4053a) this.f6626a.get(), (InterfaceC28699d) this.f6627b.get());
    }
}
