package nO0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.GetInvitationApiV1Response;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import nO0.InterfaceC44304e;

/* compiled from: InviteState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LnO0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nO0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C44303d extends q {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f415107l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final C44303d f415108m = new C44303d(null, null, false, null, false, false, false, false, false, null, 1023, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final GetInvitationApiV1Response f415109b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Category f415110c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f415111d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f415112e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f415113f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f415114g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f415115h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f415116i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f415117j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC44304e f415118k;

    /* compiled from: InviteState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LnO0/d$a;", "", "<init>", "()V", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nO0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44303d() {
        this(null, null, false, null, false, false, false, false, false, null, 1023, null);
    }

    public static C44303d a(C44303d c44303d, GetInvitationApiV1Response getInvitationApiV1Response, Category category, boolean z12, Integer num, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, InterfaceC44304e interfaceC44304e, int i12) {
        GetInvitationApiV1Response getInvitationApiV1Response2 = (i12 & 1) != 0 ? c44303d.f415109b : getInvitationApiV1Response;
        Category category2 = (i12 & 2) != 0 ? c44303d.f415110c : category;
        boolean z18 = (i12 & 4) != 0 ? c44303d.f415111d : z12;
        Integer num2 = (i12 & 8) != 0 ? c44303d.f415112e : num;
        boolean z19 = (i12 & 16) != 0 ? c44303d.f415113f : z13;
        boolean z22 = (i12 & 32) != 0 ? c44303d.f415114g : z14;
        boolean z23 = (i12 & 64) != 0 ? c44303d.f415115h : z15;
        boolean z24 = (i12 & 128) != 0 ? c44303d.f415116i : z16;
        boolean z25 = (i12 & 256) != 0 ? c44303d.f415117j : z17;
        InterfaceC44304e interfaceC44304e2 = (i12 & 512) != 0 ? c44303d.f415118k : interfaceC44304e;
        c44303d.getClass();
        return new C44303d(getInvitationApiV1Response2, category2, z18, num2, z19, z22, z23, z24, z25, interfaceC44304e2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44303d)) {
            return false;
        }
        C44303d c44303d = (C44303d) obj;
        return L.f(this.f415109b, c44303d.f415109b) && this.f415110c == c44303d.f415110c && this.f415111d == c44303d.f415111d && L.f(this.f415112e, c44303d.f415112e) && this.f415113f == c44303d.f415113f && this.f415114g == c44303d.f415114g && this.f415115h == c44303d.f415115h && this.f415116i == c44303d.f415116i && this.f415117j == c44303d.f415117j && L.f(this.f415118k, c44303d.f415118k);
    }

    public final int hashCode() {
        GetInvitationApiV1Response getInvitationApiV1Response = this.f415109b;
        int iHashCode = (getInvitationApiV1Response == null ? 0 : getInvitationApiV1Response.hashCode()) * 31;
        Category category = this.f415110c;
        int i12 = r.i((iHashCode + (category == null ? 0 : category.hashCode())) * 31, 31, this.f415111d);
        Integer num = this.f415112e;
        return this.f415118k.hashCode() + r.i(r.i(r.i(r.i(r.i((i12 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f415113f), 31, this.f415114g), 31, this.f415115h), 31, this.f415116i), 31, this.f415117j);
    }

    @k
    public final String toString() {
        return "InviteState(response=" + this.f415109b + ", category=" + this.f415110c + ", hasCustomView=" + this.f415111d + ", validTimerValue=" + this.f415112e + ", showPlaceholders=" + this.f415113f + ", isEmpty=" + this.f415114g + ", isError=" + this.f415115h + ", noInternet=" + this.f415116i + ", isSubmitting=" + this.f415117j + ", viewState=" + this.f415118k + ')';
    }

    public /* synthetic */ C44303d(GetInvitationApiV1Response getInvitationApiV1Response, Category category, boolean z12, Integer num, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, InterfaceC44304e interfaceC44304e, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : getInvitationApiV1Response, (i12 & 2) != 0 ? null : category, (i12 & 4) != 0 ? false : z12, (i12 & 8) == 0 ? num : null, (i12 & 16) != 0 ? true : z13, (i12 & 32) != 0 ? false : z14, (i12 & 64) != 0 ? false : z15, (i12 & 128) != 0 ? false : z16, (i12 & 256) == 0 ? z17 : false, (i12 & 512) != 0 ? InterfaceC44304e.C11859e.f415132a : interfaceC44304e);
    }

    public C44303d(@l GetInvitationApiV1Response getInvitationApiV1Response, @l Category category, boolean z12, @l Integer num, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, @k InterfaceC44304e interfaceC44304e) {
        this.f415109b = getInvitationApiV1Response;
        this.f415110c = category;
        this.f415111d = z12;
        this.f415112e = num;
        this.f415113f = z13;
        this.f415114g = z14;
        this.f415115h = z15;
        this.f415116i = z16;
        this.f415117j = z17;
        this.f415118k = interfaceC44304e;
    }
}
