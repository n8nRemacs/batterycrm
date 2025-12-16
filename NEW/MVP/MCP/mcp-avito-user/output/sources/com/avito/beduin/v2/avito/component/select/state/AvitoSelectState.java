package com.avito.beduin.v2.avito.component.select.state;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoSelectState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/select/state/AvitoSelectState;", "Lcom/avito/beduin/v2/engine/component/c;", "a", "b", "SelectState", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AvitoSelectState implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f334979a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f334980b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f334981c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f334982d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f334983e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SelectState f334984f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final a f334985g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f334986h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f334987i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ET0.a<b> f334988j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Y41.l<String, G0> f334989k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334990l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<r> f334991m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f334992n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334993o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334994p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f334995q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoSelectState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/select/state/AvitoSelectState$SelectState;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectState {

        /* renamed from: c, reason: collision with root package name */
        public static final SelectState f334996c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ SelectState[] f334997d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f334998e;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f334999b;

        static {
            SelectState selectState = new SelectState("Normal", 0, Constants.NORMAL);
            f334996c = selectState;
            SelectState[] selectStateArr = {selectState, new SelectState("Error", 1, "error")};
            f334997d = selectStateArr;
            f334998e = kotlin.enums.c.a(selectStateArr);
        }

        public SelectState(String str, int i12, String str2) {
            this.f334999b = str2;
        }

        public static SelectState valueOf(String str) {
            return (SelectState) Enum.valueOf(SelectState.class, str);
        }

        public static SelectState[] values() {
            return (SelectState[]) f334997d.clone();
        }
    }

    /* compiled from: AvitoSelectState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/select/state/AvitoSelectState$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f335000a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f335001b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.theme.r f335002c;

        public a(@Y61.k String str, @Y61.l String str2, @Y61.k com.avito.beduin.v2.theme.r rVar) {
            this.f335000a = str;
            this.f335001b = str2;
            this.f335002c = rVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f335000a, aVar.f335000a) && L.f(this.f335001b, aVar.f335001b) && L.f(this.f335002c, aVar.f335002c);
        }

        public final int hashCode() {
            int iHashCode = this.f335000a.hashCode() * 31;
            String str = this.f335001b;
            return this.f335002c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            return "LocalIcon(name=" + this.f335000a + ", themeName=" + this.f335001b + ", color=" + this.f335002c + ')';
        }
    }

    /* compiled from: AvitoSelectState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/select/state/AvitoSelectState$b;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f335003a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f335004b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f335005c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f335006d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f335007e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final a f335008f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final a f335009g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Y41.a<G0> f335010h;

        public b(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l a aVar, @Y61.l a aVar2, @Y61.l Y41.a<G0> aVar3) {
            this.f335003a = str;
            this.f335004b = str2;
            this.f335005c = str3;
            this.f335006d = str4;
            this.f335007e = str5;
            this.f335008f = aVar;
            this.f335009g = aVar2;
            this.f335010h = aVar3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f335003a, bVar.f335003a) && L.f(this.f335004b, bVar.f335004b) && L.f(this.f335005c, bVar.f335005c) && L.f(this.f335006d, bVar.f335006d) && L.f(this.f335007e, bVar.f335007e) && L.f(this.f335008f, bVar.f335008f) && L.f(this.f335009g, bVar.f335009g) && L.f(this.f335010h, bVar.f335010h);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f335003a.hashCode() * 31, 31, this.f335004b);
            String str = this.f335005c;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f335006d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f335007e;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            a aVar = this.f335008f;
            int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            a aVar2 = this.f335009g;
            int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            Y41.a<G0> aVar3 = this.f335010h;
            return iHashCode5 + (aVar3 != null ? aVar3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Option(identifier=");
            sb2.append(this.f335003a);
            sb2.append(", title=");
            sb2.append(this.f335004b);
            sb2.append(", subtitle=");
            sb2.append(this.f335005c);
            sb2.append(", details=");
            sb2.append(this.f335006d);
            sb2.append(", link=");
            sb2.append(this.f335007e);
            sb2.append(", leadingIcon=");
            sb2.append(this.f335008f);
            sb2.append(", trailingIcon=");
            sb2.append(this.f335009g);
            sb2.append(", onLinkTap=");
            return androidx.appcompat.app.r.v(sb2, this.f335010h, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AvitoSelectState(@Y61.k String str, boolean z12, boolean z13, boolean z14, boolean z15, @Y61.k SelectState selectState, @Y61.l a aVar, @Y61.l String str2, @Y61.l String str3, @Y61.k ET0.a<b> aVar2, @Y61.l Y41.l<? super String, G0> lVar, @Y61.l Y41.a<G0> aVar3, @Y61.k com.avito.beduin.v2.theme.l<r> lVar2, boolean z16, @Y61.l Y41.a<G0> aVar4, @Y61.l Y41.a<G0> aVar5, @Y61.l String str4) {
        this.f334979a = str;
        this.f334980b = z12;
        this.f334981c = z13;
        this.f334982d = z14;
        this.f334983e = z15;
        this.f334984f = selectState;
        this.f334985g = aVar;
        this.f334986h = str2;
        this.f334987i = str3;
        this.f334988j = aVar2;
        this.f334989k = lVar;
        this.f334990l = aVar3;
        this.f334991m = lVar2;
        this.f334992n = z16;
        this.f334993o = aVar4;
        this.f334994p = aVar5;
        this.f334995q = str4;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334993o;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334994p;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvitoSelectState)) {
            return false;
        }
        AvitoSelectState avitoSelectState = (AvitoSelectState) obj;
        return L.f(this.f334979a, avitoSelectState.f334979a) && this.f334980b == avitoSelectState.f334980b && this.f334981c == avitoSelectState.f334981c && this.f334982d == avitoSelectState.f334982d && this.f334983e == avitoSelectState.f334983e && this.f334984f == avitoSelectState.f334984f && L.f(this.f334985g, avitoSelectState.f334985g) && L.f(this.f334986h, avitoSelectState.f334986h) && L.f(this.f334987i, avitoSelectState.f334987i) && L.f(this.f334988j, avitoSelectState.f334988j) && L.f(this.f334989k, avitoSelectState.f334989k) && L.f(this.f334990l, avitoSelectState.f334990l) && L.f(this.f334991m, avitoSelectState.f334991m) && this.f334992n == avitoSelectState.f334992n && L.f(this.f334993o, avitoSelectState.f334993o) && L.f(this.f334994p, avitoSelectState.f334994p) && L.f(this.f334995q, avitoSelectState.f334995q);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF335377o() {
        return this.f334995q;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF335373k() {
        return this.f334992n;
    }

    public final int hashCode() {
        int iHashCode = (this.f334984f.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f334979a.hashCode() * 31, 31, this.f334980b), 31, this.f334981c), 31, this.f334982d), 31, this.f334983e)) * 31;
        a aVar = this.f334985g;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f334986h;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f334987i;
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f334988j.f4014b, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Y41.l<String, G0> lVar = this.f334989k;
        int iHashCode4 = (iG2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f334990l;
        int i12 = androidx.appcompat.app.r.i(C31685o.g(this.f334991m, (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31), 31, this.f334992n);
        Y41.a<G0> aVar3 = this.f334993o;
        int iHashCode5 = (i12 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        Y41.a<G0> aVar4 = this.f334994p;
        int iHashCode6 = (iHashCode5 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        String str3 = this.f334995q;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoSelectState(placeholder=");
        sb2.append(this.f334979a);
        sb2.append(", enabled=");
        sb2.append(this.f334980b);
        sb2.append(", loading=");
        sb2.append(this.f334981c);
        sb2.append(", clearButton=");
        sb2.append(this.f334982d);
        sb2.append(", readOnly=");
        sb2.append(this.f334983e);
        sb2.append(", state=");
        sb2.append(this.f334984f);
        sb2.append(", iconStart=");
        sb2.append(this.f334985g);
        sb2.append(", selectedOptionId=");
        sb2.append(this.f334986h);
        sb2.append(", bottomSheetTitle=");
        sb2.append(this.f334987i);
        sb2.append(", options=");
        sb2.append(this.f334988j);
        sb2.append(", onSelect=");
        sb2.append(this.f334989k);
        sb2.append(", onClear=");
        sb2.append(this.f334990l);
        sb2.append(", style=");
        sb2.append(this.f334991m);
        sb2.append(", visible=");
        sb2.append(this.f334992n);
        sb2.append(", onShow=");
        sb2.append(this.f334993o);
        sb2.append(", onHide=");
        sb2.append(this.f334994p);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334995q, ')');
    }
}
