package io.ktor.http.content;

import io.ktor.http.C41524i;
import io.ktor.http.C41535n0;
import io.ktor.http.T;
import io.ktor.utils.io.InterfaceC41649d1;
import io.ktor.utils.io.W0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: OutgoingContent.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lio/ktor/http/content/p;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lio/ktor/http/content/p$a;", "Lio/ktor/http/content/p$b;", "Lio/ktor/http/content/p$c;", "Lio/ktor/http/content/p$d;", "Lio/ktor/http/content/p$e;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class p {

    /* compiled from: OutgoingContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/content/p$a;", "Lio/ktor/http/content/p;", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a extends p {
        public a() {
            super(null);
        }

        @Y61.k
        public abstract byte[] e();
    }

    /* compiled from: OutgoingContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/content/p$b;", "Lio/ktor/http/content/p;", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b extends p {
        public b() {
            super(null);
        }
    }

    /* compiled from: OutgoingContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/content/p$c;", "Lio/ktor/http/content/p;", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class c extends p {
        public c() {
            super(null);
        }

        @Override // io.ktor.http.content.p
        @Y61.k
        public final C41535n0 d() {
            C41535n0.f400082d.getClass();
            return C41535n0.f400083e;
        }
    }

    /* compiled from: OutgoingContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/content/p$d;", "Lio/ktor/http/content/p;", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class d extends p {
        public d() {
            super(null);
        }

        @Y61.k
        public abstract W0 e();
    }

    /* compiled from: OutgoingContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/content/p$e;", "Lio/ktor/http/content/p;", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class e extends p {
        public e() {
            super(null);
        }

        @Y61.l
        public abstract Object e(@Y61.k InterfaceC41649d1 interfaceC41649d1, @Y61.k Continuation<? super G0> continuation);
    }

    public /* synthetic */ p(C42822w c42822w) {
        this();
    }

    @Y61.l
    public Long a() {
        return null;
    }

    @Y61.l
    public C41524i b() {
        return null;
    }

    @Y61.k
    public T c() {
        T.f399899a.getClass();
        return T.a.f399901b;
    }

    @Y61.l
    public C41535n0 d() {
        return null;
    }

    public p() {
    }
}
