package Qb0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_basic.adapter.BasicSettingsListItem;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BasicProfileSettingsState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LQb0/d;", "", "a", "b", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final b f13905e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final d f13906f = new d(null, false, null, null, 15, null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final List<BasicSettingsListItem> f13907a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13908b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Throwable f13909c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final a f13910d;

    /* compiled from: BasicProfileSettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQb0/d$a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ModerationStatus f13911a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AvatarShape f13912b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<BasicInfoItem.AvatarAction> f13913c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f13914d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Boolean f13915e;

        public a(@l ModerationStatus moderationStatus, @k AvatarShape avatarShape, @k List<BasicInfoItem.AvatarAction> list, boolean z12, @l Boolean bool) {
            this.f13911a = moderationStatus;
            this.f13912b = avatarShape;
            this.f13913c = list;
            this.f13914d = z12;
            this.f13915e = bool;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f13911a, aVar.f13911a) && this.f13912b == aVar.f13912b && L.f(this.f13913c, aVar.f13913c) && this.f13914d == aVar.f13914d && L.f(this.f13915e, aVar.f13915e);
        }

        public final int hashCode() {
            ModerationStatus moderationStatus = this.f13911a;
            int i12 = r.i(H.e((this.f13912b.hashCode() + ((moderationStatus == null ? 0 : moderationStatus.hashCode()) * 31)) * 31, 31, this.f13913c), 31, this.f13914d);
            Boolean bool = this.f13915e;
            return i12 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AvatarBottomMenuData(moderationStatus=");
            sb2.append(this.f13911a);
            sb2.append(", cropBoundsShape=");
            sb2.append(this.f13912b);
            sb2.append(", actions=");
            sb2.append(this.f13913c);
            sb2.append(", isDeletionInProgress=");
            sb2.append(this.f13914d);
            sb2.append(", isDeletionPublic=");
            return C0.g(sb2, this.f13915e, ')');
        }
    }

    /* compiled from: BasicProfileSettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb0/d$b;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public d() {
        this(null, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    public static d a(d dVar, List list, boolean z12, ApiException apiException, a aVar, int i12) {
        if ((i12 & 1) != 0) {
            list = dVar.f13907a;
        }
        if ((i12 & 2) != 0) {
            z12 = dVar.f13908b;
        }
        ApiException apiException2 = apiException;
        if ((i12 & 4) != 0) {
            apiException2 = dVar.f13909c;
        }
        if ((i12 & 8) != 0) {
            aVar = dVar.f13910d;
        }
        dVar.getClass();
        return new d(list, z12, apiException2, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f13907a, dVar.f13907a) && this.f13908b == dVar.f13908b && L.f(this.f13909c, dVar.f13909c) && L.f(this.f13910d, dVar.f13910d);
    }

    public final int hashCode() {
        List<BasicSettingsListItem> list = this.f13907a;
        int i12 = r.i((list == null ? 0 : list.hashCode()) * 31, 31, this.f13908b);
        Throwable th2 = this.f13909c;
        int iHashCode = (i12 + (th2 == null ? 0 : th2.hashCode())) * 31;
        a aVar = this.f13910d;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "BasicProfileSettingsState(items=" + this.f13907a + ", isLoading=" + this.f13908b + ", error=" + this.f13909c + ", avatarBottomMenuData=" + this.f13910d + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@l List<? extends BasicSettingsListItem> list, boolean z12, @l Throwable th2, @l a aVar) {
        this.f13907a = list;
        this.f13908b = z12;
        this.f13909c = th2;
        this.f13910d = aVar;
    }

    public /* synthetic */ d(List list, boolean z12, Throwable th2, a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : th2, (i12 & 8) != 0 ? null : aVar);
    }
}
