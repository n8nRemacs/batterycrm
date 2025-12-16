package com.avito.android.realty_agency.checkerboard.mvi;

import Xh0.C17011a;
import Zh0.C19563e;
import Zh0.InterfaceC19559a;
import Zh0.InterfaceC19561c;
import android.content.Context;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.X;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.Z;
import ci0.C27201c;
import com.avito.android.R;
import com.avito.android.realty_agency.checkerboard.bottom_sheet.I;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CheckerboardActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LZh0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.mvi.CheckerboardActor$processCheckerboardAction$1", f = "CheckerboardActor.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC19561c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f251275q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f251276r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34225a f251277s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC19559a.InterfaceC1446a f251278t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C19563e f251279u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C34225a c34225a, InterfaceC19559a.InterfaceC1446a interfaceC1446a, C19563e c19563e, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f251277s = c34225a;
        this.f251278t = interfaceC1446a;
        this.f251279u = c19563e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f251277s, this.f251278t, this.f251279u, continuation);
        kVar.f251276r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC19561c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object obj2;
        C22602e c22602eM;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f251275q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f251276r;
            C17011a c17011a = this.f251277s.f251230d;
            C27201c c27201c = ((InterfaceC19559a.InterfaceC1446a.C1447a) this.f251278t).f20387a;
            boolean z12 = this.f251279u.f20465h;
            c17011a.getClass();
            boolean z13 = (c27201c.getLotId() != null && c27201c.getIsFiltered() && c27201c.getIsActive()) ? false : true;
            Long lotId = c27201c.getLotId();
            Context context = c17011a.f19037a;
            String string = (lotId == null || !c27201c.getIsActive()) ? context.getString(R.string.checkerboard_lot_preview_not_for_sale) : c27201c.getPrice().getFull();
            boolean z14 = c27201c.getLotId() != null && c27201c.getIsActive();
            Long lotId2 = c27201c.getLotId();
            Image lotImage = c27201c.getLotImage();
            if (lotImage.isEmpty()) {
                lotImage = null;
            }
            String perMeter = c27201c.getPrice().getPerMeter();
            String str = !C43066x.K(perMeter) ? perMeter : null;
            List<String> listD = c27201c.d();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : listD) {
                if (!C43066x.K((String) obj3)) {
                    arrayList.add(obj3);
                }
            }
            String strO = C42745f0.O(arrayList, "  ·  ", null, null, null, 62);
            if (z12 || c27201c.getLotId() == null || !c27201c.getIsActive()) {
                obj2 = coroutine_suspended;
                c22602eM = null;
            } else if (c27201c.getIsFiltered()) {
                C22602e.b bVar = new C22602e.b(0, 1, null);
                bVar.f(context.getString(R.string.checkerboard_lot_preview_agent_commission_prefix));
                bVar.f(" ");
                if (c27201c.getRevenue().getIsBest()) {
                    com.akita.compose.theme.re23.g.f65049a.getClass();
                    String str2 = com.akita.compose.theme.re23.g.f65035X3;
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
                    com.akita.compose.theme.re23.a aVar = com.akita.compose.theme.re23.b.f63984b;
                    obj2 = coroutine_suspended;
                    com.akita.compose.foundation.ui.o.c(bVar, str2, rVar, aVar.f63966u0.b(com.avito.android.lib.util.darkTheme.c.a(context)));
                    int iL2 = bVar.l(new e0(aVar.f63966u0.b(com.avito.android.lib.util.darkTheme.c.a(context)), 0L, (androidx.compose.ui.text.font.e0) null, (Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (X) null, (androidx.compose.ui.graphics.drawscope.j) null, 65534, (C42822w) null));
                    try {
                        bVar.f(c27201c.getRevenue().getValue());
                        G0 g02 = G0.f406611a;
                    } finally {
                        bVar.h(iL2);
                    }
                } else {
                    obj2 = coroutine_suspended;
                    bVar.f(c27201c.getRevenue().getValue());
                }
                c22602eM = bVar.m();
            } else {
                obj2 = coroutine_suspended;
                c22602eM = new C22602e(context.getString(R.string.checkerboard_lot_preview_not_match_with_filters), null, 2, null);
            }
            InterfaceC19561c.n nVar = new InterfaceC19561c.n(new I(lotId2, lotImage, z13, string, str, strO, c22602eM, z14));
            this.f251275q = 1;
            Object objEmit = interfaceC43172j.emit(nVar, this);
            Object obj4 = obj2;
            if (objEmit == obj4) {
                return obj4;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
