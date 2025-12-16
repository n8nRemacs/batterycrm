package com.avito.beduin.v2.render.android_view;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.beduin.v2.render.android_view.s;
import kotlin.Metadata;

/* compiled from: ContainerHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/l;", "Lcom/avito/beduin/v2/render/android_view/s$b;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.render.android_view.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36342l implements s.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f338001a;

    public C36342l(@Y61.k ViewGroup viewGroup) {
        this.f338001a = viewGroup;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.b
    @Y61.k
    public final View a(int i12) {
        return this.f338001a.getChildAt(i12);
    }

    @Override // com.avito.beduin.v2.render.android_view.s.b
    public final int b() {
        return this.f338001a.getChildCount();
    }

    @Override // com.avito.beduin.v2.render.android_view.s.b
    public final void c(int i12, int i13) {
        this.f338001a.removeViews(i12, i13);
    }

    @Override // com.avito.beduin.v2.render.android_view.s.b
    public final void d(@Y61.k View view, int i12, @Y61.k ViewGroup.LayoutParams layoutParams) {
        this.f338001a.addView(view, i12, layoutParams);
    }

    @Override // com.avito.beduin.v2.render.android_view.s.b
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final ViewGroup getF338001a() {
        return this.f338001a;
    }

    @Override // com.avito.beduin.v2.render.android_view.s.b
    @Y61.k
    public final Resources f() {
        return this.f338001a.getResources();
    }

    @Override // com.avito.beduin.v2.render.android_view.s.b
    public final void g(int i12) {
        this.f338001a.removeViewAt(i12);
    }
}
