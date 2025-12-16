package Y50;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.passport.network.model.PassportListAvatar;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AccountsProfileErrorState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LY50/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f19298g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c f19299h = new c(null, null, null, null, null, 31, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19300b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f19301c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PassportListAvatar f19302d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f19303e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f19304f;

    /* compiled from: AccountsProfileErrorState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LY50/c$a;", "", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f19300b, cVar.f19300b) && L.f(this.f19301c, cVar.f19301c) && L.f(this.f19302d, cVar.f19302d) && L.f(this.f19303e, cVar.f19303e) && L.f(this.f19304f, cVar.f19304f);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f19300b.hashCode() * 31, 31, this.f19301c);
        PassportListAvatar passportListAvatar = this.f19302d;
        return this.f19304f.hashCode() + com.avito.android.actions_sheet.a.b((iD2 + (passportListAvatar == null ? 0 : passportListAvatar.hashCode())) * 31, 31, this.f19303e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccountsProfileErrorState(profileTitle=");
        sb2.append(this.f19300b);
        sb2.append(", profileName=");
        sb2.append(this.f19301c);
        sb2.append(", profileAvatar=");
        sb2.append(this.f19302d);
        sb2.append(", title=");
        sb2.append(this.f19303e);
        sb2.append(", actions=");
        return H.p(sb2, this.f19304f, ')');
    }

    public c(String str, String str2, PassportListAvatar passportListAvatar, AttributedText attributedText, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) == 0 ? str2 : "", (i12 & 4) != 0 ? null : passportListAvatar, (i12 & 8) != 0 ? new AttributedText("", C42784z0.f406748b, 0, 4, null) : attributedText, (i12 & 16) != 0 ? C42784z0.f406748b : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k String str, @k String str2, @l PassportListAvatar passportListAvatar, @k AttributedText attributedText, @k List<? extends com.avito.conveyor_item.a> list) {
        this.f19300b = str;
        this.f19301c = str2;
        this.f19302d = passportListAvatar;
        this.f19303e = attributedText;
        this.f19304f = list;
    }
}
