package defpackage;

import android.os.Build;
import org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public final class qi1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public Integer E;
    public boolean a;
    public boolean b;
    public float c;
    public float d;
    public final int e;
    public ri1 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public Double p;
    public Double q;
    public String r;
    public ni1 s;
    public oi1 t;
    public PeerConnection.IceTransportsType u;
    public PeerConnection.VpnPreference v;
    public boolean w;
    public final boolean x;
    public jda y;
    public boolean z;

    public qi1(boolean z, boolean z2, float f, float f2, int i, ri1 ri1Var, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, Double d, Double d2, String str, ni1 ni1Var, oi1 oi1Var, PeerConnection.IceTransportsType iceTransportsType, PeerConnection.VpnPreference vpnPreference, boolean z12, boolean z13, jda jdaVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, Integer num) {
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = f2;
        this.e = i;
        this.f = ri1Var;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = z9;
        this.n = z10;
        this.o = z11;
        this.p = d;
        this.q = d2;
        this.r = str;
        this.s = ni1Var;
        this.t = oi1Var;
        this.u = iceTransportsType;
        this.v = vpnPreference;
        this.w = z12;
        this.x = z13;
        this.y = jdaVar;
        this.z = z14;
        this.A = z15;
        this.B = z16;
        this.C = z17;
        this.D = z18;
        this.E = num;
    }

    public final boolean a() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi1)) {
            return false;
        }
        qi1 qi1Var = (qi1) obj;
        return this.a == qi1Var.a && this.b == qi1Var.b && Float.compare(this.c, qi1Var.c) == 0 && Float.compare(this.d, qi1Var.d) == 0 && this.e == qi1Var.e && fni.a(this.f, qi1Var.f) && this.g == qi1Var.g && this.h == qi1Var.h && this.i == qi1Var.i && this.j == qi1Var.j && this.k == qi1Var.k && this.l == qi1Var.l && this.m == qi1Var.m && this.n == qi1Var.n && this.o == qi1Var.o && fni.a(this.p, qi1Var.p) && fni.a(this.q, qi1Var.q) && fni.a(this.r, qi1Var.r) && fni.a(this.s, qi1Var.s) && fni.a(this.t, qi1Var.t) && this.u == qi1Var.u && this.v == qi1Var.v && this.w == qi1Var.w && this.x == qi1Var.x && this.y == qi1Var.y && this.z == qi1Var.z && this.A == qi1Var.A && this.B == qi1Var.B && this.C == qi1Var.C && this.D == qi1Var.D && fni.a(this.E, qi1Var.E);
    }

    public final int hashCode() {
        int iA = iti.a(this.e, hf3.b(hf3.b(fui.b(Boolean.hashCode(this.a) * 31, this.b), this.c, 31), this.d, 31));
        ri1 ri1Var = this.f;
        int iB = fui.b(fui.b(fui.b(fui.b(fui.b(fui.b(fui.b(fui.b(fui.b((iA + (ri1Var == null ? 0 : ri1Var.hashCode())) * 31, this.g), this.h), this.i), this.j), this.k), this.l), this.m), this.n), this.o);
        Double d = this.p;
        int iHashCode = (iB + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.q;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.r;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ni1 ni1Var = this.s;
        int iHashCode4 = (iHashCode3 + (ni1Var == null ? 0 : ni1Var.hashCode())) * 31;
        oi1 oi1Var = this.t;
        int iHashCode5 = (iHashCode4 + (oi1Var == null ? 0 : oi1Var.hashCode())) * 31;
        PeerConnection.IceTransportsType iceTransportsType = this.u;
        int iHashCode6 = (iHashCode5 + (iceTransportsType == null ? 0 : iceTransportsType.hashCode())) * 31;
        PeerConnection.VpnPreference vpnPreference = this.v;
        int iB2 = fui.b(fui.b((iHashCode6 + (vpnPreference == null ? 0 : vpnPreference.hashCode())) * 31, this.w), this.x);
        jda jdaVar = this.y;
        int iB3 = fui.b(fui.b(fui.b(fui.b(fui.b((iB2 + (jdaVar == null ? 0 : jdaVar.hashCode())) * 31, this.z), this.A), this.B), this.C), this.D);
        Integer num = this.E;
        return iB3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        float f = this.c;
        float f2 = this.d;
        ri1 ri1Var = this.f;
        boolean z3 = this.g;
        boolean z4 = this.h;
        boolean z5 = this.i;
        boolean z6 = this.j;
        boolean z7 = this.k;
        boolean z8 = this.l;
        boolean z9 = this.m;
        boolean z10 = this.n;
        boolean z11 = this.o;
        Double d = this.p;
        Double d2 = this.q;
        String str = this.r;
        ni1 ni1Var = this.s;
        oi1 oi1Var = this.t;
        PeerConnection.IceTransportsType iceTransportsType = this.u;
        PeerConnection.VpnPreference vpnPreference = this.v;
        boolean z12 = this.w;
        jda jdaVar = this.y;
        boolean z13 = this.z;
        boolean z14 = this.A;
        boolean z15 = this.B;
        boolean z16 = this.C;
        boolean z17 = this.D;
        Integer num = this.E;
        StringBuilder sbP = ho7.p("Experiments(isCamera2ApiEnabled=", z, ", isVideoDegradationForSwCodecEnabled=", z2, ", swCodecFrameSizeReduction=");
        sbP.append(f);
        sbP.append(", swCodecFrameRateReduction=");
        sbP.append(f2);
        sbP.append(", maxCameraFrameDimension=");
        sbP.append(this.e);
        sbP.append(", timeouts=");
        sbP.append(ri1Var);
        sbP.append(", isDtxDisabled=");
        az1.t(", isNonOpusRemovalEnabled=", ", isEnqueuedCommandMergeEnabled=", sbP, z3, z4);
        az1.t(", isStartCallByExternalIdEnabled=", ", isDynamicScreenShareSizeUpdateEnabled=", sbP, z5, z6);
        az1.t(", isBackendRenderVmojiEnabled=", ", isAddParticipantsByExternalIdEnabled=", sbP, z7, z8);
        az1.t(", isFilterCallMuteStateInitForAdmins=", ", isInCallAnalyticsUploadEnabled=", sbP, z9, z10);
        sbP.append(z11);
        sbP.append(", callAnalyticsUploadMaxLoss=");
        sbP.append(d);
        sbP.append(", callAnalyticsUploadMinBitrate=");
        sbP.append(d2);
        sbP.append(", fieldTrials=");
        sbP.append(str);
        sbP.append(", audioAdaptationParams=");
        sbP.append(ni1Var);
        sbP.append(", audioRedundancyParams=");
        sbP.append(oi1Var);
        sbP.append(", iceTransportsType=");
        sbP.append(iceTransportsType);
        sbP.append(", vpnPreference=");
        sbP.append(vpnPreference);
        sbP.append(", isDirectJoinEventEnabled=");
        az1.t(", isUsingNewStatMonitorEnabled=", ", emulatedNegotiationErrorType=", sbP, z12, this.x);
        sbP.append(jdaVar);
        sbP.append(", isNegotiationErrorStatEnabled=");
        sbP.append(z13);
        sbP.append(", skipRequestReallocEnabled=");
        az1.t(", isNewDiForCallEnabled=", ", isWebTransportEnabled=", sbP, z14, z15);
        az1.t(", isLoadKwsBySdkEnabled=", ", audioJitterBufferMaxPackets=", sbP, z16, z17);
        sbP.append(num);
        sbP.append(")");
        return sbP.toString();
    }

    public /* synthetic */ qi1() {
        this(Build.VERSION.SDK_INT >= 29, false, 0.7f, 0.75f, 960, null, false, false, false, true, false, false, false, true, false, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, 200);
    }
}
