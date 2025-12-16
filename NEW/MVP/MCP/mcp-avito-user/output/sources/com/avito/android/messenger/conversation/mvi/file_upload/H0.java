package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.C30277e1;
import com.avito.android.C34429s0;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32098u0;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.completable.C41828t;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.CreateChunkedVideoFileResponse;

/* compiled from: VideoUploadInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/api/entity/CreateChunkedVideoFileResponse;", "response", "Lio/reactivex/rxjava3/core/w;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/u0$a;", "apply", "(Lru/avito/messenger/api/entity/CreateChunkedVideoFileResponse;)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class H0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191029b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f191030c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q1 f191031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.c f191032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f191033f;

    public H0(C32104x0 c32104x0, AbstractC32094s0.a aVar, Q1 q12, com.jakewharton.rxrelay3.c cVar, AtomicBoolean atomicBoolean) {
        this.f191029b = c32104x0;
        this.f191030c = aVar;
        this.f191031d = q12;
        this.f191032e = cVar;
        this.f191033f = atomicBoolean;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        CreateChunkedVideoFileResponse createChunkedVideoFileResponse = (CreateChunkedVideoFileResponse) obj;
        VideoInfo alreadyExistingVideo = createChunkedVideoFileResponse.getAlreadyExistingVideo();
        AbstractC32094s0.a aVar = this.f191030c;
        C32104x0 c32104x0 = this.f191029b;
        if (alreadyExistingVideo != null) {
            C30277e1 c30277e1 = c32104x0.f191326e;
            c30277e1.getClass();
            kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[45];
            if (((Boolean) c30277e1.f144983S.a().invoke()).booleanValue()) {
                String str = aVar.f191218a;
                InterfaceC32024m interfaceC32024m = c32104x0.f191322a;
                MessengerUserHashInfo messengerUserHashInfo = aVar.f191219b;
                String str2 = aVar.f191220c;
                C41828t c41828tV = interfaceC32024m.V(str2, str, messengerUserHashInfo);
                String videoId = createChunkedVideoFileResponse.getVideoId();
                String str3 = this.f191031d.f215285d;
                return c41828tV.g(str3 == null ? C41823n.f402260b : new C41826q(new C34429s0(c32104x0, str3, str2, videoId, 3)).r()).B(new InterfaceC32098u0.a.b(createChunkedVideoFileResponse.getFileId(), createChunkedVideoFileResponse.getVideoId())).E();
            }
        }
        return c32104x0.f191322a.F(aVar.f191219b, aVar.f191220c, aVar.f191218a, createChunkedVideoFileResponse.getFileId(), createChunkedVideoFileResponse.getVideoId(), createChunkedVideoFileResponse.getUploadSessionId()).g(new C41826q(new G0(aVar, c32104x0, this.f191032e, this.f191033f))).z();
    }
}
