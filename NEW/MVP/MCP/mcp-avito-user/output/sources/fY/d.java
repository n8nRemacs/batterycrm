package FY;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import cZ.AbstractC27130a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChannelsHeaderState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LFY/d;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f4766h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4767a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC27130a f4768b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GY.b f4769c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<GY.a> f4770d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final WebViewLink.OnlyAvitoDomain f4771e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4772f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f4773g;

    /* compiled from: ChannelsHeaderState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFY/d$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(boolean z12, @k AbstractC27130a abstractC27130a, @k GY.b bVar, @k List<? extends GY.a> list, @l WebViewLink.OnlyAvitoDomain onlyAvitoDomain, boolean z13, @l DeepLink deepLink) {
        this.f4767a = z12;
        this.f4768b = abstractC27130a;
        this.f4769c = bVar;
        this.f4770d = list;
        this.f4771e = onlyAvitoDomain;
        this.f4772f = z13;
        this.f4773g = deepLink;
    }

    public static d a(d dVar, boolean z12, AbstractC27130a abstractC27130a, GY.b bVar, List list, WebViewLink.OnlyAvitoDomain onlyAvitoDomain, boolean z13, DeepLink deepLink, int i12) {
        boolean z14 = (i12 & 1) != 0 ? dVar.f4767a : z12;
        AbstractC27130a abstractC27130a2 = (i12 & 2) != 0 ? dVar.f4768b : abstractC27130a;
        GY.b bVar2 = (i12 & 4) != 0 ? dVar.f4769c : bVar;
        List list2 = (i12 & 8) != 0 ? dVar.f4770d : list;
        WebViewLink.OnlyAvitoDomain onlyAvitoDomain2 = (i12 & 16) != 0 ? dVar.f4771e : onlyAvitoDomain;
        boolean z15 = (i12 & 32) != 0 ? dVar.f4772f : z13;
        DeepLink deepLink2 = (i12 & 64) != 0 ? dVar.f4773g : deepLink;
        dVar.getClass();
        return new d(z14, abstractC27130a2, bVar2, list2, onlyAvitoDomain2, z15, deepLink2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f4767a == dVar.f4767a && L.f(this.f4768b, dVar.f4768b) && L.f(this.f4769c, dVar.f4769c) && L.f(this.f4770d, dVar.f4770d) && L.f(this.f4771e, dVar.f4771e) && this.f4772f == dVar.f4772f && L.f(this.f4773g, dVar.f4773g);
    }

    public final int hashCode() {
        int iE2 = H.e((this.f4769c.hashCode() + ((this.f4768b.hashCode() + (Boolean.hashCode(this.f4767a) * 31)) * 31)) * 31, 31, this.f4770d);
        WebViewLink.OnlyAvitoDomain onlyAvitoDomain = this.f4771e;
        int i12 = r.i((iE2 + (onlyAvitoDomain == null ? 0 : onlyAvitoDomain.hashCode())) * 31, 31, this.f4772f);
        DeepLink deepLink = this.f4773g;
        return i12 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelsHeaderState(isConnecting=");
        sb2.append(this.f4767a);
        sb2.append(", crmEntryPointStatus=");
        sb2.append(this.f4768b);
        sb2.append(", filterIconState=");
        sb2.append(this.f4769c);
        sb2.append(", filterChips=");
        sb2.append(this.f4770d);
        sb2.append(", autoRepliesDeeplink=");
        sb2.append(this.f4771e);
        sb2.append(", autoRepliesOnboardingShouldBeShown=");
        sb2.append(this.f4772f);
        sb2.append(", assistantSettingsDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f4773g, ')');
    }
}
