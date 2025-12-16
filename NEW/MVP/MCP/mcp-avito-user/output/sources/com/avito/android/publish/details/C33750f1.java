package com.avito.android.publish.details;

import com.avito.android.publish.PhotoUploadObserver;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import kotlin.Metadata;

/* compiled from: PublishDetailsPhotoSyncInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/f1;", "Lcom/avito/android/publish/PhotoUploadObserver$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.f1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33750f1 implements PhotoUploadObserver.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C33765k1 f234618a;

    public C33750f1(C33765k1 c33765k1) {
        this.f234618a = c33765k1;
    }

    @Override // com.avito.android.publish.PhotoUploadObserver.b
    @Y61.l
    /* renamed from: a */
    public final PhotoParameter getF231892a() {
        CategoryParameters categoryParametersC0 = this.f234618a.f234816i.C0();
        if (categoryParametersC0 != null) {
            return (PhotoParameter) categoryParametersC0.getFirstParameterOfType(PhotoParameter.class);
        }
        return null;
    }
}
