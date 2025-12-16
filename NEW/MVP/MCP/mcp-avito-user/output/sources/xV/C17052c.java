package Xv;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TarifikatorRegionState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LXv/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xv.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C17052c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f19147h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final C17052c f19148i = new C17052c(new com.avito.android.lib.design.nav_bar.a(null, null, false, null, null, null, null, 127, null), C42784z0.f406748b, null, false, false, false);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.nav_bar.a f19149b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f19150c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f19151d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19152e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19153f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19154g;

    /* compiled from: TarifikatorRegionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXv/c$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xv.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17052c(@k com.avito.android.lib.design.nav_bar.a aVar, @k List<? extends com.avito.conveyor_item.a> list, @l AttributedText attributedText, boolean z12, boolean z13, boolean z14) {
        this.f19149b = aVar;
        this.f19150c = list;
        this.f19151d = attributedText;
        this.f19152e = z12;
        this.f19153f = z13;
        this.f19154g = z14;
    }

    public static C17052c a(C17052c c17052c, com.avito.android.lib.design.nav_bar.a aVar, List list, AttributedText attributedText, boolean z12, boolean z13, boolean z14, int i12) {
        if ((i12 & 1) != 0) {
            aVar = c17052c.f19149b;
        }
        com.avito.android.lib.design.nav_bar.a aVar2 = aVar;
        if ((i12 & 2) != 0) {
            list = c17052c.f19150c;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            attributedText = c17052c.f19151d;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 8) != 0) {
            z12 = c17052c.f19152e;
        }
        boolean z15 = z12;
        if ((i12 & 16) != 0) {
            z13 = c17052c.f19153f;
        }
        boolean z16 = z13;
        if ((i12 & 32) != 0) {
            z14 = c17052c.f19154g;
        }
        c17052c.getClass();
        return new C17052c(aVar2, list2, attributedText2, z15, z16, z14);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17052c)) {
            return false;
        }
        C17052c c17052c = (C17052c) obj;
        return L.f(this.f19149b, c17052c.f19149b) && L.f(this.f19150c, c17052c.f19150c) && L.f(this.f19151d, c17052c.f19151d) && this.f19152e == c17052c.f19152e && this.f19153f == c17052c.f19153f && this.f19154g == c17052c.f19154g;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f19149b.hashCode() * 31, 31, this.f19150c);
        AttributedText attributedText = this.f19151d;
        return Boolean.hashCode(this.f19154g) + r.i(r.i((iE2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f19152e), 31, this.f19153f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TarifikatorRegionState(navBarState=");
        sb2.append(this.f19149b);
        sb2.append(", contentItems=");
        sb2.append(this.f19150c);
        sb2.append(", footer=");
        sb2.append(this.f19151d);
        sb2.append(", shouldShowSaveButton=");
        sb2.append(this.f19152e);
        sb2.append(", shouldShowExitAlertDialog=");
        sb2.append(this.f19153f);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f19154g, ')');
    }
}
