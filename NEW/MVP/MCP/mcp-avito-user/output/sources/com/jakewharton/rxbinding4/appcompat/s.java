package com.jakewharton.rxbinding4.appcompat;

import androidx.appcompat.widget.SearchView;
import h41.AbstractC40770a;
import io.reactivex.rxjava3.core.G;
import kotlin.Metadata;

/* compiled from: SearchViewQueryTextChangesObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/appcompat/s;", "Lcom/jakewharton/rxbinding4/a;", "", "a", "rxbinding-appcompat_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
final class s extends com.jakewharton.rxbinding4.a<CharSequence> {

    /* compiled from: SearchViewQueryTextChangesObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/appcompat/s$a;", "Lh41/a;", "Landroidx/appcompat/widget/SearchView$k;", "rxbinding-appcompat_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends AbstractC40770a implements SearchView.k {

        /* renamed from: c, reason: collision with root package name */
        public final G<? super CharSequence> f364100c;

        public a(@Y61.k G g12) {
            this.f364100c = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // androidx.appcompat.widget.SearchView.k
        public final boolean onQueryTextChange(@Y61.k String str) {
            if (this.f396996b.get()) {
                return false;
            }
            this.f364100c.onNext(str);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.k
        public final boolean onQueryTextSubmit(@Y61.k String str) {
            return false;
        }
    }

    @Override // com.jakewharton.rxbinding4.a
    public final CharSequence M0() {
        throw null;
    }

    @Override // com.jakewharton.rxbinding4.a
    public final void O0(@Y61.k G<? super CharSequence> g12) {
        if (Z01.b.a(g12)) {
            g12.b(new a(g12));
            throw null;
        }
    }
}
