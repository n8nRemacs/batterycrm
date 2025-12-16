package Cz0;

import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SharedViewModelModule_ProvideSharedViewModelFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<com.avito.android.str_seller_orders.strsellerordersdialog.shared.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C13377a f2818a;

    /* renamed from: b, reason: collision with root package name */
    public final l f2819b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.str_seller_orders.strsellerordersdialog.shared.b f2820c;

    public b(C13377a c13377a, l lVar, com.avito.android.str_seller_orders.strsellerordersdialog.shared.b bVar) {
        this.f2818a = c13377a;
        this.f2819b = lVar;
        this.f2820c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f2819b.f393949a;
        a.b.C8757a c8757a = (a.b.C8757a) this.f2820c.get();
        this.f2818a.getClass();
        return (com.avito.android.str_seller_orders.strsellerordersdialog.shared.a) new P0(t02, c8757a).a(com.avito.android.str_seller_orders.strsellerordersdialog.shared.a.class);
    }
}
