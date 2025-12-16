package com.avito.android.messenger.conversation.mvi.file_attachment;

import android.content.Context;
import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.di.module.C30102l3;

/* compiled from: FileStorageHelperImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class x implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f190755a;

    /* renamed from: b, reason: collision with root package name */
    public final C30713g1 f190756b;

    public x(C30102l3 c30102l3, C30713g1 c30713g1) {
        this.f190755a = c30102l3;
        this.f190756b = c30713g1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t((Context) this.f190755a.get(), (C30277e1) this.f190756b.get());
    }
}
