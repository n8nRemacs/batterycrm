package com.avito.android.imv_goods_advert.mvi;

import aN.InterfaceC19793a;
import com.avito.android.arch.mvi.a;
import com.avito.android.imv_goods_advert.ImvGoodsAdvertParams;
import com.avito.android.imv_goods_advert.mvi.entity.ImvGoodsAdvertInternalAction;
import com.avito.android.remote.model.AdvertDetails;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ImvGoodsAdvertActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_goods_advert/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LaN/a;", "Lcom/avito/android/imv_goods_advert/mvi/entity/ImvGoodsAdvertInternalAction;", "LaN/c;", "a", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC19793a, ImvGoodsAdvertInternalAction, aN.c> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f170542c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f170543a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImvGoodsAdvertParams f170544b;

    /* compiled from: ImvGoodsAdvertActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_advert/mvi/c$a;", "", "<init>", "()V", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public c(@Y61.k Gson gson, @Y61.k ImvGoodsAdvertParams imvGoodsAdvertParams) {
        this.f170543a = gson;
        this.f170544b = imvGoodsAdvertParams;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ImvGoodsAdvertInternalAction> b(InterfaceC19793a interfaceC19793a, aN.c cVar) {
        InterfaceC43160i<ImvGoodsAdvertInternalAction> c43210w;
        InterfaceC19793a interfaceC19793a2 = interfaceC19793a;
        aN.c cVar2 = cVar;
        if (interfaceC19793a2 instanceof InterfaceC19793a.c) {
            f170542c.getClass();
            c43210w = new C43152f0(C43175k.G(new com.avito.android.imv_goods_advert.mvi.a(this.f170543a, this.f170544b, null)), new b(3, null));
        } else {
            boolean z12 = interfaceC19793a2 instanceof InterfaceC19793a.b;
            AdvertDetails advertDetails = cVar2.f20887b;
            if (z12) {
                InterfaceC19793a.b bVar = (InterfaceC19793a.b) interfaceC19793a2;
                c43210w = new C43210w(new ImvGoodsAdvertInternalAction.OpenGallery(advertDetails, bVar.f20875a, bVar.f20876b));
            } else if (interfaceC19793a2 instanceof InterfaceC19793a.e) {
                c43210w = new C43210w(new ImvGoodsAdvertInternalAction.UpdateGalleryPosition(((InterfaceC19793a.e) interfaceC19793a2).f20879a));
            } else if (interfaceC19793a2 instanceof InterfaceC19793a.d) {
                if (advertDetails == null) {
                    return C43175k.w();
                }
                c43210w = new C43210w(new ImvGoodsAdvertInternalAction.ShowDescription(advertDetails));
            } else {
                if (!(interfaceC19793a2 instanceof InterfaceC19793a.C1490a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(ImvGoodsAdvertInternalAction.CloseScreen.f170549b);
            }
        }
        return c43210w;
    }
}
