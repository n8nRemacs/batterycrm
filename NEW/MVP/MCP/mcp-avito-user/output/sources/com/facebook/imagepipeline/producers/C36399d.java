package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: BaseProducerContext.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C36399d implements k0 {

    /* renamed from: n, reason: collision with root package name */
    public static final com.facebook.common.internal.l f340653n;

    /* renamed from: a, reason: collision with root package name */
    public final ImageRequest f340654a;

    /* renamed from: b, reason: collision with root package name */
    public final String f340655b;

    /* renamed from: c, reason: collision with root package name */
    @I41.h
    public final String f340656c;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f340657d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f340658e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageRequest.RequestLevel f340659f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f340660g;

    /* renamed from: h, reason: collision with root package name */
    @J41.a
    public boolean f340661h;

    /* renamed from: i, reason: collision with root package name */
    @J41.a
    public Priority f340662i;

    /* renamed from: j, reason: collision with root package name */
    @J41.a
    public boolean f340663j;

    /* renamed from: k, reason: collision with root package name */
    @J41.a
    public boolean f340664k;

    /* renamed from: l, reason: collision with root package name */
    @J41.a
    public final ArrayList f340665l;

    /* renamed from: m, reason: collision with root package name */
    public final com.facebook.imagepipeline.core.s f340666m;

    static {
        int i12 = com.facebook.common.internal.l.f339820b;
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, "id", "uri_source");
        f340653n = new com.facebook.common.internal.l(hashSet);
    }

    public C36399d(ImageRequest imageRequest, String str, @I41.h String str2, m0 m0Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z12, boolean z13, Priority priority, com.facebook.imagepipeline.core.s sVar) {
        this.f340654a = imageRequest;
        this.f340655b = str;
        HashMap map = new HashMap();
        this.f340660g = map;
        map.put("id", str);
        map.put("uri_source", imageRequest == null ? "null-request" : imageRequest.f340782b);
        this.f340656c = str2;
        this.f340657d = m0Var;
        this.f340658e = obj;
        this.f340659f = requestLevel;
        this.f340661h = z12;
        this.f340662i = priority;
        this.f340663j = z13;
        this.f340664k = false;
        this.f340665l = new ArrayList();
        this.f340666m = sVar;
    }

    public static void o(@I41.h ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l0) it.next()).a();
        }
    }

    public static void p(@I41.h ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l0) it.next()).d();
        }
    }

    public static void q(@I41.h ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l0) it.next()).b();
        }
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final Object a() {
        return this.f340658e;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final void b(C36401e c36401e) {
        boolean z12;
        synchronized (this) {
            this.f340665l.add(c36401e);
            z12 = this.f340664k;
        }
        if (z12) {
            c36401e.c();
        }
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final com.facebook.imagepipeline.core.s c() {
        return this.f340666m;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final void d(@I41.h Map<String, ?> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            e(entry.getValue(), entry.getKey());
        }
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final void e(@I41.h Object obj, String str) {
        if (f340653n.contains(str)) {
            return;
        }
        this.f340660g.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.k0
    @I41.h
    public final Object f() {
        return this.f340660g.get("origin");
    }

    @Override // com.facebook.imagepipeline.producers.k0
    @I41.h
    public final String g() {
        return this.f340656c;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final HashMap getExtras() {
        return this.f340660g;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final String getId() {
        return this.f340655b;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final synchronized Priority getPriority() {
        return this.f340662i;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final synchronized boolean h() {
        return this.f340663j;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final m0 i() {
        return this.f340657d;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final ImageRequest j() {
        return this.f340654a;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final void k(@I41.h String str, @I41.h String str2) {
        HashMap map = this.f340660g;
        map.put("origin", str);
        map.put("origin_sub", str2);
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final void l(@I41.h String str) {
        k(str, "default");
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final synchronized boolean m() {
        return this.f340661h;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    public final ImageRequest.RequestLevel n() {
        return this.f340659f;
    }

    public final void r() {
        ArrayList arrayList;
        synchronized (this) {
            if (this.f340664k) {
                arrayList = null;
            } else {
                this.f340664k = true;
                arrayList = new ArrayList(this.f340665l);
            }
        }
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l0) it.next()).c();
        }
    }
}
