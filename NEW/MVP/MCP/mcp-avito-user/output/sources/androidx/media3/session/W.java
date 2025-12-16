package androidx.media3.session;

import androidx.media3.common.C23107s;
import androidx.media3.common.H;
import androidx.media3.common.util.r;
import androidx.media3.session.C23229i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class W implements C23229i0.d, r.b, r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C23229i0 f52329c;

    public /* synthetic */ W(C23229i0 c23229i0, int i12) {
        this.f52328b = i12;
        this.f52329c = c23229i0;
    }

    @Override // androidx.media3.common.util.r.b
    public void c(Object obj, C23107s c23107s) {
        this.f52329c.getClass();
        ((H.g) obj).C(new H.f(c23107s));
    }

    @Override // androidx.media3.session.C23229i0.d
    public void e(InterfaceC23246o interfaceC23246o, int i12) {
        switch (this.f52328b) {
            case 0:
                interfaceC23246o.k1(this.f52329c.f52494c, i12);
                break;
            case 1:
                interfaceC23246o.T1(this.f52329c.f52494c, i12);
                break;
            case 2:
                interfaceC23246o.r(this.f52329c.f52494c, i12);
                break;
            case 3:
                interfaceC23246o.D0(this.f52329c.f52494c, i12);
                break;
            case 4:
                interfaceC23246o.K2(this.f52329c.f52494c, i12);
                break;
            case 5:
                interfaceC23246o.K3(this.f52329c.f52494c, i12);
                break;
            default:
                interfaceC23246o.b4(this.f52329c.f52494c, i12);
                break;
        }
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        H.g gVar = (H.g) obj;
        switch (this.f52328b) {
            case 8:
                gVar.s(this.f52329c.f52510s);
                break;
            default:
                gVar.s(this.f52329c.f52510s);
                break;
        }
    }
}
