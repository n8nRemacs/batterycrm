package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.yandex.mobile.ads.impl.b30;
import com.yandex.mobile.ads.impl.eb;
import com.yandex.mobile.ads.impl.i30;
import com.yandex.mobile.ads.impl.k30;
import com.yandex.mobile.ads.impl.mo0;
import com.yandex.mobile.ads.impl.nj0;
import com.yandex.mobile.ads.impl.q20;
import com.yandex.mobile.ads.impl.qj;
import com.yandex.mobile.ads.impl.rd0;
import com.yandex.mobile.ads.impl.w20;
import j.N;
import j.P;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final nj0 f392719a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final w20 f392720b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final q20 f392721c;

    /* renamed from: e, reason: collision with root package name */
    @N
    private final mo0 f392723e;

    /* renamed from: g, reason: collision with root package name */
    @N
    private final CopyOnWriteArraySet f392725g = new CopyOnWriteArraySet();

    /* renamed from: f, reason: collision with root package name */
    @N
    private final s f392724f = new s();

    /* renamed from: d, reason: collision with root package name */
    @N
    private final i30 f392722d = new i30();

    public class a implements k30 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.k30
        public final void a(@N Map<String, Bitmap> map) {
            r.this.f392723e.a();
            Iterator it = r.this.f392725g.iterator();
            while (it.hasNext()) {
                NativeAdImageLoadingListener nativeAdImageLoadingListener = (NativeAdImageLoadingListener) it.next();
                if (nativeAdImageLoadingListener != null) {
                    nativeAdImageLoadingListener.onFinishLoadingImages();
                }
            }
        }
    }

    public r(@N Context context, @N nj0 nj0Var, @N w20 w20Var, @N mo0 mo0Var) {
        this.f392719a = nj0Var;
        this.f392720b = w20Var;
        this.f392723e = mo0Var;
        this.f392721c = new q20(context);
    }

    @P
    public final String c() {
        return this.f392719a.d();
    }

    public final void d() {
        this.f392721c.a(this.f392722d.a(Collections.singletonList(this.f392719a)), new a());
    }

    @j.k0
    @P
    public static <T> T a(@P eb<T> ebVar) {
        if (ebVar != null) {
            return ebVar.d();
        }
        return null;
    }

    @P
    public final int b() {
        return this.f392719a.g();
    }

    public final void a(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f392725g.add(nativeAdImageLoadingListener);
    }

    public final void b(NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.f392725g.remove(nativeAdImageLoadingListener);
    }

    @N
    public final f a() {
        f fVar = new f();
        List<eb<?>> listB = this.f392719a.b();
        HashMap map = new HashMap();
        for (eb<?> ebVar : listB) {
            map.put(ebVar.b(), ebVar);
        }
        rd0 rd0Var = (rd0) a((eb) map.get("media"));
        fVar.a((String) a((eb) map.get("age")));
        fVar.b((String) a((eb) map.get("body")));
        fVar.a(a((eb) map.get("feedback")) != null);
        fVar.c((String) a((eb) map.get("call_to_action")));
        fVar.a((qj) a((eb) map.get("close_button")));
        fVar.d((String) a((eb) map.get("domain")));
        fVar.a((b30) a((eb) map.get("favicon")), this.f392720b);
        fVar.b((b30) a((eb) map.get("icon")), this.f392720b);
        b30 b30Var = null;
        List<b30> listA = rd0Var != null ? rd0Var.a() : null;
        if (listA != null && !listA.isEmpty()) {
            b30Var = listA.get(0);
        }
        fVar.c(b30Var, this.f392720b);
        fVar.a(this.f392724f.a(rd0Var));
        fVar.e((String) a((eb) map.get("price")));
        fVar.f((String) a((eb) map.get("rating")));
        fVar.g((String) a((eb) map.get("review_count")));
        fVar.h((String) a((eb) map.get("sponsored")));
        fVar.i((String) a((eb) map.get("title")));
        fVar.j((String) a((eb) map.get(ConstraintKt.WARNING)));
        return fVar;
    }
}
