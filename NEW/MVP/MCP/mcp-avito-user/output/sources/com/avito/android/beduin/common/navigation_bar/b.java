package com.avito.android.beduin.common.navigation_bar;

import Y61.k;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.adapter.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NavBarRightBeduinAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/navigation_bar/b;", "Lcom/avito/android/beduin/common/component/adapter/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends com.avito.android.beduin.common.component.adapter.a {

    /* renamed from: k, reason: collision with root package name */
    public int f103434k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f103435l;

    @Inject
    public b() {
        super(0);
        this.f103434k = -1;
        this.f103435l = true;
    }

    @Override // com.avito.android.beduin.common.component.adapter.a, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: r */
    public final void onBindViewHolder(@k a.C3019a c3019a, int i12) {
        if (!this.f103435l) {
            super.onBindViewHolder(c3019a, i12);
            return;
        }
        View view = c3019a.itemView;
        D6.c(view, null, 0, null, null, 13);
        super.onBindViewHolder(c3019a, i12);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i13 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        if (this.f103434k < 0) {
            this.f103434k = C35835l0.f(R.attr.actionBarSize, view.getContext());
        }
        view.addOnLayoutChangeListener(new a(view, i13, this));
    }

    @Override // com.avito.android.beduin.common.component.adapter.a, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: s */
    public final void onBindViewHolder(@k a.C3019a c3019a, int i12, @k List<Object> list) {
        if (!this.f103435l) {
            super.onBindViewHolder(c3019a, i12, list);
            return;
        }
        View view = c3019a.itemView;
        D6.c(view, null, 0, null, null, 13);
        super.onBindViewHolder(c3019a, i12, list);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i13 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        if (this.f103434k < 0) {
            this.f103434k = C35835l0.f(R.attr.actionBarSize, view.getContext());
        }
        view.addOnLayoutChangeListener(new a(view, i13, this));
    }

    @Override // com.avito.android.beduin.common.component.adapter.a
    public final int u() {
        return -2;
    }
}
