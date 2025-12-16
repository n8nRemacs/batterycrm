package androidx.compose.ui.graphics.colorspace;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39440c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f39441d;

    public /* synthetic */ o(r rVar, int i12) {
        this.f39440c = i12;
        this.f39441d = rVar;
    }

    @Override // androidx.compose.ui.graphics.colorspace.j
    public final double a(double d12) {
        switch (this.f39440c) {
            case 0:
                return kotlin.ranges.s.e(this.f39441d.f39455k.a(d12), r0.f39449e, r0.f39450f);
            default:
                return this.f39441d.f39458n.a(kotlin.ranges.s.e(d12, r0.f39449e, r0.f39450f));
        }
    }
}
