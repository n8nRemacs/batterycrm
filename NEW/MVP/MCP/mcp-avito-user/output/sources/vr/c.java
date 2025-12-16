package Vr;

import Pr.C14830a;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CptMassActivationState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LVr/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f17432h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final c f17433i = new c(true, null, C42784z0.f406748b, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17434b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ApiException f17435c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f17436d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C14830a f17437e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final b f17438f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f17439g;

    /* compiled from: CptMassActivationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVr/c$a;", "", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CptMassActivationState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVr/c$b;", "", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f17440a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f17441b;

        public b(@l String str, @l String str2) {
            this.f17440a = str;
            this.f17441b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f17440a, bVar.f17440a) && L.f(this.f17441b, bVar.f17441b);
        }

        public final int hashCode() {
            String str = this.f17440a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f17441b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavBarV2(title=");
            sb2.append(this.f17440a);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.f17441b, ')');
        }
    }

    public c(boolean z12, @l ApiException apiException, @k List list, @l C14830a c14830a, @l b bVar, @l AttributedText attributedText) {
        this.f17434b = z12;
        this.f17435c = apiException;
        this.f17436d = list;
        this.f17437e = c14830a;
        this.f17438f = bVar;
        this.f17439g = attributedText;
    }

    public static c a(c cVar, boolean z12, ApiException apiException) {
        List<com.avito.conveyor_item.a> list = cVar.f17436d;
        C14830a c14830a = cVar.f17437e;
        b bVar = cVar.f17438f;
        AttributedText attributedText = cVar.f17439g;
        cVar.getClass();
        return new c(z12, apiException, list, c14830a, bVar, attributedText);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f17434b == cVar.f17434b && L.f(this.f17435c, cVar.f17435c) && L.f(this.f17436d, cVar.f17436d) && L.f(this.f17437e, cVar.f17437e) && L.f(this.f17438f, cVar.f17438f) && L.f(this.f17439g, cVar.f17439g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f17434b) * 31;
        ApiException apiException = this.f17435c;
        int iE2 = H.e((iHashCode + (apiException == null ? 0 : apiException.hashCode())) * 31, 31, this.f17436d);
        C14830a c14830a = this.f17437e;
        int iHashCode2 = (iE2 + (c14830a == null ? 0 : c14830a.hashCode())) * 31;
        b bVar = this.f17438f;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        AttributedText attributedText = this.f17439g;
        return iHashCode3 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptMassActivationState(isLoading=");
        sb2.append(this.f17434b);
        sb2.append(", error=");
        sb2.append(this.f17435c);
        sb2.append(", items=");
        sb2.append(this.f17436d);
        sb2.append(", button=");
        sb2.append(this.f17437e);
        sb2.append(", navBar=");
        sb2.append(this.f17438f);
        sb2.append(", agreement=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f17439g, ')');
    }
}
