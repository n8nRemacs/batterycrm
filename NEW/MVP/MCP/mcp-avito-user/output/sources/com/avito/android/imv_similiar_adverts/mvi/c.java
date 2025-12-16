package com.avito.android.imv_similiar_adverts.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.imv_similiar_adverts.ImvSimilarAdvertsParams;
import com.avito.android.imv_similiar_adverts.mvi.entity.ImvSimilarAdvertsInternalAction;
import com.avito.android.imv_similiar_adverts.n;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import sN.C48078c;
import sN.InterfaceC48076a;

/* compiled from: ImvSimilarAdvertsActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LsN/a;", "Lcom/avito/android/imv_similiar_adverts/mvi/entity/ImvSimilarAdvertsInternalAction;", "LsN/c;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC48076a, ImvSimilarAdvertsInternalAction, C48078c> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f170890f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f170891a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImvSimilarAdvertsParams f170892b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f170893c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f170894d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f170895e;

    /* compiled from: ImvSimilarAdvertsActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/mvi/c$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public c(@Y61.k n nVar, @Y61.k ImvSimilarAdvertsParams imvSimilarAdvertsParams, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k R0 r02) {
        this.f170891a = nVar;
        this.f170892b = imvSimilarAdvertsParams;
        this.f170893c = fVar;
        this.f170894d = interfaceC28373a;
        this.f170895e = r02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ImvSimilarAdvertsInternalAction> b(InterfaceC48076a interfaceC48076a, C48078c c48078c) {
        InterfaceC48076a interfaceC48076a2 = interfaceC48076a;
        if (!(interfaceC48076a2 instanceof InterfaceC48076a.c)) {
            if (interfaceC48076a2 instanceof InterfaceC48076a.b) {
                return new C43210w(new ImvSimilarAdvertsInternalAction.OpenAdvert(((InterfaceC48076a.b) interfaceC48076a2).f437627a));
            }
            if (interfaceC48076a2 instanceof InterfaceC48076a.C12612a) {
                return new C43210w(ImvSimilarAdvertsInternalAction.Close.f170907b);
            }
            throw new NoWhenBranchMatchedException();
        }
        f170890f.getClass();
        n nVar = this.f170891a;
        ImvSimilarAdvertsParams imvSimilarAdvertsParams = this.f170892b;
        InterfaceC28373a interfaceC28373a = this.f170894d;
        return C43175k.I(this.f170895e.a(), new C43152f0(C43175k.G(new com.avito.android.imv_similiar_adverts.mvi.a(nVar, imvSimilarAdvertsParams, interfaceC28373a, null)), new b(interfaceC28373a, imvSimilarAdvertsParams, this.f170893c, null)));
    }
}
