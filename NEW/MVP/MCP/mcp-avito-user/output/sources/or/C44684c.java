package oR;

import SK0.b;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;
import lD.C43617a;

/* compiled from: LeasingCalculatorUxFeedbackHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoR/c;", "LoR/b;", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oR.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C44684c implements InterfaceC44683b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43617a f419773a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SK0.b f419774b;

    @Inject
    public C44684c(@k SK0.b bVar, @k C43617a c43617a) {
        this.f419773a = c43617a;
        this.f419774b = bVar;
    }

    @Override // oR.InterfaceC44683b
    public final void a(@k AbstractC44682a abstractC44682a) {
        C43617a c43617a = this.f419773a;
        c43617a.getClass();
        n<Object> nVar = C43617a.f413588V[25];
        if (((Boolean) c43617a.f413589A.a().invoke()).booleanValue()) {
            b.a.a(this.f419774b, abstractC44682a, null, null, null, 14);
        }
    }
}
