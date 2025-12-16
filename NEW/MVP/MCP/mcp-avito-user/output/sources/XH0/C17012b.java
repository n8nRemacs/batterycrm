package Xh0;

import android.content.Context;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckerboardConverter_Factory.java */
@e
@y
@x
/* renamed from: Xh0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C17012b implements h<C17011a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f19038a;

    public C17012b(Provider<Context> provider) {
        this.f19038a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C17011a(this.f19038a.get());
    }
}
