package com.avito.android.service_booking_user_profile.view.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import Zt0.C19606a;
import Zt0.C19607b;
import Zt0.C19609d;
import au0.InterfaceC24175a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockActionData;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockActionItemData;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import du0.C39805a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: ServiceBookingBlockInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/domain/b;", "Lcom/avito/android/service_booking_user_profile/view/domain/a;", "_avito_service-booking-user-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.service_booking_user_profile.view.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC24175a f278157a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f278158b;

    /* compiled from: ServiceBookingBlockInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Ldu0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_user_profile.view.domain.ServiceBookingBlockInteractorImpl$activeBookingBlock$2", f = "ServiceBookingBlockInteractor.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<C39805a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f278159q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f278161s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f278161s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(this.f278161s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<C39805a>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object next;
            AttributedText value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f278159q;
            b bVar = b.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC24175a interfaceC24175a = bVar.f278157a;
                this.f278159q = 1;
                obj = interfaceC24175a.a(this.f278161s, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (!(typedResult instanceof TypedResult.Success)) {
                if (typedResult instanceof TypedResult.Error) {
                    return typedResult;
                }
                throw new NoWhenBranchMatchedException();
            }
            C19606a c19606a = (C19606a) ((TypedResult.Success) typedResult).getResult();
            bVar.getClass();
            C19607b action = c19606a.getAction();
            ServiceBookingBlockActionData serviceBookingBlockActionData = (action == null || (value = action.getValue()) == null) ? null : new ServiceBookingBlockActionData(action.getUri(), value);
            List<C19609d> listD = c19606a.d();
            ArrayList arrayList = new ArrayList(C42745f0.q(listD, 10));
            for (C19609d c19609d : listD) {
                Image image = c19609d.getImage();
                DeepLink uri = c19609d.getUri();
                String title = c19609d.getTitle();
                String subtitle = c19609d.getSubtitle();
                AttributedText additionalText = c19609d.getAdditionalText();
                ServiceBookingBlockActionItemData.Type.a aVar = ServiceBookingBlockActionItemData.Type.f278197c;
                String type = c19609d.getType();
                if (type == null) {
                    type = "";
                }
                aVar.getClass();
                Iterator it = ((AbstractC42738c) ServiceBookingBlockActionItemData.Type.f278200f).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((ServiceBookingBlockActionItemData.Type) next).f278201b.equals(type)) {
                        break;
                    }
                }
                ServiceBookingBlockActionItemData.Type type2 = (ServiceBookingBlockActionItemData.Type) next;
                if (type2 == null) {
                    type2 = ServiceBookingBlockActionItemData.Type.f278198d;
                }
                arrayList.add(new ServiceBookingBlockActionItemData(image, uri, title, subtitle, additionalText, type2));
            }
            return new TypedResult.Success(new C39805a(serviceBookingBlockActionData, arrayList));
        }
    }

    @Inject
    public b(@k InterfaceC24175a interfaceC24175a, @k R0 r02) {
        this.f278157a = interfaceC24175a;
        this.f278158b = r02;
    }

    @l
    public final Object a(@l String str, @k Continuation<? super TypedResult<C39805a>> continuation) {
        return C43259k.g(this.f278158b.a(), new a(str, null), continuation);
    }
}
