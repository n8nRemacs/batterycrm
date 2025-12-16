package com.avito.beduin.v2.render.android_view;

import bU0.C25567b;
import com.avito.beduin.v2.engine.exception.RendererBeduinException;
import kotlin.Metadata;

/* compiled from: RendererContext.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/A;", "", "a", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H f337905a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.component.B f337906b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C36336f f337907c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final aU0.b f337908d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C25567b f337909e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final YT0.a f337910f;

    /* compiled from: RendererContext.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/A$a;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    public A(@Y61.k H h12, @Y61.k com.avito.beduin.v2.engine.component.B b12, @Y61.k C36336f c36336f, @Y61.l aU0.b bVar, @Y61.k C25567b c25567b, @Y61.k YT0.a aVar) {
        this.f337905a = h12;
        this.f337906b = b12;
        this.f337907c = c36336f;
        this.f337908d = bVar;
        this.f337909e = c25567b;
        this.f337910f = aVar;
    }

    @Y61.k
    public final n<?> a(@Y61.k String str) throws RendererBeduinException.UnregisteredComponentException {
        com.avito.beduin.v2.engine.component.y yVar = this.f337906b.get(str);
        H h12 = this.f337905a;
        if (yVar != null) {
            return h12.f337922b;
        }
        n<?> nVar = h12.f337921a.get(str);
        if (nVar != null) {
            return nVar;
        }
        RendererBeduinException.UnregisteredComponentException unregisteredComponentException = new RendererBeduinException.UnregisteredComponentException(str);
        com.avito.beduin.v2.engine.utils.e.b(unregisteredComponentException, "RendererContext", null);
        aU0.b bVar = this.f337908d;
        if (bVar != null) {
            bVar.a(unregisteredComponentException, com.avito.beduin.v2.engine.utils.f.a());
        }
        n<?> nVar2 = h12.f337921a.get("UnregisteredComponent");
        if (nVar2 != null) {
            return nVar2;
        }
        throw unregisteredComponentException;
    }
}
