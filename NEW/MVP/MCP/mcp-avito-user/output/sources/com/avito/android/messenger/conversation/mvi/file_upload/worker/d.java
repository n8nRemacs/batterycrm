package com.avito.android.messenger.conversation.mvi.file_upload.worker;

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
import com.avito.android.messenger.conversation.mvi.file_upload.worker.FileUploadWorker;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.common.util.concurrent.D0;
import dZ.C39684b;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileUploadManager.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/worker/d;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/worker/c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f191280a;

    @Inject
    public d(@Y61.k Context context) {
        this.f191280a = context;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_upload.worker.c
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.r a(@Y61.k final AbstractC32094s0 abstractC32094s0, @Y61.k final String str, @Y61.k final String str2, @Y61.l final String str3, @Y61.l final String str4, final boolean z12) {
        FileUploadWorker.f191253c.getClass();
        final Context context = this.f191280a;
        return new io.reactivex.rxjava3.internal.operators.completable.r(new Callable() { // from class: com.avito.android.messenger.conversation.mvi.file_upload.worker.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C23544h.a aVar = new C23544h.a();
                C39684b c39684b = FileUploadWorker.f191254d;
                AbstractC32094s0 abstractC32094s02 = abstractC32094s0;
                dZ.g.b(aVar, c39684b, abstractC32094s02.getF191222b());
                String f191223c = abstractC32094s02.getF191223c();
                LinkedHashMap linkedHashMap = aVar.f55511a;
                linkedHashMap.put("channelId", f191223c);
                linkedHashMap.put("localMessageId", abstractC32094s02.getF191221a());
                linkedHashMap.put("fileId", str);
                linkedHashMap.put(MessageBody.File.MIME_TYPE, str4);
                linkedHashMap.put("filePath", str2);
                linkedHashMap.put("fileName", str3);
                linkedHashMap.put("deleteFile", Boolean.valueOf(z12));
                J.a aVarH = new J.a(FileUploadWorker.class).h(aVar.a());
                OutOfQuotaPolicy outOfQuotaPolicy = OutOfQuotaPolicy.f55404b;
                H h12 = aVarH.f55483c;
                h12.f55811q = true;
                h12.f55812r = outOfQuotaPolicy;
                J jB2 = aVarH.a("FileUploadWorker").b();
                WorkManager.f55428a.getClass();
                Y yF2 = Y.f(context);
                FileUploadWorker.a aVar2 = FileUploadWorker.f191253c;
                MessengerUserHashInfo f191222b = abstractC32094s02.getF191222b();
                String f191223c2 = abstractC32094s02.getF191223c();
                String f191221a = abstractC32094s02.getF191221a();
                aVar2.getClass();
                return yF2.a(FileUploadWorker.a.a(f191223c2, f191221a, f191222b), ExistingWorkPolicy.f55375b, jB2).a();
            }
        });
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_upload.worker.c
    @Y61.k
    public final C41826q b(@Y61.k AbstractC32094s0.a aVar) {
        FileUploadWorker.f191253c.getClass();
        WorkManager.f55428a.getClass();
        D0<L.b.c> d0A = C23593c.d(Y.f(this.f191280a), FileUploadWorker.a.a(aVar.f191220c, aVar.f191218a, aVar.f191219b)).a();
        Objects.requireNonNull(d0A, "future is null");
        return new C41826q(io.reactivex.rxjava3.internal.functions.a.e(d0A));
    }
}
