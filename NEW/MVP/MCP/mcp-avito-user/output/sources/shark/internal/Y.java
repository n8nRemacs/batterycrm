package shark.internal;

import kotlin.Metadata;
import shark.internal.C0;

/* compiled from: InternalSharedExpanderHelpers.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lshark/internal/C0$a;", "resolve", "()Lshark/internal/C0$a;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class Y implements C0.a.InterfaceC12630a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f438482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f438483b;

    public Y(Z z12, int i12) {
        this.f438482a = z12;
        this.f438483b = i12;
    }

    @Override // shark.internal.C0.a.InterfaceC12630a
    @Y61.k
    public final C0.a a() {
        String strValueOf = String.valueOf(this.f438483b);
        Z z12 = this.f438482a;
        return new C0.a(strValueOf, z12.f438484l, ReferenceLocationType.f438452e, null);
    }
}
