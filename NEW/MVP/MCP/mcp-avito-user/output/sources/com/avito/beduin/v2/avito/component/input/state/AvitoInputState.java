package com.avito.beduin.v2.avito.component.input.state;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoInputState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/input/state/AvitoInputState;", "Lcom/avito/beduin/v2/engine/component/c;", "InputState", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AvitoInputState implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f334462a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f334463b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f334464c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InputState f334465d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f334466e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f334467f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f334468g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AvitoInputFormat f334469h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f334470i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f334471j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f334472k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f334473l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334474m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334475n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final Y41.l<String, G0> f334476o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Boolean, G0> f334477p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<c> f334478q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f334479r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334480s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334481t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334482u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> f334483v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final String f334484w;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoInputState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/input/state/AvitoInputState$InputState;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InputState {

        /* renamed from: c, reason: collision with root package name */
        public static final InputState f334485c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ InputState[] f334486d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f334487e;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f334488b;

        static {
            InputState inputState = new InputState("Normal", 0, "Normal");
            f334485c = inputState;
            InputState[] inputStateArr = {inputState, new InputState("Error", 1, "Error"), new InputState("Warning", 2, "Warning")};
            f334486d = inputStateArr;
            f334487e = kotlin.enums.c.a(inputStateArr);
        }

        public InputState(String str, int i12, String str2) {
            this.f334488b = str2;
        }

        public static InputState valueOf(String str) {
            return (InputState) Enum.valueOf(InputState.class, str);
        }

        public static InputState[] values() {
            return (InputState[]) f334486d.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AvitoInputState(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.k InputState inputState, boolean z13, boolean z14, boolean z15, @Y61.k AvitoInputFormat avitoInputFormat, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k String str6, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.l<? super String, G0> lVar, @Y61.l Y41.l<? super Boolean, G0> lVar2, @Y61.k com.avito.beduin.v2.theme.l<c> lVar3, boolean z16, @Y61.l Y41.a<G0> aVar3, @Y61.l Y41.a<G0> aVar4, @Y61.l Y41.a<G0> aVar5, @Y61.l com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar, @Y61.l String str7) {
        this.f334462a = str;
        this.f334463b = str2;
        this.f334464c = z12;
        this.f334465d = inputState;
        this.f334466e = z13;
        this.f334467f = z14;
        this.f334468g = z15;
        this.f334469h = avitoInputFormat;
        this.f334470i = str3;
        this.f334471j = str4;
        this.f334472k = str5;
        this.f334473l = str6;
        this.f334474m = aVar;
        this.f334475n = aVar2;
        this.f334476o = lVar;
        this.f334477p = lVar2;
        this.f334478q = lVar3;
        this.f334479r = z16;
        this.f334480s = aVar3;
        this.f334481t = aVar4;
        this.f334482u = aVar5;
        this.f334483v = cVar;
        this.f334484w = str7;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334480s;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334481t;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return this.f334483v;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvitoInputState)) {
            return false;
        }
        AvitoInputState avitoInputState = (AvitoInputState) obj;
        return L.f(this.f334462a, avitoInputState.f334462a) && L.f(this.f334463b, avitoInputState.f334463b) && this.f334464c == avitoInputState.f334464c && this.f334465d == avitoInputState.f334465d && this.f334466e == avitoInputState.f334466e && this.f334467f == avitoInputState.f334467f && this.f334468g == avitoInputState.f334468g && this.f334469h == avitoInputState.f334469h && L.f(this.f334470i, avitoInputState.f334470i) && L.f(this.f334471j, avitoInputState.f334471j) && L.f(this.f334472k, avitoInputState.f334472k) && L.f(this.f334473l, avitoInputState.f334473l) && L.f(this.f334474m, avitoInputState.f334474m) && L.f(this.f334475n, avitoInputState.f334475n) && L.f(this.f334476o, avitoInputState.f334476o) && L.f(this.f334477p, avitoInputState.f334477p) && L.f(this.f334478q, avitoInputState.f334478q) && this.f334479r == avitoInputState.f334479r && L.f(this.f334480s, avitoInputState.f334480s) && L.f(this.f334481t, avitoInputState.f334481t) && L.f(this.f334482u, avitoInputState.f334482u) && L.f(this.f334483v, avitoInputState.f334483v) && L.f(this.f334484w, avitoInputState.f334484w);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334484w() {
        return this.f334484w;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334479r() {
        return this.f334479r;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(H.d((this.f334469h.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f334465d.hashCode() + androidx.appcompat.app.r.i(H.d(this.f334462a.hashCode() * 31, 31, this.f334463b), 31, this.f334464c)) * 31, 31, this.f334466e), 31, this.f334467f), 31, this.f334468g)) * 31, 31, this.f334470i), 31, this.f334471j), 31, this.f334472k), 31, this.f334473l);
        Y41.a<G0> aVar = this.f334474m;
        int iHashCode = (iD2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f334475n;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.l<String, G0> lVar = this.f334476o;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Y41.l<Boolean, G0> lVar2 = this.f334477p;
        int i12 = androidx.appcompat.app.r.i(C31685o.g(this.f334478q, (iHashCode3 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31, 31), 31, this.f334479r);
        Y41.a<G0> aVar3 = this.f334480s;
        int iHashCode4 = (i12 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        Y41.a<G0> aVar4 = this.f334481t;
        int iHashCode5 = (iHashCode4 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        Y41.a<G0> aVar5 = this.f334482u;
        int iHashCode6 = (iHashCode5 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar = this.f334483v;
        int iHashCode7 = (iHashCode6 + (cVar == null ? 0 : Arrays.hashCode(cVar.f336915a))) * 31;
        String str = this.f334484w;
        return iHashCode7 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoInputState(text=");
        sb2.append(this.f334462a);
        sb2.append(", placeholder=");
        sb2.append(this.f334463b);
        sb2.append(", enabled=");
        sb2.append(this.f334464c);
        sb2.append(", state=");
        sb2.append(this.f334465d);
        sb2.append(", readOnly=");
        sb2.append(this.f334466e);
        sb2.append(", loading=");
        sb2.append(this.f334467f);
        sb2.append(", clearButton=");
        sb2.append(this.f334468g);
        sb2.append(", format=");
        sb2.append(this.f334469h);
        sb2.append(", iconStart=");
        sb2.append(this.f334470i);
        sb2.append(", iconEnd=");
        sb2.append(this.f334471j);
        sb2.append(", prefix=");
        sb2.append(this.f334472k);
        sb2.append(", postfix=");
        sb2.append(this.f334473l);
        sb2.append(", onIconStartClick=");
        sb2.append(this.f334474m);
        sb2.append(", onIconEndClick=");
        sb2.append(this.f334475n);
        sb2.append(", onTextChanged=");
        sb2.append(this.f334476o);
        sb2.append(", onFocusChanged=");
        sb2.append(this.f334477p);
        sb2.append(", style=");
        sb2.append(this.f334478q);
        sb2.append(", visible=");
        sb2.append(this.f334479r);
        sb2.append(", onShow=");
        sb2.append(this.f334480s);
        sb2.append(", onHide=");
        sb2.append(this.f334481t);
        sb2.append(", onDone=");
        sb2.append(this.f334482u);
        sb2.append(", markers=");
        sb2.append(this.f334483v);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334484w, ')');
    }
}
