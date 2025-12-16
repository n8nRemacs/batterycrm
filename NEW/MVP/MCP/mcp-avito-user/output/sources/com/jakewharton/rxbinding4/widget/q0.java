package com.jakewharton.rxbinding4.widget;

import android.widget.SearchView;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: SearchViewQueryTextChangesObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/q0;", "Lcom/jakewharton/rxbinding4/a;", "", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class q0 extends com.jakewharton.rxbinding4.a<CharSequence> {

    /* compiled from: SearchViewQueryTextChangesObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/q0$a;", "Lh41/a;", "Landroid/widget/SearchView$OnQueryTextListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements SearchView.OnQueryTextListener {

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super CharSequence> f364237c;

        public a(@Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364237c = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public final boolean onQueryTextChange(@Y61.k String str) {
            if (this.f396996b.get()) {
                return false;
            }
            this.f364237c.onNext(str);
            return true;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public final boolean onQueryTextSubmit(@Y61.k String str) {
            return false;
        }
    }

    @Override // com.jakewharton.rxbinding4.a
    public final CharSequence M0() {
        throw null;
    }

    @Override // com.jakewharton.rxbinding4.a
    public final void O0(@Y61.k io.reactivex.rxjava3.core.G<? super CharSequence> g12) {
        if (Z01.b.a(g12)) {
            new a(g12);
            throw null;
        }
    }
}
