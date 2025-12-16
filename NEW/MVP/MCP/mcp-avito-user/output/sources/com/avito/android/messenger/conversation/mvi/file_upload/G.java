package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.V2;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "fileId", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/t$a;", "apply", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class G<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f191017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32097u f191018c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f191019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f191020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f191021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MessageBody.File f191022g;

    public G(AbstractC32094s0.a aVar, C32097u c32097u, MessengerUserHashInfo messengerUserHashInfo, String str, String str2, MessageBody.File file) {
        this.f191017b = aVar;
        this.f191018c = c32097u;
        this.f191019d = messengerUserHashInfo;
        this.f191020e = str;
        this.f191021f = str2;
        this.f191022g = file;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String str = (String) obj;
        V2 v22 = V2.f318762a;
        StringBuilder sbA = androidx.appcompat.app.r.A("Received fileId = ", str, " for uploadId = ");
        AbstractC32094s0.a aVar = this.f191017b;
        sbA.append(aVar);
        v22.c("FileUploadInteractorImpl", sbA.toString(), null);
        C32097u c32097u = this.f191018c;
        InterfaceC32024m interfaceC32024m = c32097u.f191232a;
        String str2 = this.f191021f;
        MessengerUserHashInfo messengerUserHashInfo = this.f191019d;
        return interfaceC32024m.Z(this.f191020e, str2, messengerUserHashInfo).n(new C32103x(c32097u)).n(new F(aVar, this.f191018c, str, this.f191022g, messengerUserHashInfo, this.f191020e, this.f191021f));
    }
}
