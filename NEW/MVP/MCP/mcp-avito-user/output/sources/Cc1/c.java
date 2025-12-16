package Cc1;

import D31.g;
import d.C39442a;
import d.C39443b;
import d.C39444c;
import d.C39445d;
import d.C39446e;
import d.C39447f;
import d.C39448g;
import d.C39449h;
import d.C39450i;
import d.j;
import d.k;
import d.l;
import d.m;
import d.o;
import gc1.InterfaceC40658b;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import sberid.sdk.ui.models.root.ELKRootTypes;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C39447f f2356a;

    /* renamed from: b, reason: collision with root package name */
    public final j f2357b;

    /* renamed from: c, reason: collision with root package name */
    public final C39443b f2358c;

    /* renamed from: d, reason: collision with root package name */
    public final m f2359d;

    /* renamed from: e, reason: collision with root package name */
    public final l f2360e;

    /* renamed from: f, reason: collision with root package name */
    public final C39442a f2361f;

    /* renamed from: g, reason: collision with root package name */
    public final k f2362g;

    /* renamed from: h, reason: collision with root package name */
    public final o f2363h;

    public c(C39447f c39447f, j jVar, C39443b c39443b, m mVar, l lVar, C39442a c39442a, k kVar, o oVar) {
        this.f2356a = c39447f;
        this.f2357b = jVar;
        this.f2358c = c39443b;
        this.f2359d = mVar;
        this.f2360e = lVar;
        this.f2361f = c39442a;
        this.f2362g = kVar;
        this.f2363h = oVar;
    }

    public final void a(String str, InterfaceC40658b interfaceC40658b) {
        if (interfaceC40658b instanceof InterfaceC40658b.k) {
            C39447f c39447f = this.f2356a;
            ELKRootTypes eLKRootTypes = ((InterfaceC40658b.k) interfaceC40658b).f396578f;
            C39446e c39446e = new C39446e(c39447f, str, null);
            C39445d c39445d = new C39445d(c39447f, str, null);
            ConcurrentHashMap concurrentHashMap = c39447f.f393124d;
            String str2 = str == null ? "" : str;
            T t12 = (T) ((g) c39447f.f393121a).f2880a.getValue();
            Object obj = concurrentHashMap.get(str2);
            if (obj == null) {
                obj = null;
            }
            N0 n02 = (N0) obj;
            if (n02 != null) {
                n02.c(null);
            }
            concurrentHashMap.put(str2, C43259k.d(t12, null, null, new C39444c(c39445d, c39446e, null, c39447f, str, eLKRootTypes), 3));
            return;
        }
        if (str == null) {
            return;
        }
        j jVar = this.f2357b;
        C39450i c39450i = new C39450i(jVar, str, null);
        C39449h c39449h = new C39449h(jVar, str, null);
        ConcurrentHashMap concurrentHashMap2 = jVar.f393142e;
        T t13 = (T) ((g) jVar.f393138a).f2880a.getValue();
        Object obj2 = concurrentHashMap2.get(str);
        if (obj2 == null) {
            obj2 = null;
        }
        N0 n03 = (N0) obj2;
        if (n03 != null) {
            n03.c(null);
        }
        concurrentHashMap2.put(str, C43259k.d(t13, null, null, new C39448g(c39449h, c39450i, null, jVar, str, interfaceC40658b), 3));
    }
}
