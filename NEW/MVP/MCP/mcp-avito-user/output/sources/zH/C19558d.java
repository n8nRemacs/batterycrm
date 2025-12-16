package Zh;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.container.promo_block.RoundEdges;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PromoBlockPayload.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZh/d;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zh.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C19558d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f20384c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final RoundEdges f20385a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20386b;

    /* compiled from: PromoBlockPayload.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh/d$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C19558d(@l RoundEdges roundEdges) {
        this.f20385a = roundEdges;
        this.f20386b = roundEdges == null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19558d) && this.f20385a == ((C19558d) obj).f20385a;
    }

    public final int hashCode() {
        RoundEdges roundEdges = this.f20385a;
        if (roundEdges == null) {
            return 0;
        }
        return roundEdges.hashCode();
    }

    @k
    public final String toString() {
        return "PromoBlockPayload(roundEdges=" + this.f20385a + ')';
    }
}
