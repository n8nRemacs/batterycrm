package com.avito.android.extended_profile_personal_link_edit;

import Y41.p;
import Y41.q;
import com.avito.android.error.z;
import com.avito.android.extended_profile_personal_link_edit.mvi.entity.PersonalLinkEditInternalAction;
import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PersonalLinkEditInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/j;", "Lcom/avito/android/extended_profile_personal_link_edit/i;", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f151493a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f151494b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f151495c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f151496d;

    /* compiled from: PersonalLinkEditInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditInteractorImpl$save$1", f = "PersonalLinkEditInteractor.kt", i = {0, 1}, l = {43, 45, 49, 54}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super PersonalLinkEditInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151497q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f151498r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f151500t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f151501u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f151502v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z12, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f151500t = str;
            this.f151501u = z12;
            this.f151502v = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = j.this.new a(this.f151500t, this.f151501u, this.f151502v, continuation);
            aVar.f151498r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PersonalLinkEditInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_personal_link_edit.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PersonalLinkEditInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_personal_link_edit/mvi/entity/PersonalLinkEditInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_personal_link_edit.PersonalLinkEditInteractorImpl$save$2", f = "PersonalLinkEditInteractor.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super PersonalLinkEditInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151503q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f151504r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f151505s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PersonalLinkEditInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f151504r = interfaceC43172j;
            bVar.f151505s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f151503q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f151504r;
                Throwable th2 = this.f151505s;
                PersonalLinkEditInternalAction.FailSave failSave = new PersonalLinkEditInternalAction.FailSave(com.avito.android.printable_text.b.f(z.l(th2)), th2);
                this.f151504r = null;
                this.f151503q = 1;
                if (interfaceC43172j.emit(failSave, this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    @Inject
    public j(@Y61.k h31.e<D0> eVar, @Y61.k R0 r02, @Y61.k h31.e<Gson> eVar2, @Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f151493a = eVar;
        this.f151494b = r02;
        this.f151495c = eVar2;
        this.f151496d = interfaceC35863o4;
    }

    @Override // com.avito.android.extended_profile_personal_link_edit.i
    @Y61.k
    public final InterfaceC43160i a(@Y61.k String str, @Y61.l String str2, boolean z12) {
        return C43175k.I(this.f151494b.a(), new C43152f0(C43175k.G(new a(str, z12, str2, null)), new b(3, null)));
    }
}
