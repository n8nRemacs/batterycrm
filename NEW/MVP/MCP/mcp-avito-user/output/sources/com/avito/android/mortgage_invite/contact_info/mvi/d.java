package com.avito.android.mortgage_invite.contact_info.mvi;

import Y41.p;
import a20.C19669a;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFormItemType;
import com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ApplicationContactInfoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.contact_info.mvi.ApplicationContactInfoActor$process$4", f = "ApplicationContactInfoActor.kt", i = {}, l = {93, 96}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super ApplicationContactInfoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205687q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f205688r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b20.d f205689s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f205690t;

    /* compiled from: ApplicationContactInfoActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_invite.contact_info.mvi.ApplicationContactInfoActor$process$4$flow$1", f = "ApplicationContactInfoActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<ApplicationContactInfoInternalAction, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f205691q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ e f205692r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f205692r = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f205692r, continuation);
            aVar.f205691q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(ApplicationContactInfoInternalAction applicationContactInfoInternalAction, Continuation<? super G0> continuation) {
            return ((a) create(applicationContactInfoInternalAction, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ApplicationContactInfoInternalAction applicationContactInfoInternalAction = (ApplicationContactInfoInternalAction) this.f205691q;
            boolean z12 = applicationContactInfoInternalAction instanceof ApplicationContactInfoInternalAction.CreateApplicationLoadingCompleted;
            e eVar = this.f205692r;
            if (z12) {
                ApplicationContactInfoInternalAction.CreateApplicationLoadingCompleted createApplicationLoadingCompleted = (ApplicationContactInfoInternalAction.CreateApplicationLoadingCompleted) applicationContactInfoInternalAction;
                eVar.f205696d.c(createApplicationLoadingCompleted.f205703b);
                eVar.f205696d.a(createApplicationLoadingCompleted.f205703b);
            } else if (applicationContactInfoInternalAction instanceof ApplicationContactInfoInternalAction.CreateApplicationLoadingFailed) {
                eVar.f205696d.c(null);
                eVar.f205696d.a(null);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b20.d dVar, e eVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f205689s = dVar;
        this.f205690t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f205689s, this.f205690t, continuation);
        dVar.f205688r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ApplicationContactInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205687q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f205688r;
            b20.d dVar = this.f205689s;
            C19669a c19669a = dVar.f56844b;
            if (c19669a == null) {
                return G0.f406611a;
            }
            e eVar = this.f205690t;
            com.avito.android.mortgage_invite.contact_info.domain.validation.f fVar = eVar.f205695c;
            fVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayListH0 = C42745f0.h0(c19669a.f20715g.f19259b, c19669a.f20714f.f19259b);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListH0) {
                Y10.b bVar = (Y10.b) obj2;
                if (bVar.f19267g && bVar.f19266f) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Y10.b bVar2 = (Y10.b) it.next();
                if (!bVar2.f19263c) {
                    ContactInfoFormItemType contactInfoFormItemType = ContactInfoFormItemType.f205538d;
                    ContactInfoFormItemType contactInfoFormItemType2 = bVar2.f19262b;
                    String str = bVar2.f19269i;
                    ContactInfoFieldId contactInfoFieldId = bVar2.f19261a;
                    if (contactInfoFormItemType2 != contactInfoFormItemType || contactInfoFieldId == ContactInfoFieldId.f205526d) {
                        PrintableText printableTextA = fVar.f205658b.a(str);
                        if (printableTextA != null) {
                            linkedHashMap.put(contactInfoFieldId, printableTextA);
                        }
                    } else {
                        PrintableText printableTextA2 = fVar.f205657a.a(str);
                        if (printableTextA2 != null) {
                            linkedHashMap.put(contactInfoFieldId, printableTextA2);
                        }
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                C43197r1 c43197r1 = new C43197r1(new a(eVar, null), eVar.f205694b.a(dVar));
                this.f205687q = 1;
                if (C43175k.u(this, c43197r1, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                eVar.f205696d.c(null);
                ApplicationContactInfoInternalAction.UpdateValidationResult updateValidationResult = new ApplicationContactInfoInternalAction.UpdateValidationResult(linkedHashMap);
                this.f205687q = 2;
                if (interfaceC43172j.emit(updateValidationResult, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
