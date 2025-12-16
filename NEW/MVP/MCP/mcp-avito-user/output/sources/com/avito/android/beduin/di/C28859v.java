package com.avito.android.beduin.di;

import android.content.res.Resources;
import com.avito.android.R;

/* compiled from: BeduinConstructorAdvertModule_ProvideSpanCountFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.di.v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28859v implements dagger.internal.h<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.beduin.context.di.e f104003a;

    public C28859v(com.avito.android.beduin.context.di.e eVar) {
        this.f104003a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f104003a.get();
        C28852n.f103953a.getClass();
        return Integer.valueOf(resources.getInteger(R.integer.serp_columns));
    }
}
