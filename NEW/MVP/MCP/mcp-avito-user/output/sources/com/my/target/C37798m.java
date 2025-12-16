package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import com.my.target.C37802o;
import e11.C39875i0;
import e11.C39877j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.my.target.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37798m {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final C37788h f364920a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final D f364921b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final Object f364922c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final String f364923d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final com.avito.android.user_adverts.root_screen.adverts_host.host_view.g f364924e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public WeakReference<C39875i0> f364925f;

    /* renamed from: com.my.target.m$a */
    public interface a {
        void a(@j.N Context context);
    }

    public C37798m(@j.P C37788h c37788h, @j.P h11.d dVar, @j.P C37802o.a aVar) {
        this.f364920a = c37788h;
        this.f364922c = aVar;
        D d12 = null;
        if (c37788h == null) {
            this.f364921b = null;
            this.f364924e = null;
            this.f364923d = null;
            return;
        }
        ArrayList arrayList = c37788h.f364853c;
        if (arrayList != null && !arrayList.isEmpty()) {
            d12 = new D(arrayList, dVar == null ? new C39877j() : dVar);
        }
        this.f364921b = d12;
        this.f364923d = c37788h.f364852b;
        this.f364924e = new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(this, 28);
    }

    public final void a() {
        D d12 = this.f364921b;
        if (d12 != null) {
            d12.f364362e = null;
        }
        WeakReference<C39875i0> weakReference = this.f364925f;
        C39875i0 c39875i0 = weakReference != null ? weakReference.get() : null;
        if (c39875i0 == null) {
            return;
        }
        C37788h c37788h = this.f364920a;
        if (c37788h != null) {
            C37802o.b(c37788h.f364851a, c39875i0);
        }
        c39875i0.setImageBitmap(null);
        c39875i0.setImageDrawable(null);
        c39875i0.setVisibility(8);
        c39875i0.setOnClickListener(null);
        this.f364925f.clear();
        this.f364925f = null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.my.target.o$a, java.lang.Object] */
    public final void b(@j.N C39875i0 c39875i0, @j.N a aVar) {
        C37788h c37788h = this.f364920a;
        if (c37788h == null) {
            c39875i0.setImageBitmap(null);
            c39875i0.setImageDrawable(null);
            c39875i0.setVisibility(8);
            c39875i0.setOnClickListener(null);
            return;
        }
        D d12 = this.f364921b;
        if (d12 != null) {
            d12.f364362e = aVar;
        }
        this.f364925f = new WeakReference<>(c39875i0);
        c39875i0.setVisibility(0);
        c39875i0.setOnClickListener(this.f364924e);
        if (c39875i0.f394905b == null && c39875i0.f394906c == null) {
            com.my.target.common.models.b bVar = c37788h.f364851a;
            Bitmap bitmapA = bVar.a();
            if (bitmapA != null) {
                c39875i0.setImageBitmap(bitmapA);
            } else {
                C37802o.c(bVar, c39875i0, this.f364922c);
            }
        }
    }
}
