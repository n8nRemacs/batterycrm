package Z50;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.passport.network.model.PassportListAvatar;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.Flow;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BusinessVrfDuplicationState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ50/d;", "", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f19885a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19886b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PassportListAvatar f19887c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f19888d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f19889e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AttributedText f19890f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f19891g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Flow f19892h;

    public d() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f19885a, dVar.f19885a) && L.f(this.f19886b, dVar.f19886b) && L.f(this.f19887c, dVar.f19887c) && L.f(this.f19888d, dVar.f19888d) && L.f(this.f19889e, dVar.f19889e) && L.f(this.f19890f, dVar.f19890f) && L.f(this.f19891g, dVar.f19891g) && this.f19892h == dVar.f19892h;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f19885a.hashCode() * 31, 31, this.f19886b);
        PassportListAvatar passportListAvatar = this.f19887c;
        return this.f19892h.hashCode() + H.e(com.avito.android.actions_sheet.a.b(H.d(H.d((iD2 + (passportListAvatar == null ? 0 : passportListAvatar.hashCode())) * 31, 31, this.f19888d), 31, this.f19889e), 31, this.f19890f), 31, this.f19891g);
    }

    @k
    public final String toString() {
        return "Content(profileTitle=" + this.f19885a + ", profileName=" + this.f19886b + ", profileAvatar=" + this.f19887c + ", title=" + this.f19888d + ", subtitle=" + this.f19889e + ", text=" + this.f19890f + ", actions=" + this.f19891g + ", flow=" + this.f19892h + ')';
    }

    public d(String str, String str2, PassportListAvatar passportListAvatar, String str3, String str4, AttributedText attributedText, List list, Flow flow, int i12, C42822w c42822w) {
        String str5 = (i12 & 1) != 0 ? "" : str;
        String str6 = (i12 & 2) != 0 ? "" : str2;
        PassportListAvatar passportListAvatar2 = (i12 & 4) != 0 ? null : passportListAvatar;
        String str7 = (i12 & 8) != 0 ? "" : str3;
        String str8 = (i12 & 16) == 0 ? str4 : "";
        AttributedText attributedText2 = (i12 & 32) != 0 ? new AttributedText("", C42784z0.f406748b, 0, 4, null) : attributedText;
        List list2 = (i12 & 64) != 0 ? C42784z0.f406748b : list;
        Flow flow2 = (i12 & 128) != 0 ? Flow.f212551c : flow;
        this.f19885a = str5;
        this.f19886b = str6;
        this.f19887c = passportListAvatar2;
        this.f19888d = str7;
        this.f19889e = str8;
        this.f19890f = attributedText2;
        this.f19891g = list2;
        this.f19892h = flow2;
    }
}
