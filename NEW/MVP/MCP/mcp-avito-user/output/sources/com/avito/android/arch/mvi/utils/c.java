package com.avito.android.arch.mvi.utils;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Either.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/arch/mvi/utils/c;", "A", "B", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/arch/mvi/utils/c$b;", "Lcom/avito/android/arch/mvi/utils/c$c;", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class c<A, B> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f92026a = new a(null);

    /* compiled from: Either.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/arch/mvi/utils/c$a;", "", "<init>", "()V", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Either.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u0001*\u0006\b\u0003\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/arch/mvi/utils/c$b;", "A", "B", "Lcom/avito/android/arch/mvi/utils/c;", "a", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b<A, B> extends c<A, B> {

        /* renamed from: b, reason: collision with root package name */
        public final A f92027b;

        /* compiled from: Either.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/arch/mvi/utils/c$b$a;", "", "<init>", "()V", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        @X
        public b(A a12) {
            super(null);
            this.f92027b = a12;
        }

        @Override // com.avito.android.arch.mvi.utils.c
        public final boolean a() {
            return false;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f92027b, ((b) obj).f92027b);
        }

        public final int hashCode() {
            A a12 = this.f92027b;
            if (a12 == null) {
                return 0;
            }
            return a12.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.n(new StringBuilder("Left(a="), this.f92027b, ')');
        }
    }

    /* compiled from: Either.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u0001*\u0006\b\u0003\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/arch/mvi/utils/c$c;", "A", "B", "Lcom/avito/android/arch/mvi/utils/c;", "a", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.arch.mvi.utils.c$c, reason: collision with other inner class name */
    public static final /* data */ class C2712c<A, B> extends c<A, B> {

        /* renamed from: b, reason: collision with root package name */
        public final B f92028b;

        /* compiled from: Either.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/arch/mvi/utils/c$c$a;", "", "<init>", "()V", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.arch.mvi.utils.c$c$a */
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        @X
        public C2712c(B b12) {
            super(null);
            this.f92028b = b12;
        }

        @Override // com.avito.android.arch.mvi.utils.c
        public final boolean a() {
            return true;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2712c) && L.f(this.f92028b, ((C2712c) obj).f92028b);
        }

        public final int hashCode() {
            B b12 = this.f92028b;
            if (b12 == null) {
                return 0;
            }
            return b12.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.n(new StringBuilder("Right(b="), this.f92028b, ')');
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public abstract boolean a();

    public c() {
    }
}
