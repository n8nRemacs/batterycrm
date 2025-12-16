package j21;

import Y61.k;
import h21.C40764a;
import i21.InterfaceC41214a;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.text.C43066x;

/* compiled from: GetCallingAppInfoUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj21/b;", "", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* renamed from: j21.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42185b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC41214a f405422a;

    public C42185b(@k InterfaceC41214a interfaceC41214a) {
        this.f405422a = interfaceC41214a;
    }

    @k
    public final Object a(@k C40764a c40764a) {
        InterfaceC41214a interfaceC41214a = this.f405422a;
        try {
            int i12 = Z.f406624c;
            String strC = interfaceC41214a.c(c40764a.f396979a);
            if (strC == null || C43066x.K(strC)) {
                strC = interfaceC41214a.b(c40764a.f396980b);
            }
            if (strC == null || C43066x.K(strC)) {
                throw new IllegalStateException("Could not retrieve caller package name");
            }
            String strA = interfaceC41214a.a(strC);
            if (strA == null || C43066x.K(strA)) {
                throw new IllegalStateException("Could not retrieve caller pub key");
            }
            return new T11.a(strC, strA);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            return new Z.b(th2);
        }
    }
}
