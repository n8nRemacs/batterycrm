package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import java.util.Collection;

/* compiled from: FlowableBufferPredicate.java */
/* renamed from: hu.akarnokd.rxjava3.operators.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41152k<T, C extends Collection<? super T>> extends AbstractC41777j<C> implements InterfaceC41783p<T, C> {

    /* compiled from: FlowableBufferPredicate.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.k$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f398067a;

        static {
            int[] iArr = new int[c.values().length];
            f398067a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f398067a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: FlowableBufferPredicate.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.k$b */
    public static final class b<T, C extends Collection<? super T>> implements ConditionalSubscriber<T>, org.reactivestreams.e {
        @Override // org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FlowableBufferPredicate.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.k$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ c[] f398068b = {new c("BEFORE", 0), new c("AFTER", 1), new c("SPLIT", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        c EF5;

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f398068b.clone();
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super C> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
