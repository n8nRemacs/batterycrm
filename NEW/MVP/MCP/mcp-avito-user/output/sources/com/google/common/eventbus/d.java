package com.google.common.eventbus;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Dispatcher.java */
@e
/* loaded from: classes6.dex */
abstract class d {

    /* compiled from: Dispatcher.java */
    public static final class b extends d {
        static {
            new b();
        }
    }

    /* compiled from: Dispatcher.java */
    public static final class c extends d {

        /* compiled from: Dispatcher.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final Object f360160a;

            public a(Object obj, i iVar, a aVar) {
                this.f360160a = obj;
            }
        }

        public c() {
            new ConcurrentLinkedQueue();
        }
    }

    /* compiled from: Dispatcher.java */
    /* renamed from: com.google.common.eventbus.d$d, reason: collision with other inner class name */
    public static final class C10678d extends d {

        /* compiled from: Dispatcher.java */
        /* renamed from: com.google.common.eventbus.d$d$a */
        public class a extends ThreadLocal<Queue<c>> {
            @Override // java.lang.ThreadLocal
            public final Queue<c> initialValue() {
                return new ArrayDeque();
            }
        }

        /* compiled from: Dispatcher.java */
        /* renamed from: com.google.common.eventbus.d$d$b */
        public class b extends ThreadLocal<Boolean> {
            @Override // java.lang.ThreadLocal
            public final /* bridge */ /* synthetic */ Boolean initialValue() {
                return Boolean.FALSE;
            }
        }

        /* compiled from: Dispatcher.java */
        /* renamed from: com.google.common.eventbus.d$d$c */
        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            public final Object f360161a;

            /* renamed from: b, reason: collision with root package name */
            public final Iterator<i> f360162b;

            public c() {
                throw null;
            }

            public c(Object obj, Iterator it, a aVar) {
                this.f360161a = obj;
                this.f360162b = it;
            }
        }

        public C10678d() {
            new a();
            new b();
        }
    }
}
