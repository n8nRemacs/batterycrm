package com.avito.beduin.v2.component.box.android_view;

import ET0.l;
import Y61.k;
import android.view.ViewGroup;
import com.avito.beduin.v2.render.android_view.A;
import kotlin.Metadata;

/* compiled from: BoxComponent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/box/android_view/c;", "Lcom/avito/beduin/v2/component/box/android_view/a;", "Lcom/avito/beduin/v2/component/box/state/b;", "Lcom/avito/beduin/v2/component/box/android_view/f;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends a<com.avito.beduin.v2.component.box.state.b, f> {

    /* renamed from: p, reason: collision with root package name */
    @k
    public final A f335552p;

    public c(@k A a12) {
        super(a12);
        this.f335552p = a12;
    }

    @Override // com.avito.beduin.v2.component.box.android_view.a
    public final /* bridge */ /* synthetic */ void v(f fVar, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.component.box.state.a aVar) {
    }

    @Override // com.avito.beduin.v2.component.box.android_view.a
    @k
    public final f w(@k ViewGroup viewGroup) {
        f fVar = new f(viewGroup.getContext(), null, 0, 0, 14, null);
        if (this.f335552p.f337909e.f57087a) {
            l.a(fVar);
        }
        return fVar;
    }
}
