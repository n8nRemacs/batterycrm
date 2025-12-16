package org.mockito.internal.configuration.plugins;

import i81.InterfaceC41241a;
import i81.InterfaceC41242b;
import i81.InterfaceC41244d;
import i81.InterfaceC41245e;
import i81.InterfaceC41246f;
import i81.InterfaceC41247g;
import i81.InterfaceC41248h;
import i81.InterfaceC41250j;
import i81.InterfaceC41251k;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

/* compiled from: PluginRegistry.java */
/* loaded from: classes7.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC41250j f421507a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC41246f f421508b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC41245e f421509c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC41251k f421510d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC41244d f421511e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC41241a f421512f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC41248h f421513g;

    /* renamed from: h, reason: collision with root package name */
    public final List<InterfaceC41247g> f421514h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC41242b f421515i;

    public i() {
        List<InterfaceC41247g> listSingletonList;
        InterfaceC41250j interfaceC41250j = (InterfaceC41250j) new h(new b()).a(InterfaceC41250j.class);
        this.f421507a = interfaceC41250j;
        this.f421508b = (InterfaceC41246f) new h(interfaceC41250j, "mock-maker-inline", "mock-maker-proxy").a(InterfaceC41246f.class);
        this.f421509c = (InterfaceC41245e) new h(interfaceC41250j, "member-accessor-module").a(InterfaceC41245e.class);
        this.f421510d = (InterfaceC41251k) new h(interfaceC41250j).a(InterfaceC41251k.class);
        this.f421512f = (InterfaceC41241a) new h(interfaceC41250j).a(InterfaceC41241a.class);
        this.f421513g = (InterfaceC41248h) new h(interfaceC41250j).a(InterfaceC41248h.class);
        try {
            listSingletonList = new h(interfaceC41250j).f421506b.b();
        } catch (Throwable th2) {
            listSingletonList = Collections.singletonList(Proxy.newProxyInstance(InterfaceC41247g.class.getClassLoader(), new Class[]{InterfaceC41247g.class}, new g(th2)));
        }
        this.f421514h = listSingletonList;
        this.f421515i = (InterfaceC41242b) new h(this.f421507a).a(InterfaceC41242b.class);
        this.f421511e = (InterfaceC41244d) new h(this.f421507a).a(InterfaceC41244d.class);
    }
}
