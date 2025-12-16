package com.facebook.imagepipeline.core;

import com.facebook.common.references.SharedReference;
import com.facebook.common.references.a;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;
import uW0.C48986a;

/* compiled from: CloseableReferenceFactory.java */
@Nullsafe
/* renamed from: com.facebook.imagepipeline.core.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C36382a {

    /* renamed from: a, reason: collision with root package name */
    public final a.d f340280a;

    /* compiled from: CloseableReferenceFactory.java */
    /* renamed from: com.facebook.imagepipeline.core.a$a, reason: collision with other inner class name */
    public class C10534a implements a.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VW0.a f340281a;

        public C10534a(VW0.a aVar) {
            this.f340281a = aVar;
        }

        @Override // com.facebook.common.references.a.d
        public final boolean a() {
            this.f340281a.getClass();
            return false;
        }

        @Override // com.facebook.common.references.a.d
        public final void b(SharedReference<Object> sharedReference, @I41.h Throwable th2) {
            String string;
            this.f340281a.getClass();
            Object objB = sharedReference.b();
            String name = objB != null ? objB.getClass().getName() : "<value is null>";
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            Integer numValueOf2 = Integer.valueOf(System.identityHashCode(sharedReference));
            if (th2 == null) {
                string = "";
            } else {
                StringWriter stringWriter = new StringWriter();
                th2.printStackTrace(new PrintWriter(stringWriter));
                string = stringWriter.toString();
            }
            C48986a.l("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", numValueOf, numValueOf2, name, string);
        }
    }

    public C36382a(VW0.a aVar) {
        this.f340280a = new C10534a(aVar);
    }

    public final com.facebook.common.references.a a(YW0.b bVar) {
        a.d dVar = this.f340280a;
        if (bVar == null) {
            com.facebook.common.references.h<Closeable> hVar = com.facebook.common.references.a.f339838f;
            return null;
        }
        com.facebook.common.references.h<Closeable> hVar2 = com.facebook.common.references.a.f339838f;
        C10534a c10534a = (C10534a) dVar;
        c10534a.a();
        return com.facebook.common.references.a.o(bVar, hVar2, c10534a, null);
    }
}
