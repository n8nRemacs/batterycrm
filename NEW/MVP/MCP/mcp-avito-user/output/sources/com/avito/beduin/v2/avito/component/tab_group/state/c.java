package com.avito.beduin.v2.avito.component.tab_group.state;

import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoTabGroupState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/tab_group/state/c;", "Lcom/avito/beduin/v2/engine/component/c;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    public final int f335273a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ET0.a<a> f335274b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<n> f335275c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Integer, G0> f335276d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f335277e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335278f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335279g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f335280h;

    /* compiled from: AvitoTabGroupState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/tab_group/state/c$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f335281a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f335282b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final NotificationView f335283c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f335284d;

        public a(@Y61.k String str, @Y61.l Integer num, @Y61.l NotificationView notificationView, boolean z12) {
            this.f335281a = str;
            this.f335282b = num;
            this.f335283c = notificationView;
            this.f335284d = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f335281a, aVar.f335281a) && L.f(this.f335282b, aVar.f335282b) && this.f335283c == aVar.f335283c && this.f335284d == aVar.f335284d;
        }

        public final int hashCode() {
            int iHashCode = this.f335281a.hashCode() * 31;
            Integer num = this.f335282b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            NotificationView notificationView = this.f335283c;
            return Boolean.hashCode(this.f335284d) + ((iHashCode2 + (notificationView != null ? notificationView.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Tab(title=");
            sb2.append(this.f335281a);
            sb2.append(", notificationText=");
            sb2.append(this.f335282b);
            sb2.append(", notificationView=");
            sb2.append(this.f335283c);
            sb2.append(", disabled=");
            return androidx.appcompat.app.r.x(sb2, this.f335284d, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(int i12, @Y61.k ET0.a<a> aVar, @Y61.k com.avito.beduin.v2.theme.l<n> lVar, @Y61.l Y41.l<? super Integer, G0> lVar2, boolean z12, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, @Y61.l String str) {
        this.f335273a = i12;
        this.f335274b = aVar;
        this.f335275c = lVar;
        this.f335276d = lVar2;
        this.f335277e = z12;
        this.f335278f = aVar2;
        this.f335279g = aVar3;
        this.f335280h = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f335278f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f335279g;
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f335273a == cVar.f335273a && L.f(this.f335274b, cVar.f335274b) && L.f(this.f335275c, cVar.f335275c) && L.f(this.f335276d, cVar.f335276d) && this.f335277e == cVar.f335277e && L.f(this.f335278f, cVar.f335278f) && L.f(this.f335279g, cVar.f335279g) && L.f(this.f335280h, cVar.f335280h);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF335280h() {
        return this.f335280h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF335277e() {
        return this.f335277e;
    }

    public final int hashCode() {
        int iG2 = C31685o.g(this.f335275c, androidx.compose.ui.graphics.colorspace.e.g(this.f335274b.f4014b, Integer.hashCode(this.f335273a) * 31, 31), 31);
        Y41.l<Integer, G0> lVar = this.f335276d;
        int i12 = androidx.appcompat.app.r.i((iG2 + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f335277e);
        Y41.a<G0> aVar = this.f335278f;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f335279g;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f335280h;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoTabGroupState(currentTab=");
        sb2.append(this.f335273a);
        sb2.append(", tabs=");
        sb2.append(this.f335274b);
        sb2.append(", style=");
        sb2.append(this.f335275c);
        sb2.append(", onTabSelected=");
        sb2.append(this.f335276d);
        sb2.append(", visible=");
        sb2.append(this.f335277e);
        sb2.append(", onShow=");
        sb2.append(this.f335278f);
        sb2.append(", onHide=");
        sb2.append(this.f335279g);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335280h, ')');
    }
}
