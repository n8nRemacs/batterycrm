package com.jakewharton.rxbinding4.widget;

import android.widget.RadioGroup;
import h41.AbstractC40770a;
import kotlin.Metadata;

/* compiled from: RadioGroupCheckedChangeObservable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/t;", "Lcom/jakewharton/rxbinding4/a;", "", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.widget.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37767t extends com.jakewharton.rxbinding4.a<Integer> {

    /* compiled from: RadioGroupCheckedChangeObservable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/t$a;", "Lh41/a;", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.jakewharton.rxbinding4.widget.t$a */
    public static final class a extends AbstractC40770a implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public int f364242c = -1;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super Integer> f364243d;

        public a(@Y61.k io.reactivex.rxjava3.core.G g12) {
            this.f364243d = g12;
        }

        @Override // h41.AbstractC40770a
        public final void n() {
            throw null;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public final void onCheckedChanged(@Y61.k RadioGroup radioGroup, int i12) {
            if (this.f396996b.get() || i12 == this.f364242c) {
                return;
            }
            this.f364242c = i12;
            this.f364243d.onNext(Integer.valueOf(i12));
        }
    }

    @Override // com.jakewharton.rxbinding4.a
    public final Integer M0() {
        throw null;
    }

    @Override // com.jakewharton.rxbinding4.a
    public final void O0(@Y61.k io.reactivex.rxjava3.core.G<? super Integer> g12) {
        if (Z01.b.a(g12)) {
            new a(g12);
            throw null;
        }
    }
}
