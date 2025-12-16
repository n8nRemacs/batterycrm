package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.Quote;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: MessageAndQuoteBodyResolver.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/m;", "Lcom/avito/android/messenger/conversation/mvi/sync/G;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32275m implements G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f194808a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.B f194809b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f194810c;

    /* compiled from: MessageAndQuoteBodyResolver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/m$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.sync.m$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f194811a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f194812b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final MessageBody f194813c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f194814d;

        public a(int i12, boolean z12, @Y61.k MessageBody messageBody, @Y61.k LocalMessage localMessage) {
            this.f194811a = i12;
            this.f194812b = z12;
            this.f194813c = messageBody;
            this.f194814d = localMessage;
        }

        @Y61.k
        public final b a() {
            return new b(this.f194811a, this.f194812b, this.f194813c, this.f194814d);
        }

        @Y61.k
        public final b b(@Y61.k MessageBody messageBody) {
            return new b(this.f194811a, this.f194812b, messageBody, this.f194814d);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f194811a == aVar.f194811a && this.f194812b == aVar.f194812b && kotlin.jvm.internal.L.f(this.f194813c, aVar.f194813c) && this.f194814d.equals(aVar.f194814d);
        }

        public final int hashCode() {
            return this.f194814d.hashCode() + ((this.f194813c.hashCode() + androidx.appcompat.app.r.i(Integer.hashCode(this.f194811a) * 31, 31, this.f194812b)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "MessageBodyEntity(id=" + this.f194811a + ", isQuoteBody=" + this.f194812b + ", body=" + this.f194813c + ", message=" + this.f194814d + ')';
        }
    }

    /* compiled from: MessageAndQuoteBodyResolver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/m$b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.sync.m$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f194815a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f194816b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final MessageBody f194817c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f194818d;

        public b(int i12, boolean z12, @Y61.k MessageBody messageBody, @Y61.k LocalMessage localMessage) {
            this.f194815a = i12;
            this.f194816b = z12;
            this.f194817c = messageBody;
            this.f194818d = localMessage;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f194815a == bVar.f194815a && this.f194816b == bVar.f194816b && kotlin.jvm.internal.L.f(this.f194817c, bVar.f194817c) && this.f194818d.equals(bVar.f194818d);
        }

        public final int hashCode() {
            return this.f194818d.hashCode() + ((this.f194817c.hashCode() + androidx.appcompat.app.r.i(Integer.hashCode(this.f194815a) * 31, 31, this.f194816b)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ResultMessageBodyEntity(id=" + this.f194815a + ", isQuoteBody=" + this.f194816b + ", resultBody=" + this.f194817c + ", originalMessage=" + this.f194818d + ')';
        }
    }

    public C32275m(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k com.avito.android.messenger.B b12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f194808a = interfaceC47842z;
        this.f194809b = b12;
        this.f194810c = interfaceC35745a5;
    }

    public static ArrayList c(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).a());
        }
        return arrayList;
    }

    @Override // com.avito.android.messenger.conversation.mvi.sync.G
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.O a(@Y61.k LocalMessage localMessage) {
        return b(Collections.singletonList(localMessage)).r(H.f194591b);
    }

    @Override // com.avito.android.messenger.conversation.mvi.sync.G
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.O b(@Y61.k List list) {
        MessageBody body;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            LocalMessage localMessage = (LocalMessage) obj;
            arrayList.add(new a(i12, false, localMessage.getBody(), localMessage));
            Quote quote = localMessage.getQuote();
            if (quote != null && (body = quote.getBody()) != null) {
                arrayList.add(new a(i12, true, body, localMessage));
            }
            i12 = i13;
        }
        return new C41936b0(io.reactivex.rxjava3.core.z.X(C42745f0.R0(arrayList, 100, 100)), new C32283q(this)).H0().r(new r(this));
    }
}
