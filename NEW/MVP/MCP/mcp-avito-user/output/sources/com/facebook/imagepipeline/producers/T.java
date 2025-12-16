package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.producers.S;
import java.util.ArrayList;

/* compiled from: MultiplexProducer.java */
/* loaded from: classes15.dex */
class T extends C36401e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Pair f340609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S.b f340610b;

    public T(S.b bVar, Pair pair) {
        this.f340610b = bVar;
        this.f340609a = pair;
    }

    @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
    public final void a() {
        C36399d.o(this.f340610b.j());
    }

    @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
    public final void b() {
        C36399d.q(this.f340610b.l());
    }

    @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
    public final void c() {
        boolean zRemove;
        ArrayList arrayList;
        C36399d c36399d;
        ArrayList arrayListL;
        ArrayList arrayListJ;
        synchronized (this.f340610b) {
            try {
                zRemove = this.f340610b.f340601b.remove(this.f340609a);
                arrayList = null;
                if (!zRemove) {
                    c36399d = null;
                    arrayListL = null;
                } else if (this.f340610b.f340601b.isEmpty()) {
                    c36399d = this.f340610b.f340605f;
                    arrayListL = null;
                } else {
                    ArrayList arrayListK = this.f340610b.k();
                    arrayListL = this.f340610b.l();
                    arrayListJ = this.f340610b.j();
                    c36399d = null;
                    arrayList = arrayListK;
                }
                arrayListJ = arrayListL;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C36399d.p(arrayList);
        C36399d.q(arrayListL);
        C36399d.o(arrayListJ);
        if (c36399d != null) {
            S.this.getClass();
            c36399d.r();
        }
        if (zRemove) {
            ((InterfaceC36410l) this.f340609a.first).b();
        }
    }

    @Override // com.facebook.imagepipeline.producers.C36401e, com.facebook.imagepipeline.producers.l0
    public final void d() {
        C36399d.p(this.f340610b.k());
    }
}
