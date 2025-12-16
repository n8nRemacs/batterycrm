package hA0;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.success_screen_after_apply.ui.SuccessScreenAfterApplyOpenParams;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuccessScreenAfterApplyAnalyticsSender_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: hA0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40794b implements h<C40793a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f397086a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f397087b;

    /* renamed from: c, reason: collision with root package name */
    public final l f397088c;

    public C40794b(l lVar, Provider provider, Provider provider2) {
        this.f397086a = provider;
        this.f397087b = provider2;
        this.f397088c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C40793a(this.f397086a.get(), this.f397087b.get(), (SuccessScreenAfterApplyOpenParams) this.f397088c.f393949a);
    }
}
