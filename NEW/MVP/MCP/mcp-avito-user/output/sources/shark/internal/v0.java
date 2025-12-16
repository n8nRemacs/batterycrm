package shark.internal;

import kotlin.Metadata;
import shark.internal.C0;

/* compiled from: ObjectArrayReferenceReader.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lshark/internal/C0$a;", "resolve", "()Lshark/internal/C0$a;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class v0 implements C0.a.InterfaceC12630a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f438611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f438612b;

    public v0(w0 w0Var, int i12) {
        this.f438611a = w0Var;
        this.f438612b = i12;
    }

    @Override // shark.internal.C0.a.InterfaceC12630a
    @Y61.k
    public final C0.a a() {
        String strValueOf = String.valueOf(this.f438612b);
        w0 w0Var = this.f438611a;
        return new C0.a(strValueOf, w0Var.f438627l, ReferenceLocationType.f438452e, null);
    }
}
