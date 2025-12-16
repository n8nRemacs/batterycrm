package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import fU0.AbstractC40338a;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileLazyColumnState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/l;", "Lcom/avito/beduin/v2/engine/component/c;", "a", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class l implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ET0.a<a> f151401a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f151402b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f151403c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f151404d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f151405e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f151406f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> f151407g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f151408h;

    /* compiled from: ExtendedProfileLazyColumnState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/l$a;", "", "a", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36249i f151409a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C4426a f151410b;

        /* compiled from: ExtendedProfileLazyColumnState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/l$a$a;", "", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.l$a$a, reason: collision with other inner class name */
        public static final /* data */ class C4426a {

            /* renamed from: a, reason: collision with root package name */
            public final int f151411a;

            /* renamed from: b, reason: collision with root package name */
            public final int f151412b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final ET0.b f151413c;

            public C4426a(int i12, int i13, @Y61.l ET0.b bVar) {
                this.f151411a = i12;
                this.f151412b = i13;
                this.f151413c = bVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4426a)) {
                    return false;
                }
                C4426a c4426a = (C4426a) obj;
                return this.f151411a == c4426a.f151411a && this.f151412b == c4426a.f151412b && L.f(this.f151413c, c4426a.f151413c);
            }

            public final int hashCode() {
                int iE2 = androidx.appcompat.app.r.e(this.f151412b, Integer.hashCode(this.f151411a) * 31, 31);
                ET0.b bVar = this.f151413c;
                return iE2 + (bVar == null ? 0 : bVar.hashCode());
            }

            @Y61.k
            public final String toString() {
                return "Params(width=" + this.f151411a + ", height=" + this.f151412b + ", padding=" + this.f151413c + ')';
            }
        }

        public a(@Y61.k InterfaceC36249i interfaceC36249i, @Y61.k C4426a c4426a) {
            this.f151409a = interfaceC36249i;
            this.f151410b = c4426a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f151409a, aVar.f151409a) && L.f(this.f151410b, aVar.f151410b);
        }

        public final int hashCode() {
            return this.f151410b.hashCode() + (this.f151409a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "Child(component=" + this.f151409a + ", params=" + this.f151410b + ')';
        }
    }

    public l(@Y61.k ET0.a<a> aVar, @Y61.k String str, @Y61.l Y41.a<G0> aVar2, boolean z12, @Y61.l Y41.a<G0> aVar3, @Y61.l Y41.a<G0> aVar4, @Y61.l com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar, @Y61.l String str2) {
        this.f151401a = aVar;
        this.f151402b = str;
        this.f151403c = aVar2;
        this.f151404d = z12;
        this.f151405e = aVar3;
        this.f151406f = aVar4;
        this.f151407g = cVar;
        this.f151408h = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f151405e;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f151406f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return this.f151407g;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f151401a, lVar.f151401a) && L.f(this.f151402b, lVar.f151402b) && L.f(this.f151403c, lVar.f151403c) && this.f151404d == lVar.f151404d && L.f(this.f151405e, lVar.f151405e) && L.f(this.f151406f, lVar.f151406f) && L.f(this.f151407g, lVar.f151407g) && L.f(this.f151408h, lVar.f151408h);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF151408h() {
        return this.f151408h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF151404d() {
        return this.f151404d;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f151401a.f4014b.hashCode() * 31, 31, this.f151402b);
        Y41.a<G0> aVar = this.f151403c;
        int i12 = androidx.appcompat.app.r.i((iD2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f151404d);
        Y41.a<G0> aVar2 = this.f151405e;
        int iHashCode = (i12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f151406f;
        int iHashCode2 = (Arrays.hashCode(this.f151407g.f336915a) + ((iHashCode + (aVar3 == null ? 0 : aVar3.hashCode())) * 31)) * 31;
        String str = this.f151408h;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileLazyColumnState(children=");
        sb2.append(this.f151401a);
        sb2.append(", backgroundColor=");
        sb2.append(this.f151402b);
        sb2.append(", onPrefetch=");
        sb2.append(this.f151403c);
        sb2.append(", visible=");
        sb2.append(this.f151404d);
        sb2.append(", onShow=");
        sb2.append(this.f151405e);
        sb2.append(", onHide=");
        sb2.append(this.f151406f);
        sb2.append(", markers=");
        sb2.append(this.f151407g);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f151408h, ')');
    }
}
