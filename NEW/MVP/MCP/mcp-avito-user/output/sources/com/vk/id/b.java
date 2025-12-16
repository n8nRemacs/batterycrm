package com.vk.id;

import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.internal.di.VKIDDeps;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Y41.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f366772c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f366773d;

    public /* synthetic */ b(int i12, Object obj, Object obj2) {
        this.f366771b = i12;
        this.f366772c = obj;
        this.f366773d = obj2;
    }

    @Override // Y41.a
    public final Object invoke() {
        switch (this.f366771b) {
            case 0:
                return VKID$authorize$6$1$onAuthResult$1.invokeSuspend$lambda$0((VKIDAuthParams) this.f366772c, (StatParams) this.f366773d);
            default:
                return VKID._init_$lambda$3((VKIDDeps) this.f366772c, (VKID) this.f366773d);
        }
    }
}
