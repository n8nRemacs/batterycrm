package androidx.media3.session;

import androidx.media3.session.A1;
import androidx.media3.session.O0;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23224g1 implements A1.b, A1.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A1 f52474c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52475d;

    public /* synthetic */ C23224g1(A1 a12, int i12, int i13) {
        this.f52473b = i13;
        this.f52474c = a12;
        this.f52475d = i12;
    }

    @Override // androidx.media3.session.A1.b
    public void b(G1 g12, O0.g gVar) {
        int i12 = this.f52475d;
        A1 a12 = this.f52474c;
        switch (this.f52473b) {
            case 0:
                int i13 = A1.f51915u;
                g12.h0(a12.i4(gVar, g12, i12));
                break;
            default:
                int i14 = A1.f51915u;
                g12.c0(a12.i4(gVar, g12, i12));
                break;
        }
    }

    @Override // androidx.media3.session.A1.c
    public void e(G1 g12, O0.g gVar, List list) {
        int i12 = this.f52475d;
        A1 a12 = this.f52474c;
        switch (this.f52473b) {
            case 1:
                int i13 = A1.f51915u;
                g12.T(a12.i4(gVar, g12, i12), list);
                break;
            case 2:
                int i14 = A1.f51915u;
                a12.getClass();
                if (list.size() != 1) {
                    g12.O(a12.i4(gVar, g12, i12), a12.i4(gVar, g12, i12 + 1), list);
                    break;
                } else {
                    g12.d0(a12.i4(gVar, g12, i12), (androidx.media3.common.z) list.get(0));
                    break;
                }
            default:
                int i15 = A1.f51915u;
                g12.T(a12.i4(gVar, g12, i12), list);
                break;
        }
    }
}
