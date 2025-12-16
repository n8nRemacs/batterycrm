package com.jakewharton.rxbinding4.view;

import android.view.MenuItem;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: MenuItemActionViewEventObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/view/c;", "Lio/reactivex/rxjava3/core/z;", "Lcom/jakewharton/rxbinding4/view/b;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.view.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37716c extends io.reactivex.rxjava3.core.z<AbstractC37715b> {

    /* compiled from: MenuItemActionViewEventObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/view/c$a;", "Lh41/a;", "Landroid/view/MenuItem$OnActionExpandListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.jakewharton.rxbinding4.view.c$a */
    public static final class a extends AbstractC40770a implements MenuItem.OnActionExpandListener {

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super AbstractC37715b> f364176c;

        public a(@Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364176c = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        public final boolean o(AbstractC37715b abstractC37715b) {
            if (this.f396996b.get()) {
                return false;
            }
            try {
                throw null;
            } catch (Exception e12) {
                this.f364176c.onError(e12);
                dispose();
                return false;
            }
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(@Y61.k MenuItem menuItem) {
            o(new C37714a(menuItem));
            return false;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(@Y61.k MenuItem menuItem) {
            o(new C37717d(menuItem));
            return false;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k io.reactivex.rxjava3.core.G<? super AbstractC37715b> g12) {
        if (Z01.b.a(g12)) {
            g12.b(new a(g12));
            throw null;
        }
    }
}
