package com.avito.android.video_picker;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.video_picker.VideoPickerActivity;
import com.avito.android.video_picker.camera_request.CameraRequestActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: VideoPickerIntentFactoryImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/video_picker/f;", "Lcom/avito/android/video_picker/e;", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f325969a;

    @Inject
    public f(@k Context context) {
        this.f325969a = context;
    }

    @Override // com.avito.android.video_picker.e
    @k
    public final Intent a() {
        new CameraRequestActivity.a();
        return new Intent(this.f325969a, (Class<?>) CameraRequestActivity.class);
    }

    @Override // com.avito.android.video_picker.e
    @k
    public final Intent b(@k VideoUploadLimits videoUploadLimits) {
        new VideoPickerActivity.b();
        return new Intent(this.f325969a, (Class<?>) VideoPickerActivity.class).putExtra("video_picker_upload_video_limits_key", videoUploadLimits);
    }
}
