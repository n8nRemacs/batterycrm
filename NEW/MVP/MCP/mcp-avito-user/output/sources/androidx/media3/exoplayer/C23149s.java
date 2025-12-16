package androidx.media3.exoplayer;

import androidx.media3.common.C23091e;
import androidx.media3.common.H;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.r;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.exoplayer.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23149s implements r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49449c;

    public /* synthetic */ C23149s(Object obj, int i12) {
        this.f49448b = i12;
        this.f49449c = obj;
    }

    @Override // androidx.media3.common.util.r.a
    public final void invoke(Object obj) {
        Object obj2 = this.f49449c;
        H.g gVar = (H.g) obj;
        switch (this.f49448b) {
            case 0:
                int i12 = A.f48357h0;
                gVar.e((androidx.media3.common.B) obj2);
                break;
            case 1:
                int i13 = A.f48357h0;
                gVar.z((androidx.media3.common.U) obj2);
                break;
            case 2:
                int i14 = A.f48357h0;
                gVar.D((C23091e) obj2);
                break;
            case 3:
                gVar.e(A.this.f48370M);
                break;
            case 4:
                gVar.a((androidx.media3.common.text.b) obj2);
                break;
            case 5:
                gVar.d((Metadata) obj2);
                break;
            case 6:
                gVar.onCues((List) obj2);
                break;
            default:
                gVar.b((androidx.media3.common.X) obj2);
                break;
        }
    }
}
