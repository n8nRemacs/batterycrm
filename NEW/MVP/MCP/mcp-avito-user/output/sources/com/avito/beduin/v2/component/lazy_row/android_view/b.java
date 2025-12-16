package com.avito.beduin.v2.component.lazy_row.android_view;

import Y61.k;
import com.avito.beduin.v2.component.lazy_row.state.j;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;

/* compiled from: LazyRowComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_row/android_view/b;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/component/lazy_row/state/a;", "<init>", "()V", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends n<com.avito.beduin.v2.component.lazy_row.state.a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f336032c;

    static {
        new b();
        f336032c = "LazyRow";
    }

    public b() {
        super(j.f336094c);
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @k
    public final InterfaceC36343m b(@k A a12) {
        return new LazyRowComponent(a12);
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @k
    /* renamed from: k */
    public final String getF429279e() {
        return f336032c;
    }
}
