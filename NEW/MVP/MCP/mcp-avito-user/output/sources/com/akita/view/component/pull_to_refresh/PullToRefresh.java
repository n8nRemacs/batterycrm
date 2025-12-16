package com.akita.view.component.pull_to_refresh;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.akita.view.component.pull_to_refresh.b;
import com.akita.view.component.pull_to_refresh.i;
import i3.C41216a;
import k3.C42483a;
import k3.InterfaceC42485c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PullToRefresh.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u00020\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/akita/view/component/pull_to_refresh/PullToRefresh;", "Lcom/akita/view/component/pull_to_refresh/b;", "Lk3/c;", "Lcom/akita/view/component/pull_to_refresh/state/a;", "Li3/a;", "Lcom/akita/view/component/pull_to_refresh/b$c;", "", "enabled", "Lkotlin/G0;", "setScrollWhileRefreshing", "(Z)V", "newStyle", "setStyle", "(Li3/a;)V", "newState", "setState", "(Lcom/akita/view/component/pull_to_refresh/state/a;)V", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PullToRefresh extends b implements InterfaceC42485c<com.akita.view.component.pull_to_refresh.state.a, C41216a>, b.c {

    /* renamed from: T, reason: collision with root package name */
    @k
    public com.akita.view.component.pull_to_refresh.state.a f66937T;

    /* renamed from: U, reason: collision with root package name */
    @l
    public C41216a f66938U;

    @X41.j
    public PullToRefresh(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void setScrollWhileRefreshing(boolean enabled) {
        setState(com.akita.view.component.pull_to_refresh.state.a.a(this.f66937T, !enabled, 5));
    }

    @Override // com.akita.view.component.pull_to_refresh.b.c
    public final void j0() {
        com.akita.view.component.pull_to_refresh.state.a aVarA = com.akita.view.component.pull_to_refresh.state.a.a(this.f66937T, false, 6);
        this.f66937T = aVarA;
        aVarA.f66993c.invoke();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PullToRefresh(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12, i13);
        this.f66937T = new com.akita.view.component.pull_to_refresh.state.a(false, false, null, 7, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.c.f66989a, i12, i13);
        C41216a.C11365a c11365a = C41216a.f398349d;
        getContext();
        c11365a.getClass();
        setStyle(new C41216a(typedArrayObtainStyledAttributes.getColor(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0)));
        com.akita.view.component.pull_to_refresh.state.a aVarA = com.akita.view.component.pull_to_refresh.state.a.a(this.f66937T, typedArrayObtainStyledAttributes.getBoolean(0, false), 5);
        this.f66937T = aVarA;
        setScrollWhileRefreshing(true ^ aVarA.f66992b);
        typedArrayObtainStyledAttributes.recycle();
        setOnRefreshListener(this);
    }

    public void setState(@k com.akita.view.component.pull_to_refresh.state.a newState) {
        com.akita.view.component.pull_to_refresh.state.a aVar = this.f66937T;
        if (aVar == null) {
            aVar = null;
        }
        if (new C42483a(newState, aVar).f406029c) {
            return;
        }
        this.f66937T = newState;
        Boolean boolValueOf = Boolean.valueOf(newState.f66991a);
        if (!new C42483a(boolValueOf, aVar != null ? Boolean.valueOf(aVar.f66991a) : null).f406029c) {
            setIsRefreshing(boolValueOf.booleanValue());
        }
        Boolean boolValueOf2 = Boolean.valueOf(newState.f66992b);
        if (new C42483a(boolValueOf2, aVar != null ? Boolean.valueOf(aVar.f66992b) : null).f406029c) {
            return;
        }
        setDisableScrollWhileRefreshing(boolValueOf2.booleanValue());
    }

    public void setStyle(@k C41216a newStyle) {
        C41216a c41216a = this.f66938U;
        if (new C42483a(newStyle, c41216a).f406029c) {
            return;
        }
        this.f66938U = newStyle;
        int i12 = newStyle.f398350a;
        if (!L.f(Integer.valueOf(i12), c41216a != null ? Integer.valueOf(c41216a.f398350a) : null)) {
            setSpinnerDrawableColor(i12);
        }
        int i13 = newStyle.f398351b;
        if (!L.f(Integer.valueOf(i13), c41216a != null ? Integer.valueOf(c41216a.f398351b) : null)) {
            setSize(i13);
        }
        int i14 = newStyle.f398352c;
        if (L.f(Integer.valueOf(i14), c41216a != null ? Integer.valueOf(c41216a.f398352c) : null)) {
            return;
        }
        setThickness(i14);
    }
}
