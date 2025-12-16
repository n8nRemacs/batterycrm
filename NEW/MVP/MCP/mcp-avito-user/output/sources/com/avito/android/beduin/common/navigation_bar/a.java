package com.avito.android.beduin.common.navigation_bar;

import android.view.View;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f103431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f103432c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f103433d;

    public a(View view, int i12, b bVar) {
        this.f103431b = view;
        this.f103432c = i12;
        this.f103433d = bVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        view.removeOnLayoutChangeListener(this);
        int i22 = this.f103433d.f103434k;
        View view2 = this.f103431b;
        D6.c(view2, null, Integer.valueOf(((i22 - view2.getHeight()) / 2) + this.f103432c), null, null, 13);
    }
}
