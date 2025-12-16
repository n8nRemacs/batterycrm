package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import e11.C39902r1;
import e11.C39922y0;
import e11.m2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: com.my.target.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37802o {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public static final WeakHashMap<ImageView, com.my.target.common.models.b> f365040c = new WeakHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final ArrayList f365041a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public FX0.b f365042b;

    /* renamed from: com.my.target.o$a */
    public interface a {
        void a(boolean z12);
    }

    public C37802o(@j.N ArrayList arrayList) {
        this.f365041a = arrayList;
    }

    public static void a(@j.N Bitmap bitmap, @j.N ImageView imageView) {
        if (!(imageView instanceof C39922y0)) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        C39922y0 c39922y0 = (C39922y0) imageView;
        c39922y0.setAlpha(0.0f);
        c39922y0.setImageBitmap(bitmap);
        c39922y0.animate().alpha(1.0f).setDuration(300L);
    }

    @j.j0
    public static void b(@j.N com.my.target.common.models.b bVar, @j.N ImageView imageView) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        WeakHashMap<ImageView, com.my.target.common.models.b> weakHashMap = f365040c;
        if (weakHashMap.get(imageView) == bVar) {
            weakHashMap.remove(imageView);
        }
    }

    @j.j0
    public static void c(@j.N com.my.target.common.models.b bVar, @j.N ImageView imageView, @j.P a aVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        WeakHashMap<ImageView, com.my.target.common.models.b> weakHashMap = f365040c;
        if (weakHashMap.get(imageView) == bVar) {
            return;
        }
        weakHashMap.remove(imageView);
        if (bVar.a() != null) {
            a(bVar.a(), imageView);
            return;
        }
        weakHashMap.put(imageView, bVar);
        WeakReference weakReference = new WeakReference(imageView);
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        C37802o c37802o = new C37802o(arrayList);
        c37802o.f365042b = new FX0.b(weakReference, bVar, aVar, 17);
        Context context = imageView.getContext();
        if (!arrayList.isEmpty()) {
            m2.a(new com.vk.id.captcha.web.h(10, c37802o, context.getApplicationContext()));
        } else {
            if (c37802o.f365042b == null) {
                return;
            }
            m2.d(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(c37802o, 22));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, android.graphics.Bitmap, java.lang.Object] */
    @j.l0
    public final void d(@j.N Context context) {
        ?? r32;
        if (m2.b()) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        C39902r1 c39902r1 = new C39902r1(false);
        Iterator it = this.f365041a.iterator();
        while (it.hasNext()) {
            com.my.target.common.models.b bVar = (com.my.target.common.models.b) it.next();
            if (bVar.a() == null && (r32 = (Bitmap) c39902r1.b(bVar.f394304a, null, null, applicationContext)) != 0) {
                if (bVar.f364777e) {
                    com.my.target.common.models.b.f364776f.put(bVar, r32);
                } else {
                    bVar.f394307d = r32;
                }
                if (bVar.f394306c == 0 || bVar.f394305b == 0) {
                    bVar.f394306c = r32.getHeight();
                    bVar.f394305b = r32.getWidth();
                }
            }
        }
    }
}
