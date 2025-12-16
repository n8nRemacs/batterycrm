package com.facebook.imagepipeline.core;

import com.avito.android.remote.model.text.TooltipAttribute;
import com.facebook.common.internal.n;
import com.facebook.imagepipeline.request.ImageRequest;

/* compiled from: ImagePipeline.java */
/* loaded from: classes12.dex */
class h implements com.facebook.common.internal.r<com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageRequest f340288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f340289b;

    public h(p pVar, ImageRequest imageRequest) {
        this.f340289b = pVar;
        this.f340288a = imageRequest;
    }

    @Override // com.facebook.common.internal.r
    public final com.facebook.datasource.f<com.facebook.common.references.a<YW0.b>> get() {
        return this.f340289b.b(this.f340288a, null, ImageRequest.RequestLevel.FULL_FETCH, null, null);
    }

    public final String toString() {
        n.b bVarB = com.facebook.common.internal.n.b(this);
        bVarB.b(this.f340288a.f340782b, TooltipAttribute.PARAM_DEEP_LINK);
        return bVarB.toString();
    }
}
