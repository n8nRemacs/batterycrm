package com.facebook.imagepipeline.systrace;

import I41.h;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: FrescoSystrace.java */
@Nullsafe
/* loaded from: classes15.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    @h
    public static volatile com.facebook.imagepipeline.systrace.a f340816a;

    /* compiled from: FrescoSystrace.java */
    /* renamed from: com.facebook.imagepipeline.systrace.b$b, reason: collision with other inner class name */
    public interface InterfaceC10540b {
    }

    /* compiled from: FrescoSystrace.java */
    public static final class c implements InterfaceC10540b {
        public c() {
        }
    }

    /* compiled from: FrescoSystrace.java */
    public interface d {
    }

    static {
        new c();
        f340816a = null;
    }

    public static boolean a() {
        if (f340816a == null) {
            synchronized (b.class) {
                try {
                    if (f340816a == null) {
                        f340816a = new com.facebook.imagepipeline.systrace.a();
                    }
                } finally {
                }
            }
        }
        f340816a.getClass();
        return false;
    }
}
