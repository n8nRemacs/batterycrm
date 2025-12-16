package com.avito.beduin.v2.avito.component.slider.state;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoSliderState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/slider/state/AvitoSliderState;", "Lcom/avito/beduin/v2/engine/component/c;", "Presets", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AvitoSliderState implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f335112a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335113b;

    /* renamed from: c, reason: collision with root package name */
    public final int f335114c;

    /* renamed from: d, reason: collision with root package name */
    public final int f335115d;

    /* renamed from: e, reason: collision with root package name */
    public final int f335116e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Y41.l<Integer, G0> f335117f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.theme.l<e> f335118g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f335119h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Y41.a<G0> f335120i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Y41.a<G0> f335121j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f335122k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoSliderState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/slider/state/AvitoSliderState$Presets;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Presets {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Presets[] f335123b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f335124c;

        static {
            Presets[] presetsArr = {new Presets("default", 0), new Presets("overlay", 1), new Presets("inverse", 2)};
            f335123b = presetsArr;
            f335124c = kotlin.enums.c.a(presetsArr);
        }

        public Presets() {
            throw null;
        }

        public static Presets valueOf(String str) {
            return (Presets) Enum.valueOf(Presets.class, str);
        }

        public static Presets[] values() {
            return (Presets[]) f335123b.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AvitoSliderState(boolean z12, int i12, int i13, int i14, int i15, @l Y41.l<? super Integer, G0> lVar, @k com.avito.beduin.v2.theme.l<e> lVar2, boolean z13, @l Y41.a<G0> aVar, @l Y41.a<G0> aVar2, @l String str) {
        this.f335112a = z12;
        this.f335113b = i12;
        this.f335114c = i13;
        this.f335115d = i14;
        this.f335116e = i15;
        this.f335117f = lVar;
        this.f335118g = lVar2;
        this.f335119h = z13;
        this.f335120i = aVar;
        this.f335121j = aVar2;
        this.f335122k = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> b() {
        return this.f335120i;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> d() {
        return this.f335121j;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvitoSliderState)) {
            return false;
        }
        AvitoSliderState avitoSliderState = (AvitoSliderState) obj;
        return this.f335112a == avitoSliderState.f335112a && this.f335113b == avitoSliderState.f335113b && this.f335114c == avitoSliderState.f335114c && this.f335115d == avitoSliderState.f335115d && this.f335116e == avitoSliderState.f335116e && L.f(this.f335117f, avitoSliderState.f335117f) && L.f(this.f335118g, avitoSliderState.f335118g) && this.f335119h == avitoSliderState.f335119h && L.f(this.f335120i, avitoSliderState.f335120i) && L.f(this.f335121j, avitoSliderState.f335121j) && L.f(this.f335122k, avitoSliderState.f335122k);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @l
    /* renamed from: getTag, reason: from getter */
    public final String getF334324g() {
        return this.f335122k;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334321d() {
        return this.f335119h;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f335116e, r.e(this.f335115d, r.e(this.f335114c, r.e(this.f335113b, Boolean.hashCode(this.f335112a) * 31, 31), 31), 31), 31);
        Y41.l<Integer, G0> lVar = this.f335117f;
        int i12 = r.i(C31685o.g(this.f335118g, (iE2 + (lVar == null ? 0 : lVar.hashCode())) * 31, 31), 31, this.f335119h);
        Y41.a<G0> aVar = this.f335120i;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f335121j;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f335122k;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoSliderState(enabled=");
        sb2.append(this.f335112a);
        sb2.append(", min=");
        sb2.append(this.f335113b);
        sb2.append(", max=");
        sb2.append(this.f335114c);
        sb2.append(", step=");
        sb2.append(this.f335115d);
        sb2.append(", value=");
        sb2.append(this.f335116e);
        sb2.append(", onChange=");
        sb2.append(this.f335117f);
        sb2.append(", style=");
        sb2.append(this.f335118g);
        sb2.append(", visible=");
        sb2.append(this.f335119h);
        sb2.append(", onShow=");
        sb2.append(this.f335120i);
        sb2.append(", onHide=");
        sb2.append(this.f335121j);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335122k, ')');
    }
}
