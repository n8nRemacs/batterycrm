package ru.cyberity.cbr.camera;

import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class e implements androidx.view.result.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f432068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f432069c;

    public /* synthetic */ e(a aVar, int i12) {
        this.f432068b = i12;
        this.f432069c = aVar;
    }

    @Override // androidx.view.result.a
    public final void a(Object obj) {
        switch (this.f432068b) {
            case 0:
                a.a(this.f432069c, (Map) obj);
                break;
            default:
                b.a((b) this.f432069c, (Map) obj);
                break;
        }
    }
}
