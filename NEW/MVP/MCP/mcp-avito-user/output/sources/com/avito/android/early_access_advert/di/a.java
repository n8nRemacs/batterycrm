package com.avito.android.early_access_advert.di;

import com.avito.android.early_access_advert.EarlyAccessAdvertBottomSheet;
import com.avito.android.early_access_advert.di.d;

/* compiled from: DaggerEarlyAccessAdvertComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEarlyAccessAdvertComponent.java */
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final e f145595a;

        public b(e eVar, C4229a c4229a) {
            this.f145595a = eVar;
        }

        @Override // com.avito.android.early_access_advert.di.d
        public final void a(EarlyAccessAdvertBottomSheet earlyAccessAdvertBottomSheet) {
            earlyAccessAdvertBottomSheet.f145586h0 = this.f145595a.E7();
        }
    }

    /* compiled from: DaggerEarlyAccessAdvertComponent.java */
    public static final class c implements d.a {
        public c() {
        }

        @Override // com.avito.android.early_access_advert.di.d.a
        public final d a(e eVar) {
            return new b(eVar, null);
        }
    }

    public static d.a a() {
        return new c();
    }
}
