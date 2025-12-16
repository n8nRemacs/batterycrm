package com.jakewharton.rxbinding4.widget;

import android.widget.RatingBar;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: RatingBarRatingChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/v;", "Lcom/jakewharton/rxbinding4/a;", "Lcom/jakewharton/rxbinding4/widget/u;", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.widget.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37769v extends com.jakewharton.rxbinding4.a<C37768u> {

    /* compiled from: RatingBarRatingChangeEventObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/v$a;", "Lh41/a;", "Landroid/widget/RatingBar$OnRatingBarChangeListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.jakewharton.rxbinding4.widget.v$a */
    public static final class a extends AbstractC40770a implements RatingBar.OnRatingBarChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super C37768u> f364249c;

        public a(@Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364249c = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public final void onRatingChanged(@Y61.k RatingBar ratingBar, float f12, boolean z12) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364249c.onNext(new C37768u(ratingBar, f12, z12));
        }
    }

    @Override // com.jakewharton.rxbinding4.a
    public final C37768u M0() {
        throw null;
    }

    @Override // com.jakewharton.rxbinding4.a
    public final void O0(@Y61.k io.reactivex.rxjava3.core.G<? super C37768u> g12) {
        if (Z01.b.a(g12)) {
            new a(g12);
            throw null;
        }
    }
}
