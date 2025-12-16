package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.persistence.messenger.TransferStatus;
import java.io.File;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.CreateVoiceFileResponse;

/* compiled from: FileUploadInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/File;", "file", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t$b;", "apply", "(Ljava/io/File;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class M<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32097u f191054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f191055c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CreateVoiceFileResponse f191056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f191057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f191058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f191059g;

    public M(C32097u c32097u, AbstractC32094s0.a aVar, CreateVoiceFileResponse createVoiceFileResponse, MessengerUserHashInfo messengerUserHashInfo, String str, String str2) {
        this.f191054b = c32097u;
        this.f191055c = aVar;
        this.f191056d = createVoiceFileResponse;
        this.f191057e = messengerUserHashInfo;
        this.f191058f = str;
        this.f191059g = str2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        File file = (File) obj;
        C32097u c32097u = this.f191054b;
        com.avito.android.messenger.conversation.mvi.file_upload.worker.c cVar = c32097u.f191238g;
        String fileId = this.f191056d.getFileId();
        String path = file.getPath();
        String name = file.getName();
        AbstractC32094s0.a aVar = this.f191055c;
        return io.reactivex.rxjava3.core.z.k(c32097u.f191232a.p(this.f191058f, this.f191059g, this.f191057e).T(C32107z.f191338b, Integer.MAX_VALUE), new io.reactivex.rxjava3.internal.operators.mixed.a(cVar.a(aVar, fileId, path, name, null, false).k(new A(aVar, 1)), io.reactivex.rxjava3.core.z.c0(TransferStatus.IN_PROGRESS)), new L()).N(I.f191034b).S().r(new J(aVar, this.f191054b, this.f191056d, file, this.f191058f)).i(new K(file));
    }
}
