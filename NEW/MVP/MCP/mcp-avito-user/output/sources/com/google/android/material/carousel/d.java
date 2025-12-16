package com.google.android.material.carousel;

import aZ0.InterfaceC19845a;
import androidx.media3.exoplayer.analytics.m;
import j.InterfaceC42167x;
import j.N;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: KeylineState.java */
/* loaded from: classes6.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f356151a;

    /* renamed from: b, reason: collision with root package name */
    public final List<c> f356152b;

    /* renamed from: c, reason: collision with root package name */
    public final int f356153c;

    /* renamed from: d, reason: collision with root package name */
    public final int f356154d;

    /* compiled from: KeylineState.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f356155a;

        /* renamed from: c, reason: collision with root package name */
        public c f356157c;

        /* renamed from: d, reason: collision with root package name */
        public c f356158d;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f356156b = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public int f356159e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f356160f = -1;

        /* renamed from: g, reason: collision with root package name */
        public float f356161g = 0.0f;

        public b(float f12) {
            this.f356155a = f12;
        }

        @InterfaceC19845a
        @N
        public final void a(float f12, @InterfaceC42167x float f13, boolean z12, float f14) {
            if (f14 <= 0.0f) {
                return;
            }
            c cVar = new c(Float.MIN_VALUE, f12, f13, f14);
            ArrayList arrayList = this.f356156b;
            if (z12) {
                if (this.f356157c == null) {
                    this.f356157c = cVar;
                    this.f356159e = arrayList.size();
                }
                if (this.f356160f != -1 && arrayList.size() - this.f356160f > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f14 != this.f356157c.f356165d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f356158d = cVar;
                this.f356160f = arrayList.size();
            } else {
                if (this.f356157c == null && f14 < this.f356161g) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f356158d != null && f14 > this.f356161g) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f356161g = f14;
            arrayList.add(cVar);
        }

        @N
        public final d b() {
            if (this.f356157c == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            while (true) {
                ArrayList arrayList2 = this.f356156b;
                if (i12 >= arrayList2.size()) {
                    return new d(this.f356155a, arrayList, this.f356159e, this.f356160f);
                }
                c cVar = (c) arrayList2.get(i12);
                float f12 = this.f356157c.f356163b;
                float f13 = this.f356159e;
                float f14 = this.f356155a;
                arrayList.add(new c((i12 * f14) + (f12 - (f13 * f14)), cVar.f356163b, cVar.f356164c, cVar.f356165d));
                i12++;
            }
        }
    }

    /* compiled from: KeylineState.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final float f356162a;

        /* renamed from: b, reason: collision with root package name */
        public final float f356163b;

        /* renamed from: c, reason: collision with root package name */
        public final float f356164c;

        /* renamed from: d, reason: collision with root package name */
        public final float f356165d;

        public c(float f12, float f13, float f14, float f15) {
            this.f356162a = f12;
            this.f356163b = f13;
            this.f356164c = f14;
            this.f356165d = f15;
        }
    }

    public final c a() {
        return this.f356152b.get(this.f356153c);
    }

    public final c b() {
        return this.f356152b.get(0);
    }

    public final c c() {
        return this.f356152b.get(this.f356154d);
    }

    public final c d() {
        return (c) m.h(1, this.f356152b);
    }

    public d(float f12, List<c> list, int i12, int i13) {
        this.f356151a = f12;
        this.f356152b = Collections.unmodifiableList(list);
        this.f356153c = i12;
        this.f356154d = i13;
    }
}
