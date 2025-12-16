package com.avito.android.messenger.conversation.mvi.message_suggests;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MessageSuggestsInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/a;", "", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32119a {

    /* compiled from: MessageSuggestsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.a$a, reason: collision with other inner class name */
    public static final class C5671a {
    }

    /* compiled from: MessageSuggestsInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/a$b;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.a$b */
    public static final /* data */ class b {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final C5672a f191940e = new C5672a(null);

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final b f191941f = new b(null, C42784z0.f406748b, false, false);

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f191942a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<MessageSuggest> f191943b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f191944c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f191945d;

        /* compiled from: MessageSuggestsInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/a$b$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.a$b$a, reason: collision with other inner class name */
        public static final class C5672a {
            public /* synthetic */ C5672a(C42822w c42822w) {
                this();
            }

            public C5672a() {
            }
        }

        public b(@Y61.l String str, @Y61.k List<MessageSuggest> list, boolean z12, boolean z13) {
            this.f191942a = str;
            this.f191943b = list;
            this.f191944c = z12;
            this.f191945d = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f191942a, bVar.f191942a) && L.f(this.f191943b, bVar.f191943b) && this.f191944c == bVar.f191944c && this.f191945d == bVar.f191945d;
        }

        public final int hashCode() {
            String str = this.f191942a;
            return Boolean.hashCode(this.f191945d) + androidx.appcompat.app.r.i(androidx.compose.foundation.H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f191943b), 31, this.f191944c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UserSuggestList(title=");
            sb2.append(this.f191942a);
            sb2.append(", suggestList=");
            sb2.append(this.f191943b);
            sb2.append(", isSeller=");
            sb2.append(this.f191944c);
            sb2.append(", hideChatButtons=");
            return androidx.appcompat.app.r.x(sb2, this.f191945d, ')');
        }
    }

    @Y61.k
    com.jakewharton.rxrelay3.b a();

    void b();

    void destroy();
}
