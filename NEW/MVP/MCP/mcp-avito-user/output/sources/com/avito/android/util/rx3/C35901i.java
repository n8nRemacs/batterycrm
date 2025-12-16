package com.avito.android.util.rx3;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.rx3.AbstractC35899h;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.observable.C41997x;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: DelayedProgress.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_rx_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.rx3.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35901i {

    /* compiled from: DelayedProgress.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "Lcom/avito/android/util/rx3/h;", "apply", "(Ljava/lang/Object;)Lcom/avito/android/util/rx3/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.util.rx3.i$a */
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f319029b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new AbstractC35899h.b(obj);
        }
    }

    /* compiled from: DelayedProgress.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "error", "Lcom/avito/android/util/rx3/h;", "apply", "(Ljava/lang/Throwable;)Lcom/avito/android/util/rx3/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.util.rx3.i$b */
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f319030b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new AbstractC35899h.a((Throwable) obj);
        }
    }

    /* compiled from: DelayedProgress.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Lcom/avito/android/util/rx3/h;", "apply", "(J)Lcom/avito/android/util/rx3/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.util.rx3.i$c */
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f319031b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Number) obj).longValue();
            return AbstractC35899h.c.f319027a;
        }
    }

    /* compiled from: DelayedProgress.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lcom/avito/android/util/rx3/h;", VoiceInfo.STATE, "", "test", "(Lcom/avito/android/util/rx3/h;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.util.rx3.i$d */
    public static final class d<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f319032b = new d<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return !(((AbstractC35899h) obj) instanceof AbstractC35899h.c);
        }
    }

    /* compiled from: DelayedProgress.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lcom/avito/android/util/rx3/h;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/util/rx3/h;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.util.rx3.i$e */
    public static final class e<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f319033b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.reactivex.rxjava3.core.H f319034c;

        public e(long j12, io.reactivex.rxjava3.core.H h12) {
            this.f319033b = j12;
            this.f319034c = h12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            AbstractC35899h abstractC35899h = (AbstractC35899h) obj;
            if (!(abstractC35899h instanceof AbstractC35899h.c)) {
                return io.reactivex.rxjava3.core.z.c0(abstractC35899h);
            }
            return new C41997x(io.reactivex.rxjava3.core.z.c0(abstractC35899h), AbstractC41768a.y(this.f319033b, TimeUnit.MILLISECONDS, this.f319034c));
        }
    }

    @Y61.k
    public static final <T> io.reactivex.rxjava3.core.z<AbstractC35899h<T>> a(@Y61.k io.reactivex.rxjava3.core.z<T> zVar, @Y61.k io.reactivex.rxjava3.core.H h12, long j12, long j13) {
        return (io.reactivex.rxjava3.core.z<AbstractC35899h<T>>) io.reactivex.rxjava3.core.z.g0(zVar.j0(h12).d0(a.f319029b).m0(b.f319030b), io.reactivex.rxjava3.core.z.F0(j12, TimeUnit.MILLISECONDS, h12).d0(c.f319031b)).B0(d.f319032b).u(new e(j13, h12));
    }
}
