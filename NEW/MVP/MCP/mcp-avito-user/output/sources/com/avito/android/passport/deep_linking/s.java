package com.avito.android.passport.deep_linking;

import Ju.AbstractC14250d;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PassportProfilesListLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.passport.profiles_list.ProfilesListResult;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import rv.C47918a;

/* compiled from: PassportProfilesListAsyncLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/deep_linking/s;", "Lev/a;", "Lcom/avito/android/deep_linking/links/PassportProfilesListLink;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s extends AbstractC40161a<PassportProfilesListLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final E50.a f211083f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f211084g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C25719a f211085h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.i f211086i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.b f211087j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C43238h f211088k;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f211089b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s f211090c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.passport.deep_linking.s$a$a, reason: collision with other inner class name */
        public static final class C6307a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f211091b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ s f211092c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.passport.deep_linking.PassportProfilesListAsyncLinkHandler$onCreate$$inlined$filter$1$2", f = "PassportProfilesListAsyncLinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.passport.deep_linking.s$a$a$a, reason: collision with other inner class name */
            public static final class C6308a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f211093q;

                /* renamed from: r, reason: collision with root package name */
                public int f211094r;

                public C6308a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f211093q = obj;
                    this.f211094r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C6307a.this.emit(null, this);
                }
            }

            public C6307a(InterfaceC43172j interfaceC43172j, s sVar) {
                this.f211091b = interfaceC43172j;
                this.f211092c = sVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.passport.deep_linking.s.a.C6307a.C6308a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.passport.deep_linking.s$a$a$a r0 = (com.avito.android.passport.deep_linking.s.a.C6307a.C6308a) r0
                    int r1 = r0.f211094r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f211094r = r1
                    goto L18
                L13:
                    com.avito.android.passport.deep_linking.s$a$a$a r0 = new com.avito.android.passport.deep_linking.s$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f211093q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f211094r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    rv.a r6 = (rv.C47918a) r6
                    int r6 = r6.f437155a
                    com.avito.android.passport.deep_linking.s r2 = r4.f211092c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f211094r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f211091b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.deep_linking.s.a.C6307a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, s sVar) {
            this.f211089b = interfaceC43160i;
            this.f211090c = sVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C47918a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f211089b).collect(new C6307a(interfaceC43172j, this.f211090c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: PassportProfilesListAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lrv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.deep_linking.PassportProfilesListAsyncLinkHandler$onCreate$2", f = "PassportProfilesListAsyncLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<C47918a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f211096q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = s.this.new b(continuation);
            bVar.f211096q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            return ((b) create(c47918a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            ProfilesListResult profilesListResult;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C47918a c47918a = (C47918a) this.f211096q;
            Intent intent = c47918a.f437157c;
            if (intent != null) {
                profilesListResult = (ProfilesListResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("PassportProfilesListActivity.ResultExtra", ProfilesListResult.class) : intent.getParcelableExtra("PassportProfilesListActivity.ResultExtra"));
            } else {
                profilesListResult = null;
            }
            ProfilesListResult profilesListResult2 = profilesListResult != null ? profilesListResult : null;
            if (profilesListResult2 == null) {
                profilesListResult2 = ProfilesListResult.Cancelled.f213742b;
            }
            boolean z12 = profilesListResult2 instanceof ProfilesListResult.MergeSuccess;
            s sVar = s.this;
            if (z12) {
                PrintableText printableTextD = com.avito.android.passport.profile_add.merge.b.d(c47918a.f437157c);
                com.avito.android.lib.design.toast_bar.i.f181082D.getClass();
                i.a.b();
                if (printableTextD == null) {
                    printableTextD = com.avito.android.printable_text.b.c(R.string.passport_lib_public_passport_accounts_merge_finish_success_toast, new Serializable[0]);
                }
                PrintableText printableText = printableTextD;
                ToastBarPosition toastBarPosition = ToastBarPosition.f181047e;
                ToastMessageLink.ToastTheme toastTheme = ToastMessageLink.ToastTheme.f133730c;
                a.i.C4057a.d(sVar.f211086i, printableText, null, null, null, 0, toastBarPosition, null, "avitoRe23", 958);
            }
            sVar.j(AbstractC14250d.c.f9171c);
            return G0.f406611a;
        }
    }

    @Inject
    public s(@Y61.k E50.a aVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k C25719a c25719a, @Y61.k a.i iVar, @Y61.k a.b bVar, @Y61.k R0 r02) {
        this.f211083f = aVar;
        this.f211084g = interfaceC4053a;
        this.f211085h = c25719a;
        this.f211086i = iVar;
        this.f211087j = bVar;
        this.f211088k = U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), r02.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        PassportProfilesListLink passportProfilesListLink = (PassportProfilesListLink) deepLink;
        this.f211085h.b(passportProfilesListLink, this, null, new r(this, passportProfilesListLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new b(null), new a(kotlinx.coroutines.rx3.y.a(this.f211087j.Q()), this)), this.f211088k);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f211088k, null);
    }
}
