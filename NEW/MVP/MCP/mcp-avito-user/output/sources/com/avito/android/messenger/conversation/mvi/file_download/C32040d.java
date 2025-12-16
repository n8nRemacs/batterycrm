package com.avito.android.messenger.conversation.mvi.file_download;

import android.content.Context;
import androidx.work.C23544h;
import androidx.work.ExistingWorkPolicy;
import androidx.work.J;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkManager;
import androidx.work.impl.Y;
import com.avito.android.C30277e1;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.conversation.mvi.file_download.FileDownloadWorker;
import com.avito.android.persistence.messenger.FileChunkMetaInfo;
import dZ.C39684b;
import io.reactivex.rxjava3.internal.operators.completable.C41811b;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileDownloadManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "alreadyEnqueued", "Lio/reactivex/rxjava3/core/g;", "apply", "(Z)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.file_download.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32040d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32042f f190911b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190912c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<FileChunkMetaInfo> f190915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f190916g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f190917h;

    public C32040d(C32042f c32042f, MessengerUserHashInfo messengerUserHashInfo, String str, String str2, List<FileChunkMetaInfo> list, Integer num, long j12) {
        this.f190911b = c32042f;
        this.f190912c = messengerUserHashInfo;
        this.f190913d = str;
        this.f190914e = str2;
        this.f190915f = list;
        this.f190916g = num;
        this.f190917h = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return C41823n.f402260b;
        }
        C32042f c32042f = this.f190911b;
        InterfaceC32024m interfaceC32024m = c32042f.f190921c;
        final MessengerUserHashInfo messengerUserHashInfo = this.f190912c;
        C41811b c41811bG = interfaceC32024m.z(messengerUserHashInfo, this.f190913d, this.f190914e, this.f190915f, this.f190916g).g(new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC32050n(c32042f, 1)));
        FileDownloadWorker.a aVar = FileDownloadWorker.f190805d;
        C30277e1 c30277e1 = c32042f.f190923e;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[36];
        final boolean zBooleanValue = ((Boolean) c30277e1.f144965J.a().invoke()).booleanValue();
        aVar.getClass();
        final String str = this.f190914e;
        final Context context = c32042f.f190919a;
        final String str2 = this.f190913d;
        final long j12 = this.f190917h;
        final Integer num = this.f190916g;
        return c41811bG.g(new io.reactivex.rxjava3.internal.operators.completable.r(new Callable() { // from class: com.avito.android.messenger.conversation.mvi.file_download.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str3;
                C23544h.a aVar2 = new C23544h.a();
                C39684b c39684b = FileDownloadWorker.f190806e;
                MessengerUserHashInfo messengerUserHashInfo2 = messengerUserHashInfo;
                dZ.g.b(aVar2, c39684b, messengerUserHashInfo2);
                LinkedHashMap linkedHashMap = aVar2.f55511a;
                String str4 = str2;
                linkedHashMap.put("channelId", str4);
                String str5 = str;
                linkedHashMap.put("localMessageId", str5);
                aVar2.c("enqTimestamp", j12);
                Integer num2 = num;
                if (num2 != null) {
                    linkedHashMap.put("chunkIndex", num2.toString());
                }
                J.a aVarH = new J.a(FileDownloadWorker.class).h(aVar2.a());
                if (zBooleanValue) {
                    aVarH = aVarH;
                    OutOfQuotaPolicy outOfQuotaPolicy = OutOfQuotaPolicy.f55404b;
                    androidx.work.impl.model.H h12 = aVarH.f55483c;
                    h12.f55811q = true;
                    h12.f55812r = outOfQuotaPolicy;
                }
                androidx.work.J jB2 = aVarH.a("FileDownloadWorker").b();
                WorkManager.f55428a.getClass();
                Y yF2 = Y.f(context);
                String strH = com.avito.android.messenger.util.i.h(messengerUserHashInfo2.f430681c);
                if (num2 == null) {
                    str3 = "";
                } else {
                    str3 = "||" + num2;
                }
                StringBuilder sb2 = new StringBuilder();
                androidx.media3.exoplayer.analytics.m.p(sb2, messengerUserHashInfo2.f430682d, "||", str4, "||");
                return yF2.a(androidx.camera.camera2.internal.G.g(sb2, str5, strH, str3), ExistingWorkPolicy.f55375b, jB2).a();
            }
        }));
    }
}
