package com.yandex.metrica.networktasks.api;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {

    /* renamed from: b, reason: collision with root package name */
    public static volatile NetworkServiceLocator f382415b;

    /* renamed from: a, reason: collision with root package name */
    public NetworkCore f382416a;

    private NetworkServiceLocator() {
    }

    public static void a() {
        if (f382415b == null) {
            synchronized (NetworkServiceLocator.class) {
                try {
                    if (f382415b == null) {
                        f382415b = new NetworkServiceLocator();
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        NetworkCore networkCore = this.f382416a;
        if (networkCore != null) {
            synchronized (networkCore.f382412e) {
                try {
                    c cVar = networkCore.f382413f;
                    if (cVar != null) {
                        cVar.f382447a.i();
                    }
                    ArrayList arrayList = new ArrayList(networkCore.f382410c.size());
                    networkCore.f382410c.drainTo(arrayList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).f382447a.i();
                    }
                } finally {
                }
            }
        }
    }
}
