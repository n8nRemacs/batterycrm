package VH0;

import Y61.k;
import com.avito.android.N2;
import io.reactivex.rxjava3.internal.operators.single.G;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishCsatUxFeedbackDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVH0/e;", "LVH0/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f17040a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SK0.b f17041b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final N2 f17042c;

    @Inject
    public e(@k g gVar, @k SK0.b bVar, @k N2 n22) {
        this.f17040a = gVar;
        this.f17041b = bVar;
        this.f17042c = n22;
    }

    @Override // VH0.b
    @k
    public final G a() {
        return new G(new c(this, 0));
    }
}
