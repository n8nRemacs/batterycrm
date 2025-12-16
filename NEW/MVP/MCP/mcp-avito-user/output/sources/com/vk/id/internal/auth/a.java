package com.vk.id.internal.auth;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Y41.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AuthActivity f366967c;

    public /* synthetic */ a(AuthActivity authActivity, int i12) {
        this.f366966b = i12;
        this.f366967c = authActivity;
    }

    @Override // Y41.a
    public final Object invoke() {
        switch (this.f366966b) {
            case 0:
                return AuthActivity.finish$lambda$13(this.f366967c);
            case 1:
                return AuthActivity.onResume$lambda$7(this.f366967c);
            case 2:
                return AuthActivity.onStop$lambda$1(this.f366967c);
            default:
                return AuthActivity.onPause$lambda$9(this.f366967c);
        }
    }
}
