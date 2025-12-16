package com.vk.id;

import Y41.l;
import com.vk.id.VKID;
import com.vk.id.auth.VKIDAuthParams;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f366768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f366769d;

    public /* synthetic */ a(int i12, Object obj, Object obj2) {
        this.f366767b = i12;
        this.f366768c = obj;
        this.f366769d = obj2;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        switch (this.f366767b) {
            case 0:
                return VKID.AnonymousClass6.invokeSuspend$lambda$0((VKIDAuthParams) this.f366768c, (VKID) this.f366769d, (VKIDAuthParams.Builder) obj);
            default:
                return AuthResultHandler.handleOauth$lambda$3$lambda$2((AuthResultHandler) this.f366768c, (Y41.a) this.f366769d, (Throwable) obj);
        }
    }
}
