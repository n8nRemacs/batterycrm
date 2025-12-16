package com.avito.android.imv_goods_poll.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.ImvGoodsOptionType;
import com.avito.android.imv_goods_poll.ImvGoodsPollParams;
import com.avito.android.imv_goods_poll.mvi.entity.ImvGoodsPollInternalAction;
import com.avito.android.util.R0;
import fN.InterfaceC40319a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ImvGoodsPollActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/imv_goods_poll/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LfN/a;", "Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction;", "LfN/c;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC40319a, ImvGoodsPollInternalAction, fN.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ImvGoodsPollParams f170673a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.imv_goods_poll.j f170674b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f170675c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f170676d;

    /* compiled from: ImvGoodsPollActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f170677a;

        static {
            int[] iArr = new int[ImvGoodsOptionType.values().length];
            try {
                iArr[ImvGoodsOptionType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImvGoodsOptionType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f170677a = iArr;
        }
    }

    @Inject
    public b(@Y61.k ImvGoodsPollParams imvGoodsPollParams, @Y61.k com.avito.android.imv_goods_poll.j jVar, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k R0 r02) {
        this.f170673a = imvGoodsPollParams;
        this.f170674b = jVar;
        this.f170675c = fVar;
        this.f170676d = r02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ImvGoodsPollInternalAction> b(InterfaceC40319a interfaceC40319a, fN.c cVar) {
        InterfaceC40319a interfaceC40319a2 = interfaceC40319a;
        fN.c cVar2 = cVar;
        if (interfaceC40319a2 instanceof InterfaceC40319a.C11146a) {
            return C43175k.I(this.f170676d.a(), new C43152f0(C43175k.G(new c(this, cVar2, ((InterfaceC40319a.C11146a) interfaceC40319a2).f395858a, null)), new d(this, null)));
        }
        if (interfaceC40319a2 instanceof InterfaceC40319a.b) {
            return new C43210w(new ImvGoodsPollInternalAction.UpdateItems(((InterfaceC40319a.b) interfaceC40319a2).f395859a, null, 2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
