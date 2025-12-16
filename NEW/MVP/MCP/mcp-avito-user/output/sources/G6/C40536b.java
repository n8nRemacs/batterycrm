package g6;

import com.avito.android.advert.item.mortgage_calculator.c;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageCalculatorFilter_Factory.java */
@e
@y
@x
/* renamed from: g6.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C40536b implements h<C40535a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f396286a;

    public C40536b(Provider<c> provider) {
        this.f396286a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C40535a(this.f396286a.get());
    }
}
