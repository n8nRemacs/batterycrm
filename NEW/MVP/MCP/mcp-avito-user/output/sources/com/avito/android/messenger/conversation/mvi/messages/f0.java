package com.avito.android.messenger.conversation.mvi.messages;

import kotlin.Metadata;

/* compiled from: MessageListScrollAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/f0;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/messenger/conversation/mvi/messages/f0$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/f0$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/f0$c;", "Lcom/avito/android/messenger/conversation/mvi/messages/f0$d;", "Lcom/avito/android/messenger/conversation/mvi/messages/f0$e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface f0 {

    /* compiled from: MessageListScrollAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/f0$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/f0;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements f0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f192948a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -571962556;
        }

        @Y61.k
        public final String toString() {
            return "InitialScrollPerformed";
        }
    }

    /* compiled from: MessageListScrollAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/f0$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/f0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements f0 {

        /* renamed from: a, reason: collision with root package name */
        public final float f192949a;

        public b(float f12) {
            this.f192949a = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f192949a, ((b) obj).f192949a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f192949a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f192949a, new StringBuilder("OnScrolled(dy="));
        }
    }

    /* compiled from: MessageListScrollAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/f0$c;", "Lcom/avito/android/messenger/conversation/mvi/messages/f0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements f0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f192950a;

        public c(boolean z12) {
            this.f192950a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f192950a == ((c) obj).f192950a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f192950a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("OnScrolledToBottom(isAtBottom="), this.f192950a, ')');
        }
    }

    /* compiled from: MessageListScrollAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/f0$d;", "Lcom/avito/android/messenger/conversation/mvi/messages/f0;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements f0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f192951a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1385449050;
        }

        @Y61.k
        public final String toString() {
            return "OnScrolledToTop";
        }
    }

    /* compiled from: MessageListScrollAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/f0$e;", "Lcom/avito/android/messenger/conversation/mvi/messages/f0;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements f0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f192952a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 975799769;
        }

        @Y61.k
        public final String toString() {
            return "UserInteractedWithList";
        }
    }
}
