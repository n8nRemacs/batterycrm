package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import androidx.work.C23544h;
import androidx.work.ExistingWorkPolicy;
import androidx.work.J;
import androidx.work.L;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkManager;
import androidx.work.impl.Y;
import androidx.work.impl.model.H;
import androidx.work.impl.utils.C23593c;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.video.chunked_upload.ChunkedVideoUploadWorker;
import com.avito.android.persistence.messenger.InterfaceC33140y2;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.common.util.concurrent.D0;
import dZ.C39684b;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.completable.I;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChunkedVideoUploadManager.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/f;", "Lcom/avito/android/messenger/conversation/mvi/video/chunked_upload/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements InterfaceC32303b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f194933a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_attachment.n f194934b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33140y2 f194935c;

    @Inject
    public f(@Y61.k Context context, @Y61.k com.avito.android.messenger.conversation.mvi.file_attachment.n nVar, @Y61.k InterfaceC33140y2 interfaceC33140y2) {
        this.f194933a = context;
        this.f194934b = nVar;
        this.f194935c = interfaceC33140y2;
    }

    @Override // com.avito.android.messenger.conversation.mvi.video.chunked_upload.InterfaceC32303b
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.r a(@Y61.k final AbstractC32094s0.b bVar, @Y61.k final String str, @Y61.k final String str2, @Y61.k final String str3, @Y61.k final String str4, @Y61.l final String str5, @Y61.l final String str6) {
        ChunkedVideoUploadWorker.f194897c.getClass();
        final Context context = this.f194933a;
        return new io.reactivex.rxjava3.internal.operators.completable.r(new Callable() { // from class: com.avito.android.messenger.conversation.mvi.video.chunked_upload.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C23544h.a aVar = new C23544h.a();
                C39684b c39684b = ChunkedVideoUploadWorker.f194898d;
                AbstractC32094s0.b bVar2 = bVar;
                MessengerUserHashInfo messengerUserHashInfo = bVar2.f191222b;
                dZ.g.b(aVar, c39684b, messengerUserHashInfo);
                LinkedHashMap linkedHashMap = aVar.f55511a;
                String str7 = bVar2.f191223c;
                linkedHashMap.put("channelId", str7);
                String str8 = bVar2.f191221a;
                linkedHashMap.put("localMessageId", str8);
                linkedHashMap.put("fileId", str);
                linkedHashMap.put("hash", str3);
                linkedHashMap.put("uploadSessionId", str4);
                linkedHashMap.put(MessageBody.File.MIME_TYPE, str5);
                linkedHashMap.put("filePath", str2);
                linkedHashMap.put("fileName", str6);
                long j12 = bVar2.f191224d;
                aVar.c("partNumber", j12);
                aVar.c("totalPartNumber", bVar2.f191225e);
                J.a aVarH = new J.a(ChunkedVideoUploadWorker.class).h(aVar.a());
                OutOfQuotaPolicy outOfQuotaPolicy = OutOfQuotaPolicy.f55404b;
                H h12 = aVarH.f55483c;
                h12.f55811q = true;
                h12.f55812r = outOfQuotaPolicy;
                J jB2 = aVarH.a("ChunkedVideoUploadWorker").b();
                WorkManager.f55428a.getClass();
                Y yF2 = Y.f(context);
                ChunkedVideoUploadWorker.f194897c.getClass();
                return yF2.a(ChunkedVideoUploadWorker.a.a(messengerUserHashInfo, str7, str8, j12), ExistingWorkPolicy.f55375b, jB2).a();
            }
        });
    }

    @Override // com.avito.android.messenger.conversation.mvi.video.chunked_upload.InterfaceC32303b
    @Y61.k
    public final I b(@Y61.k AbstractC32094s0.b bVar) {
        ChunkedVideoUploadWorker.f194897c.getClass();
        WorkManager.f55428a.getClass();
        D0<L.b.c> d0A = C23593c.d(Y.f(this.f194933a), ChunkedVideoUploadWorker.a.a(bVar.f191222b, bVar.f191223c, bVar.f191221a, bVar.f191224d)).a();
        Objects.requireNonNull(d0A, "future is null");
        return new C41826q(io.reactivex.rxjava3.internal.functions.a.e(d0A)).B(G0.f406611a).n(new C32305d(this, bVar)).r(e.f194932b).o(new C32304c(this)).r();
    }
}
