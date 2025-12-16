package com.avito.android.phone_reverification_info.mvi;

import Y41.p;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.phone_reverification_info.PhoneReverificationInfo;
import com.avito.android.phone_reverification_info.mvi.entity.PhoneReverificationInfoInternalAction;
import com.avito.android.util.InterfaceC35863o4;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import w70.C49461b;
import x70.AbstractC49786e;

/* compiled from: PhoneReverificationInfoBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/phone_reverification_info/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements com.avito.android.arch.mvi.b<PhoneReverificationInfoInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PhoneReverificationInfo f216153a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.phone_reverification_info.i f216154b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f216155c;

    /* compiled from: PhoneReverificationInfoBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.phone_reverification_info.mvi.PhoneReverificationInfoBootstrap$produce$1", f = "PhoneReverificationInfoBootstrap.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super PhoneReverificationInfoInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f216156q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f216157r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f216157r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PhoneReverificationInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            ArrayList arrayList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f216156q;
            d dVar = d.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f216157r;
                PhoneReverificationInfo phoneReverificationInfo = dVar.f216153a;
                com.avito.android.phone_reverification_info.i iVar = dVar.f216154b;
                iVar.getClass();
                boolean z12 = phoneReverificationInfo instanceof PhoneReverificationInfo.Allow;
                InterfaceC35863o4 interfaceC35863o4 = iVar.f216106a;
                if (z12) {
                    PhoneReverificationInfo.Allow allow = (PhoneReverificationInfo.Allow) phoneReverificationInfo;
                    arrayList = new ArrayList();
                    arrayList.add(new com.avito.android.phone_reverification_info.items.header.a(interfaceC35863o4.a(), com.avito.android.printable_text.b.c(R.string.phone_reverification_number_verified, new Serializable[0])));
                    arrayList.add(new com.avito.android.phone_reverification_info.items.attention.a(interfaceC35863o4.a(), com.avito.android.printable_text.b.c(R.string.phone_reverification_number_used_attention, new Serializable[0])));
                    String str = allow.f216036d;
                    if (str == null) {
                        str = allow.f216034b;
                    }
                    String strReplace = str.replace(' ', (char) 160);
                    arrayList.add(new com.avito.android.phone_reverification_info.items.text.a(interfaceC35863o4.a(), new AbstractC49786e.a(strReplace, com.avito.android.printable_text.b.c(R.string.phone_reverification_number_continue_use_attention, strReplace))));
                    String str2 = allow.f216035c;
                    arrayList.add(new com.avito.android.phone_reverification_info.items.text_point.a(interfaceC35863o4.a(), str2 != null ? new AbstractC49786e.a(str2, com.avito.android.printable_text.b.c(R.string.phone_reverification_number_email_cancel, str2)) : new AbstractC49786e.b(com.avito.android.printable_text.b.c(R.string.phone_reverification_number_email_empty_cancel, new Serializable[0]))));
                    arrayList.add(new com.avito.android.phone_reverification_info.items.text_point.a(interfaceC35863o4.a(), new AbstractC49786e.b(com.avito.android.printable_text.b.c(R.string.phone_reverification_number_expired, new Serializable[0]))));
                } else {
                    if (!(phoneReverificationInfo instanceof PhoneReverificationInfo.Disallow)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PhoneReverificationInfo.Disallow disallow = (PhoneReverificationInfo.Disallow) phoneReverificationInfo;
                    arrayList = new ArrayList();
                    String str3 = disallow.f216038c;
                    arrayList.add(new com.avito.android.phone_reverification_info.items.header.a(interfaceC35863o4.a(), str3 != null ? com.avito.android.printable_text.b.c(R.string.phone_reverification_number_already_used, str3) : com.avito.android.printable_text.b.c(R.string.phone_reverification_number_verified, new Serializable[0])));
                    String str4 = disallow.f216039d;
                    if (str4 == null) {
                        str4 = disallow.f216037b;
                    }
                    arrayList.add(new com.avito.android.phone_reverification_info.items.text.a(interfaceC35863o4.a(), new AbstractC49786e.a(str4, com.avito.android.printable_text.b.c(R.string.phone_reverification_disabled, str4))));
                }
                PhoneReverificationInfoInternalAction.InitialContent initialContent = new PhoneReverificationInfoInternalAction.InitialContent(arrayList, phoneReverificationInfo);
                this.f216156q = 1;
                if (interfaceC43172j.emit(initialContent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            dVar.f216155c.c(new C49461b(dVar.f216153a.c()));
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k PhoneReverificationInfo phoneReverificationInfo, @Y61.k com.avito.android.phone_reverification_info.i iVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f216153a = phoneReverificationInfo;
        this.f216154b = iVar;
        this.f216155c = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PhoneReverificationInfoInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
