package androidx.media3.session;

import androidx.media3.session.A1;
import androidx.media3.session.O0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23268v1 implements A1.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A1.e f52650c;

    public /* synthetic */ C23268v1(A1.e eVar, int i12) {
        this.f52649b = i12;
        this.f52650c = eVar;
    }

    @Override // androidx.media3.session.A1.e
    public final Object d(T0 t02, O0.g gVar, int i12) {
        switch (this.f52649b) {
            case 0:
                return A1.h4((G0) t02, gVar, i12, this.f52650c, new x1(gVar, i12, 0));
            default:
                return A1.h4(t02, gVar, i12, this.f52650c, new x1(gVar, i12, 1));
        }
    }
}
