package Lf;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.autoteka.items.fullScreenError.landing.LandingErrorItem;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.UniversalColor;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaLandingState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LLf/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "LLf/c$a;", "LLf/c$b;", "LLf/c$c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class c extends q {

    /* compiled from: AutotekaLandingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLf/c$a;", "LLf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f10065b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f10066c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f10067d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f10068e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f10069f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f10070g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f10071h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final UniversalColor f10072i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@l String str, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @l String str2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @l String str3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3, @l String str4, @l UniversalColor universalColor) {
            super(null);
            this.f10065b = str;
            this.f10066c = list;
            this.f10067d = str2;
            this.f10068e = list2;
            this.f10069f = str3;
            this.f10070g = list3;
            this.f10071h = str4;
            this.f10072i = universalColor;
        }

        public static a a(a aVar, String str, List list, String str2, List list2, String str3, List list3, String str4, UniversalColor universalColor, int i12) {
            String str5 = (i12 & 1) != 0 ? aVar.f10065b : str;
            List list4 = (i12 & 2) != 0 ? aVar.f10066c : list;
            String str6 = (i12 & 4) != 0 ? aVar.f10067d : str2;
            List list5 = (i12 & 8) != 0 ? aVar.f10068e : list2;
            String str7 = (i12 & 16) != 0 ? aVar.f10069f : str3;
            List list6 = (i12 & 32) != 0 ? aVar.f10070g : list3;
            String str8 = (i12 & 64) != 0 ? aVar.f10071h : str4;
            UniversalColor universalColor2 = (i12 & 128) != 0 ? aVar.f10072i : universalColor;
            aVar.getClass();
            return new a(str5, list4, str6, list5, str7, list6, str8, universalColor2);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f10065b, aVar.f10065b) && L.f(this.f10066c, aVar.f10066c) && L.f(this.f10067d, aVar.f10067d) && L.f(this.f10068e, aVar.f10068e) && L.f(this.f10069f, aVar.f10069f) && L.f(this.f10070g, aVar.f10070g) && L.f(this.f10071h, aVar.f10071h) && L.f(this.f10072i, aVar.f10072i);
        }

        public final int hashCode() {
            String str = this.f10065b;
            int iE2 = H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f10066c);
            String str2 = this.f10067d;
            int iE3 = H.e((iE2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f10068e);
            String str3 = this.f10069f;
            int iE4 = H.e((iE3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f10070g);
            String str4 = this.f10071h;
            int iHashCode = (iE4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            UniversalColor universalColor = this.f10072i;
            return iHashCode + (universalColor != null ? universalColor.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(topFormId=");
            sb2.append(this.f10065b);
            sb2.append(", topComponents=");
            sb2.append(this.f10066c);
            sb2.append(", mainFormId=");
            sb2.append(this.f10067d);
            sb2.append(", mainComponents=");
            sb2.append(this.f10068e);
            sb2.append(", bottomFormId=");
            sb2.append(this.f10069f);
            sb2.append(", bottomComponents=");
            sb2.append(this.f10070g);
            sb2.append(", navBarTitle=");
            sb2.append(this.f10071h);
            sb2.append(", navBarColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f10072i, ')');
        }
    }

    /* compiled from: AutotekaLandingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLf/c$b;", "LLf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LandingErrorItem f10073b;

        public b(@k LandingErrorItem landingErrorItem) {
            super(null);
            this.f10073b = landingErrorItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f10073b, ((b) obj).f10073b);
        }

        public final int hashCode() {
            return this.f10073b.hashCode();
        }

        @k
        public final String toString() {
            return "Failed(item=" + this.f10073b + ')';
        }
    }

    /* compiled from: AutotekaLandingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLf/c$c;", "LLf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lf.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0624c extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final G0 f10074b;

        public C0624c() {
            this(null, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0624c) && L.f(this.f10074b, ((C0624c) obj).f10074b);
        }

        public final int hashCode() {
            return this.f10074b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.v(new StringBuilder("Loading(stub="), this.f10074b, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0624c(G0 g02, int i12, C42822w c42822w) {
            super(null);
            g02 = (i12 & 1) != 0 ? G0.f406611a : g02;
            this.f10074b = g02;
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
