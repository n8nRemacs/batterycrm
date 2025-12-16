package com.avito.android.messenger.conversation.mvi.send;

import android.net.Uri;
import android.os.Parcelable;
import com.avito.android.messenger.InterfaceC32575x;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.conversation.W1;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.remote.feedback.FeedbackAdvertItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.MessengerTimestamp;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.Quote;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.observable.H1;
import io.reactivex.rxjava3.internal.operators.single.C42009g;
import io.reactivex.rxjava3.internal.operators.single.C42015m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.MessengerUserType;

/* compiled from: SendMessageInteractor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/A;", "Lcom/avito/android/messenger/conversation/mvi/send/q;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class A implements InterfaceC32232q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f194157a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f194158b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.q0 f194159c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32218j f194160d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32575x f194161e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f194162f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f194163g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f194164h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final W1 f194165i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<kotlin.G0> f194166j = C31685o.m();

    @Inject
    public A(@InterfaceC32438g0 @Y61.k String str, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k com.avito.android.messenger.q0 q0Var, @Y61.k InterfaceC32218j interfaceC32218j, @Y61.k InterfaceC32575x interfaceC32575x, @Y61.k com.avito.android.server_time.f fVar, @Y61.k InterfaceC32024m interfaceC32024m, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k W1 w12) {
        this.f194157a = str;
        this.f194158b = interfaceC47842z;
        this.f194159c = q0Var;
        this.f194160d = interfaceC32218j;
        this.f194161e = interfaceC32575x;
        this.f194162f = fVar;
        this.f194163g = interfaceC32024m;
        this.f194164h = interfaceC35745a5;
        this.f194165i = w12;
    }

    public static C42009g k(A a12, MessageBody messageBody, MessengerUserHashInfo messengerUserHashInfo, Quote quote, String str, Long l12, Y41.l lVar, int i12) {
        LocalMessage.Type type;
        long jFromMillis = MessengerTimestamp.INSTANCE.fromMillis(a12.f194162f.now());
        String strA = a12.f194161e.a();
        Quote quote2 = (i12 & 256) != 0 ? null : quote;
        String str2 = (i12 & 512) != 0 ? null : str;
        Long l13 = (i12 & 1024) != 0 ? null : l12;
        Y41.l c32237t = (i12 & 2048) != 0 ? new C32237t(1, a12.f194163g, InterfaceC32024m.class, "createMessage", "createMessage(Lcom/avito/android/remote/model/messenger/message/LocalMessage;)Lio/reactivex/rxjava3/core/Completable;", 0) : lVar;
        a12.getClass();
        String str3 = messengerUserHashInfo.f430682d;
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        if (messengerUserType instanceof MessengerUserType.Default) {
            type = LocalMessage.Type.Default.INSTANCE;
        } else if (messengerUserType instanceof MessengerUserType.Employee.Company) {
            type = LocalMessage.Type.EmployeeCompany.INSTANCE;
        } else {
            if (!(messengerUserType instanceof MessengerUserType.Employee.Personal)) {
                throw new NoWhenBranchMatchedException();
            }
            type = LocalMessage.Type.EmployeePersonal.INSTANCE;
        }
        LocalMessage localMessage = new LocalMessage(strA, null, a12.f194157a, messageBody, str3, str3, jFromMillis, true, false, null, null, false, null, quote2, str2, type, messengerUserHashInfo.f430680b, l13, 7168, null);
        AbstractC41768a abstractC41768a = (AbstractC41768a) c32237t.invoke(localMessage);
        InterfaceC35745a5 interfaceC35745a5 = a12.f194164h;
        return abstractC41768a.x(interfaceC35745a5.a()).q(interfaceC35745a5.c()).h(io.reactivex.rxjava3.core.I.q(localMessage));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q
    @Y61.k
    public final H1 a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l Quote quote) {
        return this.f194160d.a(str).p(r.f194547b).w(new C32235s(this, str, messengerUserHashInfo, quote, new AtomicBoolean(quote != null))).H0();
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q
    @Y61.k
    public final C42015m b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k FeedbackAdvertItem feedbackAdvertItem, @Y61.l Quote quote) {
        List<Image> list = feedbackAdvertItem.f253449f;
        return k(this, new MessageBody.Item(feedbackAdvertItem.f253445b, messengerUserHashInfo.f430682d, feedbackAdvertItem.f253446c, list != null ? (Image) C42745f0.G(list) : null, feedbackAdvertItem.f253447d, feedbackAdvertItem.f253448e), messengerUserHashInfo, quote, this.f194165i.f189243f, null, null, 3324).z(this.f194164h.a()).h(new C32247y(this));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q
    @Y61.k
    public final C42015m c(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k MessageBody.Voice voice, @Y61.k String str, @Y61.k String str2, long j12, @Y61.l Quote quote) {
        return k(this, voice, messengerUserHashInfo, quote, null, null, new C32243w(this, str, str2, j12), 1788).z(this.f194164h.a()).h(new C32247y(this));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q
    @Y61.k
    public final C42015m d(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k MessageBody.Location location, @Y61.l Quote quote) {
        return k(this, location, messengerUserHashInfo, quote, null, null, null, 3836).z(this.f194164h.a()).h(new C32247y(this));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q
    @Y61.k
    public final C42015m e(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k MessageBody.Video video, @Y61.k Uri uri, @Y61.l String str, @Y61.k String str2, @Y61.l Quote quote) {
        return k(this, video, messengerUserHashInfo, quote, null, null, new C32241v(this, uri, str2, str), 1788).z(this.f194164h.a()).h(new C32247y(this));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q
    @Y61.k
    public final C42015m f(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return k(this, new MessageBody.Text.Reaction(str, null, null, null, 14, null), messengerUserHashInfo, null, this.f194165i.f189243f, null, null, 3580).z(this.f194164h.a()).h(new C32247y(this));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.W g(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l Quote quote, @Y61.l Long l12) {
        Parcelable link;
        int i12 = 0;
        AtomicBoolean atomicBoolean = new AtomicBoolean(quote != null);
        ArrayList arrayList = new ArrayList();
        ArrayList<MessageBody.Text.Chunk> arrayListA = this.f194159c.a(str);
        if (arrayListA.size() == 1 && (arrayListA.get(0) instanceof MessageBody.Text.Chunk.Link)) {
            for (MessageBody.Text.Chunk chunk : arrayListA) {
                if (chunk instanceof MessageBody.Text.Chunk.Plain) {
                    MessageBody.Text.Chunk.Plain plain = (MessageBody.Text.Chunk.Plain) chunk;
                    link = new MessageBody.Text.Regular(str.substring(plain.getStart(), plain.getEnd() + 1), null, null, false, null, 24, null);
                } else {
                    if (!(chunk instanceof MessageBody.Text.Chunk.Link)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MessageBody.Text.Chunk.Link link2 = (MessageBody.Text.Chunk.Link) chunk;
                    link = new MessageBody.Link(str.substring(link2.getStart(), link2.getEnd() + 1), null, null, false, 8, null);
                }
                arrayList.add(link);
            }
        } else {
            if (arrayListA.size() >= 2 && (!(arrayListA.get(0) instanceof MessageBody.Text.Chunk.Plain) || !(androidx.appcompat.app.r.j(1, arrayListA) instanceof MessageBody.Text.Chunk.Plain))) {
                MessageBody.Text.Chunk chunk2 = (MessageBody.Text.Chunk) arrayListA.get(0);
                int size = arrayListA.size();
                boolean z12 = false;
                int i13 = 1;
                while (true) {
                    if (i13 < size) {
                        MessageBody.Text.Chunk chunk3 = (MessageBody.Text.Chunk) arrayListA.get(i13);
                        boolean z13 = chunk3 instanceof MessageBody.Text.Chunk.Plain;
                        if (z13) {
                            i12++;
                        }
                        if ((z13 && (chunk2 instanceof MessageBody.Text.Chunk.Plain)) || ((chunk3 instanceof MessageBody.Text.Chunk.Link) && (chunk2 instanceof MessageBody.Text.Chunk.Link))) {
                            if (z12) {
                                break;
                            }
                        } else {
                            z12 = true;
                        }
                        i13++;
                    } else if (i12 == arrayListA.size()) {
                        break;
                    }
                }
            }
            arrayList.add(new MessageBody.Text.Regular(str, null, arrayListA, false, null, 24, null));
        }
        return io.reactivex.rxjava3.core.z.X(arrayList).w(new C32245x(this, messengerUserHashInfo, quote, l12, atomicBoolean)).H0().h(new C32249z(this)).z(this.f194164h.a());
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q
    public final io.reactivex.rxjava3.core.z h() {
        return this.f194166j;
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q
    @Y61.k
    public final C42015m i(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k MessageBody.File file, @Y61.k Uri uri, @Y61.l Quote quote) {
        return k(this, file, messengerUserHashInfo, quote, null, null, new C32239u(this, uri), 1788).z(this.f194164h.a()).h(new C32247y(this));
    }

    @Override // com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.I j(long j12, @Y61.k List list) {
        return new io.reactivex.rxjava3.internal.operators.completable.v(this.f194158b.sendTyping(this.f194157a, list, Long.valueOf(j12)).z(this.f194164h.a())).r();
    }
}
