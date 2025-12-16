package bI0;

import Ag.CallableC13028a;
import Y61.k;
import io.reactivex.rxjava3.internal.operators.single.G;
import javax.inject.Inject;
import kotlin.Metadata;
import lD.C43617a;

/* compiled from: PublishTransportUxFeedbackHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbI0/c;", "LbI0/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bI0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25515c implements InterfaceC25514b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f57031a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C43617a f57032b;

    @Inject
    public C25515c(@k SK0.b bVar, @k C43617a c43617a) {
        this.f57031a = bVar;
        this.f57032b = c43617a;
    }

    @Override // bI0.InterfaceC25514b
    @k
    public final G a(@k String str) {
        return new G(new CallableC13028a(6, this, str));
    }
}
