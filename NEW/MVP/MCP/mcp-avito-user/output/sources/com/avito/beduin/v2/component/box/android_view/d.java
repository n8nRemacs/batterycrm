package com.avito.beduin.v2.component.box.android_view;

import Y61.k;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;

/* compiled from: BoxComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/box/android_view/d;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/component/box/state/b;", "<init>", "()V", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends n<com.avito.beduin.v2.component.box.state.b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final d f335553c = new d();

    public d() {
        super(com.avito.beduin.v2.component.box.state.f.f335586c);
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @k
    public final InterfaceC36343m b(@k A a12) {
        return new c(a12);
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @k
    /* renamed from: k */
    public final String getF73359f() {
        return "Box";
    }
}
