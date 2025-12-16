package com.jakewharton.rxbinding4.view;

import android.view.MenuItem;
import h41.AbstractC40770a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MenuItemClickObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/view/e;", "Lio/reactivex/rxjava3/core/z;", "Lkotlin/G0;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.view.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37718e extends io.reactivex.rxjava3.core.z<G0> {

    /* renamed from: b, reason: collision with root package name */
    public final MenuItem f364179b;

    /* renamed from: c, reason: collision with root package name */
    public final Y41.l<MenuItem, Boolean> f364180c;

    /* compiled from: MenuItemClickObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/view/e$a;", "Lh41/a;", "Landroid/view/MenuItem$OnMenuItemClickListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.jakewharton.rxbinding4.view.e$a */
    public static final class a extends AbstractC40770a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public final MenuItem f364181c;

        /* renamed from: d, reason: collision with root package name */
        public final Y41.l<MenuItem, Boolean> f364182d;

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super G0> f364183e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k MenuItem menuItem, @Y61.k Y41.l<? super MenuItem, Boolean> lVar, @Y61.k io.reactivex.rxjava3.core.G<? super G0> g12) {
            this.f364181c = menuItem;
            this.f364182d = lVar;
            this.f364183e = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            this.f364181c.setOnMenuItemClickListener(null);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(@Y61.k MenuItem menuItem) {
            io.reactivex.rxjava3.core.G<? super G0> g12 = this.f364183e;
            if (this.f396996b.get()) {
                return false;
            }
            try {
                if (!this.f364182d.invoke(this.f364181c).booleanValue()) {
                    return false;
                }
                g12.onNext(G0.f406611a);
                return true;
            } catch (Exception e12) {
                g12.onError(e12);
                dispose();
                return false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37718e(@Y61.k MenuItem menuItem, @Y61.k Y41.l<? super MenuItem, Boolean> lVar) {
        this.f364179b = menuItem;
        this.f364180c = lVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k io.reactivex.rxjava3.core.G<? super G0> g12) {
        if (Z01.b.a(g12)) {
            MenuItem menuItem = this.f364179b;
            a aVar = new a(menuItem, this.f364180c, g12);
            g12.b(aVar);
            menuItem.setOnMenuItemClickListener(aVar);
        }
    }
}
