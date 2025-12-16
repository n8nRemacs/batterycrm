package com.avito.beduin.v2.avito.component.progress_bar.state;

import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoProgressBarState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/progress_bar/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final o f334816a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<i> f334817b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f334818c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334819d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334820e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f334821f;

    /* compiled from: AvitoProgressBarState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/progress_bar/state/a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.avito.component.progress_bar.state.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10376a {

        /* renamed from: a, reason: collision with root package name */
        public final float f334822a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.theme.r f334823b;

        public C10376a(float f12, @Y61.k com.avito.beduin.v2.theme.r rVar) {
            this.f334822a = f12;
            this.f334823b = rVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10376a)) {
                return false;
            }
            C10376a c10376a = (C10376a) obj;
            return Float.compare(this.f334822a, c10376a.f334822a) == 0 && L.f(this.f334823b, c10376a.f334823b);
        }

        public final int hashCode() {
            return this.f334823b.hashCode() + (Float.hashCode(this.f334822a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "Segment(value=" + this.f334822a + ", color=" + this.f334823b + ')';
        }
    }

    public a(@Y61.l o oVar, @Y61.k com.avito.beduin.v2.theme.l<i> lVar, boolean z12, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2, @Y61.l String str) {
        this.f334816a = oVar;
        this.f334817b = lVar;
        this.f334818c = z12;
        this.f334819d = aVar;
        this.f334820e = aVar2;
        this.f334821f = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334819d;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334820e;
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f334816a, aVar.f334816a) && L.f(this.f334817b, aVar.f334817b) && this.f334818c == aVar.f334818c && L.f(this.f334819d, aVar.f334819d) && L.f(this.f334820e, aVar.f334820e) && L.f(this.f334821f, aVar.f334821f);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334821f() {
        return this.f334821f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334818c() {
        return this.f334818c;
    }

    public final int hashCode() {
        o oVar = this.f334816a;
        int i12 = androidx.appcompat.app.r.i(C31685o.g(this.f334817b, (oVar == null ? 0 : oVar.hashCode()) * 31, 31), 31, this.f334818c);
        Y41.a<G0> aVar = this.f334819d;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f334820e;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f334821f;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoProgressBarState(progress=");
        sb2.append(this.f334816a);
        sb2.append(", style=");
        sb2.append(this.f334817b);
        sb2.append(", visible=");
        sb2.append(this.f334818c);
        sb2.append(", onShow=");
        sb2.append(this.f334819d);
        sb2.append(", onHide=");
        sb2.append(this.f334820e);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334821f, ')');
    }
}
