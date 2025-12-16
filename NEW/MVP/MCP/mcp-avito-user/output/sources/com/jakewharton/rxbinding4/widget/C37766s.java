package com.jakewharton.rxbinding4.widget;

import android.view.MenuItem;
import android.widget.PopupMenu;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: PopupMenuItemClickObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/s;", "Lio/reactivex/rxjava3/core/z;", "Landroid/view/MenuItem;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.widget.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37766s extends io.reactivex.rxjava3.core.z<MenuItem> {

    /* compiled from: PopupMenuItemClickObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/s$a;", "Lh41/a;", "Landroid/widget/PopupMenu$OnMenuItemClickListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.jakewharton.rxbinding4.widget.s$a */
    public static final class a extends AbstractC40770a implements PopupMenu.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super MenuItem> f364241c;

        public a(@Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364241c = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public final boolean onMenuItemClick(@Y61.k MenuItem menuItem) {
            if (this.f396996b.get()) {
                return false;
            }
            this.f364241c.onNext(menuItem);
            return true;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k io.reactivex.rxjava3.core.G<? super MenuItem> g12) {
        if (Z01.b.a(g12)) {
            new a(g12);
            throw null;
        }
    }
}
