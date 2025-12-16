package com.avito.android.permissions;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;

/* compiled from: LocationPermissionDialogPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/permissions/d;", "", "b", "c", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.permissions.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC33034d {

    /* compiled from: LocationPermissionDialogPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.permissions.d$a */
    public static final class a {
    }

    /* compiled from: LocationPermissionDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/permissions/d$b;", "", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.permissions.d$b */
    public interface b {
        void F0();
    }

    /* compiled from: LocationPermissionDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/permissions/d$c;", "", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.permissions.d$c */
    public interface c {

        /* compiled from: LocationPermissionDialogPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.permissions.d$c$a */
        public static final class a {
        }

        void N0();

        void d(@Y61.l String str);

        void g1();
    }

    void a();

    boolean b();

    @Y61.k
    io.reactivex.rxjava3.core.I<Boolean> c();

    @Y61.k
    io.reactivex.rxjava3.internal.observers.y d();

    void e(@Y61.k View view);

    void e0();

    void f(@Y61.l b bVar, @Y61.l c cVar, @Y61.l Fragment fragment);

    @Y61.k
    io.reactivex.rxjava3.internal.observers.y g();

    @Y61.k
    io.reactivex.rxjava3.disposables.c h();

    boolean i();

    @Y61.k
    io.reactivex.rxjava3.core.I<Boolean> j();
}
