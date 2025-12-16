package com.avito.android.evidence_request.details.files;

import com.avito.android.photo_cache.q;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameterKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FilesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_cache/q;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/photo_cache/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.evidence_request.details.h f148450b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f148451c;

    public m(Y41.a aVar, com.avito.android.evidence_request.details.h hVar) {
        this.f148450b = hVar;
        this.f148451c = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Object obj2 = (com.avito.android.photo_cache.q) obj;
        if (obj2 instanceof q.b) {
            PhotoParameter photoParameterKe = this.f148450b.ke();
            ArrayList arrayList = new ArrayList(C42745f0.E0(((q.b) obj2).getData(), PhotoParameterKt.maxPhotos(photoParameterKe)));
            if (photoParameterKe != null) {
                PhotoParameter.ImageUploadListWrapper imageUploadListWrapper = new PhotoParameter.ImageUploadListWrapper(arrayList);
                if (!L.f(photoParameterKe.getValue(), imageUploadListWrapper)) {
                    photoParameterKe.setValue(imageUploadListWrapper);
                    photoParameterKe.setError(null);
                }
            }
        }
        if (obj2 instanceof q.c) {
            this.f148451c.invoke();
        }
    }
}
