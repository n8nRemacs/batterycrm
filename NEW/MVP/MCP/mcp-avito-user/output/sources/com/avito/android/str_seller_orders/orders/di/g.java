package com.avito.android.str_seller_orders.orders.di;

import androidx.fragment.app.Fragment;
import com.avito.android.str_seller_orders.orders.StrOrdersOpenParams;
import com.avito.android.str_seller_orders.orders.di.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.reflect.n;
import kz0.C43520a;
import lE.C43624b;

/* compiled from: StrOrdersFragmentModule_ProvideStrOrdersPagerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<C43520a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f288863a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C43624b> f288864b;

    /* renamed from: c, reason: collision with root package name */
    public final l f288865c;

    public g(l lVar, l lVar2, Provider provider) {
        this.f288863a = lVar;
        this.f288864b = provider;
        this.f288865c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f288863a.f393949a;
        C43624b c43624bJ = ((a.c.C8693c) this.f288864b).f288858a.J();
        StrOrdersOpenParams strOrdersOpenParams = (StrOrdersOpenParams) this.f288865c.f393949a;
        c.f288859a.getClass();
        n<Object> nVar = C43624b.f413639o[9];
        return new C43520a(fragment, ((Boolean) c43624bJ.f413649k.a().invoke()).booleanValue(), strOrdersOpenParams.f288839c);
    }
}
