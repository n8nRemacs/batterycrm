package uI0;

import Y61.k;
import androidx.view.M0;
import com.avito.android.account.E;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.P0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import nE.C44240b;
import vI0.InterfaceC49219a;
import vI0.InterfaceC49220b;

/* compiled from: AppRaterViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LuI0/b;", "LuI0/a;", "Landroidx/lifecycle/M0;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uI0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48906b extends M0 implements InterfaceC48905a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final E f439894E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final C44240b f439895J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final P0 f439896K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final Z1<InterfaceC49220b> f439897L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final InterfaceC43160i<G0> f439898M;

    @Inject
    public C48906b(@k E e12, @k C44240b c44240b) {
        this.f439894E = e12;
        this.f439895J = c44240b;
        P0 p0A = Q0.a();
        p0A.q3();
        this.f439896K = p0A;
        this.f439897L = p2.a(InterfaceC49220b.a.f440668a);
        this.f439898M = C43175k.w();
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(Object obj) {
        InterfaceC49219a interfaceC49219a = (InterfaceC49219a) obj;
        boolean z12 = interfaceC49219a instanceof InterfaceC49219a.C12763a;
        Z1<InterfaceC49220b> z13 = this.f439897L;
        if (z12) {
            this.f439896K.c(null);
            while (!z13.N3(z13.getValue(), InterfaceC49220b.a.f440668a)) {
            }
            return;
        }
        if (!(interfaceC49219a instanceof InterfaceC49219a.b) || L.f(z13.getValue(), InterfaceC49220b.C12764b.f440669a)) {
            return;
        }
        C44240b c44240b = this.f439895J;
        c44240b.getClass();
        n<Object> nVar = C44240b.f414940f[0];
        if (((Boolean) c44240b.f414941b.a().invoke()).booleanValue() && this.f439894E.b()) {
            while (!z13.N3(z13.getValue(), InterfaceC49220b.C12764b.f440669a)) {
            }
        } else {
            while (!z13.N3(z13.getValue(), InterfaceC49220b.a.f440668a)) {
            }
        }
    }

    @Override // com.avito.android.arch.mvi.android.m
    @k
    public final InterfaceC43160i<G0> getEvents() {
        return this.f439898M;
    }

    @Override // com.avito.android.arch.mvi.android.m
    public final n2 getState() {
        return this.f439897L;
    }
}
