package shark.internal;

import androidx.compose.ui.platform.C22491k0;
import kotlin.Metadata;
import shark.M1;
import shark.X1;
import shark.internal.C0;
import shark.internal.C48268b0;

/* compiled from: InternalSharedExpanderHelpers.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lshark/internal/C0$a;", "resolve", "()Lshark/internal/C0$a;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48270c0 implements C0.a.InterfaceC12630a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C48268b0.b f438509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X1 f438510b;

    public C48270c0(C48268b0.b bVar, X1 x12) {
        this.f438509a = bVar;
        this.f438510b = x12;
    }

    @Override // shark.internal.C0.a.InterfaceC12630a
    @Y61.k
    public final C0.a a() {
        M1.c cVarA;
        String strI;
        X1 x12 = this.f438510b;
        M1 m1E = x12.e();
        String string = null;
        String strA = (m1E == null || (cVarA = m1E.a()) == null || (strI = cVarA.i()) == null) ? null : C22491k0.a('\"', "\"", strI);
        if (strA != null) {
            string = strA;
        } else {
            M1 m1E2 = x12.e();
            if (m1E2 != null) {
                string = m1E2.toString();
            }
        }
        if (string == null) {
            string = "null";
        }
        return new C0.a(string, this.f438509a.f438504n, ReferenceLocationType.f438452e, null);
    }
}
