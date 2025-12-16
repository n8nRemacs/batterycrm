package com.avito.android.messenger.channels.adapter.konveyor.common.swipable;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SwipableItemView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/c;", "", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: SwipableItemView.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/c$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/c$a$a;", "Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/c$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: SwipableItemView.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/c$a$a;", "Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/c$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.channels.adapter.konveyor.common.swipable.c$a$a, reason: collision with other inner class name */
        public static final class C5485a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C5485a f186913a = new C5485a();

            public C5485a() {
                super(null);
            }
        }

        /* compiled from: SwipableItemView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/c$a$b;", "Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/c$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f186914a;

            public b(int i12) {
                super(null);
                this.f186914a = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f186914a == ((b) obj).f186914a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f186914a);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("AllExceptOneWithHash(swipeLayoutHash="), this.f186914a, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SwipableItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/common/swipable/c$b;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        static {
            new b();
        }
    }
}
