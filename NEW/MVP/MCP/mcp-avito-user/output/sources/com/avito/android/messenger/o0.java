package com.avito.android.messenger;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HashIdChangeUiControllerImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/o0;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/o0$a;", "Lcom/avito/android/messenger/o0$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class o0 {

    /* compiled from: HashIdChangeUiControllerImpl.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/o0$a;", "Lcom/avito/android/messenger/o0;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends o0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f196928a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: HashIdChangeUiControllerImpl.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/o0$b;", "Lcom/avito/android/messenger/o0;", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/o0$b$a;", "Lcom/avito/android/messenger/o0$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b extends o0 {

        /* compiled from: HashIdChangeUiControllerImpl.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/o0$b$a;", "Lcom/avito/android/messenger/o0$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f196929a;

            public a(@Y61.k String str) {
                super(null);
                this.f196929a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f196929a, ((a) obj).f196929a);
            }

            public final int hashCode() {
                return this.f196929a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Active(fragmentName="), this.f196929a, ')');
            }
        }

        /* compiled from: HashIdChangeUiControllerImpl.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/o0$b$b;", "Lcom/avito/android/messenger/o0$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.o0$b$b, reason: collision with other inner class name */
        public static final class C5793b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5793b f196930a = new C5793b();

            public C5793b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
            super(null);
        }
    }

    public /* synthetic */ o0(C42822w c42822w) {
        this();
    }

    public o0() {
    }
}
