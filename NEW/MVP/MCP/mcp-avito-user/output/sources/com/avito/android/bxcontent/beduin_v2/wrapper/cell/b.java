package com.avito.android.bxcontent.beduin_v2.wrapper.cell;

import com.avito.android.di.B;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BxCellWrapperComponentFactory.kt */
@B
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/b;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends com.avito.beduin.v2.render.android_view.n<a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<com.avito.konveyor.a> f109577c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e f109578d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f109579e;

    @Inject
    public b(@Y61.k Y41.a<com.avito.konveyor.a> aVar, @Y61.k e eVar, @Y61.k j jVar) {
        super(jVar);
        this.f109577c = aVar;
        this.f109578d = eVar;
        this.f109579e = new ArrayList();
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @Y61.k
    public final InterfaceC36343m b(@Y61.k A a12) {
        a aVar = new a(this.f109577c.invoke(), this.f109578d);
        this.f109579e.add(aVar);
        return aVar;
    }
}
