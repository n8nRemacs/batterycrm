package com.avito.android.str_seller_orders_important_to_note.deeplink;

import com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteDeeplink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StrSellerImportantToNoteDeeplinkHandlerModule_ProvideStrSellerImportantToNoteDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f291259a;

    /* renamed from: b, reason: collision with root package name */
    public final f f291260b;

    public c(d dVar, f fVar) {
        this.f291259a = dVar;
        this.f291260b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f291260b.getClass();
        e eVar = new e();
        d dVar = this.f291259a;
        b.f291258a.getClass();
        return new C43834a(StrSellerImportantToNoteDeeplink.class, eVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(StrSellerImportantToNoteDeeplink.class), dVar));
    }
}
