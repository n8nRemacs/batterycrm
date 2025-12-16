package Eq0;

import Y61.k;
import Y61.l;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HintClickTarget.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LEq0/a;", "", "<init>", "()V", "a", "b", "LEq0/a$a;", "LEq0/a$b;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Eq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13521a {

    /* compiled from: HintClickTarget.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEq0/a$a;", "LEq0/a;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eq0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0260a extends AbstractC13521a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserAdvertsHintItem f4344a;

        public C0260a(@k UserAdvertsHintItem userAdvertsHintItem) {
            super(null);
            this.f4344a = userAdvertsHintItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0260a) && L.f(this.f4344a, ((C0260a) obj).f4344a);
        }

        public final int hashCode() {
            return this.f4344a.hashCode();
        }

        @k
        public final String toString() {
            return "ItemHintClick(hint=" + this.f4344a + ')';
        }
    }

    /* compiled from: HintClickTarget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEq0/a$b;", "LEq0/a;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eq0.a$b */
    public static final /* data */ class b extends AbstractC13521a {
        static {
            new b();
        }

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1326299820;
        }

        @k
        public final String toString() {
            return "MoreHintsClick";
        }
    }

    public /* synthetic */ AbstractC13521a(C42822w c42822w) {
        this();
    }

    public AbstractC13521a() {
    }
}
