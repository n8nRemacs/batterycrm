package sZ;

import Y61.k;
import Y61.l;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UnreadMessagesTooltip.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LsZ/a;", "", "<init>", "()V", "a", "b", "LsZ/a$a;", "LsZ/a$b;", "_avito_messenger-unread-counter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sZ.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC48135a {

    /* compiled from: UnreadMessagesTooltip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsZ/a$a;", "LsZ/a;", "<init>", "()V", "_avito_messenger-unread-counter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sZ.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12619a extends AbstractC48135a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12619a f437722a = new C12619a();

        public C12619a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12619a);
        }

        public final int hashCode() {
            return -513147442;
        }

        @k
        public final String toString() {
            return "NoTooltip";
        }
    }

    /* compiled from: UnreadMessagesTooltip.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsZ/a$b;", "LsZ/a;", "_avito_messenger-unread-counter_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sZ.a$b */
    public static final /* data */ class b extends AbstractC48135a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f437723a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f437724b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f437725c;

        public /* synthetic */ b(String str, Integer num, Integer num2, int i12, C42822w c42822w) {
            this(str, num, (i12 & 4) != 0 ? null : num2);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f437723a, bVar.f437723a) && L.f(this.f437724b, bVar.f437724b) && L.f(this.f437725c, bVar.f437725c);
        }

        public final int hashCode() {
            int iHashCode = this.f437723a.hashCode() * 31;
            Integer num = this.f437724b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f437725c;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Tooltip(text=");
            sb2.append(this.f437723a);
            sb2.append(", styleRes=");
            sb2.append(this.f437724b);
            sb2.append(", anchorOffsetDp=");
            return s.j(sb2, this.f437725c, ')');
        }

        public b(@k String str, @l Integer num, @l Integer num2) {
            super(null);
            this.f437723a = str;
            this.f437724b = num;
            this.f437725c = num2;
        }
    }

    public /* synthetic */ AbstractC48135a(C42822w c42822w) {
        this();
    }

    public AbstractC48135a() {
    }
}
