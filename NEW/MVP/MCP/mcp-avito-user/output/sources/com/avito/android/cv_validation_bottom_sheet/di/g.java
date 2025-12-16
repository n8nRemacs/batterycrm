package com.avito.android.cv_validation_bottom_sheet.di;

import androidx.recyclerview.widget.C;
import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvValidationBottomSheetModule_ProvideListUpdateCallbackFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final u f131826a;

    public g(u uVar) {
        this.f131826a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f131826a.get();
        c.f131820a.getClass();
        return jVar;
    }
}
