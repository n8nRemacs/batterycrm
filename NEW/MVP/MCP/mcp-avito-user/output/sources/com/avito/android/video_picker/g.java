package com.avito.android.video_picker;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VideoPickerIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f325970a;

    public g(C30102l3 c30102l3) {
        this.f325970a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Context) this.f325970a.get());
    }
}
