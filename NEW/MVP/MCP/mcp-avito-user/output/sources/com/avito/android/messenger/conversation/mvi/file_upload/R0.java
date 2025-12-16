package com.avito.android.messenger.conversation.mvi.file_upload;

import android.media.MediaCodec;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.video.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.nio.BufferOverflowException;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.text.C43066x;
import ru.avito.messenger.api.entity.CreateChunkedVideoFileResponse;

/* compiled from: VideoUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/r0;", "", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class R0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CreateChunkedVideoFileResponse f191088c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f191089d;

    public R0(C32104x0 c32104x0, CreateChunkedVideoFileResponse createChunkedVideoFileResponse, AbstractC32094s0.a aVar) {
        this.f191087b = c32104x0;
        this.f191088c = createChunkedVideoFileResponse;
        this.f191089d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        String strConcat;
        String message;
        kotlin.Q q12 = (kotlin.Q) obj;
        C32092r0 c32092r0 = (C32092r0) q12.f406619b;
        Throwable th2 = (Throwable) q12.f406620c;
        C32104x0 c32104x0 = this.f191087b;
        if (th2 != null) {
            com.avito.android.messenger.conversation.mvi.video.m mVar = c32104x0.f191331j;
            CreateChunkedVideoFileResponse createChunkedVideoFileResponse = this.f191088c;
            String fileId = createChunkedVideoFileResponse.getFileId();
            String videoId = createChunkedVideoFileResponse.getVideoId();
            mVar.getClass();
            if (th2 instanceof b.a.C5754a) {
                strConcat = "cancelled";
            } else if (th2 instanceof b.a.C5755b) {
                Throwable cause = th2.getCause();
                if (cause == null || (message = cause.getMessage()) == null) {
                    message = "";
                }
                strConcat = "failed.".concat(C43066x.q(message, "muxer", true) ? "muxer" : C43066x.q(message, "Failed requirement", true) ? "failed_requirement" : th2.getCause() instanceof BufferOverflowException ? "buffer_overflow" : th2.getCause() instanceof MediaCodec.CodecException ? "codec" : PluralsKeys.OTHER);
            } else {
                strConcat = th2 instanceof TimeoutException ? "failed.timeout" : "failed.other";
            }
            mVar.a("compression." + strConcat);
            mVar.f195028a.c(new NonFatalErrorEvent("Messenger video compression failed", th2, kotlin.collections.P0.g(new kotlin.Q(MessageBody.Video.VIDEO_ID, videoId), new kotlin.Q("fileId", fileId)), null, 8, null));
        }
        InterfaceC32024m interfaceC32024m = c32104x0.f191322a;
        AbstractC32094s0.a aVar = this.f191089d;
        return interfaceC32024m.s(aVar.f191219b, aVar.f191220c, aVar.f191218a, c32092r0.f191206a.getPath(), c32092r0.f191211f, c32092r0.f191212g, c32092r0.f191208c, c32092r0.f191210e, th2 != null);
    }
}
