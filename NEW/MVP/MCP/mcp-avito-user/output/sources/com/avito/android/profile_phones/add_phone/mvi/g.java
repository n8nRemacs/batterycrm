package com.avito.android.profile_phones.add_phone.mvi;

import Ju.InterfaceC14249c;
import Y41.p;
import com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction;
import com.avito.android.profile_phones.deep_linking.a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;

/* compiled from: AddPhoneBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements com.avito.android.arch.mvi.b<AddPhoneInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f226923a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_phones.add_phone.n f226924b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f226925c;

    /* compiled from: AddPhoneBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_phones.add_phone.mvi.AddPhoneBootstrap$produce$1", f = "AddPhoneBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<C43501a, Continuation<? super InterfaceC43160i<? extends AddPhoneInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f226926q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f226926q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends AddPhoneInternalAction>> continuation) {
            return ((a) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC14249c interfaceC14249c = ((C43501a) this.f226926q).f413261b;
            if (!(interfaceC14249c instanceof a.InterfaceC6897a.b)) {
                return C43175k.w();
            }
            g gVar = g.this;
            com.avito.android.profile_phones.add_phone.n nVar = gVar.f226924b;
            a.InterfaceC6897a.b bVar = (a.InterfaceC6897a.b) interfaceC14249c;
            String str = bVar.f227106b;
            return nVar.c(bVar.f227107c, gVar.f226925c, str);
        }
    }

    @Inject
    public g(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.profile_phones.add_phone.n nVar, @com.avito.android.profile_phones.add_phone.di.g @Y61.l String str) {
        this.f226923a = aVar;
        this.f226924b = nVar;
        this.f226925c = str;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AddPhoneInternalAction> a() {
        return C43175k.B(new a(null), y.a(this.f226923a.d9()));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
