package shark.internal;

import kotlin.Metadata;
import shark.N2;
import shark.g3;
import shark.internal.C0;

/* compiled from: ClassReferenceReader.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lshark/internal/C0$a;", "resolve", "()Lshark/internal/C0$a;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.internal.y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48301y implements C0.a.InterfaceC12630a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f438628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f438629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3 f438630c;

    public C48301y(String str, long j12, g3 g3Var) {
        this.f438628a = str;
        this.f438629b = j12;
        this.f438630c = g3Var;
    }

    @Override // shark.internal.C0.a.InterfaceC12630a
    @Y61.k
    public final C0.a a() {
        return new C0.a(this.f438628a, this.f438629b, ReferenceLocationType.f438450c, (N2) this.f438630c);
    }
}
