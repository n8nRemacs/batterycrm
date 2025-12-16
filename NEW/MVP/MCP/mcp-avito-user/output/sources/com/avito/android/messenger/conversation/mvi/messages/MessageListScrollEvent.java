package com.avito.android.messenger.conversation.mvi.messages;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MessageListScrollEvent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/MessageListScrollEvent;", "", "ScrollAlignment", "a", "Lcom/avito/android/messenger/conversation/mvi/messages/MessageListScrollEvent$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MessageListScrollEvent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessageListScrollEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/MessageListScrollEvent$ScrollAlignment;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScrollAlignment {

        /* renamed from: b, reason: collision with root package name */
        public static final ScrollAlignment f192083b;

        /* renamed from: c, reason: collision with root package name */
        public static final ScrollAlignment f192084c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ScrollAlignment[] f192085d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f192086e;

        static {
            ScrollAlignment scrollAlignment = new ScrollAlignment("TOP", 0);
            f192083b = scrollAlignment;
            ScrollAlignment scrollAlignment2 = new ScrollAlignment("CENTER", 1);
            f192084c = scrollAlignment2;
            ScrollAlignment[] scrollAlignmentArr = {scrollAlignment, scrollAlignment2};
            f192085d = scrollAlignmentArr;
            f192086e = kotlin.enums.c.a(scrollAlignmentArr);
        }

        public ScrollAlignment() {
            throw null;
        }

        public static ScrollAlignment valueOf(String str) {
            return (ScrollAlignment) Enum.valueOf(ScrollAlignment.class, str);
        }

        public static ScrollAlignment[] values() {
            return (ScrollAlignment[]) f192085d.clone();
        }
    }

    /* compiled from: MessageListScrollEvent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/MessageListScrollEvent$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/MessageListScrollEvent;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements MessageListScrollEvent {

        /* renamed from: a, reason: collision with root package name */
        public final int f192087a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ScrollAlignment f192088b;

        public a(int i12, @Y61.k ScrollAlignment scrollAlignment) {
            this.f192087a = i12;
            this.f192088b = scrollAlignment;
        }

        public /* synthetic */ a(int i12, ScrollAlignment scrollAlignment, int i13, C42822w c42822w) {
            this(i12, (i13 & 2) != 0 ? ScrollAlignment.f192084c : scrollAlignment);
        }
    }
}
