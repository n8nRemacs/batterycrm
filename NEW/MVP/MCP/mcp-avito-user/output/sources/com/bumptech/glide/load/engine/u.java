package com.bumptech.glide.load.engine;

import androidx.core.util.y;
import java.util.Arrays;
import java.util.List;

/* compiled from: LoadPath.java */
/* loaded from: classes5.dex */
public class u<Data, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final y.a<List<Throwable>> f339162a;

    /* renamed from: b, reason: collision with root package name */
    public final List<? extends k<Data, ResourceType, Transcode>> f339163b;

    /* renamed from: c, reason: collision with root package name */
    public final String f339164c;

    public u(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<k<Data, ResourceType, Transcode>> list, y.a<List<Throwable>> aVar) {
        this.f339162a = aVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f339163b = list;
        this.f339164c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[LOOP:0: B:3:0x000d->B:25:0x005f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062 A[EDGE_INSN: B:40:0x0062->B:26:0x0062 BREAK  A[LOOP:0: B:3:0x000d->B:25:0x005f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bumptech.glide.load.engine.w a(com.bumptech.glide.load.data.e r16, @j.N com.bumptech.glide.load.k r17, int r18, int r19, com.bumptech.glide.load.engine.j.c r20, java.util.List r21) throws com.bumptech.glide.load.engine.GlideException {
        /*
            r15 = this;
            r1 = r15
            r2 = r21
            java.util.List<? extends com.bumptech.glide.load.engine.k<Data, ResourceType, Transcode>> r3 = r1.f339163b
            int r4 = r3.size()
            r0 = 0
            r5 = 0
            r6 = r5
            r5 = r0
        Ld:
            if (r6 >= r4) goto L62
            java.lang.Object r0 = r3.get(r6)
            com.bumptech.glide.load.engine.k r0 = (com.bumptech.glide.load.engine.k) r0
            androidx.core.util.y$a<java.util.List<java.lang.Throwable>> r13 = r0.f339085d     // Catch: com.bumptech.glide.load.engine.GlideException -> L54
            java.lang.Object r7 = r13.b()     // Catch: com.bumptech.glide.load.engine.GlideException -> L54
            java.lang.String r8 = "Argument must not be null"
            com.bumptech.glide.util.k.c(r7, r8)     // Catch: com.bumptech.glide.load.engine.GlideException -> L54
            r14 = r7
            java.util.List r14 = (java.util.List) r14     // Catch: com.bumptech.glide.load.engine.GlideException -> L54
            r7 = r0
            r8 = r16
            r9 = r18
            r10 = r19
            r11 = r17
            r12 = r14
            com.bumptech.glide.load.engine.w r7 = r7.a(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L48
            r13.a(r14)     // Catch: com.bumptech.glide.load.engine.GlideException -> L54
            r8 = r20
            com.bumptech.glide.load.engine.w r7 = r8.a(r7)     // Catch: com.bumptech.glide.load.engine.GlideException -> L44
            com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> r0 = r0.f339084c     // Catch: com.bumptech.glide.load.engine.GlideException -> L44
            r9 = r17
            com.bumptech.glide.load.engine.w r0 = r0.a(r7, r9)     // Catch: com.bumptech.glide.load.engine.GlideException -> L52
            r5 = r0
            goto L5c
        L44:
            r0 = move-exception
            r9 = r17
            goto L59
        L48:
            r0 = move-exception
            r9 = r17
            r8 = r20
            r7 = r0
            r13.a(r14)     // Catch: com.bumptech.glide.load.engine.GlideException -> L52
            throw r7     // Catch: com.bumptech.glide.load.engine.GlideException -> L52
        L52:
            r0 = move-exception
            goto L59
        L54:
            r0 = move-exception
            r9 = r17
            r8 = r20
        L59:
            r2.add(r0)
        L5c:
            if (r5 == 0) goto L5f
            goto L62
        L5f:
            int r6 = r6 + 1
            goto Ld
        L62:
            if (r5 == 0) goto L65
            return r5
        L65:
            com.bumptech.glide.load.engine.GlideException r0 = new com.bumptech.glide.load.engine.GlideException
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            java.lang.String r2 = r1.f339164c
            r0.<init>(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.u.a(com.bumptech.glide.load.data.e, com.bumptech.glide.load.k, int, int, com.bumptech.glide.load.engine.j$c, java.util.List):com.bumptech.glide.load.engine.w");
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f339163b.toArray()) + '}';
    }
}
