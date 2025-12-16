package com.avito.android.confirm_documents_bottom_sheet.deeplink;

import com.avito.android.confirm_documents_bottom_sheet.ConfirmDocumentsBottomSheetDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ConfirmDocumentsBottomSheetDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f125520a;

    public e(c cVar) {
        this.f125520a = cVar;
    }

    public static C43834a a(c cVar) {
        d.f125519a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ConfirmDocumentsBottomSheetDeeplink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ConfirmDocumentsBottomSheetDeeplink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f125520a);
    }
}
