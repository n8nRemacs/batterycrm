package XH0;

import Ag.CallableC13028a;
import Y61.k;
import io.reactivex.rxjava3.internal.operators.single.G;
import javax.inject.Inject;
import kotlin.Metadata;
import lD.C43617a;

/* compiled from: PublishCsatUxFeedbackGenericHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXH0/d;", "LXH0/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f18814a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SK0.b f18815b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43617a f18816c;

    @Inject
    public d(@k f fVar, @k SK0.b bVar, @k C43617a c43617a) {
        this.f18814a = fVar;
        this.f18815b = bVar;
        this.f18816c = c43617a;
    }

    @Override // XH0.b
    @k
    public final G a(@k String str) {
        return new G(new CallableC13028a(3, this, str));
    }
}
