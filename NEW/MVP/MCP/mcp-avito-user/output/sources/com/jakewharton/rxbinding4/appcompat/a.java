package com.jakewharton.rxbinding4.appcompat;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import h41.AbstractC40770a;
import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: ActionMenuViewItemClickObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/appcompat/a;", "Lio/reactivex/rxjava3/core/z;", "Landroid/view/MenuItem;", "a", "rxbinding-appcompat_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class a extends z<MenuItem> {

    /* compiled from: ActionMenuViewItemClickObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/appcompat/a$a;", "Lh41/a;", "Landroidx/appcompat/widget/ActionMenuView$e;", "rxbinding-appcompat_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.jakewharton.rxbinding4.appcompat.a$a, reason: collision with other inner class name */
    public static final class C10770a extends AbstractC40770a implements ActionMenuView.e {

        /* renamed from: c, reason: collision with root package name */
        public final G<? super MenuItem> f364096c;

        public C10770a(@Y61.k G g12) {
            this.f364096c = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public final boolean onMenuItemClick(@Y61.k MenuItem menuItem) {
            if (this.f396996b.get()) {
                return true;
            }
            this.f364096c.onNext(menuItem);
            return true;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@Y61.k G<? super MenuItem> g12) {
        if (Z01.b.a(g12)) {
            g12.b(new C10770a(g12));
            throw null;
        }
    }
}
