package com.avito.android.authorization.social_registration.code_check;

import To.InterfaceC15383a;
import Y41.p;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.registration.ProfileSocial;
import com.avito.android.remote.model.registration.RegisteredProfile;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Collections;
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
import kotlinx.coroutines.flow.InterfaceC43172j;
import me.C44068a;
import me.C44069b;
import me.InterfaceC44071d;

/* compiled from: SocRegCodeConfirmInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.social_registration.code_check.SocRegCodeConfirmInteractor$confirmV2$1", f = "SocRegCodeConfirmInteractor.kt", i = {0, 1}, l = {35, 36, 60}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes11.dex */
final class e extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC15383a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public f f94594q;

    /* renamed from: r, reason: collision with root package name */
    public int f94595r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f94596s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f94597t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f94598u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f94599v;

    /* compiled from: SocRegCodeConfirmInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lme/d;", "result", "LTo/a;", "<anonymous>", "(Lme/d;)LTo/a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.authorization.social_registration.code_check.SocRegCodeConfirmInteractor$confirmV2$1$result$1", f = "SocRegCodeConfirmInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC44071d, Continuation<? super InterfaceC15383a>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f94600q;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(2, continuation);
            aVar.f94600q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC44071d interfaceC44071d, Continuation<? super InterfaceC15383a> continuation) {
            return ((a) create(interfaceC44071d, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC44071d interfaceC44071d = (InterfaceC44071d) this.f94600q;
            List listSingletonList = null;
            ArrayList arrayList = null;
            if (interfaceC44071d instanceof InterfaceC44071d.a) {
                InterfaceC44071d.a aVar = (InterfaceC44071d.a) interfaceC44071d;
                if (aVar.getMessages().getCode() != null) {
                    return new InterfaceC15383a.d.b(com.avito.android.printable_text.b.f(aVar.getMessages().getCode()));
                }
                String login = aVar.getMessages().getLogin();
                return new InterfaceC15383a.c(login != null ? com.avito.android.printable_text.b.f(login) : null, null, null, 6, null);
            }
            if (!(interfaceC44071d instanceof InterfaceC44071d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC44071d.b bVar = (InterfaceC44071d.b) interfaceC44071d;
            AttributedText warning = bVar.getWarning();
            String hash = bVar.getHash();
            C44068a profile = bVar.getProfile();
            if (profile != null) {
                String name = profile.getName();
                boolean isPassport = profile.getIsPassport();
                String description = profile.getDescription();
                Image avatar = profile.getAvatar();
                String login2 = profile.getLogin();
                List<C44069b> listF = profile.f();
                if (listF != null) {
                    List<C44069b> list = listF;
                    arrayList = new ArrayList(C42745f0.q(list, 10));
                    for (C44069b c44069b : list) {
                        arrayList.add(new ProfileSocial(c44069b.getType(), c44069b.getTitle()));
                    }
                }
                listSingletonList = Collections.singletonList(new RegisteredProfile(name, description, avatar, login2, arrayList, Boolean.valueOf(profile.getNeedWarning()), Boolean.valueOf(isPassport)));
            }
            if (listSingletonList == null) {
                listSingletonList = C42784z0.f406748b;
            }
            return new InterfaceC15383a.C1082a(new To.b(new SocialRegCcResult(warning, listSingletonList, hash)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, String str, String str2, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f94597t = fVar;
        this.f94598u = str;
        this.f94599v = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f94597t, this.f94598u, this.f94599v, continuation);
        eVar.f94596s = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC15383a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f94595r
            r2 = 3
            r3 = 1
            r4 = 0
            r5 = 2
            if (r1 == 0) goto L30
            if (r1 == r3) goto L26
            if (r1 == r5) goto L1e
            if (r1 != r2) goto L16
            kotlin.C42729a0.b(r10)
            goto L78
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.f94596s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L6b
        L26:
            com.avito.android.authorization.social_registration.code_check.f r1 = r9.f94594q
            java.lang.Object r3 = r9.f94596s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r10)
            goto L53
        L30:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f94596s
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            com.avito.android.authorization.social_registration.code_check.f r1 = r9.f94597t
            ie.a r6 = r1.f94601a
            java.lang.String r7 = r9.f94598u
            java.lang.String r7 = com.avito.android.code_check_public.model.Phone.b(r7)
            r9.f94596s = r10
            r9.f94594q = r1
            r9.f94595r = r3
            java.lang.String r3 = r9.f94599v
            java.lang.Object r3 = r6.a(r3, r7, r9)
            if (r3 != r0) goto L50
            return r0
        L50:
            r8 = r3
            r3 = r10
            r10 = r8
        L53:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            com.avito.android.authorization.social_registration.code_check.e$a r6 = new com.avito.android.authorization.social_registration.code_check.e$a
            r6.<init>(r5, r4)
            r9.f94596s = r3
            r9.f94594q = r4
            r9.f94595r = r5
            r1.getClass()
            java.lang.Object r10 = com.avito.android.code_check_public.screen.c.b.b(r10, r6, r9)
            if (r10 != r0) goto L6a
            return r0
        L6a:
            r1 = r3
        L6b:
            To.a r10 = (To.InterfaceC15383a) r10
            r9.f94596s = r4
            r9.f94595r = r2
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L78
            return r0
        L78:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.social_registration.code_check.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
