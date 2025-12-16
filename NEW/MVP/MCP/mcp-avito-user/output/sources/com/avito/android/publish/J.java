package com.avito.android.publish;

import com.avito.android.photo_cache.q;
import com.avito.android.publish.PhotoUploadObserver;
import com.avito.android.remote.model.ImageUploadResult;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameterKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PhotoUploadObserver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_cache/q;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/photo_cache/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class J extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.photo_cache.q, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f231914l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PhotoUploadObserver.b f231915m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f231916n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k12, PhotoUploadObserver.b bVar, boolean z12) {
        super(1);
        this.f231914l = k12;
        this.f231915m = bVar;
        this.f231916n = z12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(com.avito.android.photo_cache.q qVar) {
        com.avito.android.photo_cache.q qVar2 = qVar;
        boolean z12 = qVar2 instanceof q.b;
        boolean z13 = this.f231916n;
        K k12 = this.f231914l;
        if (z12) {
            q.b bVar = (q.b) qVar2;
            k12.getClass();
            PhotoParameter f231892a = this.f231915m.getF231892a();
            PhotoParameter.ImageUploadListWrapper value = f231892a != null ? f231892a.getValue() : null;
            ArrayList arrayList = new ArrayList(C42745f0.E0(bVar.getData(), PhotoParameterKt.maxPhotos(f231892a)));
            PhotoParameter.ImageUploadListWrapper imageUploadListWrapper = new PhotoParameter.ImageUploadListWrapper(arrayList);
            if (!kotlin.jvm.internal.L.f(value, imageUploadListWrapper)) {
                int size = imageUploadListWrapper.size();
                List<ImageUploadResult> onlyUploaded = imageUploadListWrapper.getOnlyUploaded();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(onlyUploaded, 10));
                Iterator<T> it = onlyUploaded.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ImageUploadResult) it.next()).getUploadId());
                }
                k12.f231920c.b(size, arrayList2);
            }
            if (f231892a != null) {
                PhotoParameter.ImageUploadListWrapper imageUploadListWrapper2 = new PhotoParameter.ImageUploadListWrapper(arrayList);
                if (!kotlin.jvm.internal.L.f(f231892a.getValue(), imageUploadListWrapper2)) {
                    f231892a.setValue(imageUploadListWrapper2);
                    f231892a.setError(null);
                }
            }
            boolean zF2 = kotlin.jvm.internal.L.f(value, f231892a != null ? f231892a.getValue() : null);
            com.jakewharton.rxrelay3.c<PhotoUploadObserver.UploadStatus> cVar = k12.f231922e;
            if (!zF2) {
                cVar.accept(bVar instanceof q.c ? PhotoUploadObserver.UploadStatus.f231961b : PhotoUploadObserver.UploadStatus.f231962c);
            } else if (z13 && (bVar instanceof q.c)) {
                cVar.accept(PhotoUploadObserver.UploadStatus.f231963d);
            }
        } else if ((qVar2 instanceof q.a) && z13) {
            k12.f231922e.accept(PhotoUploadObserver.UploadStatus.f231964e);
        }
        return kotlin.G0.f406611a;
    }
}
