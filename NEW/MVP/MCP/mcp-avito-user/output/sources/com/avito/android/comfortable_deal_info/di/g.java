package com.avito.android.comfortable_deal_info.di;

import androidx.fragment.app.DialogFragment;
import com.avito.android.comfortable_deal_info.ComfortableDealInfoDialogParams;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComfortableDealInfoModule_Companion_ProvideComfortableDealInfoFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<com.avito.android.comfortable_deal_info.f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f123474a;

    /* renamed from: b, reason: collision with root package name */
    public final l f123475b;

    public g(l lVar, l lVar2) {
        this.f123474a = lVar;
        this.f123475b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        DialogFragment dialogFragment = (DialogFragment) this.f123474a.f393949a;
        ComfortableDealInfoDialogParams comfortableDealInfoDialogParams = (ComfortableDealInfoDialogParams) this.f123475b.f393949a;
        f.f123472a.getClass();
        return new com.avito.android.comfortable_deal_info.g(dialogFragment, comfortableDealInfoDialogParams.f123450b);
    }
}
