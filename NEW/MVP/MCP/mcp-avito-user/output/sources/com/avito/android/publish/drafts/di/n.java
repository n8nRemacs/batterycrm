package com.avito.android.publish.drafts.di;

import com.avito.android.publish.drafts.C33842h;
import com.avito.android.publish.drafts.db.LocalDraftTypeAdapter;
import com.avito.android.remote.model.category_parameters.AttributeNode;
import com.avito.android.remote.parse.adapter.AttributeNodeDeserializer;
import com.avito.android.remote.parse.adapter.AttributeNodeSerializer;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishDraftsModule_ProvideStreamGsonFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<Gson> {

    /* compiled from: PublishDraftsModule_ProvideStreamGsonFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final n f235367a = new n();
    }

    public static n a() {
        return a.f235367a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = h.f235345a;
        com.google.gson.d dVar = new com.google.gson.d();
        dVar.b(C33842h.class, new LocalDraftTypeAdapter());
        dVar.b(AttributeNode.class, new AttributeNodeDeserializer());
        dVar.b(AttributeNode.class, new AttributeNodeSerializer());
        return dVar.a();
    }
}
