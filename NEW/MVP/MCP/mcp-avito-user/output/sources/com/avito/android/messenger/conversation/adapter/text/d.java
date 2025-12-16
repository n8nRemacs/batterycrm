package com.avito.android.messenger.conversation.adapter.text;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.adapter.InterfaceC31916b;
import com.avito.android.messenger.conversation.adapter.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextMessageView.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/text/d;", "LTV0/e;", "Lcom/avito/android/messenger/conversation/adapter/b;", "Lcom/avito/android/messenger/conversation/adapter/m;", "Lcom/avito/android/messenger/conversation/adapter/quote/c;", "Lcom/avito/android/messenger/conversation/adapter/e;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d extends TV0.e, InterfaceC31916b, m, com.avito.android.messenger.conversation.adapter.quote.c, com.avito.android.messenger.conversation.adapter.e {

    /* compiled from: TextMessageView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: TextMessageView.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/text/d$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/messenger/conversation/adapter/text/d$b$a;", "Lcom/avito/android/messenger/conversation/adapter/text/d$b$b;", "Lcom/avito/android/messenger/conversation/adapter/text/d$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TextMessageView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/text/d$b$a;", "Lcom/avito/android/messenger/conversation/adapter/text/d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @k
            public final String toString() {
                return "Emoji(text=null)";
            }
        }

        /* compiled from: TextMessageView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/text/d$b$b;", "Lcom/avito/android/messenger/conversation/adapter/text/d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.adapter.text.d$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5581b extends b {
            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5581b)) {
                    return false;
                }
                ((C5581b) obj).getClass();
                return L.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            @k
            public final String toString() {
                return "Link(text=null)";
            }
        }

        /* compiled from: TextMessageView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/text/d$b$c;", "Lcom/avito/android/messenger/conversation/adapter/text/d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f189299a;

            public c(@k String str) {
                super(null);
                this.f189299a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f189299a, ((c) obj).f189299a);
            }

            public final int hashCode() {
                return this.f189299a.hashCode();
            }

            @k
            public final String toString() {
                return "Text(text=" + ((Object) this.f189299a) + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    void W30(@k Y41.l lVar, @k List list);
}
