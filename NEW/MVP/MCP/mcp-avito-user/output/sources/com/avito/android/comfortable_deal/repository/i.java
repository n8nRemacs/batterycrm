package com.avito.android.comfortable_deal.repository;

import Jp.InterfaceC14233a;
import Rp.C15069a;
import Y41.p;
import android.net.Uri;
import com.avito.android.comfortable_deal.api.model.PageInfo;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import com.avito.android.comfortable_deal.common.view.client.RealtyData;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: ComfortableDealRepository.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Ldp/j;", "Lcom/avito/android/comfortable_deal/common/view/client/ClientCardData;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl$mortgageApplications$2", f = "ComfortableDealRepository.kt", i = {0}, l = {175}, m = "invokeSuspend", n = {"correctPage"}, s = {"J$0"})
/* loaded from: classes12.dex */
final class i extends SuspendLambda implements p<T, Continuation<? super TypedResult<dp.j<ClientCardData>>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public long f122593q;

    /* renamed from: r, reason: collision with root package name */
    public int f122594r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f122595s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f122596t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f122597u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f122598v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f122599w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i12, d dVar, String str, int i13, boolean z12, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f122595s = i12;
        this.f122596t = dVar;
        this.f122597u = str;
        this.f122598v = i13;
        this.f122599w = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f122595s, this.f122596t, this.f122597u, this.f122598v, this.f122599w, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<dp.j<ClientCardData>>> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        long j12;
        Object objK;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f122594r;
        d dVar = this.f122596t;
        if (i12 == 0) {
            C42729a0.b(obj);
            j12 = this.f122595s + 1;
            InterfaceC14233a interfaceC14233a = dVar.f122534c;
            Rp.d dVar2 = new Rp.d(this.f122597u, j12, this.f122598v, "comfort_deal", this.f122599w ? "archived" : "active", "comfort_deal_mortgage_tab");
            this.f122593q = j12;
            this.f122594r = 1;
            objK = interfaceC14233a.k(dVar2, this);
            if (objK == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j13 = this.f122593q;
            C42729a0.b(obj);
            j12 = j13;
            objK = obj;
        }
        TypedResult typedResult = (TypedResult) objK;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        C15069a c15069a = (C15069a) ((TypedResult.Success) typedResult).getResult();
        if (j12 > c15069a.getPaging().getTotalPages()) {
            list = C42784z0.f406748b;
        } else {
            dVar.getClass();
            List<Rp.f> listA = c15069a.a();
            ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
            for (Rp.f fVar : listA) {
                String id2 = fVar.getId();
                String avatar = fVar.getAvatar();
                Image image = avatar != null ? ImageKt.toImage(Uri.parse(avatar)) : null;
                String fullname = fVar.getFullname();
                String phone = fVar.getPhone();
                arrayList.add(new ClientCardData(id2, image, fullname, phone.length() == 0 ? null : phone, new RealtyData(null, new AttributedText(fVar.getCurrentStep(), C42784z0.f406748b, 1), null, fVar.getCalculation().getStringValue(), UniversalColorKt.universalColorOf$default(fVar.getIsArchived() ? "gray54" : "green", 0, 2, null), (float) fVar.getProgress(), true), fVar.getIsArchived(), fVar.getLink()));
            }
            list = arrayList;
        }
        return new TypedResult.Success(new dp.j(new dp.k(new PageInfo((int) c15069a.getPaging().getTotalCount()), list), c15069a.getEntryPoint()));
    }
}
