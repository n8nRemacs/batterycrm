package com.avito.android.messenger.conversation.mvi.file_download;

import arrow.core.Y0;
import com.avito.android.persistence.messenger.FileChunkMetaInfo;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.util.V2;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileDownloadManager.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/persistence/messenger/Q1;", "metaInfoOption", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.file_download.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32039c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f190906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190907c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C32042f f190910f;

    public C32039c(Integer num, MessengerUserHashInfo messengerUserHashInfo, String str, String str2, C32042f c32042f) {
        this.f190906b = num;
        this.f190907c = messengerUserHashInfo;
        this.f190908d = str;
        this.f190909e = str2;
        this.f190910f = c32042f;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List<FileChunkMetaInfo> list;
        T next;
        String localPath;
        String str;
        Y0 y02 = (Y0) obj;
        MessengerUserHashInfo messengerUserHashInfo = this.f190907c;
        String str2 = this.f190909e;
        String str3 = this.f190908d;
        C32042f c32042f = this.f190910f;
        Integer num = this.f190906b;
        if (num == null) {
            Q1 q12 = (Q1) y02.c();
            if (q12 != null && (str = q12.f215286e) != null) {
                return c32042f.f190922d.o(str);
            }
            V2 v22 = V2.f318762a;
            StringBuilder sb2 = new StringBuilder("cancelDownload() failed: internalPath is empty - ");
            androidx.media3.exoplayer.analytics.m.p(sb2, com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]), ", channelId = ", str3, ", localMessageId = ");
            sb2.append(str2);
            v22.c("FileDownloadManager", sb2.toString(), null);
            return io.reactivex.rxjava3.core.I.q(G0.f406611a);
        }
        Q1 q13 = (Q1) y02.c();
        if (q13 != null && (list = q13.f215303v) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
                if (((FileChunkMetaInfo) next).getChunkIndex() == num.intValue()) {
                    break;
                }
            }
            FileChunkMetaInfo fileChunkMetaInfo = next;
            if (fileChunkMetaInfo != null && (localPath = fileChunkMetaInfo.getLocalPath()) != null) {
                return c32042f.f190922d.o(localPath);
            }
        }
        V2 v23 = V2.f318762a;
        StringBuilder sb3 = new StringBuilder("cancelDownload() failed: internalPath is empty - ");
        androidx.media3.exoplayer.analytics.m.p(sb3, com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]), ", channelId = ", str3, ", localMessageId = ");
        sb3.append(str2);
        sb3.append(", chunkIndex = ");
        sb3.append(num);
        v23.c("FileDownloadManager", sb3.toString(), null);
        return io.reactivex.rxjava3.core.I.q(G0.f406611a);
    }
}
