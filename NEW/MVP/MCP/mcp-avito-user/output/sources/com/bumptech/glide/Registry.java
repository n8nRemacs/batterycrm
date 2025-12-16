package com.bumptech.glide;

import androidx.core.util.y;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.model.p;
import j.N;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class Registry {

    /* renamed from: a, reason: collision with root package name */
    public final p f338670a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.provider.a f338671b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.provider.e f338672c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.provider.f f338673d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.f f338674e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.transcode.f f338675f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.provider.b f338676g;

    /* renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.provider.d f338677h = new com.bumptech.glide.provider.d();

    /* renamed from: i, reason: collision with root package name */
    public final com.bumptech.glide.provider.c f338678i = new com.bumptech.glide.provider.c();

    /* renamed from: j, reason: collision with root package name */
    public final y.a<List<Throwable>> f338679j;

    public static class MissingComponentException extends RuntimeException {
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException() {
            throw null;
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@N Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException() {
            throw null;
        }
    }

    public Registry() {
        y.a<List<Throwable>> aVarB = com.bumptech.glide.util.pool.a.b();
        this.f338679j = aVarB;
        this.f338670a = new p(aVarB);
        this.f338671b = new com.bumptech.glide.provider.a();
        com.bumptech.glide.provider.e eVar = new com.bumptech.glide.provider.e();
        this.f338672c = eVar;
        this.f338673d = new com.bumptech.glide.provider.f();
        this.f338674e = new com.bumptech.glide.load.data.f();
        this.f338675f = new com.bumptech.glide.load.resource.transcode.f();
        this.f338676g = new com.bumptech.glide.provider.b();
        List listAsList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.addAll(listAsList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (eVar) {
            try {
                ArrayList arrayList2 = new ArrayList(eVar.f339529a);
                eVar.f339529a.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    eVar.f339529a.add((String) it.next());
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (!arrayList.contains(str)) {
                        eVar.f339529a.add(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @N
    public final void a(@N l lVar, @N Class cls, @N Class cls2, @N String str) {
        this.f338672c.a(lVar, cls, cls2, str);
    }

    @N
    public final ArrayList b() {
        ArrayList arrayList;
        com.bumptech.glide.provider.b bVar = this.f338676g;
        synchronized (bVar) {
            arrayList = bVar.f339523a;
        }
        if (arrayList.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return arrayList;
    }

    @N
    public final void c(@N e.a aVar) {
        com.bumptech.glide.load.data.f fVar = this.f338674e;
        synchronized (fVar) {
            fVar.f338857a.put(aVar.a(), aVar);
        }
    }
}
