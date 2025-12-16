package com.avito.android.publish;

import com.avito.android.publish.PhotoUploadObserver;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import kotlin.Metadata;

/* compiled from: PhotoSyncDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/D;", "Lcom/avito/android/publish/PhotoUploadObserver$b;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class D implements PhotoUploadObserver.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PhotoParameter f231892a;

    public D(PhotoParameter photoParameter) {
        this.f231892a = photoParameter;
    }

    @Override // com.avito.android.publish.PhotoUploadObserver.b
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final PhotoParameter getF231892a() {
        return this.f231892a;
    }
}
