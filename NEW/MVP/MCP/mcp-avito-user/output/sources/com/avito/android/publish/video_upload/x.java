package com.avito.android.publish.video_upload;

import com.avito.android.publish.video_upload.models.CreateFileIdModel;
import com.avito.android.publish.video_upload.s;
import com.avito.android.remote.model.video_upload.CreateFileIdResponse;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: VideoUploadViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/video_upload/CreateFileIdResponse;", "it", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/publish/video_upload/models/CreateFileIdModel;", "apply", "(Lcom/avito/android/remote/model/video_upload/CreateFileIdResponse;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class x<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f245608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s.b f245609c;

    public x(s sVar, s.b bVar) {
        this.f245608b = sVar;
        this.f245609c = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        CreateFileIdResponse createFileIdResponse = (CreateFileIdResponse) obj;
        String videoId = createFileIdResponse.getVideoId();
        CreateFileIdModel createFileIdModel = new CreateFileIdModel(videoId, createFileIdResponse.getFileId());
        this.f245608b.f245584R = videoId;
        this.f245609c.f245590c = videoId;
        return I.q(createFileIdModel);
    }
}
