package k6;

import SK0.b;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import k6.AbstractC42523a;
import kotlin.Metadata;
import kotlin.reflect.n;
import lD.C43617a;

/* compiled from: OwnershipCostFeedbackHelper.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk6/c;", "Lk6/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43617a f406094a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SK0.b f406095b;

    @Inject
    public c(@k SK0.b bVar, @k C43617a c43617a) {
        this.f406094a = c43617a;
        this.f406095b = bVar;
    }

    @Override // k6.b
    public final void a(@k AbstractC42523a abstractC42523a) {
        boolean z12 = abstractC42523a instanceof AbstractC42523a.b;
        C43617a c43617a = this.f406094a;
        if (z12) {
            c43617a.getClass();
            n<Object> nVar = C43617a.f413588V[5];
            if (!((Boolean) c43617a.f413615g.a().invoke()).booleanValue()) {
                return;
            }
        }
        if (abstractC42523a instanceof AbstractC42523a.C11604a) {
            c43617a.getClass();
            n<Object> nVar2 = C43617a.f413588V[9];
            if (!((Boolean) c43617a.f413619k.a().invoke()).booleanValue()) {
                return;
            }
        }
        b.a.a(this.f406095b, abstractC42523a, null, null, null, 14);
    }
}
