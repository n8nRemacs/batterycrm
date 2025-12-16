package com.avito.android.lib.deprecated_design.tab;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import hw.InterfaceC41179d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TabView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/o;", "Lcom/avito/android/lib/deprecated_design/tab/m;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f178163a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f178164b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f178165c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f178166d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f178167e;

    /* compiled from: TabView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Integer, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            D6.f(o.this.f178163a, num.intValue(), 0, 0, 0, 14);
            return G0.f406611a;
        }
    }

    /* compiled from: TabView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Integer, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            D6.f(o.this.f178163a, 0, 0, num.intValue(), 0, 11);
            return G0.f406611a;
        }
    }

    public o(@Y61.k View view) {
        this.f178163a = view;
        View viewFindViewById = view.findViewById(R.id.tab_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f178164b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tab_counter);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f178165c = (TextView) viewFindViewById2;
        this.f178166d = new LinkedHashSet();
        this.f178167e = true;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.m
    public final void a(@Y61.k String str, @Y61.l String str2) {
        I5.a(this.f178164b, str, false);
        I5.a(this.f178165c, str2, false);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    public final void b(int i12, int i13, boolean z12) {
        LinkedHashSet linkedHashSet = this.f178166d;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).cancel();
        }
        linkedHashSet.clear();
        View view = this.f178163a;
        int iD2 = (z12 && i12 == 0) ? com.avito.android.actions_sheet.a.d(view, R.dimen.standard_padding) : 0;
        int iD3 = (z12 && i12 == i13 + (-1)) ? com.avito.android.actions_sheet.a.d(view, R.dimen.standard_padding) : 0;
        ValueAnimator valueAnimatorC = c(view.getPaddingLeft(), iD2, new a());
        if (valueAnimatorC != null) {
            linkedHashSet.add(valueAnimatorC);
        }
        ValueAnimator valueAnimatorC2 = c(view.getPaddingRight(), iD3, new b());
        if (valueAnimatorC2 != null) {
            linkedHashSet.add(valueAnimatorC2);
        }
        this.f178167e = false;
    }

    public final ValueAnimator c(int i12, int i13, Y41.l lVar) {
        if (this.f178167e) {
            lVar.invoke(Integer.valueOf(i13));
            return null;
        }
        if (i12 == i13) {
            return null;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i12, i13);
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.addUpdateListener(new n(0, lVar));
        valueAnimatorOfInt.start();
        return valueAnimatorOfInt;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    @Y61.k
    /* renamed from: getView, reason: from getter */
    public final View getF178163a() {
        return this.f178163a;
    }
}
