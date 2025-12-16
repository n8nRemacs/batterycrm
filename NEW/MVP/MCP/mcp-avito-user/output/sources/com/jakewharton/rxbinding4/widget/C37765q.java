package com.jakewharton.rxbinding4.widget;

import android.widget.CompoundButton;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: CompoundButtonCheckedChangeObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/q;", "Lcom/jakewharton/rxbinding4/a;", "", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.widget.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37765q extends com.jakewharton.rxbinding4.a<Boolean> {

    /* compiled from: CompoundButtonCheckedChangeObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/q$a;", "Lh41/a;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.jakewharton.rxbinding4.widget.q$a */
    public static final class a extends AbstractC40770a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super Boolean> f364236c;

        public a(@Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364236c = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(@Y61.k CompoundButton compoundButton, boolean z12) {
            if (this.f396996b.get()) {
                return;
            }
            this.f364236c.onNext(Boolean.valueOf(z12));
        }
    }

    @Override // com.jakewharton.rxbinding4.a
    public final Boolean M0() {
        throw null;
    }

    @Override // com.jakewharton.rxbinding4.a
    public final void O0(@Y61.k io.reactivex.rxjava3.core.G<? super Boolean> g12) {
        if (Z01.b.a(g12)) {
            g12.b(new a(g12));
            throw null;
        }
    }
}
