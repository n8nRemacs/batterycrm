package Hq0;

import Y61.k;
import Y61.l;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;
import sI0.InterfaceC48055a;

/* compiled from: HintsDialogInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHq0/d;", "LHq0/a;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hq0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14022d implements InterfaceC14019a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC48055a> f7757a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f7758b;

    @Inject
    public C14022d(@k InterfaceC35745a5 interfaceC35745a5, @k h31.e eVar) {
        this.f7757a = eVar;
        this.f7758b = interfaceC35745a5;
    }

    @Override // Hq0.InterfaceC14019a
    @k
    public final W a(@k String str) {
        return g1.a(new C42007e(new C14020b(0, this, str))).z(this.f7758b.a());
    }

    @Override // Hq0.InterfaceC14019a
    @k
    public final W b(@k String str, @l String str2, @k String str3) {
        return g1.a(new C42007e(new C14021c(0, str, this, str2, str3))).z(this.f7758b.a());
    }
}
