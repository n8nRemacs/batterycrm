package com.avito.beduin.v2.avito.component.common;

import com.avito.beduin.v2.theme.r;
import com.avito.beduin.v2.theme.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: Border.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/common/a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f334115a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final r f334116b;

    /* compiled from: Border.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.avito.component.common.a$a, reason: collision with other inner class name */
    public static final class C10372a extends N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public static final C10372a f334117l = new C10372a();

        public C10372a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(0.0f);
        }
    }

    public a() {
        this(0.0f, null, 3, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f334115a, aVar.f334115a) == 0 && L.f(this.f334116b, aVar.f334116b);
    }

    public final int hashCode() {
        return this.f334116b.hashCode() + (Float.hashCode(this.f334115a) * 31);
    }

    @Y61.k
    public final String toString() {
        return "Border(width=" + this.f334115a + ", color=" + this.f334116b + ')';
    }

    public a(float f12, @Y61.k r rVar) {
        this.f334115a = f12;
        this.f334116b = rVar;
    }

    public a(@Y61.k b bVar) {
        this(bVar.f334118a.c(C10372a.f334117l).floatValue(), t.f338374a.b(bVar.f334119b));
    }

    public a(float f12, r rVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0.0f : f12, (i12 & 2) != 0 ? t.f338374a : rVar);
    }
}
