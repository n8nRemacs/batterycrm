package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.persistence.messenger.C33136x2;
import com.avito.android.persistence.messenger.UserEntityType;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.CreateChunkedVideoFileResponse;

/* compiled from: VideoUploadInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Ljava/io/File;", "", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/persistence/messenger/TransferStatus;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d1<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.b f191136b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191137c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CreateChunkedVideoFileResponse f191138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C32092r0 f191139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f191140f;

    public d1(AbstractC32094s0.b bVar, C32104x0 c32104x0, CreateChunkedVideoFileResponse createChunkedVideoFileResponse, C32092r0 c32092r0, AtomicBoolean atomicBoolean) {
        this.f191136b = bVar;
        this.f191137c = c32104x0;
        this.f191138d = createChunkedVideoFileResponse;
        this.f191139e = c32092r0;
        this.f191140f = atomicBoolean;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        File file = (File) q12.f406619b;
        String str = (String) q12.f406620c;
        AbstractC32094s0.b bVar = this.f191136b;
        MessengerUserHashInfo messengerUserHashInfo = bVar.f191222b;
        String str2 = messengerUserHashInfo.f430682d;
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        io.reactivex.rxjava3.internal.operators.completable.T tB2 = this.f191137c.f191322a.e(new C33136x2(str2, bVar.f191223c, bVar.f191221a, bVar.f191224d, bVar.f191225e, file.getPath(), null, str, null, userEntityTypeG, 64, null)).B(kotlin.G0.f406611a);
        C32092r0 c32092r0 = this.f191139e;
        AtomicBoolean atomicBoolean = this.f191140f;
        return tB2.n(new b1(this.f191137c, bVar, this.f191138d, file, str, c32092r0, atomicBoolean));
    }
}
