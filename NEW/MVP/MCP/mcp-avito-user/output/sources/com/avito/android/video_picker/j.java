package com.avito.android.video_picker;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VideoPickerViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.video_picker.mvi.e f325971a;

    public j(com.avito.android.video_picker.mvi.e eVar) {
        this.f325971a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.video_picker.mvi.d) this.f325971a.get(), null, 2, null);
    }
}
