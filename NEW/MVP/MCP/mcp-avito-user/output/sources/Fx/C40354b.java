package fX;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.UniversalImage;
import j.InterfaceC42165v;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BadgeDetailsV3State.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LfX/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fX.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C40354b extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f395899d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C40354b f395900e = new C40354b(new C11156b(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0), Collections.singletonList(new com.avito.android.loyalty.ui.badge_details_v3.items.skeleton.a(UUID.randomUUID().toString())));

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C11156b f395901b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f395902c;

    /* compiled from: BadgeDetailsV3State.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfX/b$a;", "", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fX.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BadgeDetailsV3State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfX/b$b;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fX.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11156b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final UniversalImage f395903a;

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC42165v
        public final int f395904b;

        /* JADX WARN: Multi-variable type inference failed */
        public C11156b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11156b) && L.f(this.f395903a, ((C11156b) obj).f395903a);
        }

        public final int hashCode() {
            UniversalImage universalImage = this.f395903a;
            if (universalImage == null) {
                return 0;
            }
            return universalImage.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.s(new StringBuilder("HeaderImage(image="), this.f395903a, ')');
        }

        public C11156b(@l UniversalImage universalImage) {
            this.f395903a = universalImage;
            this.f395904b = R.drawable.badge_details_header_image_placeholder;
        }

        public /* synthetic */ C11156b(UniversalImage universalImage, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : universalImage);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C40354b(@l C11156b c11156b, @k List<? extends com.avito.conveyor_item.a> list) {
        this.f395901b = c11156b;
        this.f395902c = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40354b)) {
            return false;
        }
        C40354b c40354b = (C40354b) obj;
        return L.f(this.f395901b, c40354b.f395901b) && L.f(this.f395902c, c40354b.f395902c);
    }

    public final int hashCode() {
        C11156b c11156b = this.f395901b;
        return this.f395902c.hashCode() + ((c11156b == null ? 0 : c11156b.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BadgeDetailsV3State(headerImage=");
        sb2.append(this.f395901b);
        sb2.append(", items=");
        return H.p(sb2, this.f395902c, ')');
    }
}
