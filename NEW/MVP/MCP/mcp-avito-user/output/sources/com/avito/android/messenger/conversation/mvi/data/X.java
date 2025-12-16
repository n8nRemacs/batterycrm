package com.avito.android.messenger.conversation.mvi.data;

import com.avito.android.persistence.messenger.FileChunkMetaInfo;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.persistence.messenger.R1;
import com.avito.android.persistence.messenger.TransferStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageRepository.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/persistence/messenger/Q1;", "metaInfo", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/persistence/messenger/Q1;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class X<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f190432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190433c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f190436f;

    public X(d0 d0Var, MessengerUserHashInfo messengerUserHashInfo, String str, String str2, Integer num) {
        this.f190432b = d0Var;
        this.f190433c = messengerUserHashInfo;
        this.f190434d = str;
        this.f190435e = str2;
        this.f190436f = num;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ArrayList arrayList;
        List<FileChunkMetaInfo> list = ((Q1) obj).f215303v;
        if (list != null) {
            List<FileChunkMetaInfo> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (FileChunkMetaInfo fileChunkMetaInfoCopy$default : list2) {
                int chunkIndex = fileChunkMetaInfoCopy$default.getChunkIndex();
                Integer num = this.f190436f;
                if (num != null && chunkIndex == num.intValue()) {
                    fileChunkMetaInfoCopy$default = FileChunkMetaInfo.copy$default(fileChunkMetaInfoCopy$default, 0, 0L, null, TransferStatus.ERROR, 5, null);
                }
                arrayList.add(fileChunkMetaInfoCopy$default);
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        R1 r12 = this.f190432b.f190455b;
        MessengerUserHashInfo messengerUserHashInfo = this.f190433c;
        return r12.d(messengerUserHashInfo.f430682d, this.f190434d, this.f190435e, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), arrayList2);
    }
}
