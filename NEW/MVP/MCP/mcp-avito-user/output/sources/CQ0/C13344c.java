package Cq0;

import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import h31.e;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;
import sI0.InterfaceC48055a;

/* compiled from: AllAdvicesInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCq0/c;", "LCq0/a;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cq0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13344c implements InterfaceC13342a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC48055a> f2716a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f2717b;

    @Inject
    public C13344c(@k InterfaceC35745a5 interfaceC35745a5, @k e eVar) {
        this.f2716a = eVar;
        this.f2717b = interfaceC35745a5;
    }

    @Override // Cq0.InterfaceC13342a
    @k
    public final W a() {
        return g1.a(new C42007e(new C13343b(this, 0))).z(this.f2717b.a());
    }
}
