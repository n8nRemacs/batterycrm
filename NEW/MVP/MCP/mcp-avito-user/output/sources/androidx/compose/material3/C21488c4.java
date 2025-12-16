package androidx.compose.material3;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.c4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21488c4 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z3 f36125l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f36126m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f36127n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21488c4(Z3 z32, int i12, androidx.compose.ui.v vVar, int i13) {
        super(2);
        this.f36125l = z32;
        this.f36126m = i12;
        this.f36127n = vVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.ui.v vVar;
        num.intValue();
        int iA2 = C22066f2.a(433);
        Z3 z32 = this.f36125l;
        z32.getClass();
        androidx.compose.runtime.B bE2 = a12.E(327413563);
        int i12 = this.f36126m;
        int i13 = ((bE2.m(i12) ? 4 : 2) | iA2) & 19;
        androidx.compose.ui.v vVar2 = this.f36127n;
        if (i13 == 18 && bE2.c()) {
            bE2.f();
            vVar = vVar2;
        } else {
            D6.f34620b.getClass();
            if (D6.b(i12, 0)) {
                bE2.I(-2065101749);
                int i14 = Ng.f35206b;
                vVar = vVar2;
                C21914uj.b(Og.a(bE2, R.string.m3c_date_picker_title), vVar, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bE2, 48, 0, 131068);
                bE2.X(false);
            } else {
                vVar = vVar2;
                if (D6.b(i12, D6.f34621c)) {
                    bE2.I(-2065101591);
                    int i15 = Ng.f35206b;
                    C21914uj.b(Og.a(bE2, R.string.m3c_date_input_title), vVar, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bE2, 48, 0, 131068);
                    bE2.X(false);
                } else {
                    bE2.I(-2065101459);
                    bE2.X(false);
                }
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21488c4(z32, i12, vVar, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
