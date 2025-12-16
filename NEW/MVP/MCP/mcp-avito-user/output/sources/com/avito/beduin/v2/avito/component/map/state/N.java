package com.avito.beduin.v2.avito.component.map.state;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserLocation.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/N;", "", "<init>", "()V", "a", "b", "Lcom/avito/beduin/v2/avito/component/map/state/N$a;", "Lcom/avito/beduin/v2/avito/component/map/state/N$b;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class N {

    /* compiled from: UserLocation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/N$a;", "Lcom/avito/beduin/v2/avito/component/map/state/N;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends N {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final x f334636a;

        public a(@Y61.k x xVar) {
            super(null);
            this.f334636a = xVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f334636a, ((a) obj).f334636a);
        }

        public final int hashCode() {
            return this.f334636a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Circle(center=" + this.f334636a + ')';
        }
    }

    /* compiled from: UserLocation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/N$b;", "Lcom/avito/beduin/v2/avito/component/map/state/N;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends N {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final x f334637a;

        /* renamed from: b, reason: collision with root package name */
        public final float f334638b;

        public b(@Y61.k x xVar, float f12) {
            super(null);
            this.f334637a = xVar;
            this.f334638b = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f334637a, bVar.f334637a) && Float.compare(this.f334638b, bVar.f334638b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f334638b) + (this.f334637a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Point(point=");
            sb2.append(this.f334637a);
            sb2.append(", zIndex=");
            return androidx.appcompat.app.r.k(')', this.f334638b, sb2);
        }
    }

    public /* synthetic */ N(C42822w c42822w) {
        this();
    }

    public N() {
    }
}
