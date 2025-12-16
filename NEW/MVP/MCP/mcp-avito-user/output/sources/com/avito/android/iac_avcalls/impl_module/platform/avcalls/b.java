package com.avito.android.iac_avcalls.impl_module.platform.avcalls;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class b implements com.avito.avcalls.utils.g, com.avito.avcalls.android.utils.g, HV0.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f164379c;

    public /* synthetic */ b(m mVar, int i12) {
        this.f164378b = i12;
        this.f164379c = mVar;
    }

    @Override // com.avito.avcalls.utils.g, com.avito.avcalls.android.utils.g
    public void cancel() {
        m mVar = this.f164379c;
        switch (this.f164378b) {
            case 0:
                AtomicInteger atomicInteger = c.f164380j;
                DisposableHelper.a(mVar);
                break;
            default:
                AtomicInteger atomicInteger2 = com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.j.f164550e;
                DisposableHelper.a(mVar);
                break;
        }
    }

    @Override // HV0.c
    public void dispose() {
        int i12 = com.avito.android.lib.beduin_v2.repository.favorite_item.a.f176588g;
        DisposableHelper.a(this.f164379c);
    }
}
