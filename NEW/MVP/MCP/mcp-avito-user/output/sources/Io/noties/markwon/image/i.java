package io.noties.markwon.image;

import j.P;

/* compiled from: ImageSize.java */
/* loaded from: classes8.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final a f401914a;

    /* renamed from: b, reason: collision with root package name */
    public final a f401915b;

    /* compiled from: ImageSize.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f401916a;

        /* renamed from: b, reason: collision with root package name */
        public final String f401917b;

        public a(float f12, @P String str) {
            this.f401916a = f12;
            this.f401917b = str;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Dimension{value=");
            sb2.append(this.f401916a);
            sb2.append(", unit='");
            return AK.c.s(sb2, this.f401917b, "'}");
        }
    }

    public i(@P a aVar, @P a aVar2) {
        this.f401914a = aVar;
        this.f401915b = aVar2;
    }

    public final String toString() {
        return "ImageSize{width=" + this.f401914a + ", height=" + this.f401915b + '}';
    }
}
