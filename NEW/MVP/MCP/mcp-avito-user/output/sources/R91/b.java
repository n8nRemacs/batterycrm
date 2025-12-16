package R91;

import androidx.appcompat.app.r;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14119a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14120b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14121c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14122d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14123e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14124f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14125g;

    public b(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f14119a = z12;
        this.f14120b = z13;
        this.f14121c = z14;
        this.f14122d = z15;
        this.f14123e = z16;
        this.f14124f = z17;
        this.f14125g = z18;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("isPassportDetected=");
        sb2.append(this.f14119a);
        sb2.append(",\n isPassportInFrame=");
        sb2.append(this.f14120b);
        sb2.append(",\n isPassportInZone=");
        sb2.append(this.f14121c);
        sb2.append(",\n isPassportBlurry=");
        sb2.append(this.f14122d);
        sb2.append(",\n isSlowMotion=");
        sb2.append(this.f14123e);
        sb2.append(",\n hasFlare=");
        sb2.append(this.f14124f);
        sb2.append(",\n isLowBrightness=");
        return r.x(sb2, this.f14125g, ')');
    }
}
