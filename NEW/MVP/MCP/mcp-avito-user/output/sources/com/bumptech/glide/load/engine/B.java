package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.model.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* compiled from: SourceGenerator.java */
/* loaded from: classes5.dex */
class B implements h, h.a {

    /* renamed from: b, reason: collision with root package name */
    public final i<?> f338895b;

    /* renamed from: c, reason: collision with root package name */
    public final h.a f338896c;

    /* renamed from: d, reason: collision with root package name */
    public int f338897d;

    /* renamed from: e, reason: collision with root package name */
    public e f338898e;

    /* renamed from: f, reason: collision with root package name */
    public Object f338899f;

    /* renamed from: g, reason: collision with root package name */
    public volatile n.a<?> f338900g;

    /* renamed from: h, reason: collision with root package name */
    public f f338901h;

    public B(i<?> iVar, h.a aVar) {
        this.f338895b = iVar;
        this.f338896c = aVar;
    }

    @Override // com.bumptech.glide.load.engine.h
    public final boolean a() {
        Object obj = this.f338899f;
        if (obj != null) {
            this.f338899f = null;
            int i12 = com.bumptech.glide.util.g.f339641a;
            SystemClock.elapsedRealtimeNanos();
            try {
                Registry registry = this.f338895b.f339015c.f338742b;
                registry.getClass();
                com.bumptech.glide.load.a aVarB = registry.f338671b.b(obj.getClass());
                if (aVarB == null) {
                    throw new Registry.NoSourceEncoderAvailableException(androidx.compose.ui.graphics.colorspace.e.k(obj.getClass(), "Failed to find source encoder for data class: "));
                }
                g gVar = new g(aVarB, obj, this.f338895b.f339021i);
                com.bumptech.glide.load.h hVar = this.f338900g.f339240a;
                i<?> iVar = this.f338895b;
                this.f338901h = new f(hVar, iVar.f339026n);
                iVar.f339020h.a().a(this.f338901h, gVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Objects.toString(this.f338901h);
                    obj.toString();
                    aVarB.toString();
                    SystemClock.elapsedRealtimeNanos();
                }
                this.f338900g.f339242c.b();
                this.f338898e = new e(Collections.singletonList(this.f338900g.f339240a), this.f338895b, this);
            } catch (Throwable th2) {
                this.f338900g.f339242c.b();
                throw th2;
            }
        }
        e eVar = this.f338898e;
        if (eVar != null && eVar.a()) {
            return true;
        }
        this.f338898e = null;
        this.f338900g = null;
        boolean z12 = false;
        while (!z12 && this.f338897d < this.f338895b.b().size()) {
            ArrayList arrayListB = this.f338895b.b();
            int i13 = this.f338897d;
            this.f338897d = i13 + 1;
            this.f338900g = (n.a) arrayListB.get(i13);
            if (this.f338900g != null && (this.f338895b.f339028p.c(this.f338900g.f339242c.d()) || this.f338895b.c(this.f338900g.f339242c.a()) != null)) {
                this.f338900g.f339242c.e(this.f338895b.f339027o, new A(this, this.f338900g));
                z12 = true;
            }
        }
        return z12;
    }

    @Override // com.bumptech.glide.load.engine.h.a
    public final void b(com.bumptech.glide.load.h hVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource) {
        ((j) this.f338896c).b(hVar, exc, dVar, this.f338900g.f339242c.d());
    }

    @Override // com.bumptech.glide.load.engine.h.a
    public final void c(com.bumptech.glide.load.h hVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, com.bumptech.glide.load.h hVar2) {
        this.f338896c.c(hVar, obj, dVar, this.f338900g.f339242c.d(), hVar);
    }

    @Override // com.bumptech.glide.load.engine.h
    public final void cancel() {
        n.a<?> aVar = this.f338900g;
        if (aVar != null) {
            aVar.f339242c.cancel();
        }
    }
}
