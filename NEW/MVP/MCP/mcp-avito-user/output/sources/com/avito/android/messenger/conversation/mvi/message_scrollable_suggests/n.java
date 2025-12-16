package com.avito.android.messenger.conversation.mvi.message_scrollable_suggests;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MessageScrollSuggestsView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n;", "Lcom/avito/android/mvi/e;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface n extends com.avito.android.mvi.e<b> {

    /* compiled from: MessageScrollSuggestsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: MessageScrollSuggestsView.kt */
    @P
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b$a;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b$b;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b$c;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b$d;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b$e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<MessageSuggestsView.SuggestItem> f191864a;

        /* compiled from: MessageScrollSuggestsView.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b$a;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f191865b = new a();

            public a() {
                super(C42784z0.f406748b, null);
            }
        }

        /* compiled from: MessageScrollSuggestsView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b$b;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.n$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5669b extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Throwable f191866b;

            public C5669b(@Y61.k Throwable th2) {
                super(C42784z0.f406748b, null);
                this.f191866b = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5669b) && L.f(this.f191866b, ((C5669b) obj).f191866b);
            }

            public final int hashCode() {
                return this.f191866b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f191866b, ')');
            }
        }

        /* compiled from: MessageScrollSuggestsView.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b$c;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f191867b = new c();

            public c() {
                super(C42784z0.f406748b, null);
            }
        }

        /* compiled from: MessageScrollSuggestsView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b$d;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final List<MessageSuggestsView.SuggestItem> f191868b;

            public d(@Y61.k List<MessageSuggestsView.SuggestItem> list) {
                super(list, null);
                this.f191868b = list;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f191868b, ((d) obj).f191868b);
            }

            public final int hashCode() {
                return this.f191868b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return H.p(new StringBuilder("Loading(currentItems="), this.f191868b, ')');
            }
        }

        /* compiled from: MessageScrollSuggestsView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b$e;", "Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/n$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f191869b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final ArrayList f191870c;

            public e(@Y61.l String str, @Y61.k ArrayList arrayList) {
                super(arrayList, null);
                this.f191869b = str;
                this.f191870c = arrayList;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return L.f(this.f191869b, eVar.f191869b) && L.f(this.f191870c, eVar.f191870c);
            }

            public final int hashCode() {
                String str = this.f191869b;
                return this.f191870c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Visible(title=");
                sb2.append(this.f191869b);
                sb2.append(", suggestItems=");
                return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f191870c, ')');
            }
        }

        public b() {
            throw null;
        }

        public b(List list, C42822w c42822w) {
            this.f191864a = list;
        }
    }
}
