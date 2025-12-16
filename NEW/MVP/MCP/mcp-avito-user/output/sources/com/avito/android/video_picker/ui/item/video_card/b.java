package com.avito.android.video_picker.ui.item.video_card;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VideoCardBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f325984a;

    public b(e eVar) {
        this.f325984a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f325984a.get());
    }
}
