package com.google.firebase.dynamiclinks.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.google.firebase.dynamiclinks.internal.g;
import j.P;

/* compiled from: FirebaseDynamicLinksImpl.java */
/* loaded from: classes5.dex */
public class e extends com.google.firebase.dynamiclinks.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.dynamiclinks.internal.c f361532a;

    /* renamed from: b, reason: collision with root package name */
    public final wZ0.b<com.google.firebase.analytics.connector.a> f361533b;

    /* compiled from: FirebaseDynamicLinksImpl.java */
    public static class a extends g.b {
        @Override // com.google.firebase.dynamiclinks.internal.g
        public void j3(Status status, @P DynamicLinkData dynamicLinkData) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.firebase.dynamiclinks.internal.g
        public void n1(Status status, @P ShortDynamicLinkImpl shortDynamicLinkImpl) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: FirebaseDynamicLinksImpl.java */
    public static class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final C37028k<com.google.firebase.dynamiclinks.f> f361534a;

        public b(C37028k<com.google.firebase.dynamiclinks.f> c37028k) {
            this.f361534a = c37028k;
        }

        @Override // com.google.firebase.dynamiclinks.internal.e.a, com.google.firebase.dynamiclinks.internal.g
        public final void n1(Status status, @P ShortDynamicLinkImpl shortDynamicLinkImpl) {
            B.a(status, shortDynamicLinkImpl, this.f361534a);
        }
    }

    /* compiled from: FirebaseDynamicLinksImpl.java */
    public static final class c extends A<com.google.firebase.dynamiclinks.internal.d, com.google.firebase.dynamiclinks.f> {
        @Override // com.google.android.gms.common.api.internal.A
        public final void b(C36616a.b bVar, C37028k<com.google.firebase.dynamiclinks.f> c37028k) {
            com.google.firebase.dynamiclinks.internal.d dVar = (com.google.firebase.dynamiclinks.internal.d) bVar;
            b bVar2 = new b(c37028k);
            dVar.getClass();
            try {
                ((h) dVar.getService()).Q0(bVar2);
            } catch (RemoteException unused) {
            }
        }
    }

    /* compiled from: FirebaseDynamicLinksImpl.java */
    public static class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final C37028k<com.google.firebase.dynamiclinks.d> f361535a;

        /* renamed from: b, reason: collision with root package name */
        public final wZ0.b<com.google.firebase.analytics.connector.a> f361536b;

        public d(wZ0.b<com.google.firebase.analytics.connector.a> bVar, C37028k<com.google.firebase.dynamiclinks.d> c37028k) {
            this.f361536b = bVar;
            this.f361535a = c37028k;
        }

        @Override // com.google.firebase.dynamiclinks.internal.e.a, com.google.firebase.dynamiclinks.internal.g
        public final void j3(Status status, @P DynamicLinkData dynamicLinkData) {
            com.google.firebase.analytics.connector.a aVar;
            B.a(status, dynamicLinkData == null ? null : new com.google.firebase.dynamiclinks.d(dynamicLinkData), this.f361535a);
            if (dynamicLinkData == null) {
                return;
            }
            Bundle bundle = dynamicLinkData.f361525f;
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle.getBundle("scionData");
            if (bundle2 == null || bundle2.keySet() == null || (aVar = this.f361536b.get()) == null) {
                return;
            }
            for (String str : bundle2.keySet()) {
                aVar.a("fdl", str, bundle2.getBundle(str));
            }
        }
    }

    /* compiled from: FirebaseDynamicLinksImpl.java */
    /* renamed from: com.google.firebase.dynamiclinks.internal.e$e, reason: collision with other inner class name */
    public static final class C10721e extends A<com.google.firebase.dynamiclinks.internal.d, com.google.firebase.dynamiclinks.d> {

        /* renamed from: d, reason: collision with root package name */
        @P
        public final String f361537d;

        /* renamed from: e, reason: collision with root package name */
        public final wZ0.b<com.google.firebase.analytics.connector.a> f361538e;

        public C10721e(wZ0.b<com.google.firebase.analytics.connector.a> bVar, @P String str) {
            super(null, false, 13201);
            this.f361537d = str;
            this.f361538e = bVar;
        }

        @Override // com.google.android.gms.common.api.internal.A
        public final void b(C36616a.b bVar, C37028k<com.google.firebase.dynamiclinks.d> c37028k) {
            com.google.firebase.dynamiclinks.internal.d dVar = (com.google.firebase.dynamiclinks.internal.d) bVar;
            d dVar2 = new d(this.f361538e, c37028k);
            String str = this.f361537d;
            dVar.getClass();
            try {
                ((h) dVar.getService()).c1(dVar2, str);
            } catch (RemoteException unused) {
            }
        }
    }

    @VisibleForTesting
    public e() {
        throw null;
    }

    public e(com.google.firebase.g gVar, wZ0.b<com.google.firebase.analytics.connector.a> bVar) {
        gVar.a();
        C36616a.d.C10620d c10620d = C36616a.d.f348913j2;
        h.a aVar = h.a.f348930c;
        this.f361532a = new com.google.firebase.dynamiclinks.internal.c(gVar.f361595a, com.google.firebase.dynamiclinks.internal.c.f361531k, c10620d, aVar);
        this.f361533b = bVar;
        bVar.get();
    }

    @Override // com.google.firebase.dynamiclinks.c
    public final Task<com.google.firebase.dynamiclinks.d> a(@P Intent intent) {
        Task taskDoWrite = this.f361532a.doWrite(new C10721e(this.f361533b, intent.getDataString()));
        Parcelable.Creator<DynamicLinkData> creator = DynamicLinkData.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA");
        DynamicLinkData dynamicLinkData = (DynamicLinkData) (byteArrayExtra == null ? null : TX0.b.a(byteArrayExtra, creator));
        com.google.firebase.dynamiclinks.d dVar = dynamicLinkData != null ? new com.google.firebase.dynamiclinks.d(dynamicLinkData) : null;
        return dVar != null ? C37030m.f(dVar) : taskDoWrite;
    }
}
