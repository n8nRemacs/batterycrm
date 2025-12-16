package vq0;

import Cq0.C13343b;
import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import h31.e;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;
import sI0.InterfaceC48055a;

/* compiled from: ShortAdvicesInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvq0/b;", "Lvq0/a;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vq0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49369b implements InterfaceC49368a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC48055a> f440998a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f440999b;

    @Inject
    public C49369b(@k InterfaceC35745a5 interfaceC35745a5, @k e eVar) {
        this.f440998a = eVar;
        this.f440999b = interfaceC35745a5;
    }

    @Override // vq0.InterfaceC49368a
    @k
    public final W a() {
        return g1.a(new C42007e(new C13343b(this, 12))).z(this.f440999b.a());
    }
}
