package com.avito.android.bxcontent.beduin_v2.wrapper;

import com.avito.android.bxcontent.mvi.entity.C29126a;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BxWrapperComponentFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/c;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/android/bxcontent/beduin_v2/wrapper/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends com.avito.beduin.v2.render.android_view.n<a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC29127b, G0> f109563c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<com.avito.konveyor.a> f109564d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h f109565e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, C29126a.b> f109566f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ArrayList f109567g;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@Y61.k Y41.l<? super InterfaceC29127b, G0> lVar, @Y61.k Y41.a<com.avito.konveyor.a> aVar, @Y61.k h hVar, @Y61.k Y41.l<? super String, C29126a.b> lVar2, @Y61.k m mVar) {
        super(mVar);
        this.f109563c = lVar;
        this.f109564d = aVar;
        this.f109565e = hVar;
        this.f109566f = lVar2;
        this.f109567g = new ArrayList();
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @Y61.k
    public final InterfaceC36343m b(@Y61.k A a12) {
        a aVar = new a(this.f109563c, this.f109564d.invoke(), this.f109565e, this.f109566f);
        this.f109567g.add(aVar);
        return aVar;
    }
}
