package ZH0;

import Ag.CallableC13028a;
import Y61.k;
import io.reactivex.rxjava3.internal.operators.single.G;
import javax.inject.Inject;
import kotlin.Metadata;
import lD.C43617a;

/* compiled from: PublishMotoUxFeedbackHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZH0/c;", "LZH0/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f20075a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C43617a f20076b;

    @Inject
    public c(@k SK0.b bVar, @k C43617a c43617a) {
        this.f20075a = bVar;
        this.f20076b = c43617a;
    }

    @Override // ZH0.b
    @k
    public final G a(@k String str) {
        return new G(new CallableC13028a(4, this, str));
    }
}
