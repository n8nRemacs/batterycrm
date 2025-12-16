package com.avito.android.messenger.conversation.mvi;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MessageSpamActionsInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/a;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/a$b;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a extends S20.a<b> {

    /* compiled from: MessageSpamActionsInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/a$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5594a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f189661a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f189662b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f189663c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f189664d;

        public C5594a(@k String str, @k String str2, @l String str3, @k String str4) {
            this.f189661a = str;
            this.f189662b = str2;
            this.f189663c = str3;
            this.f189664d = str4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5594a)) {
                return false;
            }
            C5594a c5594a = (C5594a) obj;
            return L.f(this.f189661a, c5594a.f189661a) && L.f(this.f189662b, c5594a.f189662b) && L.f(this.f189663c, c5594a.f189663c) && L.f(this.f189664d, c5594a.f189664d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f189661a.hashCode() * 31, 31, this.f189662b);
            String str = this.f189663c;
            return this.f189664d.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChannelData(userId=");
            sb2.append(this.f189661a);
            sb2.append(", channelId=");
            sb2.append(this.f189662b);
            sb2.append(", itemId=");
            sb2.append(this.f189663c);
            sb2.append(", suspectMessageId=");
            return C22026a.c(sb2, this.f189664d, ')');
        }
    }

    /* compiled from: MessageSpamActionsInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/a$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/messenger/conversation/mvi/a$b$a;", "Lcom/avito/android/messenger/conversation/mvi/a$b$b;", "Lcom/avito/android/messenger/conversation/mvi/a$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: MessageSpamActionsInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/a$b$a;", "Lcom/avito/android/messenger/conversation/mvi/a$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.a$b$a, reason: collision with other inner class name */
        public static final class C5595a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C5595a f189665a = new C5595a();

            public C5595a() {
                super(null);
            }
        }

        /* compiled from: MessageSpamActionsInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/a$b$b;", "Lcom/avito/android/messenger/conversation/mvi/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5596b extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final C5594a f189666a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f189667b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f189668c;

            public C5596b(@k C5594a c5594a, boolean z12, @l String str) {
                super(null);
                this.f189666a = c5594a;
                this.f189667b = z12;
                this.f189668c = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5596b)) {
                    return false;
                }
                C5596b c5596b = (C5596b) obj;
                return L.f(this.f189666a, c5596b.f189666a) && this.f189667b == c5596b.f189667b && L.f(this.f189668c, c5596b.f189668c);
            }

            public final int hashCode() {
                int i12 = r.i(this.f189666a.hashCode() * 31, 31, this.f189667b);
                String str = this.f189668c;
                return i12 + (str == null ? 0 : str.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InProgress(data=");
                sb2.append(this.f189666a);
                sb2.append(", isSpam=");
                sb2.append(this.f189667b);
                sb2.append(", spamUserId=");
                return C22026a.c(sb2, this.f189668c, ')');
            }
        }

        /* compiled from: MessageSpamActionsInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/a$b$c;", "Lcom/avito/android/messenger/conversation/mvi/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final C5594a f189669a;

            public c(@k C5594a c5594a) {
                super(null);
                this.f189669a = c5594a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f189669a, ((c) obj).f189669a);
            }

            public final int hashCode() {
                return this.f189669a.hashCode();
            }

            @k
            public final String toString() {
                return "Static(data=" + this.f189669a + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @k
    z<Throwable> Q();

    void U4(@k String str);

    void Y6(@k String str);
}
