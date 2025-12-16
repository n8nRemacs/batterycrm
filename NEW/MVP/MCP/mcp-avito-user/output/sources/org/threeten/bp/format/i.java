package org.threeten.bp.format;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DateTimeTextProvider.java */
/* loaded from: classes8.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference<i> f422060a = new AtomicReference<>();

    /* compiled from: DateTimeTextProvider.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f422061a;

        static {
            AtomicReference<i> atomicReference = i.f422060a;
            l lVar = new l();
            while (!atomicReference.compareAndSet(null, lVar) && atomicReference.get() == null) {
            }
            f422061a = i.f422060a.get();
        }
    }

    public abstract String a(org.threeten.bp.temporal.h hVar, long j12, TextStyle textStyle, Locale locale);

    public abstract Iterator<Map.Entry<String, Long>> b(org.threeten.bp.temporal.h hVar, TextStyle textStyle, Locale locale);
}
