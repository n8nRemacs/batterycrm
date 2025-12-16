package com.avito.android.profile_phones.landline_verification;

import androidx.compose.foundation.H;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ManualPhoneVerificationLink;
import com.avito.android.deep_linking.links.auth.PhoneVerificationLinkContext;
import com.avito.android.deep_linking.links.x;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.LandlinePhoneVerificationStatusResult;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: LandlinePhoneVerificationViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel;", "Landroidx/lifecycle/M0;", "ActionState", "a", "b", "ResultStatus", "c", "d", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LandlinePhoneVerificationViewModel extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final j f227176E;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public a f227178K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f227179L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public y f227180M;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final g f227177J = new g();

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C23038g0<d> f227181N = new C23038g0<>();

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final D<c> f227182O = new D<>();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final D<b> f227183P = new D<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LandlinePhoneVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$ActionState;", "", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionState {

        /* renamed from: c, reason: collision with root package name */
        public static final ActionState f227184c;

        /* renamed from: d, reason: collision with root package name */
        public static final ActionState f227185d;

        /* renamed from: e, reason: collision with root package name */
        public static final ActionState f227186e;

        /* renamed from: f, reason: collision with root package name */
        public static final ActionState f227187f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ ActionState[] f227188g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f227189h;

        /* renamed from: b, reason: collision with root package name */
        public final int f227190b;

        static {
            ActionState actionState = new ActionState("CALL_ORDER", 0, 0);
            f227184c = actionState;
            ActionState actionState2 = new ActionState("CALL_ORDERED", 1, 1);
            f227185d = actionState2;
            ActionState actionState3 = new ActionState("MANUAL", 2, 2);
            f227186e = actionState3;
            ActionState actionState4 = new ActionState("STATUS", 3, 3);
            f227187f = actionState4;
            ActionState[] actionStateArr = {actionState, actionState2, actionState3, actionState4};
            f227188g = actionStateArr;
            f227189h = kotlin.enums.c.a(actionStateArr);
        }

        public ActionState(String str, int i12, int i13) {
            this.f227190b = i13;
        }

        public static ActionState valueOf(String str) {
            return (ActionState) Enum.valueOf(ActionState.class, str);
        }

        public static ActionState[] values() {
            return (ActionState[]) f227188g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LandlinePhoneVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$ResultStatus;", "", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResultStatus {

        /* renamed from: b, reason: collision with root package name */
        public static final ResultStatus f227191b;

        /* renamed from: c, reason: collision with root package name */
        public static final ResultStatus f227192c;

        /* renamed from: d, reason: collision with root package name */
        public static final ResultStatus f227193d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ResultStatus[] f227194e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f227195f;

        static {
            ResultStatus resultStatus = new ResultStatus("SUCCESS", 0);
            f227191b = resultStatus;
            ResultStatus resultStatus2 = new ResultStatus("CANCEL", 1);
            f227192c = resultStatus2;
            ResultStatus resultStatus3 = new ResultStatus("MANUAL", 2);
            f227193d = resultStatus3;
            ResultStatus[] resultStatusArr = {resultStatus, resultStatus2, resultStatus3};
            f227194e = resultStatusArr;
            f227195f = kotlin.enums.c.a(resultStatusArr);
        }

        public ResultStatus() {
            throw null;
        }

        public static ResultStatus valueOf(String str) {
            return (ResultStatus) Enum.valueOf(ResultStatus.class, str);
        }

        public static ResultStatus[] values() {
            return (ResultStatus[]) f227194e.clone();
        }
    }

    /* compiled from: LandlinePhoneVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$b;", "", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f227203a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final ApiError f227204b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Throwable f227205c;

        public b() {
            this(null, null, null, 7, null);
        }

        public b(@Y61.l ApiError apiError, @Y61.l String str, @Y61.l Throwable th2) {
            this.f227203a = str;
            this.f227204b = apiError;
            this.f227205c = th2;
        }

        public /* synthetic */ b(String str, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : apiError, (i12 & 1) != 0 ? null : str, (i12 & 4) != 0 ? null : th2);
        }
    }

    /* compiled from: LandlinePhoneVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$c;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$c$a;", "Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$c$b;", "Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$c$c;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: LandlinePhoneVerificationViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$c$a;", "Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$c;", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f227206a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: LandlinePhoneVerificationViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$c$b;", "Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$c;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f227207a;

            public b(@Y61.k String str) {
                super(null);
                this.f227207a = str;
            }
        }

        /* compiled from: LandlinePhoneVerificationViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$c$c;", "Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$c;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel$c$c, reason: collision with other inner class name */
        public static final class C6901c extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f227208a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ResultStatus f227209b;

            public C6901c(@Y61.k String str, @Y61.k ResultStatus resultStatus) {
                super(null);
                this.f227208a = str;
                this.f227209b = resultStatus;
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: LandlinePhoneVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$d;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$d$a;", "Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$d$b;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d {

        /* compiled from: LandlinePhoneVerificationViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$d$a;", "Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$d;", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f227210a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: LandlinePhoneVerificationViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$d$b;", "Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$d;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ActionState f227211a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f227212b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f227213c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final AttributedText f227214d;

            public b(@Y61.k ActionState actionState, @Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText) {
                super(null);
                this.f227211a = actionState;
                this.f227212b = str;
                this.f227213c = str2;
                this.f227214d = attributedText;
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: LandlinePhoneVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/LandlinePhoneVerificationStatusResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/LandlinePhoneVerificationStatusResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f227216c;

        /* compiled from: LandlinePhoneVerificationViewModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f227217a;

            static {
                int[] iArr = new int[LandlinePhoneVerificationStatusResult.VerificationStatus.values().length];
                try {
                    iArr[LandlinePhoneVerificationStatusResult.VerificationStatus.ERROR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LandlinePhoneVerificationStatusResult.VerificationStatus.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LandlinePhoneVerificationStatusResult.VerificationStatus.PROCESSING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LandlinePhoneVerificationStatusResult.VerificationStatus.FAILED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f227217a = iArr;
            }
        }

        public e(a aVar) {
            this.f227216c = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            LandlinePhoneVerificationStatusResult landlinePhoneVerificationStatusResult = (LandlinePhoneVerificationStatusResult) obj;
            LandlinePhoneVerificationStatusResult.VerificationStatus status = landlinePhoneVerificationStatusResult.getStatus();
            int i12 = status == null ? -1 : a.f227217a[status.ordinal()];
            a aVar = this.f227216c;
            LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel = LandlinePhoneVerificationViewModel.this;
            if (i12 == 1) {
                y yVar = landlinePhoneVerificationViewModel.f227180M;
                if (yVar != null) {
                    DisposableHelper.a(yVar);
                }
                LandlinePhoneVerificationViewModel.ke(landlinePhoneVerificationViewModel, new a(0, aVar.f227197b, aVar.f227198c, aVar.f227199d, aVar.f227200e, aVar.f227201f, true));
                return;
            }
            if (i12 == 2) {
                y yVar2 = landlinePhoneVerificationViewModel.f227180M;
                if (yVar2 != null) {
                    DisposableHelper.a(yVar2);
                }
                landlinePhoneVerificationViewModel.f227182O.setValue(new c.C6901c(aVar.f227200e, ResultStatus.f227191b));
                return;
            }
            if (i12 != 3) {
                if (i12 != 4) {
                    V2.f318762a.j("verificationStatusPolling", "Failed to VerificationStatusPolling - unknown LandlinePhoneVerificationStatusResult status value", null);
                    return;
                }
                y yVar3 = landlinePhoneVerificationViewModel.f227180M;
                if (yVar3 != null) {
                    DisposableHelper.a(yVar3);
                }
                DeepLink deeplink = landlinePhoneVerificationStatusResult.getDeeplink();
                ManualPhoneVerificationLink manualPhoneVerificationLink = deeplink instanceof ManualPhoneVerificationLink ? (ManualPhoneVerificationLink) deeplink : null;
                if (manualPhoneVerificationLink == null) {
                    return;
                }
                PhoneVerificationLinkContext phoneVerificationLinkContext = manualPhoneVerificationLink.f133435b;
                Integer numC = phoneVerificationLinkContext.getCallId();
                LandlinePhoneVerificationViewModel.ke(landlinePhoneVerificationViewModel, new a(numC != null ? numC.intValue() : 0, phoneVerificationLinkContext.getTitle(), phoneVerificationLinkContext.getSubtitle(), phoneVerificationLinkContext.getDescription(), aVar.f227200e, true, false, 64, null));
            }
        }
    }

    /* compiled from: LandlinePhoneVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            if (th2 instanceof ApiException) {
                ApiError apiError = ((ApiException) th2).f318522b;
                if (apiError instanceof ApiError.NetworkIOError) {
                    LandlinePhoneVerificationViewModel.this.f227183P.postValue(new b(((ApiError.NetworkIOError) apiError).getF244063c(), null, th2, 2, null));
                    return;
                }
            }
            V2.f318762a.a("DEFAULT_TAG", "Failed to request VerificationStatusPolling ", th2);
        }
    }

    /* compiled from: LandlinePhoneVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$g", "Lcom/avito/android/deep_linking/links/x;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements x {
        public g() {
        }

        @Override // com.avito.android.deep_linking.links.x
        public final boolean X(@Y61.k String str) {
            URL url = new URL(str);
            if (!L.f(url.getHost(), "support.avito.ru")) {
                return true;
            }
            LandlinePhoneVerificationViewModel.this.f227182O.postValue(new c.b(url.getPath()));
            return true;
        }
    }

    public LandlinePhoneVerificationViewModel(@Y61.k j jVar) {
        this.f227176E = jVar;
    }

    public static final void ke(LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel, a aVar) {
        if (L.f(landlinePhoneVerificationViewModel.f227178K, aVar)) {
            return;
        }
        a aVar2 = landlinePhoneVerificationViewModel.f227178K;
        AttributedText attributedText = aVar2 != null ? aVar2.f227199d : null;
        if (attributedText != null) {
            attributedText.setOnUrlClickListener(null);
        }
        AttributedText attributedText2 = aVar.f227199d;
        if (attributedText2 != null) {
            attributedText2.setOnUrlClickListener(landlinePhoneVerificationViewModel.f227177J);
        }
        landlinePhoneVerificationViewModel.f227178K = aVar;
        landlinePhoneVerificationViewModel.me(aVar);
        landlinePhoneVerificationViewModel.le(aVar);
    }

    public static void ne(LandlinePhoneVerificationViewModel landlinePhoneVerificationViewModel, Throwable th2, ApiError apiError, int i12) {
        if ((i12 & 1) != 0) {
            th2 = null;
        }
        if ((i12 & 2) != 0) {
            apiError = null;
        }
        landlinePhoneVerificationViewModel.f227183P.postValue(new b(apiError, "", th2));
    }

    public final void le(a aVar) {
        int i12;
        if (aVar == null || (i12 = aVar.f227196a) <= 0) {
            return;
        }
        y yVar = this.f227180M;
        if (yVar == null || yVar.getF318621e()) {
            j jVar = this.f227176E;
            jVar.getClass();
            this.f227180M = (y) new io.reactivex.rxjava3.internal.operators.mixed.x(z.a0(4L, 4L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.b.f404942b), new i(jVar, i12)).j0(jVar.f227234c.e()).v0(new e(aVar), new f(), io.reactivex.rxjava3.internal.functions.a.f401993c);
        }
    }

    public final void me(a aVar) {
        d.b bVar = new d.b(C43066x.K(aVar.f227200e) ? ActionState.f227187f : aVar.f227201f ? ActionState.f227186e : aVar.f227196a > 0 ? ActionState.f227185d : ActionState.f227184c, aVar.f227197b, aVar.f227198c, aVar.f227199d);
        if (aVar.f227202g) {
            this.f227183P.setValue(new b(null, null, null, 7, null));
        }
        this.f227181N.setValue(bVar);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f227179L;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        y yVar = this.f227180M;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        super.onCleared();
    }

    /* compiled from: LandlinePhoneVerificationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationViewModel$a;", "", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f227196a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f227197b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f227198c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final AttributedText f227199d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f227200e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f227201f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f227202g;

        public a(int i12, @Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText, @Y61.k String str3, boolean z12, boolean z13) {
            this.f227196a = i12;
            this.f227197b = str;
            this.f227198c = str2;
            this.f227199d = attributedText;
            this.f227200e = str3;
            this.f227201f = z12;
            this.f227202g = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f227196a == aVar.f227196a && L.f(this.f227197b, aVar.f227197b) && L.f(this.f227198c, aVar.f227198c) && L.f(this.f227199d, aVar.f227199d) && L.f(this.f227200e, aVar.f227200e) && this.f227201f == aVar.f227201f && this.f227202g == aVar.f227202g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f227202g) + androidx.appcompat.app.r.i(H.d(com.avito.android.actions_sheet.a.b(H.d(H.d(Integer.hashCode(this.f227196a) * 31, 31, this.f227197b), 31, this.f227198c), 31, this.f227199d), 31, this.f227200e), 31, this.f227201f);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Data(callId=");
            sb2.append(this.f227196a);
            sb2.append(", title=");
            sb2.append(this.f227197b);
            sb2.append(", subtitle=");
            sb2.append(this.f227198c);
            sb2.append(", description=");
            sb2.append(this.f227199d);
            sb2.append(", phone=");
            sb2.append(this.f227200e);
            sb2.append(", isManual=");
            sb2.append(this.f227201f);
            sb2.append(", isError=");
            return androidx.appcompat.app.r.x(sb2, this.f227202g, ')');
        }

        public /* synthetic */ a(int i12, String str, String str2, AttributedText attributedText, String str3, boolean z12, boolean z13, int i13, C42822w c42822w) {
            this(i12, str, str2, attributedText, str3, z12, (i13 & 64) != 0 ? false : z13);
        }
    }
}
