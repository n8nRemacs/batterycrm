package com.vk.id.internal.auth;

import android.os.Bundle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements Y41.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366973b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f366974c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AuthActivity f366975d;

    public /* synthetic */ c(Bundle bundle, AuthActivity authActivity) {
        this.f366974c = bundle;
        this.f366975d = authActivity;
    }

    @Override // Y41.a
    public final Object invoke() {
        switch (this.f366973b) {
            case 0:
                return AuthActivity.m(this.f366974c, this.f366975d);
            default:
                return AuthActivity.onSaveInstanceState$lambda$11(this.f366974c, this.f366975d);
        }
    }

    public /* synthetic */ c(AuthActivity authActivity, Bundle bundle) {
        this.f366975d = authActivity;
        this.f366974c = bundle;
    }
}
