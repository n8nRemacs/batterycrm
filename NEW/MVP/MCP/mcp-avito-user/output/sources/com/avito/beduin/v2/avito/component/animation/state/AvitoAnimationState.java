package com.avito.beduin.v2.avito.component.animation.state;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import com.avito.beduin.v2.theme.r;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoAnimationState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState;", "Lcom/avito/beduin/v2/engine/component/c;", "a", "b", "c", "RepeatMode", "State", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AvitoAnimationState implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final c f333748a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final c f333749b;

    /* renamed from: c, reason: collision with root package name */
    public final int f333750c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RepeatMode f333751d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Float f333752e;

    /* renamed from: f, reason: collision with root package name */
    public final float f333753f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f333754g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final State f333755h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f333756i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f333757j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Y41.a<G0> f333758k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Y41.a<G0> f333759l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f333760m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoAnimationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$RepeatMode;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RepeatMode {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f333761c;

        /* renamed from: d, reason: collision with root package name */
        public static final RepeatMode f333762d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ RepeatMode[] f333763e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f333764f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f333765b;

        /* compiled from: AvitoAnimationState.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$RepeatMode$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            RepeatMode repeatMode = new RepeatMode("Restart", 0, "restart");
            f333762d = repeatMode;
            RepeatMode[] repeatModeArr = {repeatMode, new RepeatMode("Reverse", 1, "reverse")};
            f333763e = repeatModeArr;
            f333764f = kotlin.enums.c.a(repeatModeArr);
            f333761c = new a(null);
        }

        public RepeatMode(String str, int i12, String str2) {
            this.f333765b = str2;
        }

        public static RepeatMode valueOf(String str) {
            return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
        }

        public static RepeatMode[] values() {
            return (RepeatMode[]) f333763e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoAnimationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$State;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f333766c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f333767d;

        /* renamed from: e, reason: collision with root package name */
        public static final State f333768e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ State[] f333769f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f333770g;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f333771b;

        /* compiled from: AvitoAnimationState.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$State$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            State state = new State("Play", 0, "play");
            f333767d = state;
            State state2 = new State("Pause", 1, "pause");
            f333768e = state2;
            State[] stateArr = {state, state2, new State("Resume", 2, "resume")};
            f333769f = stateArr;
            f333770g = kotlin.enums.c.a(stateArr);
            f333766c = new a(null);
        }

        public State(String str, int i12, String str2) {
            this.f333771b = str2;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f333769f.clone();
        }
    }

    /* compiled from: AvitoAnimationState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$a;", "", "<init>", "()V", "", "CONTENT_MODE_REMOTE", "Ljava/lang/String;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AvitoAnimationState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$b;", "", "Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    /* compiled from: AvitoAnimationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$c;", "Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$b;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f333772a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f333773b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final a f333774c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final a f333775d;

        /* compiled from: AvitoAnimationState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/animation/state/AvitoAnimationState$c$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f333776a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f333777b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final r f333778c;

            public a(@k String str, @l String str2, @k r rVar) {
                this.f333776a = str;
                this.f333777b = str2;
                this.f333778c = rVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f333776a, aVar.f333776a) && L.f(this.f333777b, aVar.f333777b) && L.f(this.f333778c, aVar.f333778c);
            }

            public final int hashCode() {
                int iHashCode = this.f333776a.hashCode() * 31;
                String str = this.f333777b;
                return this.f333778c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @k
            public final String toString() {
                return "LocalIcon(name=" + this.f333776a + ", themeName=" + this.f333777b + ", color=" + this.f333778c + ')';
            }
        }

        public c(String str, String str2, a aVar, a aVar2, int i12, C42822w c42822w) {
            this.f333772a = (i12 & 1) != 0 ? "remote" : str;
            this.f333773b = str2;
            this.f333774c = aVar;
            this.f333775d = aVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f333772a, cVar.f333772a) && L.f(this.f333773b, cVar.f333773b) && L.f(this.f333774c, cVar.f333774c) && L.f(this.f333775d, cVar.f333775d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f333772a.hashCode() * 31, 31, this.f333773b);
            a aVar = this.f333774c;
            int iHashCode = (iD2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            a aVar2 = this.f333775d;
            return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "RemoteJSON(mode=" + this.f333772a + ", url=" + this.f333773b + ", error=" + this.f333774c + ", placeholder=" + this.f333775d + ')';
        }
    }

    static {
        new a(null);
    }

    public AvitoAnimationState(@l c cVar, @l c cVar2, int i12, @k RepeatMode repeatMode, @l Float f12, float f13, boolean z12, @k State state, @k String str, boolean z13, @l Y41.a aVar, @l Y41.a aVar2, @l String str2) {
        this.f333748a = cVar;
        this.f333749b = cVar2;
        this.f333750c = i12;
        this.f333751d = repeatMode;
        this.f333752e = f12;
        this.f333753f = f13;
        this.f333754g = z12;
        this.f333755h = state;
        this.f333756i = str;
        this.f333757j = z13;
        this.f333758k = aVar;
        this.f333759l = aVar2;
        this.f333760m = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> b() {
        return this.f333758k;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> d() {
        return this.f333759l;
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
        if (!(obj instanceof AvitoAnimationState)) {
            return false;
        }
        AvitoAnimationState avitoAnimationState = (AvitoAnimationState) obj;
        return L.f(this.f333748a, avitoAnimationState.f333748a) && L.f(this.f333749b, avitoAnimationState.f333749b) && this.f333750c == avitoAnimationState.f333750c && this.f333751d == avitoAnimationState.f333751d && L.f(this.f333752e, avitoAnimationState.f333752e) && Float.compare(this.f333753f, avitoAnimationState.f333753f) == 0 && this.f333754g == avitoAnimationState.f333754g && this.f333755h == avitoAnimationState.f333755h && this.f333756i.equals(avitoAnimationState.f333756i) && this.f333757j == avitoAnimationState.f333757j && L.f(this.f333758k, avitoAnimationState.f333758k) && L.f(this.f333759l, avitoAnimationState.f333759l) && L.f(this.f333760m, avitoAnimationState.f333760m);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @l
    /* renamed from: getTag, reason: from getter */
    public final String getF333803j() {
        return this.f333760m;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF333800g() {
        return this.f333757j;
    }

    public final int hashCode() {
        c cVar = this.f333748a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        c cVar2 = this.f333749b;
        int iHashCode2 = (this.f333751d.hashCode() + androidx.appcompat.app.r.e(this.f333750c, (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31, 31)) * 31;
        Float f12 = this.f333752e;
        int i12 = androidx.appcompat.app.r.i(H.d((this.f333755h.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.d(this.f333753f, (iHashCode2 + (f12 == null ? 0 : f12.hashCode())) * 31, 31), 31, this.f333754g)) * 31, 31, this.f333756i), 31, this.f333757j);
        Y41.a<G0> aVar = this.f333758k;
        int iHashCode3 = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f333759l;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f333760m;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoAnimationState(content=");
        sb2.append(this.f333748a);
        sb2.append(", contentDark=");
        sb2.append(this.f333749b);
        sb2.append(", repeatCount=");
        sb2.append(this.f333750c);
        sb2.append(", repeatMode=");
        sb2.append(this.f333751d);
        sb2.append(", progress=");
        sb2.append(this.f333752e);
        sb2.append(", speed=");
        sb2.append(this.f333753f);
        sb2.append(", autoPlay=");
        sb2.append(this.f333754g);
        sb2.append(", animationState=");
        sb2.append(this.f333755h);
        sb2.append(", contentDescription=");
        sb2.append(this.f333756i);
        sb2.append(", visible=");
        sb2.append(this.f333757j);
        sb2.append(", onShow=");
        sb2.append(this.f333758k);
        sb2.append(", onHide=");
        sb2.append(this.f333759l);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f333760m, ')');
    }
}
