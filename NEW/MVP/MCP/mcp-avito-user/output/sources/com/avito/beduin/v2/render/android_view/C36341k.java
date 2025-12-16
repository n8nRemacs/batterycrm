package com.avito.beduin.v2.render.android_view;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.akita.view.component.pull_to_refresh.PullToRefresh;
import com.avito.beduin.v2.render.android_view.s;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContainerHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/k;", "Lcom/avito/beduin/v2/render/android_view/s$b;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.render.android_view.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36341k implements s.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PullToRefresh f337999a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public View f338000b;

    public C36341k(@Y61.k PullToRefresh pullToRefresh) {
        this.f337999a = pullToRefresh;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.b
    @Y61.k
    public final View a(int i12) {
        View view = this.f338000b;
        if (view != null) {
            return view;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.avito.beduin.v2.render.android_view.s.b
    public final int b() {
        return this.f338000b != null ? 1 : 0;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.b
    public final void c(int i12, int i13) {
        g(i12);
    }

    @Override // com.avito.beduin.v2.render.android_view.s.b
    public final void d(@Y61.k View view, int i12, @Y61.k ViewGroup.LayoutParams layoutParams) {
        View view2 = this.f338000b;
        PullToRefresh pullToRefresh = this.f337999a;
        if (view2 != null) {
            pullToRefresh.removeView(view2);
        }
        this.f338000b = view;
        pullToRefresh.addView(view, layoutParams);
    }

    @Override // com.avito.beduin.v2.render.android_view.s.b
    @Y61.k
    /* renamed from: e */
    public final ViewGroup getF338001a() {
        return this.f337999a;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.b
    @Y61.k
    public final Resources f() {
        return this.f337999a.getResources();
    }

    @Override // com.avito.beduin.v2.render.android_view.s.b
    public final void g(int i12) {
        View view = this.f338000b;
        if (view != null) {
            this.f337999a.removeView(view);
        }
        this.f338000b = null;
    }
}
