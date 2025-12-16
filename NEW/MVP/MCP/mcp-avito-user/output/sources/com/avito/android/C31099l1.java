package com.avito.android;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.photo_picker.C33272x;
import com.avito.android.photo_picker.C33273y;

/* compiled from: MessengerServiceIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.l1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C31099l1 implements dagger.internal.h<C31095k1> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f174859a;

    /* renamed from: b, reason: collision with root package name */
    public final C33273y f174860b;

    public C31099l1(C30102l3 c30102l3, C33273y c33273y) {
        this.f174859a = c30102l3;
        this.f174860b = c33273y;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f174859a.get();
        this.f174860b.getClass();
        return new C31095k1(context, new C33272x());
    }
}
