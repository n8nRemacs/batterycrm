package com.avito.android.calltracking.di;

import android.content.Context;
import android.content.res.Resources;
import cm.C27215a;
import cm.C27219e;
import cm.InterfaceC27217c;
import com.avito.android.calltracking.CalltrackingActivity;
import com.avito.android.calltracking.di.a;
import dagger.internal.B;
import dagger.internal.u;

/* compiled from: DaggerCalltrackingComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class p {

    /* compiled from: DaggerCalltrackingComponent.java */
    public static final class b implements com.avito.android.calltracking.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<C27215a> f113676a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC27217c> f113677b;

        public b(Context context, Resources resources, a aVar) {
            this.f113676a = B.a(new n(dagger.internal.l.a(context)));
            this.f113677b = B.a(new C27219e(dagger.internal.l.a(resources), this.f113676a));
        }

        @Override // com.avito.android.calltracking.di.a
        public final void Km(CalltrackingActivity calltrackingActivity) {
            calltrackingActivity.f113550m = this.f113676a.get();
        }

        @Override // com.avito.android.calltracking.di.d
        public final InterfaceC27217c Ri() {
            return this.f113677b.get();
        }
    }

    /* compiled from: DaggerCalltrackingComponent.java */
    public static final class c implements a.InterfaceC3329a {
        public c() {
        }

        @Override // com.avito.android.calltracking.di.a.InterfaceC3329a
        public final com.avito.android.calltracking.di.a a(CalltrackingActivity calltrackingActivity, Resources resources) {
            return new b(calltrackingActivity, resources, null);
        }
    }

    public static a.InterfaceC3329a a() {
        return new c();
    }
}
