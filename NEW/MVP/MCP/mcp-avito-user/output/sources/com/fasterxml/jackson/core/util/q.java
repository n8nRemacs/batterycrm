package com.fasterxml.jackson.core.util;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ThreadLocalBufferManager.java */
/* loaded from: classes3.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f341324a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ReferenceQueue<com.fasterxml.jackson.core.util.a> f341325b = new ReferenceQueue<>();

    /* compiled from: ThreadLocalBufferManager.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final q f341326a = new q();
    }
}
