package com.otaliastudios.transcoder.internal.pipeline;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: State.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/k;", "T", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/otaliastudios/transcoder/internal/pipeline/k$b;", "Lcom/otaliastudios/transcoder/internal/pipeline/k$d;", "Lcom/otaliastudios/transcoder/internal/pipeline/k$c;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class k<T> {

    /* compiled from: State.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/k$a;", "T", "Lcom/otaliastudios/transcoder/internal/pipeline/k$b;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a<T> extends b<T> {
        public a() {
            throw null;
        }

        @Override // com.otaliastudios.transcoder.internal.pipeline.k.b
        @Y61.k
        public final String toString() {
            return H.n(new StringBuilder("State.Eos("), this.f366179a, ')');
        }
    }

    /* compiled from: State.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/k$b;", "T", "Lcom/otaliastudios/transcoder/internal/pipeline/k;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class b<T> extends k<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f366179a;

        public b(T t12) {
            super(null);
            this.f366179a = t12;
        }

        @Y61.k
        public String toString() {
            return H.n(new StringBuilder("State.Ok("), this.f366179a, ')');
        }
    }

    /* compiled from: State.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/k$c;", "Lcom/otaliastudios/transcoder/internal/pipeline/k;", "", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f366180a = new c();

        public c() {
            super(null);
        }

        @Y61.k
        public final String toString() {
            return "State.Retry";
        }
    }

    /* compiled from: State.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/k$d;", "Lcom/otaliastudios/transcoder/internal/pipeline/k;", "", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f366181a = new d();

        public d() {
            super(null);
        }

        @Y61.k
        public final String toString() {
            return "State.Wait";
        }
    }

    public /* synthetic */ k(C42822w c42822w) {
        this();
    }

    public k() {
    }
}
