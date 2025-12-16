package com.avito.android.messenger.conversation.mvi.data;

import Ag.CallableC13028a;
import androidx.work.impl.CallableC23587q;
import com.airbnb.lottie.CallableC27295o;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.persistence.messenger.C33136x2;
import com.avito.android.persistence.messenger.FileChunkMetaInfo;
import com.avito.android.persistence.messenger.InterfaceC33043a0;
import com.avito.android.persistence.messenger.InterfaceC33140y2;
import com.avito.android.persistence.messenger.IsReadStatus;
import com.avito.android.persistence.messenger.O1;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.persistence.messenger.R1;
import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import com.avito.android.persistence.messenger.Y0;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.huawei.hms.adapter.internal.CommonCode;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.completable.C41828t;
import io.reactivex.rxjava3.internal.operators.flowable.C41906z1;
import io.reactivex.rxjava3.internal.operators.observable.C41934a1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.MessengerUserType;

/* compiled from: MessageRepository.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/data/d0;", "Lcom/avito/android/messenger/conversation/mvi/data/m;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d0 implements InterfaceC32024m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y0 f190454a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R1 f190455b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33140y2 f190456c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33043a0 f190457d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32021j f190458e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32012a f190459f;

    @Inject
    public d0(@Y61.k Y0 y02, @Y61.k R1 r12, @Y61.k InterfaceC33140y2 interfaceC33140y2, @Y61.k InterfaceC33043a0 interfaceC33043a0, @Y61.k InterfaceC32021j interfaceC32021j, @Y61.k InterfaceC32012a interfaceC32012a) {
        this.f190454a = y02;
        this.f190455b = r12;
        this.f190456c = interfaceC33140y2;
        this.f190457d = interfaceC33043a0;
        this.f190458e = interfaceC32021j;
        this.f190459f = interfaceC32012a;
    }

    public static final io.reactivex.rxjava3.core.z a(d0 d0Var, List list, MessengerUserHashInfo messengerUserHashInfo, String str) {
        io.reactivex.rxjava3.core.z zVarI;
        d0Var.getClass();
        if (list.isEmpty()) {
            return io.reactivex.rxjava3.core.z.c0(C42784z0.f406748b);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((O1) it.next()).f215238a);
        }
        int size = arrayList.size();
        R1 r12 = d0Var.f190455b;
        if (size > 500) {
            ArrayList arrayListR0 = C42745f0.R0(arrayList, 500, 500);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListR0, 10));
            Iterator it2 = arrayListR0.iterator();
            while (it2.hasNext()) {
                arrayList2.add(r12.i(messengerUserHashInfo.f430682d, str, (List) it2.next(), com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)));
            }
            zVarI = io.reactivex.rxjava3.core.z.m(arrayList2, Y.f190437b);
        } else {
            zVarI = r12.i(messengerUserHashInfo.f430682d, str, arrayList, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c));
        }
        return zVarI.d0(new Z(d0Var, list));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t A(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l List list, @Y61.l Integer num) {
        ArrayList arrayList;
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        if (num == null) {
            return C31685o.n(this, "setFileInternalPath", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2), new kotlin.Q("internalPath", String.valueOf(str3))), this.f190455b.p(messengerUserHashInfo.f430682d, str, str2, str3, com.avito.android.messenger.util.i.g(messengerUserType)));
        }
        if (list != null) {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            int i12 = 0;
            for (Object obj : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                FileChunkMetaInfo fileChunkMetaInfoCopy$default = (FileChunkMetaInfo) obj;
                if (i12 == num.intValue()) {
                    fileChunkMetaInfoCopy$default = FileChunkMetaInfo.copy$default(fileChunkMetaInfoCopy$default, 0, 0L, str3, null, 11, null);
                }
                arrayList2.add(fileChunkMetaInfoCopy$default);
                i12 = i13;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return C31685o.n(this, "setFileInternalPath", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2), new kotlin.Q("internalPath", String.valueOf(str3))), this.f190455b.d(messengerUserHashInfo.f430682d, str, str2, com.avito.android.messenger.util.i.g(messengerUserType), arrayList));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t B(@Y61.k final List list) {
        AbstractC41768a rVar;
        if (list.size() > 500) {
            ArrayList<List> arrayListR0 = C42745f0.R0(list, 500, 500);
            ArrayList arrayList = new ArrayList(C42745f0.q(arrayListR0, 10));
            for (final List list2 : arrayListR0) {
                final int i12 = 0;
                arrayList.add(new io.reactivex.rxjava3.internal.operators.completable.r(new Callable(this) { // from class: com.avito.android.messenger.conversation.mvi.data.r

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ d0 f190499c;

                    {
                        this.f190499c = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i12) {
                            case 0:
                                String[] strArr = (String[]) list2.toArray(new String[0]);
                                return Integer.valueOf(this.f190499c.f190454a.u((String[]) Arrays.copyOf(strArr, strArr.length)));
                            default:
                                String[] strArr2 = (String[]) list2.toArray(new String[0]);
                                return Integer.valueOf(this.f190499c.f190454a.u((String[]) Arrays.copyOf(strArr2, strArr2.length)));
                        }
                    }
                }));
            }
            rVar = AbstractC41768a.p(arrayList);
        } else {
            final int i13 = 1;
            rVar = new io.reactivex.rxjava3.internal.operators.completable.r(new Callable(this) { // from class: com.avito.android.messenger.conversation.mvi.data.r

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d0 f190499c;

                {
                    this.f190499c = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i13) {
                        case 0:
                            String[] strArr = (String[]) list.toArray(new String[0]);
                            return Integer.valueOf(this.f190499c.f190454a.u((String[]) Arrays.copyOf(strArr, strArr.length)));
                        default:
                            String[] strArr2 = (String[]) list.toArray(new String[0]);
                            return Integer.valueOf(this.f190499c.f190454a.u((String[]) Arrays.copyOf(strArr2, strArr2.length)));
                    }
                }
            });
        }
        return rVar.t(new c0(this, "markMessagesAsFailed", Collections.singletonMap("localIds", list)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 C(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return new io.reactivex.rxjava3.internal.operators.single.G(new CallableC13028a(18, this, messengerUserHashInfo)).w(new b0(this, "getMessageCount", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q[0])));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t D(@Y61.k List list) {
        return this.f190456c.a(list).t(new c0(this, "deleteMessageUploadParts", P0.c()));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t E(@Y61.k LocalMessage localMessage) {
        return new C41826q(new C32025n(this, localMessage, 0)).t(new c0(this, "createMessage", Collections.singletonMap("message", localMessage)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t F(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5) {
        return C31685o.n(this, "setChunkedVideoIds", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2), new kotlin.Q("fileId", str3), new kotlin.Q(MessageBody.Video.VIDEO_ID, str4), new kotlin.Q("uploadSessionId", str5)), this.f190455b.n(messengerUserHashInfo.f430682d, str, str2, str3, str4, str5, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t G(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return C31685o.n(this, "deleteMessageUploadParts", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2)), this.f190456c.c(com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, str, str2));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t H(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        return C31685o.n(this, "updateFileHash", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2), new kotlin.Q("fileHash", String.valueOf(str3))), this.f190455b.l(messengerUserHashInfo.f430682d, str, str2, str3, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t I(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, long j12, @Y61.k String str3) {
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        return C31685o.n(this, "setMessagePartUploadedSuccessfully", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2), new kotlin.Q("partNumber", Long.valueOf(j12)), new kotlin.Q("eTag", str3)), this.f190456c.h(messengerUserHashInfo.f430682d, str, str2, j12, str3, TransferStatus.SUCCESS, userEntityTypeG));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 J(@Y61.k String str) {
        return this.f190455b.g(str).r(C32034x.f190516b).w(new b0(this, "containsMetaInfoWithInternalPath", Collections.singletonMap("internalPath", str)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 K(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return this.f190454a.c(messengerUserHashInfo.f430682d, str, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)).d0(new P(this)).S().w(new b0(this, "getMessagesWithIncompleteBodies", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 L(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return this.f190454a.n(j12, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, str).w(new b0(this, "getRemoteIdsOfMessagesBefore", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("before", Long.valueOf(j12)))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 M(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserType);
        Y0 y02 = this.f190454a;
        String str3 = messengerUserHashInfo.f430682d;
        return io.reactivex.rxjava3.core.z.k(y02.t(userEntityTypeG, str3, str, str2), this.f190455b.q(com.avito.android.messenger.util.i.g(messengerUserType), str3, str, str2), new F(this)).S().w(new b0(this, "getMessageAndMetaInfo", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t N(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return C31685o.n(this, "deleteMessageAndMetaInfo", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localId", str2)), new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC32027p(this, messengerUserHashInfo, str, str2, 0)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41934a1 O(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        return new C41934a1(this.f190454a.k(messengerUserHashInfo.f430682d, IsReadStatus.IS_READ_LOCALLY, userEntityTypeG).d0(new P(this)).d0(Q.f190427b), new a0(this, "getLatestReadLocallyMessage", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q[0])));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t P(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return C31685o.n(this, "markOutgoingMessagesAsReadInChannel", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("timestamp", Long.valueOf(j12))), new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC32026o(this, messengerUserHashInfo, str, j12, 0)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41934a1 Q(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return new C41934a1(this.f190454a.s(messengerUserHashInfo.f430682d, str, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), IsReadStatus.IS_NOT_READ).d0(new P(this)), new a0(this, "getUnreadMessages", Collections.singletonMap("channelId", str)));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.rxjava3.internal.operators.completable.C41828t R(@Y61.k ru.avito.messenger.MessengerUserHashInfo r22, @Y61.k java.lang.String r23, @Y61.k java.lang.String r24, @Y61.l java.util.List r25, @Y61.l java.lang.Integer r26) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.data.d0.R(ru.avito.messenger.MessengerUserHashInfo, java.lang.String, java.lang.String, java.util.List, java.lang.Integer):io.reactivex.rxjava3.internal.operators.completable.t");
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 S() {
        return this.f190456c.f().w(new b0(this, "getMessageUploadPartsWithoutCorrespondingMetaInfo", P0.c()));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t T(@Y61.k LocalMessage localMessage, @Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        String userId = localMessage.getUserId();
        String accountId = localMessage.getAccountId();
        return new C41826q(new C32028q(this, localMessage, new Q1(userId, localMessage.getChannelId(), localMessage.getLocalId(), str, null, 0L, null, null, null, 0L, null, 0L, 0L, str2, null, null, false, null, str3, com.avito.android.messenger.util.i.f(localMessage.getUserType()), accountId, null, null, 6545360, null), 0)).t(new c0(this, "createVideoMessage", P0.g(new kotlin.Q("message", localMessage), new kotlin.Q("path", str), new kotlin.Q("fileName", str2))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t U(@Y61.k LocalMessage localMessage, @Y61.k String str, @Y61.k String str2, long j12) {
        String userId = localMessage.getUserId();
        String accountId = localMessage.getAccountId();
        return new C41826q(new C32028q(this, localMessage, new Q1(userId, localMessage.getChannelId(), localMessage.getLocalId(), str, null, 0L, null, null, null, j12, null, 0L, 0L, str2, null, null, false, null, null, com.avito.android.messenger.util.i.f(localMessage.getUserType()), accountId, null, null, 6807024, null), 1)).t(new c0(this, "createVoiceMessage", P0.g(new kotlin.Q("message", localMessage), new kotlin.Q("path", str), new kotlin.Q("fileName", str2))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t V(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        return C31685o.n(this, "setFileTransferredSuccessfully", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2)), this.f190455b.m(messengerUserHashInfo.f430682d, str, str2, TransferStatus.SUCCESS, userEntityTypeG));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t W(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, long j12) {
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        return C31685o.n(this, "setMessagePartUploadFailed", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2), new kotlin.Q("partNumber", Long.valueOf(j12))), this.f190456c.d(messengerUserHashInfo.f430682d, str, str2, j12, TransferStatus.ERROR, userEntityTypeG));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t X(@Y61.k List list) {
        return this.f190455b.a(list).t(new c0(this, "deleteMessageMetaInfos", P0.c()));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41934a1 Y(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        io.reactivex.rxjava3.core.z<R> zVarY0 = this.f190454a.E(j12, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, str).y0(new D(this, messengerUserHashInfo, str));
        a0 a0Var = new a0(this, "getLatestMessagesAndMetaInfo", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("limit", Long.valueOf(j12))));
        zVarY0.getClass();
        return new C41934a1(zVarY0, a0Var);
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 Z(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return this.f190455b.q(com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, str, str2).S().r(G.f190417b).w(new b0(this, "getMessageMetaInfo", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 a0(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k List list) {
        return this.f190454a.l(messengerUserHashInfo.f430682d, list, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)).r(new N(this)).w(new b0(this, "getMessagesWithRemoteIds", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("remoteIds", list))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 b() {
        return this.f190455b.b().w(new b0(this, "getMetaInfosWithoutCorrespondingMessage", P0.c()));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t b0(@Y61.k final MessengerUserHashInfo messengerUserHashInfo, @Y61.k final List list, final long j12) {
        AbstractC41768a rVar;
        if (list.size() > 500) {
            ArrayList<List> arrayListR0 = C42745f0.R0(list, 500, 500);
            ArrayList arrayList = new ArrayList(C42745f0.q(arrayListR0, 10));
            for (final List list2 : arrayListR0) {
                final int i12 = 0;
                arrayList.add(new io.reactivex.rxjava3.internal.operators.completable.r(new Callable(this) { // from class: com.avito.android.messenger.conversation.mvi.data.u

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ d0 f190511c;

                    {
                        this.f190511c = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i12) {
                            case 0:
                                MessengerUserHashInfo messengerUserHashInfo2 = messengerUserHashInfo;
                                UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo2.f430681c);
                                IsReadStatus isReadStatus = IsReadStatus.IS_READ;
                                return Integer.valueOf(this.f190511c.f190454a.A(messengerUserHashInfo2.f430682d, list2, j12, isReadStatus, userEntityTypeG));
                            default:
                                MessengerUserHashInfo messengerUserHashInfo3 = messengerUserHashInfo;
                                UserEntityType userEntityTypeG2 = com.avito.android.messenger.util.i.g(messengerUserHashInfo3.f430681c);
                                IsReadStatus isReadStatus2 = IsReadStatus.IS_READ;
                                return Integer.valueOf(this.f190511c.f190454a.A(messengerUserHashInfo3.f430682d, list2, j12, isReadStatus2, userEntityTypeG2));
                        }
                    }
                }));
            }
            rVar = AbstractC41768a.p(arrayList);
        } else {
            final int i13 = 1;
            rVar = new io.reactivex.rxjava3.internal.operators.completable.r(new Callable(this) { // from class: com.avito.android.messenger.conversation.mvi.data.u

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d0 f190511c;

                {
                    this.f190511c = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i13) {
                        case 0:
                            MessengerUserHashInfo messengerUserHashInfo2 = messengerUserHashInfo;
                            UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo2.f430681c);
                            IsReadStatus isReadStatus = IsReadStatus.IS_READ;
                            return Integer.valueOf(this.f190511c.f190454a.A(messengerUserHashInfo2.f430682d, list, j12, isReadStatus, userEntityTypeG));
                        default:
                            MessengerUserHashInfo messengerUserHashInfo3 = messengerUserHashInfo;
                            UserEntityType userEntityTypeG2 = com.avito.android.messenger.util.i.g(messengerUserHashInfo3.f430681c);
                            IsReadStatus isReadStatus2 = IsReadStatus.IS_READ;
                            return Integer.valueOf(this.f190511c.f190454a.A(messengerUserHashInfo3.f430682d, list, j12, isReadStatus2, userEntityTypeG2));
                    }
                }
            });
        }
        return rVar.t(new c0(this, "markMessagesAsRead", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("messageIds", list), new kotlin.Q("timestamp", Long.valueOf(j12)))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t c(@Y61.k ArrayList arrayList) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC13028a(17, this, arrayList)).t(new c0(this, "updateVoiceMetaInfo", P0.c()));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 c0(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return this.f190455b.q(com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, str, str2).S().n(new I(this, messengerUserHashInfo, str, str2)).w(new b0(this, "getMessageMetaInfoAndUploadParts", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41934a1 d() {
        return new C41934a1(this.f190454a.d().d0(new P(this)), new a0(this, "getAllPendingMessages", P0.c()));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t d0(final long j12, @Y61.k final String str) {
        return new C41826q(new InterfaceC43543a() { // from class: com.avito.android.messenger.conversation.mvi.data.t
            @Override // l41.InterfaceC43543a
            public final void run() {
                this.f190507b.f190454a.a(j12, str);
            }
        }).t(new c0(this, "resetMessageForResend", P0.g(new kotlin.Q("localId", str), new kotlin.Q("newTimestamp", Long.valueOf(j12)))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t e(@Y61.k C33136x2 c33136x2) {
        return this.f190456c.i(c33136x2).t(new c0(this, "createMessageUploadPart", Collections.singletonMap("messageUploadPart", c33136x2)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t e0(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        return C31685o.n(this, "setFileUploadInProgress", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2), new kotlin.Q("bytesTransferred", 0L)), this.f190455b.m(messengerUserHashInfo.f430682d, str, str2, TransferStatus.IN_PROGRESS, userEntityTypeG));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 f(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return this.f190456c.g(com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, str, str2).w(new b0(this, "getMessageUploadParts", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t f0(@Y61.k LocalMessage localMessage) {
        return new C41826q(new C32025n(this, localMessage, 1)).t(new c0(this, "updateMessage", Collections.singletonMap("message", localMessage)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 g(long j12, @Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, long j13) {
        return this.f190454a.v(j12, messengerUserHashInfo.f430682d, str, j13, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)).w(new b0(this, "getRemoteIdsBefore", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("date", Long.valueOf(j12)), new kotlin.Q("limit", Long.valueOf(j13)))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41934a1 g0(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return new C41934a1(this.f190454a.f(messengerUserHashInfo.f430682d, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)).d0(new P(this)).d0(T.f190428b), new a0(this, "observeFirstPendingMessage", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q[0])));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t h(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return C31685o.n(this, "deleteMessage", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2)), new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC32027p(this, messengerUserHashInfo, str, str2, 2)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t h0(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return C31685o.n(this, "markIncomingMessagesAsReadInChannel", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("timestamp", Long.valueOf(j12))), new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC32026o(this, messengerUserHashInfo, str, j12, 1)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41934a1 i(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return new C41934a1(this.f190454a.t(com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, str, str2).d0(new E(this)), new a0(this, "getMessage", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t i0(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
        return C31685o.n(this, "clearRemoteVideoUploadInfo", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2)), this.f190455b.n(messengerUserHashInfo.f430682d, str, str2, null, null, null, userEntityTypeG));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41934a1 j(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return new C41934a1(this.f190454a.B(messengerUserHashInfo.f430682d, str, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)), new a0(this, "getMessageCountObservable", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t k(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return C31685o.n(this, "setIsReadLocallyForMessagesInChannel", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("readLocallyTimeStamp", Long.valueOf(j12))), new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC32026o(this, messengerUserHashInfo, str, j12, 2)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 l(@Y61.k String str) {
        return this.f190456c.e(str).r(C32033w.f190515b).w(new b0(this, "containsMessageUploadPartWithPath", Collections.singletonMap("path", str)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 m(@Y61.k String str) {
        return this.f190455b.j(str).r(C32035y.f190517b).w(new b0(this, "containsMetaInfoWithRecordedVideoInternalPath", Collections.singletonMap("recordedVideoInternalPath", str)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t n(@Y61.k List list) {
        C41826q c41826q = new C41826q(new GL.a(12, this, list));
        List list2 = list;
        StringBuilder sb2 = new StringBuilder((list2.size() * 3) + 1);
        sb2.append("(size=" + list2.size() + ")[");
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            sb2.append("\n\t");
            sb2.append((LocalMessage) obj);
            if (i12 < list2.size() - 1) {
                sb2.append(",");
            }
            i12 = i13;
        }
        sb2.append("]");
        return c41826q.t(new c0(this, "createMessages", Collections.singletonMap("messages", sb2.toString())));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 o(long j12, @Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return this.f190454a.m(j12, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, str).w(new b0(this, "getLatestRemoteIds", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("limit", Long.valueOf(j12)))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41934a1 p(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return new C41934a1(this.f190455b.q(com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, str, str2).d0(U.f190429b), new a0(this, "observeMessageMetaInfo", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 q(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return this.f190454a.C(com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, str, str2).n(new B(this, messengerUserHashInfo, str)).w(new b0(this, "getPositionInListOfMessageWithRemoteId", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("remoteId", str2))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41934a1 r(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, long j12) {
        return new C41934a1(this.f190456c.b(messengerUserHashInfo.f430682d, str, str2, j12, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)).d0(V.f190430b), new a0(this, "observeMessageUploadPart", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2), new kotlin.Q("partNumber", Long.valueOf(j12)))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t s(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, long j12, long j13, @Y61.l String str4, @Y61.l String str5, boolean z12) {
        return C31685o.n(this, "serChunkedVideoInfo", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2), new kotlin.Q("internalPath", str3), new kotlin.Q("sizeInBytes", Long.valueOf(j12)), new kotlin.Q("chunkCount", Long.valueOf(j13)), new kotlin.Q(CommonCode.MapKey.HAS_RESOLUTION, str4 == null ? "null" : str4), new kotlin.Q("extension", str5 != null ? str5 : "null"), new kotlin.Q("compressionFailed", Boolean.valueOf(z12))), this.f190455b.h(messengerUserHashInfo.f430682d, str, str2, str3, j12, j13, str4, str5, z12 ? 1 : 0, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 t(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, int i12) {
        return new io.reactivex.rxjava3.internal.operators.single.G(new CallableC27295o(i12, this, 1, messengerUserHashInfo, str)).w(new b0(this, "getTimestampOfTheOldestAmongTheLatestNMessages", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("limit", Integer.valueOf(i12)))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t u(@Y61.k LocalMessage localMessage, @Y61.k String str) {
        String userId = localMessage.getUserId();
        String accountId = localMessage.getAccountId();
        return new C41826q(new C32028q(this, localMessage, new Q1(userId, localMessage.getChannelId(), localMessage.getLocalId(), str, null, 0L, null, null, null, 0L, null, 0L, 0L, null, null, null, false, null, null, com.avito.android.messenger.util.i.f(localMessage.getUserType()), accountId, null, null, 6815680, null), 2)).t(new c0(this, "createFileMessage", P0.g(new kotlin.Q("message", localMessage), new kotlin.Q("path", str))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t v(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l Integer num, @Y61.l Q1 q12) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = "path";
        String str9 = "localMessageId";
        String str10 = "channelId";
        String str11 = "setFileDownloadedSuccessfully";
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        if (num == null) {
            return C31685o.n(this, "setFileDownloadedSuccessfully", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2), new kotlin.Q("path", str3)), this.f190455b.k(TransferStatus.SUCCESS, com.avito.android.messenger.util.i.g(messengerUserType), messengerUserHashInfo.f430682d, str, str2, str3));
        }
        List<FileChunkMetaInfo> list = q12 != null ? q12.f215303v : null;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            FileChunkMetaInfo fileChunkMetaInfoCopy$default = (FileChunkMetaInfo) obj;
            if (i12 == num.intValue()) {
                str4 = str11;
                str6 = str8;
                str7 = str9;
                str5 = str10;
                fileChunkMetaInfoCopy$default = FileChunkMetaInfo.copy$default(fileChunkMetaInfoCopy$default, 0, 0L, str3, TransferStatus.SUCCESS, 1, null);
            } else {
                str4 = str11;
                str5 = str10;
                str6 = str8;
                str7 = str9;
            }
            arrayList.add(fileChunkMetaInfoCopy$default);
            str8 = str6;
            i12 = i13;
            str10 = str5;
            str11 = str4;
            str9 = str7;
        }
        return C31685o.n(this, str11, com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q(str10, str), new kotlin.Q(str9, str2), new kotlin.Q(str8, str3)), this.f190455b.d(messengerUserHashInfo.f430682d, str, str2, com.avito.android.messenger.util.i.g(messengerUserType), arrayList));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 w(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return this.f190454a.C(com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, str, str2).r(new K(this)).w(new b0(this, "getMessageWithRemoteId", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("remoteId", str2))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.f0
    @Y61.k
    public final C41906z1 x(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return new io.reactivex.rxjava3.internal.operators.single.G(new CallableC23587q(this, messengerUserHashInfo, str, 9)).w(new b0(this, "getMessageCount", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str))));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t y(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l Integer num) {
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        if (num != null) {
            return this.f190455b.q(com.avito.android.messenger.util.i.g(messengerUserType), messengerUserHashInfo.f430682d, str, str2).S().r(W.f190431b).o(new X(this, messengerUserHashInfo, str, str2, num)).t(new c0(this, "setFileTransferFailed", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2), new kotlin.Q("chunkIndex", num))));
        }
        UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserType);
        return C31685o.n(this, "setFileTransferFailed", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2)), this.f190455b.m(messengerUserHashInfo.f430682d, str, str2, TransferStatus.ERROR, userEntityTypeG));
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.g0
    @Y61.k
    public final C41828t z(@Y61.k final MessengerUserHashInfo messengerUserHashInfo, @Y61.k final String str, @Y61.k final String str2, @Y61.l final List list, @Y61.l final Integer num) {
        if (num == null) {
            return C31685o.n(this, "setFileDownloadStarted", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2)), new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC32027p(this, messengerUserHashInfo, str, str2, 1)));
        }
        return C31685o.n(this, "setFileDownloadStarted", com.avito.android.messenger.util.i.a(messengerUserHashInfo, new kotlin.Q("channelId", str), new kotlin.Q("localMessageId", str2), new kotlin.Q("chunkIndex", num)), new io.reactivex.rxjava3.internal.operators.completable.r(new Callable() { // from class: com.avito.android.messenger.conversation.mvi.data.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                MessengerUserHashInfo messengerUserHashInfo2 = messengerUserHashInfo;
                UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo2.f430681c);
                TransferStatus transferStatus = TransferStatus.IN_PROGRESS;
                int iIntValue = num.intValue();
                this.f190501b.f190455b.o(messengerUserHashInfo2.f430682d, str, str2, userEntityTypeG, messengerUserHashInfo2.f430680b, list, iIntValue, transferStatus);
                return G0.f406611a;
            }
        }));
    }
}
