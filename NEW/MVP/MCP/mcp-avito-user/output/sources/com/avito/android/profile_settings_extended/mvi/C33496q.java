package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile_settings_extended.adapter.carousel.ExtendedSettingsCarouselItem;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import com.avito.android.profile_settings_extended.mvi.entity.CommonValueBottomMenuAction;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vc0.C49308g;
import yc0.e;

/* compiled from: ExtendedProfileSettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$processCarouselItemAction$1", f = "ExtendedProfileSettingsActor.kt", i = {}, l = {559, 561, 565, 588, 600}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile_settings_extended.mvi.q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33496q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f230722q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f230723r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yc0.e f230724s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33480a f230725t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33496q(yc0.e eVar, C33480a c33480a, Continuation<? super C33496q> continuation) {
        super(2, continuation);
        this.f230724s = eVar;
        this.f230725t = c33480a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33496q c33496q = new C33496q(this.f230724s, this.f230725t, continuation);
        c33496q.f230723r = obj;
        return c33496q;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33496q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        CommonValueId commonValueId;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f230722q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f230723r;
            yc0.e eVar = this.f230724s;
            boolean z12 = eVar instanceof e.f;
            C33480a c33480a = this.f230725t;
            if (z12) {
                C43210w c43210wC = C33480a.c(c33480a, ((e.f) eVar).f443250a);
                this.f230722q = 1;
                if (C43175k.u(this, c43210wC, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (eVar instanceof e.a) {
                C43210w c43210wC2 = C33480a.c(c33480a, ((e.a) eVar).f443243a);
                this.f230722q = 2;
                if (C43175k.u(this, c43210wC2, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (eVar instanceof e.c) {
                e.c cVar = (e.c) eVar;
                ExtendedSettingsCarouselItem.Carousel carousel = cVar.f443246a.f229286g;
                if (carousel != null && (commonValueId = carousel.f229289b) != null) {
                    ExtendedProfileSettingsInternalAction.CommonValueInternalAction.ShowCommonValueBottomMenu showCommonValueBottomMenu = new ExtendedProfileSettingsInternalAction.CommonValueInternalAction.ShowCommonValueBottomMenu(commonValueId, c33480a.f230507h.a(commonValueId), new e.f(cVar.f443246a), new CommonValueBottomMenuAction.DeleteCommonValue(commonValueId, CommonValueBottomMenuAction.DeleteCommonValue.WidgetType.f230541b, null, 4, null));
                    this.f230722q = 3;
                    if (interfaceC43172j.emit(showCommonValueBottomMenu, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (eVar instanceof e.b) {
                InterfaceC28373a interfaceC28373a = c33480a.f230512m;
                e.b bVar = (e.b) eVar;
                boolean z13 = bVar.f443245b;
                ExtendedSettingsCarouselItem.Carousel carousel2 = bVar.f443244a.f229286g;
                String str = carousel2 != null ? carousel2.f229290c : null;
                if (str == null) {
                    str = "";
                }
                interfaceC28373a.c(new C49308g(z13, str));
                ExtendedSettingsCarouselItem extendedSettingsCarouselItem = bVar.f443244a;
                ExtendedSettingsCarouselItem.Carousel carousel3 = extendedSettingsCarouselItem.f229286g;
                if (carousel3 != null) {
                    String str2 = extendedSettingsCarouselItem.f229283d;
                    String str3 = carousel3.f229289b.f230266c;
                    List<ExtendedProfileSettingsAdvert> list = carousel3.f229292e;
                    ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Boxing.boxLong(((ExtendedProfileSettingsAdvert) it.next()).f230267b));
                    }
                    InterfaceC43160i interfaceC43160iI = C43175k.I(c33480a.f230513n.a(), c33480a.f230504e.c(str2, str3, carousel3.f229293f, arrayList, bVar.f443245b));
                    this.f230722q = 4;
                    if (C43175k.u(this, interfaceC43160iI, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (eVar instanceof e.d) {
                e.d dVar = (e.d) eVar;
                ExtendedProfileSettingsInternalAction.CarouselWidgetInternalAction.CarouselItemScrollStateChange carouselItemScrollStateChange = new ExtendedProfileSettingsInternalAction.CarouselWidgetInternalAction.CarouselItemScrollStateChange(dVar.f443248b, dVar.f443247a.f229283d);
                this.f230722q = 5;
                if (interfaceC43172j.emit(carouselItemScrollStateChange, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (eVar instanceof e.C12911e) {
                c33480a.f230504e.a(Collections.singletonList(((e.C12911e) eVar).f443249a));
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4 && i12 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
