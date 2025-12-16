package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.V2;
import java.io.File;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileUploadInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/File;", "file", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t$a;", "apply", "(Ljava/io/File;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class F<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f191006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32097u f191007c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f191008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MessageBody.File f191009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f191010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f191011g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f191012h;

    public F(AbstractC32094s0.a aVar, C32097u c32097u, String str, MessageBody.File file, MessengerUserHashInfo messengerUserHashInfo, String str2, String str3) {
        this.f191006b = aVar;
        this.f191007c = c32097u;
        this.f191008d = str;
        this.f191009e = file;
        this.f191010f = messengerUserHashInfo;
        this.f191011g = str2;
        this.f191012h = str3;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        File file = (File) obj;
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder("File is copied to internal storage and ready for uploadId = ");
        AbstractC32094s0.a aVar = this.f191006b;
        sb2.append(aVar);
        v22.c("FileUploadInteractorImpl", sb2.toString(), null);
        C32097u c32097u = this.f191007c;
        com.avito.android.messenger.conversation.mvi.file_upload.worker.c cVar = c32097u.f191238g;
        String path = file.getPath();
        MessageBody.File file2 = this.f191009e;
        return io.reactivex.rxjava3.core.z.k(c32097u.f191232a.p(this.f191011g, this.f191012h, this.f191010f).T(C32107z.f191338b, Integer.MAX_VALUE), new io.reactivex.rxjava3.internal.operators.mixed.a(cVar.a(aVar, this.f191008d, path, file2.getName(), file2.getMimeType(), true).k(new A(aVar, 0)), io.reactivex.rxjava3.core.z.c0(TransferStatus.IN_PROGRESS)), new E()).N(B.f190991b).S().r(new C(aVar, this.f191009e, this.f191007c, this.f191011g, this.f191008d)).i(new D(file));
    }
}
