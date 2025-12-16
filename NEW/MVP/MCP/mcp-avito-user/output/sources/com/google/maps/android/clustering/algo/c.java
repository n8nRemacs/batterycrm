package com.google.maps.android.clustering.algo;

import KZ0.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* compiled from: NonHierarchicalDistanceBasedAlgorithm.java */
/* loaded from: classes6.dex */
public class c<T extends com.google.maps.android.clustering.b> implements com.google.maps.android.clustering.algo.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final JZ0.b f362235a = new JZ0.b(1.0d);

    /* compiled from: NonHierarchicalDistanceBasedAlgorithm.java */
    public static class b<T extends com.google.maps.android.clustering.b> implements a.InterfaceC0580a, com.google.maps.android.clustering.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f362236a;

        /* renamed from: b, reason: collision with root package name */
        public final Set<T> f362237b;

        public b() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(com.google.maps.android.clustering.b bVar, a aVar) {
            this.f362236a = bVar;
            LatLng position = bVar.getPosition();
            JZ0.b bVar2 = c.f362235a;
            bVar2.getClass();
            double d12 = (position.f354408c / 360.0d) + 0.5d;
            double dSin = Math.sin(Math.toRadians(position.f354407b));
            double dLog = ((Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
            double d13 = bVar2.f9041a;
            new JZ0.a(d12 * d13, dLog * d13);
            this.f362237b = Collections.singleton(bVar);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return ((b) obj).f362236a.equals(this.f362236a);
            }
            return false;
        }

        @Override // com.google.maps.android.clustering.a
        public final Collection getItems() {
            return this.f362237b;
        }

        @Override // com.google.maps.android.clustering.a
        public final int getSize() {
            return 1;
        }

        public final int hashCode() {
            return this.f362236a.hashCode();
        }
    }

    public c() {
        new ArrayList();
    }
}
