package com.avito.android.coil;

import android.app.Application;
import coil.j;
import coil.k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Application f119729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InitCoilTask f119730b;

    public /* synthetic */ a(Application application, InitCoilTask initCoilTask) {
        this.f119729a = application;
        this.f119730b = initCoilTask;
    }

    @Override // coil.k
    public final j a() {
        return InitCoilTask.execute$lambda$2(this.f119729a, this.f119730b);
    }
}
