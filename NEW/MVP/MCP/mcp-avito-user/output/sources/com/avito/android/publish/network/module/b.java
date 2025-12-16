package com.avito.android.publish.network.module;

import com.avito.android.remote.model.PublishDraftResponse;
import com.avito.android.remote.model.SaveDraftResponse;
import com.avito.android.remote.model.StsRecognitionResult;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import com.avito.android.remote.model.adverts.PostAdvertResult;
import com.avito.android.remote.model.adverts.PretendAdvertResult;
import com.avito.android.remote.model.publish.EditAdvertResult;
import com.avito.android.util.C35866p0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.collections.b1;

/* compiled from: PublishJsonModule_ProvideCustomTypeAdaptersFactory.java */
@e
@x
@y
/* loaded from: classes16.dex */
public final class b implements h<Set<C35866p0>> {

    /* compiled from: PublishJsonModule_ProvideCustomTypeAdaptersFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f237462a = new b();
    }

    public static b a() {
        return a.f237462a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.network.module.a.f237461a.getClass();
        return b1.g(new C35866p0(AdvertProactiveModerationResult.class, P0.g(new Q("ok", AdvertProactiveModerationResult.Ok.class), new Q("duplicate-found", AdvertProactiveModerationResult.Duplicate.class), new Q("wrong-category-found", AdvertProactiveModerationResult.WrongCategory.class))), new C35866p0(PublishDraftResponse.class, P0.g(new Q("ok", PublishDraftResponse.Ok.class), new Q("not-found", PublishDraftResponse.NotFound.class))), new C35866p0(SaveDraftResponse.class, P0.g(new Q("ok", SaveDraftResponse.Ok.class), new Q("conflict", SaveDraftResponse.Conflict.class))), new C35866p0(StsRecognitionResult.class, P0.g(new Q("ok", StsRecognitionResult.Ok.class), new Q("not-found", StsRecognitionResult.NotFound.class))), new C35866p0(EditAdvertResult.class, P0.g(new Q("ok", EditAdvertResult.Ok.class), new Q("incorrect-data", EditAdvertResult.InputErrors.class), new Q("need-support", EditAdvertResult.NeedSupport.class))), new C35866p0(PostAdvertResult.class, P0.g(new Q("ok", PostAdvertResult.Ok.class), new Q("incorrect-data", PostAdvertResult.InputErrors.class))), new C35866p0(PretendAdvertResult.class, P0.g(new Q("ok", PretendAdvertResult.Ok.class), new Q("incorrect-data", PretendAdvertResult.InputErrors.class))));
    }
}
