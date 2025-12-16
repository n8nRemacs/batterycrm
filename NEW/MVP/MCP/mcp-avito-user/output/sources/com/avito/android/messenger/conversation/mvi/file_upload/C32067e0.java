package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.di.module.L5;
import com.avito.android.messenger.di.C1;

/* compiled from: MessengerFileUploadConfigProviderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.e0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32067e0 implements dagger.internal.h<C32063c0> {

    /* renamed from: a, reason: collision with root package name */
    public final C1 f191142a;

    /* renamed from: b, reason: collision with root package name */
    public final L5 f191143b;

    public C32067e0(C1 c12, L5 l52) {
        this.f191142a = c12;
        this.f191143b = l52;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32063c0((ru.avito.messenger.C0) this.f191142a.get(), (com.avito.android.messenger.service.d) this.f191143b.get());
    }
}
