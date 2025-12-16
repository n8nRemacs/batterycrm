package ky;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.extended_profile_ui_components.ActionsBottomMenuData;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: EditBasicInfoState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lky/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c extends q {

    /* renamed from: u, reason: collision with root package name */
    @k
    public static final a f413319u = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Image f413320b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f413321c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ModerationStatus f413322d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Uri f413323e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f413324f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f413325g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f413326h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f413327i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f413328j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Integer f413329k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f413330l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Integer f413331m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f413332n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final String f413333o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final AttributedText f413334p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final d f413335q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f413336r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f413337s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final ActionsBottomMenuData<InterfaceC43512a> f413338t;

    /* compiled from: EditBasicInfoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lky/c$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l Image image, boolean z12, @l ModerationStatus moderationStatus, @l Uri uri, boolean z13, @k String str, @l String str2, boolean z14, @l String str3, @l Integer num, @l String str4, @l Integer num2, boolean z15, @k String str5, @l AttributedText attributedText, @l d dVar, boolean z16, boolean z17, @l ActionsBottomMenuData<InterfaceC43512a> actionsBottomMenuData) {
        this.f413320b = image;
        this.f413321c = z12;
        this.f413322d = moderationStatus;
        this.f413323e = uri;
        this.f413324f = z13;
        this.f413325g = str;
        this.f413326h = str2;
        this.f413327i = z14;
        this.f413328j = str3;
        this.f413329k = num;
        this.f413330l = str4;
        this.f413331m = num2;
        this.f413332n = z15;
        this.f413333o = str5;
        this.f413334p = attributedText;
        this.f413335q = dVar;
        this.f413336r = z16;
        this.f413337s = z17;
        this.f413338t = actionsBottomMenuData;
    }

    public static c a(c cVar, Image image, boolean z12, ModerationStatus moderationStatus, Uri uri, boolean z13, String str, String str2, boolean z14, String str3, Integer num, String str4, Integer num2, boolean z15, String str5, AttributedText attributedText, d dVar, boolean z16, boolean z17, ActionsBottomMenuData actionsBottomMenuData, int i12) {
        Image image2 = (i12 & 1) != 0 ? cVar.f413320b : image;
        boolean z18 = (i12 & 2) != 0 ? cVar.f413321c : z12;
        ModerationStatus moderationStatus2 = (i12 & 4) != 0 ? cVar.f413322d : moderationStatus;
        Uri uri2 = (i12 & 8) != 0 ? cVar.f413323e : uri;
        boolean z19 = (i12 & 16) != 0 ? cVar.f413324f : z13;
        String str6 = (i12 & 32) != 0 ? cVar.f413325g : str;
        String str7 = (i12 & 64) != 0 ? cVar.f413326h : str2;
        boolean z22 = (i12 & 128) != 0 ? cVar.f413327i : z14;
        String str8 = (i12 & 256) != 0 ? cVar.f413328j : str3;
        Integer num3 = (i12 & 512) != 0 ? cVar.f413329k : num;
        String str9 = (i12 & 1024) != 0 ? cVar.f413330l : str4;
        Integer num4 = (i12 & 2048) != 0 ? cVar.f413331m : num2;
        boolean z23 = (i12 & 4096) != 0 ? cVar.f413332n : z15;
        String str10 = (i12 & 8192) != 0 ? cVar.f413333o : str5;
        AttributedText attributedText2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? cVar.f413334p : attributedText;
        d dVar2 = (i12 & 32768) != 0 ? cVar.f413335q : dVar;
        boolean z24 = (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? cVar.f413336r : z16;
        boolean z25 = (i12 & 131072) != 0 ? cVar.f413337s : z17;
        ActionsBottomMenuData actionsBottomMenuData2 = (i12 & 262144) != 0 ? cVar.f413338t : actionsBottomMenuData;
        cVar.getClass();
        return new c(image2, z18, moderationStatus2, uri2, z19, str6, str7, z22, str8, num3, str9, num4, z23, str10, attributedText2, dVar2, z24, z25, actionsBottomMenuData2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f413320b, cVar.f413320b) && this.f413321c == cVar.f413321c && L.f(this.f413322d, cVar.f413322d) && L.f(this.f413323e, cVar.f413323e) && this.f413324f == cVar.f413324f && L.f(this.f413325g, cVar.f413325g) && L.f(this.f413326h, cVar.f413326h) && this.f413327i == cVar.f413327i && L.f(this.f413328j, cVar.f413328j) && L.f(this.f413329k, cVar.f413329k) && L.f(this.f413330l, cVar.f413330l) && L.f(this.f413331m, cVar.f413331m) && this.f413332n == cVar.f413332n && L.f(this.f413333o, cVar.f413333o) && L.f(this.f413334p, cVar.f413334p) && L.f(this.f413335q, cVar.f413335q) && this.f413336r == cVar.f413336r && this.f413337s == cVar.f413337s && L.f(this.f413338t, cVar.f413338t);
    }

    public final int hashCode() {
        Image image = this.f413320b;
        int i12 = r.i((image == null ? 0 : image.hashCode()) * 31, 31, this.f413321c);
        ModerationStatus moderationStatus = this.f413322d;
        int iHashCode = (i12 + (moderationStatus == null ? 0 : moderationStatus.hashCode())) * 31;
        Uri uri = this.f413323e;
        int iD2 = H.d(r.i((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.f413324f), 31, this.f413325g);
        String str = this.f413326h;
        int i13 = r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f413327i);
        String str2 = this.f413328j;
        int iHashCode2 = (i13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f413329k;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f413330l;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f413331m;
        int iD3 = H.d(r.i((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f413332n), 31, this.f413333o);
        AttributedText attributedText = this.f413334p;
        int iHashCode5 = (iD3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        d dVar = this.f413335q;
        int i14 = r.i(r.i((iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f413336r), 31, this.f413337s);
        ActionsBottomMenuData<InterfaceC43512a> actionsBottomMenuData = this.f413338t;
        return i14 + (actionsBottomMenuData != null ? actionsBottomMenuData.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "EditBasicInfoState(avatarImage=" + this.f413320b + ", hasAvatar=" + this.f413321c + ", avatarModerationStatus=" + this.f413322d + ", uploadingImage=" + this.f413323e + ", avatarActionInProgress=" + this.f413324f + ", name=" + this.f413325g + ", nameHint=" + this.f413326h + ", nameErrorState=" + this.f413327i + ", verticalValue=" + this.f413328j + ", verticalId=" + this.f413329k + ", specificValue=" + this.f413330l + ", specificId=" + this.f413331m + ", isSpecificVisible=" + this.f413332n + ", personalLink=" + this.f413333o + ", personalLinkHint=" + this.f413334p + ", sellerType=" + this.f413335q + ", personalLinkErrorState=" + this.f413336r + ", isLoading=" + this.f413337s + ", actionsBottomMenu=" + this.f413338t + ')';
    }
}
