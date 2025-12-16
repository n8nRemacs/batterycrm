package com.avito.android.data_picker_show.di;

import com.avito.android.data_picker_show.DataPickerShowLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DataPickerShowLinkModule_ProvideServiceBookingDaySettingsMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.data_picker_show.deeplink.b f132549a;

    public e(com.avito.android.data_picker_show.deeplink.b bVar) {
        this.f132549a = bVar;
    }

    public static C43834a a(com.avito.android.data_picker_show.deeplink.b bVar) {
        d.f132548a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(DataPickerShowLink.class, new com.avito.android.data_picker_show.deeplink.e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DataPickerShowLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f132549a);
    }
}
