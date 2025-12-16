package com.avito.android.iac_dialer_root.impl_module.activity.di;

import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import cL.InterfaceC27060a;
import com.avito.android.iac_dialer_root.impl_module.activity.argumet_ver_241206.IacCallActivity;
import com.avito.android.iac_dialer_root.impl_module.activity.di.b;
import dagger.internal.e;
import dagger.internal.t;
import fL.C40308b;

/* compiled from: DaggerIacCallActivityComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerIacCallActivityComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.iac_dialer_root.impl_module.activity.di.b.a
        public final com.avito.android.iac_dialer_root.impl_module.activity.di.b a(IacCallActivity iacCallActivity, Resources resources, com.avito.android.iac_dialer_root.impl_module.activity.di.c cVar) {
            return new c(cVar, iacCallActivity, resources, null);
        }
    }

    /* compiled from: DaggerIacCallActivityComponent.java */
    public static final class c implements com.avito.android.iac_dialer_root.impl_module.activity.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final ActivityC22955m f166880a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.iac_dialer_root.impl_module.activity.di.c f166881b;

        public c(com.avito.android.iac_dialer_root.impl_module.activity.di.c cVar, ActivityC22955m activityC22955m, Resources resources, C4956a c4956a) {
            this.f166880a = activityC22955m;
            this.f166881b = cVar;
        }

        @Override // com.avito.android.iac_dialer_root.impl_module.activity.di.b
        public final void a(IacCallActivity iacCallActivity) {
            com.avito.android.iac_dialer_root.impl_module.activity.di.c cVar = this.f166881b;
            InterfaceC27060a interfaceC27060aIk = cVar.ik();
            t.c(interfaceC27060aIk);
            OK.b bVarEe = cVar.Ee();
            t.c(bVarEe);
            iacCallActivity.f166876m = new C40308b(this.f166880a, interfaceC27060aIk, bVarEe);
            jL.e eVarUl = cVar.ul();
            t.c(eVarUl);
            iacCallActivity.f166877n = eVarUl;
            com.avito.android.iac_dialer_root.public_module.on_back_pressed_callback.b bVarDb = cVar.Db();
            t.c(bVarDb);
            iacCallActivity.f166878o = bVarDb;
        }
    }

    public static b.a a() {
        return new b();
    }
}
