package i90;

import Y61.k;
import com.avito.android.B2;
import com.avito.android.serp.adapter.U;
import io.reactivex.rxjava3.internal.operators.single.G;
import javax.inject.Inject;
import k90.InterfaceC42540a;
import kotlin.Metadata;

/* compiled from: PriceListUxFeedbackDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li90/d;", "Li90/b;", "_avito_price-list-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements InterfaceC41254b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42540a f398401a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SK0.b f398402b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final B2 f398403c;

    @Inject
    public d(@k InterfaceC42540a interfaceC42540a, @k SK0.b bVar, @k B2 b22) {
        this.f398401a = interfaceC42540a;
        this.f398402b = bVar;
        this.f398403c = b22;
    }

    @Override // i90.InterfaceC41254b
    @k
    public final G a() {
        return new G(new U(this, 6));
    }
}
