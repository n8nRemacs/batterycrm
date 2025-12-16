package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.collection.C20199a;
import com.bumptech.glide.b;
import com.bumptech.glide.load.engine.m;
import com.bumptech.glide.request.target.l;
import j.B;
import j.N;
import j.P;
import j.k0;
import java.util.List;

/* compiled from: GlideContext.java */
/* loaded from: classes5.dex */
public class e extends ContextWrapper {

    /* renamed from: j, reason: collision with root package name */
    @k0
    public static final a f338740j = new a();

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.j f338741a;

    /* renamed from: b, reason: collision with root package name */
    public final Registry f338742b;

    /* renamed from: c, reason: collision with root package name */
    public final l f338743c;

    /* renamed from: d, reason: collision with root package name */
    public final b.a f338744d;

    /* renamed from: e, reason: collision with root package name */
    public final List<com.bumptech.glide.request.f<Object>> f338745e;

    /* renamed from: f, reason: collision with root package name */
    public final C20199a f338746f;

    /* renamed from: g, reason: collision with root package name */
    public final m f338747g;

    /* renamed from: h, reason: collision with root package name */
    public final int f338748h;

    /* renamed from: i, reason: collision with root package name */
    @B
    @P
    public com.bumptech.glide.request.g f338749i;

    public e(@N Context context, @N com.bumptech.glide.load.engine.bitmap_recycle.j jVar, @N Registry registry, @N l lVar, @N b.a aVar, @N C20199a c20199a, @N List list, @N m mVar, int i12) {
        super(context.getApplicationContext());
        this.f338741a = jVar;
        this.f338742b = registry;
        this.f338743c = lVar;
        this.f338744d = aVar;
        this.f338745e = list;
        this.f338746f = c20199a;
        this.f338747g = mVar;
        this.f338748h = i12;
    }
}
