package Se;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BuyContactsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LSe/b;", "", "<init>", "()V", "a", "LSe/b$a;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Se.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC15175b {

    /* compiled from: BuyContactsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSe/b$a;", "LSe/b;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Se.b$a */
    public static final /* data */ class a extends AbstractC15175b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f15097a;

        public a(@k DeepLink deepLink) {
            super(null);
            this.f15097a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f15097a, ((a) obj).f15097a);
        }

        public final int hashCode() {
            return this.f15097a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleLink(uri="), this.f15097a, ')');
        }
    }

    public /* synthetic */ AbstractC15175b(C42822w c42822w) {
        this();
    }

    public AbstractC15175b() {
    }
}
