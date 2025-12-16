package e80;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.category_parameters.ImageGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoItemGroupSelectionState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Le80/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: e80.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C39966c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f394982f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C39966c f394983g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f394984b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<ImageGroup> f394985c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f394986d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final d f394987e;

    /* compiled from: PhotoItemGroupSelectionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le80/c$a;", "", "<init>", "()V", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e80.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        d.f394988c.getClass();
        f394983g = new C39966c("", c42784z0, null, d.f394989d);
    }

    public C39966c(@k String str, @k List<ImageGroup> list, @l String str2, @k d dVar) {
        this.f394984b = str;
        this.f394985c = list;
        this.f394986d = str2;
        this.f394987e = dVar;
    }

    public static C39966c a(C39966c c39966c, String str, List list, String str2, d dVar, int i12) {
        if ((i12 & 1) != 0) {
            str = c39966c.f394984b;
        }
        if ((i12 & 2) != 0) {
            list = c39966c.f394985c;
        }
        if ((i12 & 4) != 0) {
            str2 = c39966c.f394986d;
        }
        if ((i12 & 8) != 0) {
            dVar = c39966c.f394987e;
        }
        c39966c.getClass();
        return new C39966c(str, list, str2, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39966c)) {
            return false;
        }
        C39966c c39966c = (C39966c) obj;
        return L.f(this.f394984b, c39966c.f394984b) && L.f(this.f394985c, c39966c.f394985c) && L.f(this.f394986d, c39966c.f394986d) && L.f(this.f394987e, c39966c.f394987e);
    }

    public final int hashCode() {
        int iE2 = H.e(this.f394984b.hashCode() * 31, 31, this.f394985c);
        String str = this.f394986d;
        return this.f394987e.f394990b.hashCode() + ((iE2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "PhotoItemGroupSelectionState(header=" + this.f394984b + ", imageGroups=" + this.f394985c + ", currentGroupId=" + this.f394986d + ", viewState=" + this.f394987e + ')';
    }
}
