package sx0;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.A;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SparePartsV3ClicksRelay.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsx0/c;", "Lsx0/b;", "<init>", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sx0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48430c implements InterfaceC48429b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43108m f438931a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC43160i<C48428a> f438932b;

    @Inject
    public C48430c() {
        C43108m c43108mA = A.a(1, BufferOverflow.f410778c, null, 4);
        this.f438931a = c43108mA;
        this.f438932b = C43175k.Q(c43108mA);
    }

    @Override // sx0.InterfaceC48429b
    public final void a(@k C48428a c48428a) {
        this.f438931a.w(c48428a);
    }

    @Override // sx0.InterfaceC48429b
    @k
    public final InterfaceC43160i<C48428a> g() {
        return this.f438932b;
    }
}
