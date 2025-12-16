package com.my.tracker.obfuscated;

import com.google.android.gms.tasks.InterfaceC37024g;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class E implements com.huawei.hmf.tasks.h, InterfaceC37024g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f365277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f365278c;

    public /* synthetic */ E(Object obj, Object obj2) {
        this.f365277b = obj;
        this.f365278c = obj2;
    }

    @Override // com.huawei.hmf.tasks.h
    public void onFailure(Exception exc) {
        ((C37829c) this.f365277b).a((List) this.f365278c, exc);
    }

    @Override // com.google.android.gms.tasks.InterfaceC37024g
    public void onSuccess(Object obj) {
        ((C37832f) this.f365277b).a((z0) this.f365278c, (NX0.b) obj);
    }
}
