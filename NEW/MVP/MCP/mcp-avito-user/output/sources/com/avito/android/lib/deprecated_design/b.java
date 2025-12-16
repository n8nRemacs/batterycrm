package com.avito.android.lib.deprecated_design;

import Y61.k;
import android.R;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import hw.InterfaceC41179d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CheckableLinearLayout.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/lib/deprecated_design/b;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/widget/Checkable;", "", BeduinCartItemModel.CHECKED_STRING, "Lkotlin/G0;", "setChecked", "(Z)V", "a", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class b extends LinearLayoutCompat implements Checkable {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final int[] f177806r;

    /* renamed from: q, reason: collision with root package name */
    public boolean f177807q;

    /* compiled from: CheckableLinearLayout.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/deprecated_design/b$a;", "", "<init>", "()V", "", "CHECKED_STATE_SET", "[I", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f177806r = new int[]{R.attr.state_checked};
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f177807q;
    }

    @Override // android.view.ViewGroup, android.view.View
    @k
    public final int[] onCreateDrawableState(int i12) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i12 + 1);
        if (this.f177807q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f177806r);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (checked != this.f177807q) {
            this.f177807q = checked;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f177807q);
    }
}
