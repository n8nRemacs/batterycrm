package com.avito.android.app.task;

import com.avito.android.error_reporting.app_state.C30367f;
import com.avito.android.error_reporting.app_state.C30368g;

/* compiled from: ApkSignatureCheckBackgroundTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.app.task.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28550e implements dagger.internal.h<ApkSignatureCheckBackgroundTask> {

    /* renamed from: a, reason: collision with root package name */
    public final C30368g f91586a;

    public C28550e(C30368g c30368g) {
        this.f91586a = c30368g;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new ApkSignatureCheckBackgroundTask((C30367f) this.f91586a.get());
    }
}
