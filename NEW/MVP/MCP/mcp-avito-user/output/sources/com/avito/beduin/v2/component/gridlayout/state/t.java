package com.avito.beduin.v2.component.gridlayout.state;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SpanCount.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/state/t;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/beduin/v2/component/gridlayout/state/t$a;", "Lcom/avito/beduin/v2/component/gridlayout/state/t$c;", "Lcom/avito/beduin/v2/component/gridlayout/state/t$d;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f335879a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final c f335880b = new c(2);

    /* compiled from: SpanCount.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/state/t$a;", "Lcom/avito/beduin/v2/component/gridlayout/state/t;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends t {

        /* renamed from: c, reason: collision with root package name */
        public final int f335881c;

        public a(int i12) {
            super(null);
            this.f335881c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f335881c == ((a) obj).f335881c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f335881c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("Adaptive(minSpanSize="), this.f335881c, ')');
        }
    }

    /* compiled from: SpanCount.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/state/t$b;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: SpanCount.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/state/t$c;", "Lcom/avito/beduin/v2/component/gridlayout/state/t;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends t {

        /* renamed from: c, reason: collision with root package name */
        public final int f335882c;

        public c(int i12) {
            super(null);
            this.f335882c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f335882c == ((c) obj).f335882c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f335882c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("Fixed(count="), this.f335882c, ')');
        }
    }

    /* compiled from: SpanCount.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/state/t$d;", "Lcom/avito/beduin/v2/component/gridlayout/state/t;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends t {

        /* renamed from: c, reason: collision with root package name */
        public final int f335883c;

        public d(int i12) {
            super(null);
            this.f335883c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f335883c == ((d) obj).f335883c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f335883c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("FixedSize(spanSize="), this.f335883c, ')');
        }
    }

    public /* synthetic */ t(C42822w c42822w) {
        this();
    }

    public t() {
    }
}
