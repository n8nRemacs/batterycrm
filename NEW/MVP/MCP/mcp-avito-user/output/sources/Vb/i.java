package Vb;

import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LVb/i;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class i extends q {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f17248i = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f17249b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f17250c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f17251d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f17252e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final k f17253f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final l f17254g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final List<Tb.e> f17255h;

    /* compiled from: AiAssistantState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVb/i$a;", "", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k m mVar, @Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.k k kVar, @Y61.k l lVar, @Y61.k List<Tb.e> list) {
        this.f17249b = mVar;
        this.f17250c = str;
        this.f17251d = str2;
        this.f17252e = str3;
        this.f17253f = kVar;
        this.f17254g = lVar;
        this.f17255h = list;
    }

    public static i a(i iVar, m mVar, String str, String str2, k kVar, l lVar, List list, int i12) {
        if ((i12 & 1) != 0) {
            mVar = iVar.f17249b;
        }
        m mVar2 = mVar;
        if ((i12 & 2) != 0) {
            str = iVar.f17250c;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            str2 = iVar.f17251d;
        }
        String str4 = str2;
        String str5 = iVar.f17252e;
        if ((i12 & 16) != 0) {
            kVar = iVar.f17253f;
        }
        k kVar2 = kVar;
        if ((i12 & 32) != 0) {
            lVar = iVar.f17254g;
        }
        l lVar2 = lVar;
        if ((i12 & 64) != 0) {
            list = iVar.f17255h;
        }
        iVar.getClass();
        return new i(mVar2, str3, str4, str5, kVar2, lVar2, list);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f17249b, iVar.f17249b) && L.f(this.f17250c, iVar.f17250c) && L.f(this.f17251d, iVar.f17251d) && L.f(this.f17252e, iVar.f17252e) && L.f(this.f17253f, iVar.f17253f) && L.f(this.f17254g, iVar.f17254g) && L.f(this.f17255h, iVar.f17255h);
    }

    public final int hashCode() {
        int iHashCode = this.f17249b.hashCode() * 31;
        String str = this.f17250c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17251d;
        return this.f17255h.hashCode() + ((this.f17254g.hashCode() + ((this.f17253f.hashCode() + H.d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f17252e)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AiAssistantState(viewState=");
        sb2.append(this.f17249b);
        sb2.append(", chatId=");
        sb2.append(this.f17250c);
        sb2.append(", newChatContext=");
        sb2.append(this.f17251d);
        sb2.append(", context=");
        sb2.append(this.f17252e);
        sb2.append(", idempotentIds=");
        sb2.append(this.f17253f);
        sb2.append(", timestamps=");
        sb2.append(this.f17254g);
        sb2.append(", closeFeedbacks=");
        return H.p(sb2, this.f17255h, ')');
    }
}
