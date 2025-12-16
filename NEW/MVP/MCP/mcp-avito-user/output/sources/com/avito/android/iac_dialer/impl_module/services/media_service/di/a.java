package com.avito.android.iac_dialer.impl_module.services.media_service.di;

import android.app.Service;
import com.avito.android.iac_dialer.impl_module.services.media_service.IacMediaService;
import com.avito.android.iac_dialer.impl_module.services.media_service.di.b;
import dagger.internal.e;
import dagger.internal.t;
import zK.f;

/* compiled from: DaggerIacMediaServiceComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerIacMediaServiceComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.iac_dialer.impl_module.services.media_service.di.b.a
        public final com.avito.android.iac_dialer.impl_module.services.media_service.di.b a(IacMediaService iacMediaService, com.avito.android.iac_dialer.impl_module.services.media_service.di.c cVar) {
            return new c(cVar, iacMediaService, null);
        }
    }

    /* compiled from: DaggerIacMediaServiceComponent.java */
    public static final class c implements com.avito.android.iac_dialer.impl_module.services.media_service.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.iac_dialer.impl_module.services.media_service.di.c f166367a;

        public c(com.avito.android.iac_dialer.impl_module.services.media_service.di.c cVar, Service service, C4938a c4938a) {
            this.f166367a = cVar;
        }

        @Override // com.avito.android.iac_dialer.impl_module.services.media_service.di.b
        public final void a(IacMediaService iacMediaService) {
            com.avito.android.iac_dialer.impl_module.services.media_service.di.c cVar = this.f166367a;
            AK.a aVarBj = cVar.bj();
            t.c(aVarBj);
            iacMediaService.f166356b = aVarBj;
            com.avito.android.iac_dialer.impl_module.notifications.new_impl.a aVarQg = cVar.Qg();
            t.c(aVarQg);
            iacMediaService.f166357c = aVarQg;
            f fVarZe = cVar.ze();
            t.c(fVarZe);
            iacMediaService.f166358d = fVarZe;
            com.avito.android.app_foreground_provider.util_module.a aVarBg = cVar.bg();
            t.c(aVarBg);
            iacMediaService.f166359e = aVarBg;
        }
    }

    public static b.a a() {
        return new b();
    }
}
