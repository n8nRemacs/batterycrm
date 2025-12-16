package com.avito.android.permissions;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.util.SnackBarCallbackType;
import com.avito.android.util.ViewOnClickListenerC35977x5;
import javax.inject.Inject;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: LocationPermissionDialogPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/permissions/e;", "Lcom/avito/android/permissions/d;", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.permissions.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33035e implements InterfaceC33034d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f215114a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewOnClickListenerC35977x5 f215115b = new ViewOnClickListenerC35977x5();

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public InterfaceC33034d.b f215116c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public InterfaceC33034d.c f215117d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC42726C<com.avito.android.component.snackbar.d> f215118e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public View f215119f;

    /* compiled from: LocationPermissionDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.permissions.e$a */
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Boolean) obj).getClass();
            return io.reactivex.rxjava3.core.I.q(Boolean.valueOf(C33035e.this.f215114a.d()));
        }
    }

    @Inject
    public C33035e(@Y61.k q qVar) {
        this.f215114a = qVar;
    }

    @Override // com.avito.android.permissions.InterfaceC33034d
    public final void a() {
        this.f215116c = null;
        this.f215117d = null;
        this.f215114a.a();
    }

    @Override // com.avito.android.permissions.InterfaceC33034d
    public final boolean b() {
        return this.f215114a.b();
    }

    @Override // com.avito.android.permissions.InterfaceC33034d
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Boolean> c() {
        return this.f215114a.c();
    }

    @Override // com.avito.android.permissions.InterfaceC33034d
    @Y61.k
    public final io.reactivex.rxjava3.internal.observers.y d() {
        return (io.reactivex.rxjava3.internal.observers.y) io.reactivex.rxjava3.core.I.q(Boolean.valueOf(this.f215114a.d())).F().v0(new C33040j(this), C33041k.f215127b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.permissions.InterfaceC33034d
    public final void e(@Y61.k View view) {
        this.f215119f = view;
    }

    @Override // com.avito.android.permissions.InterfaceC33034d
    public final void e0() {
        this.f215119f = null;
    }

    @Override // com.avito.android.permissions.InterfaceC33034d
    public final void f(@Y61.l InterfaceC33034d.b bVar, @Y61.l InterfaceC33034d.c cVar, @Y61.l Fragment fragment) {
        this.f215116c = bVar;
        this.f215117d = cVar;
        if (fragment != null) {
            this.f215114a.g(fragment);
        }
    }

    @Override // com.avito.android.permissions.InterfaceC33034d
    @Y61.k
    public final io.reactivex.rxjava3.internal.observers.y g() {
        return (io.reactivex.rxjava3.internal.observers.y) j().F().v0(new C33038h(this), new C33039i(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.permissions.InterfaceC33034d
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c h() {
        io.reactivex.rxjava3.core.z<Boolean> zVarF = this.f215114a.c().F();
        l lVar = new l(this);
        m mVar = new m(this);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = zVarF.v0(lVar, mVar, interfaceC43543a);
        io.reactivex.rxjava3.subjects.e<SnackBarCallbackType> eVar = this.f215115b.f319127b;
        n nVar = new n(this);
        l41.g<? super Throwable> gVar = o.f215131b;
        eVar.getClass();
        return new io.reactivex.rxjava3.disposables.c(dVarV0, eVar.v0(nVar, gVar, interfaceC43543a));
    }

    @Override // com.avito.android.permissions.InterfaceC33034d
    public final boolean i() {
        return this.f215114a.getF215135c();
    }

    @Override // com.avito.android.permissions.InterfaceC33034d
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Boolean> j() {
        q qVar = this.f215114a;
        return qVar.d() ? io.reactivex.rxjava3.core.I.q(Boolean.TRUE) : qVar.e().n(new a());
    }
}
