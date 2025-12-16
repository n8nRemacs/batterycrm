package com.avito.android.messenger.conversation.mvi.data;

import com.avito.android.persistence.messenger.IsReadStatus;
import com.avito.android.persistence.messenger.O1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.Quote;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;

/* compiled from: MessageEntityConverter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/data/k;", "Lcom/avito/android/messenger/conversation/mvi/data/j;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.data.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32022k implements InterfaceC32021j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32019h f190478a;

    /* compiled from: _Sequences.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "kotlin/sequences/L", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.data.k$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f190479l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof MessageBody.SystemMessageBody.Platform.Bubble.Image);
        }
    }

    @Inject
    public C32022k(@Y61.k InterfaceC32019h interfaceC32019h) {
        this.f190478a = interfaceC32019h;
    }

    public static boolean c(MessageBody messageBody) {
        if (!(messageBody instanceof MessageBody.ImageReference ? true : messageBody instanceof MessageBody.ItemReference)) {
            if (!(messageBody instanceof MessageBody.Link)) {
                if (!(messageBody instanceof MessageBody.SystemMessageBody.Platform)) {
                    return true;
                }
                C43025h.a aVar = new C43025h.a(C43033p.i(new C42770s0(((MessageBody.SystemMessageBody.Platform) messageBody).getChunks()), a.f190479l));
                while (aVar.hasNext()) {
                    if (((MessageBody.SystemMessageBody.Platform.Bubble.Image) aVar.next()).getImage() != null) {
                    }
                }
                return true;
            }
            MessageBody.Link.Preview preview = ((MessageBody.Link) messageBody).getPreview();
            if ((preview != null ? preview.getImageId() : null) == null || preview.getImage() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.InterfaceC32021j
    @Y61.k
    public final O1 a(@Y61.k LocalMessage localMessage) {
        String str;
        String str2;
        String str3;
        String str4;
        Long l12;
        Boolean bool;
        Integer chunkIndex;
        Quote quote = localMessage.getQuote();
        InterfaceC32019h interfaceC32019h = this.f190478a;
        if (quote != null) {
            String id2 = quote.getId();
            String fromId = quote.getFromId();
            String strC = interfaceC32019h.c(quote.getBody());
            String strB = interfaceC32019h.b(quote.getBody());
            Long lValueOf = Long.valueOf(quote.getCreated());
            Boolean boolValueOf = Boolean.valueOf(c(quote.getBody()));
            chunkIndex = quote.getChunkIndex();
            str = id2;
            str2 = fromId;
            str3 = strC;
            str4 = strB;
            l12 = lValueOf;
            bool = boolValueOf;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            l12 = null;
            bool = null;
            chunkIndex = null;
        }
        String localId = localMessage.getLocalId();
        String channelId = localMessage.getChannelId();
        String remoteId = localMessage.getRemoteId();
        return new O1(localId, channelId, (remoteId == null || remoteId.length() <= 0) ? null : remoteId, localMessage.getCreated(), interfaceC32019h.c(localMessage.getBody()), localMessage.getUserId(), localMessage.getFromId(), interfaceC32019h.b(localMessage.getBody()), localMessage.isRead(), false, localMessage.isFailed(), localMessage.getReadTimestamp(), localMessage.getPreview(), localMessage.isSupported(), c(localMessage.getBody()), localMessage.isRead() ? IsReadStatus.IS_READ : IsReadStatus.IS_NOT_READ, localMessage.getReadLocallyTimestamp(), str, str2, str3, str4, l12, bool, chunkIndex, localMessage.getXHash(), com.avito.android.messenger.util.i.f(localMessage.getUserType()), localMessage.getAccountId(), localMessage.getSendTimestamp(), 512, null);
    }

    @Override // com.avito.android.messenger.conversation.mvi.data.InterfaceC32021j
    @Y61.k
    public final LocalMessage b(@Y61.k O1 o12) {
        LocalMessage.Type type;
        String str;
        String str2;
        String str3;
        Long l12;
        String str4 = o12.f215242e;
        String str5 = o12.f215245h;
        InterfaceC32019h interfaceC32019h = this.f190478a;
        MessageBody messageBodyA = interfaceC32019h.a(str4, str5);
        String str6 = o12.f215255r;
        Quote quote = (str6 == null || (str = o12.f215256s) == null || (str2 = o12.f215257t) == null || (str3 = o12.f215258u) == null || (l12 = o12.f215259v) == null) ? null : new Quote(str6, interfaceC32019h.a(str2, str3), l12.longValue(), str, o12.f215261x);
        int iOrdinal = o12.f215263z.ordinal();
        if (iOrdinal == 0) {
            type = LocalMessage.Type.Default.INSTANCE;
        } else if (iOrdinal == 1) {
            type = LocalMessage.Type.EmployeePersonal.INSTANCE;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            type = LocalMessage.Type.EmployeeCompany.INSTANCE;
        }
        return new LocalMessage(o12.f215238a, o12.f215240c, o12.f215239b, messageBodyA, o12.f215243f, o12.f215244g, o12.f215241d, o12.f215246i, o12.f215248k, o12.f215249l, o12.f215250m, o12.f215251n, o12.f215254q, quote, o12.f215262y, type, o12.f215236A, o12.f215237B);
    }
}
