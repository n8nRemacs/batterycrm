package com.avito.android.messenger.conversation.mvi.send;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.analytics.MessengerFileErrorEvent;
import com.avito.android.messenger.conversation.mvi.file_attachment.FileAttachmentException;
import com.avito.android.messenger.conversation.mvi.send.D;
import com.avito.android.util.V2;
import java.text.DecimalFormat;
import kotlin.Metadata;

/* compiled from: SendMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class X<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f194461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D.J f194462c;

    public X(D d12, D.J j12) {
        this.f194461b = d12;
        this.f194462c = j12;
    }

    @Override // l41.g
    public final void accept(Object obj) throws Resources.NotFoundException {
        Throwable th2 = (Throwable) obj;
        boolean z12 = th2 instanceof FileAttachmentException.FileMaxSizeExceeded;
        D d12 = this.f194461b;
        if (z12) {
            V2 v22 = V2.f318762a;
            String str = d12.f207131E;
            StringBuilder sb2 = new StringBuilder("Video file exceeded max allowed size: fileSizeInBytes = ");
            FileAttachmentException.FileMaxSizeExceeded fileMaxSizeExceeded = (FileAttachmentException.FileMaxSizeExceeded) th2;
            long j12 = fileMaxSizeExceeded.f190695b;
            sb2.append(j12);
            sb2.append(", maxAllowedSize = ");
            long j13 = fileMaxSizeExceeded.f190696c;
            sb2.append(j13);
            v22.c(str, sb2.toString(), null);
            d12.f194200c0.a("prepare.failed.max_size");
            d12.f194199b0.c(new MessengerFileErrorEvent(d12.f194201d0, Long.valueOf(j12), fileMaxSizeExceeded.f190697d, MessengerFileErrorEvent.FileType.f186218c));
            Resources resources = d12.f194198a0;
            d12.f194183A0.postValue(resources.getString(R.string.messenger_attachment_video_file_max_size_exceeded_error, new DecimalFormat(resources.getString(R.string.messenger_attachment_video_file_max_size_exceeded_error_file_size_format)).format(Float.valueOf(j13 / 1048576.0f))));
            return;
        }
        if (!(th2 instanceof FileAttachmentException.VideoMaxDurationExceeded)) {
            if (!(th2 instanceof FileAttachmentException.ReadFileInfoException) || this.f194462c.f194239f == null) {
                V2.f318762a.a(d12.f207131E, "Failed to prepare video for attachment", th2);
                d12.f194200c0.a("prepare.failed.other");
                d12.f194183A0.postValue(d12.f194198a0.getString(R.string.messenger_attachment_video_preparation_error));
                return;
            }
            d12.f194199b0.c(new NonFatalErrorEvent("Error reading recorded video file", th2, null, new NonFatalErrorEvent.a.b(D.class, "Error reading recorded video file", 0, 4, null), 4, null));
            V2.f318762a.a(d12.f207131E, "Failed to prepare recorded video for attachment", th2);
            d12.f194200c0.a("prepare.failed.read_recorded_video");
            d12.f194184B0.postValue(d12.f194198a0.getString(R.string.messenger_attachment_video_try_again_with_gallery));
            return;
        }
        V2 v23 = V2.f318762a;
        String str2 = d12.f207131E;
        StringBuilder sb3 = new StringBuilder("Video file exceeded max allowed duration: videoDurationSec = ");
        FileAttachmentException.VideoMaxDurationExceeded videoMaxDurationExceeded = (FileAttachmentException.VideoMaxDurationExceeded) th2;
        sb3.append(videoMaxDurationExceeded.f190699b);
        sb3.append(", maxAllowedDurationSec = ");
        long j14 = videoMaxDurationExceeded.f190700c;
        sb3.append(j14);
        v23.c(str2, sb3.toString(), null);
        d12.f194200c0.a("prepare.failed.duration");
        Resources resources2 = d12.f194198a0;
        d12.f194183A0.postValue(resources2.getString(R.string.messenger_attachment_video_file_max_duration_exceeded_error, new DecimalFormat(resources2.getString(R.string.messenger_attachment_video_file_max_duration_exceeded_error_video_duration_format)).format(Float.valueOf(j14 / 60.0f))));
    }
}
