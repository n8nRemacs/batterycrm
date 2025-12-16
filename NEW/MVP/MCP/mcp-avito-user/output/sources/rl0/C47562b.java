package rL0;

import com.avito.android.vas_discount.v2.mvi.f;
import com.avito.android.vas_discount.v2.mvi.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: VasDiscountV2ViewModel_Factory.java */
@e
@y
@x
/* renamed from: rL0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47562b implements h<C47561a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f429759a;

    public C47562b(g gVar) {
        this.f429759a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f429759a.get();
        i2.f411430a.getClass();
        return new C47561a(fVar, i2.a.f411433c);
    }
}
