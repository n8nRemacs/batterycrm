package com.avito.android.mvi;

import Y61.k;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert.item.delivery_suggests.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Loading.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/mvi/b;", "T", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/mvi/b$a;", "Lcom/avito/android/mvi/b$b;", "Lcom/avito/android/mvi/b$c;", "Lcom/avito/android/mvi/b$d;", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class b<T> {

    /* compiled from: Loading.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mvi/b$a;", "T", "Lcom/avito/android/mvi/b;", "<init>", "()V", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> extends b<T> {
        public a() {
            super(null);
        }

        @k
        public final String toString() {
            return "Loading.Empty";
        }
    }

    /* compiled from: Loading.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mvi/b$b;", "T", "Lcom/avito/android/mvi/b;", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mvi.b$b, reason: collision with other inner class name */
    public static final class C6174b<T> extends b<T> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f207033a;

        public C6174b(@k Throwable th2) {
            super(null);
            this.f207033a = th2;
        }

        @k
        public final String toString() {
            return l.t(new StringBuilder("Loading.Error(error = "), this.f207033a, ')');
        }
    }

    /* compiled from: Loading.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mvi/b$c;", "T", "Lcom/avito/android/mvi/b;", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c<T> extends b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final long f207034a;

        public c() {
            this(0L, 1, null);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("Loading.InProgress(id = "), this.f207034a, ')');
        }

        public c(long j12) {
            super(null);
            this.f207034a = j12;
        }

        public /* synthetic */ c(long j12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? 0L : j12);
        }
    }

    /* compiled from: Loading.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mvi/b$d;", "T", "Lcom/avito/android/mvi/b;", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d<T> extends b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f207035a;

        public d(T t12) {
            super(null);
            this.f207035a = t12;
        }

        @k
        public final String toString() {
            return H.n(new StringBuilder("Loading.Success(value = "), this.f207035a, ')');
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    public b() {
    }
}
