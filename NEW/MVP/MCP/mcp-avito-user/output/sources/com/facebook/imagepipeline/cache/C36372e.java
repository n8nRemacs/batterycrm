package com.facebook.imagepipeline.cache;

import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: BitmapMemoryCacheKey.java */
@J41.b
@Nullsafe
/* renamed from: com.facebook.imagepipeline.cache.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C36372e implements com.facebook.cache.common.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f340218a;

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public final UW0.d f340219b;

    /* renamed from: c, reason: collision with root package name */
    public final UW0.e f340220c;

    /* renamed from: d, reason: collision with root package name */
    public final UW0.b f340221d;

    /* renamed from: e, reason: collision with root package name */
    @I41.h
    public final com.facebook.cache.common.c f340222e;

    /* renamed from: f, reason: collision with root package name */
    @I41.h
    public final String f340223f;

    /* renamed from: g, reason: collision with root package name */
    public final int f340224g;

    /* renamed from: h, reason: collision with root package name */
    @I41.h
    public final Object f340225h;

    public C36372e(String str, @I41.h UW0.d dVar, UW0.e eVar, UW0.b bVar, @I41.h com.facebook.cache.common.c cVar, @I41.h String str2, @I41.h Object obj) {
        str.getClass();
        this.f340218a = str;
        this.f340219b = dVar;
        this.f340220c = eVar;
        this.f340221d = bVar;
        this.f340222e = cVar;
        this.f340223f = str2;
        Integer numValueOf = Integer.valueOf(str.hashCode());
        Integer numValueOf2 = Integer.valueOf(dVar != null ? dVar.hashCode() : 0);
        Integer numValueOf3 = Integer.valueOf(eVar.hashCode());
        int iHashCode = numValueOf.hashCode();
        int iHashCode2 = numValueOf2.hashCode();
        int iHashCode3 = numValueOf3.hashCode();
        int iHashCode4 = bVar == null ? 0 : bVar.hashCode();
        this.f340224g = ((((((((((iHashCode + 31) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (cVar == null ? 0 : cVar.hashCode())) * 31) + (str2 != null ? str2.hashCode() : 0);
        this.f340225h = obj;
        RealtimeSinceBootClock.get().getClass();
        SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.cache.common.c
    public final String a() {
        return this.f340218a;
    }

    @Override // com.facebook.cache.common.c
    public final boolean b() {
        return false;
    }

    public final boolean equals(@I41.h Object obj) {
        if (!(obj instanceof C36372e)) {
            return false;
        }
        C36372e c36372e = (C36372e) obj;
        return this.f340224g == c36372e.f340224g && this.f340218a.equals(c36372e.f340218a) && com.facebook.common.internal.n.a(this.f340219b, c36372e.f340219b) && com.facebook.common.internal.n.a(this.f340220c, c36372e.f340220c) && com.facebook.common.internal.n.a(this.f340221d, c36372e.f340221d) && com.facebook.common.internal.n.a(this.f340222e, c36372e.f340222e) && com.facebook.common.internal.n.a(this.f340223f, c36372e.f340223f);
    }

    public final int hashCode() {
        return this.f340224g;
    }

    public final String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.f340218a, this.f340219b, this.f340220c, this.f340221d, this.f340222e, this.f340223f, Integer.valueOf(this.f340224g));
    }
}
