package defpackage;

import org.webrtc.PeerConnectionFactory;

/* loaded from: classes2.dex */
public final class aia {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final PeerConnectionFactory.EnhancerKind e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final Runnable m;
    public final int n;

    public aia(boolean z, boolean z2, boolean z3, boolean z4, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z5, aj0 aj0Var, int i6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = enhancerKind;
        this.f = str;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = z5;
        this.m = aj0Var;
        this.n = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aia)) {
            return false;
        }
        aia aiaVar = (aia) obj;
        aiaVar.getClass();
        return this.a == aiaVar.a && this.b == aiaVar.b && this.c == aiaVar.c && this.d == aiaVar.d && this.e == aiaVar.e && fni.a(this.f, aiaVar.f) && this.g == aiaVar.g && this.h == aiaVar.h && this.i == aiaVar.i && this.j == aiaVar.j && this.k == aiaVar.k && this.l == aiaVar.l && fni.a(this.m, aiaVar.m) && this.n == aiaVar.n;
    }

    public final int hashCode() {
        int iB = fui.b(fui.b(fui.b(fui.b(Boolean.hashCode(false) * 31, this.a), this.b), this.c), this.d);
        PeerConnectionFactory.EnhancerKind enhancerKind = this.e;
        int iHashCode = (iB + (enhancerKind == null ? 0 : enhancerKind.hashCode())) * 31;
        String str = this.f;
        int iB2 = fui.b(iti.a(this.k, iti.a(this.j, iti.a(this.i, iti.a(this.h, iti.a(this.g, (iHashCode + (str == null ? 0 : str.hashCode())) * 31))))), this.l);
        Runnable runnable = this.m;
        int iHashCode2 = (iB2 + (runnable == null ? 0 : runnable.hashCode())) * 31;
        int i = this.n;
        return iHashCode2 + (i != 0 ? az1.v(i) : 0);
    }

    public final String toString() {
        StringBuilder sbP = ho7.p("NoiseSuppressorActiveState(noiseSuppressorStuttering=false, serversideBasic=", this.a, ", serversideAnn=", this.b, ", clientsidePlatform=");
        az1.t(", clientsideAnn=", ", enhancerKind=", sbP, this.c, this.d);
        sbP.append(this.e);
        sbP.append(", filePath=");
        sbP.append(this.f);
        sbP.append(", inputSampleRate=");
        hf3.g(sbP, this.g, ", outputSampleRate=", this.h, ", fallbackTimeLimitMillis=");
        hf3.g(sbP, this.i, ", fallbackStutterCountMillis=", this.j, ", fallbackTimeframeMillis=");
        sbP.append(this.k);
        sbP.append(", logTimings=");
        sbP.append(this.l);
        sbP.append(", onNoiseSuppressorDisabledDueToStutter=");
        sbP.append(this.m);
        sbP.append(", kind=");
        int i = this.n;
        sbP.append(i != 1 ? i != 2 ? i != 3 ? "null" : "PIPELINE" : "BASELINE" : "NONE");
        sbP.append(")");
        return sbP.toString();
    }
}
