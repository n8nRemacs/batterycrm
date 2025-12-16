package com.avito.android.phones_actualization.scenario;

import To.d;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.AppbarNavigationIcon;
import com.avito.android.code_check_public.screen.PhoneList;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_check_public.screen.d;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.passport.deeplinks.PhonesListLink;
import com.avito.android.remote.model.text.AttributedText;
import com.squareup.anvil.annotations.ContributesBinding;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ActualizePhonesScreenBuilder.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phones_actualization/scenario/s;", "Lcom/avito/android/phones_actualization/scenario/q;", "_avito_phones-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d.b f216266a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c.b f216267b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f216268c;

    /* compiled from: ActualizePhonesScreenBuilder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.a f216269l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.a aVar) {
            super(1);
            this.f216269l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            if (str.length() > 0) {
                this.f216269l.f406838b = true;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ActualizePhonesScreenBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.code_check_public.a> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.a f216271m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.a aVar) {
            super(0);
            this.f216271m = aVar;
        }

        @Override // Y41.a
        public final com.avito.android.code_check_public.a invoke() {
            s sVar = s.this;
            sVar.f216268c.c(new C70.a(this.f216271m.f406838b, Boolean.TRUE));
            sVar.f216268c.c(new C70.c());
            return null;
        }
    }

    /* compiled from: ActualizePhonesScreenBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.android.code_check_public.a> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.a f216273m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l0.a aVar) {
            super(0);
            this.f216273m = aVar;
        }

        @Override // Y41.a
        public final com.avito.android.code_check_public.a invoke() {
            s.this.f216268c.c(new C70.a(this.f216273m.f406838b, Boolean.FALSE));
            return null;
        }
    }

    /* compiled from: ActualizePhonesScreenBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<com.avito.android.code_check_public.a> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.a f216275m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l0.a aVar) {
            super(0);
            this.f216275m = aVar;
        }

        @Override // Y41.a
        public final com.avito.android.code_check_public.a invoke() {
            s.this.f216268c.c(new C70.a(this.f216275m.f406838b, null));
            return null;
        }
    }

    /* compiled from: ActualizePhonesScreenBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<com.avito.android.code_check_public.a> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.a f216277m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l0.a aVar) {
            super(0);
            this.f216277m = aVar;
        }

        @Override // Y41.a
        public final com.avito.android.code_check_public.a invoke() {
            s.this.f216268c.c(new C70.a(this.f216277m.f406838b, null));
            return null;
        }
    }

    /* compiled from: ActualizePhonesScreenBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<com.avito.android.code_check_public.a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.code_check_public.a invoke() {
            s.this.f216268c.c(new C70.b());
            return null;
        }
    }

    /* compiled from: ActualizePhonesScreenBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<com.avito.android.code_check_public.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f216279l = new g();

        public g() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.code_check_public.a invoke() {
            return new a.b.C3496a(null, 1, null);
        }
    }

    /* compiled from: ActualizePhonesScreenBuilder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.phones_actualization.scenario.ActualizePhonesScreenBuilderImpl$navigateReadablePhoneList$screen$2", f = "ActualizePhonesScreenBuilder.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super To.d>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f216280q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f216281r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ DeepLink f216282s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(DeepLink deepLink, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f216282s = deepLink;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = new h(this.f216282s, continuation);
            hVar.f216281r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super To.d> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f216280q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f216281r;
                DeepLink deepLink = this.f216282s;
                if (deepLink != null) {
                    d.C1084d c1084d = new d.C1084d(new a.InterfaceC3494a.b(deepLink, null, 2, null));
                    this.f216280q = 1;
                    if (interfaceC43172j.emit(c1084d, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
    public s(@com.avito.android.code_check_public.g @Y61.k d.b bVar, @com.avito.android.code_check_public.g @Y61.k c.b bVar2, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f216266a = bVar;
        this.f216267b = bVar2;
        this.f216268c = interfaceC28373a;
    }

    @Override // com.avito.android.phones_actualization.scenario.q
    @Y61.k
    public final a.InterfaceC3494a.d a(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.k AttributedText attributedText) {
        return new a.InterfaceC3494a.d(new PhoneList("ActualizePhonesListReadable", new com.avito.android.code_check_public.screen.i(new a.b.C3497b(null, null, null, null, null, 31, null), new a.b.C3496a(null, 1, null), new com.avito.android.code_check_public.screen.b(new a.b.C3496a(null, 1, null), AppbarNavigationIcon.f119298c, null), null, 8, null), null, new PhoneList.b(com.avito.android.printable_text.b.f(str), null, PhoneList.c.a.f119324a, new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(attributedText), null, PhoneList.ItemIcon.f119308b, null, new PhoneList.a(com.avito.android.printable_text.b.c(R.string.phone_list_action, new Serializable[0]), new a.InterfaceC3494a.b(new PhonesListLink(null, 1, null), g.f216279l), null, 4, null), false, 338, null), null, C43175k.G(new h(deepLink, null)), null, 84, null), false, new f(), 2, null);
    }

    @Override // com.avito.android.phones_actualization.scenario.q
    @Y61.k
    public final a.InterfaceC3494a.d b(@Y61.k AttributedText attributedText, @Y61.k String str) {
        l0.a aVar = new l0.a();
        return new a.InterfaceC3494a.d(new PhoneList("ActualizePhonesListConfirmable", new com.avito.android.code_check_public.screen.i(new a.InterfaceC3494a.d(d(), false, new c(aVar), 2, null), new a.b.C3496a(new d(aVar)), new com.avito.android.code_check_public.screen.b(new a.b.C3496a(new e(aVar)), AppbarNavigationIcon.f119298c, null), null, 8, null), null, new PhoneList.b(com.avito.android.printable_text.b.f(str), com.avito.android.printable_text.b.c(R.string.phone_list_number_not_found, new Serializable[0]), new PhoneList.c.b.C3501b(8, new a(aVar)), new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(attributedText), com.avito.android.printable_text.b.c(R.string.phone_list_search_hint, new Serializable[0]), PhoneList.ItemIcon.f119308b, new PhoneList.a(com.avito.android.printable_text.b.c(R.string.phone_list_new_number_button, new Serializable[0]), new a.InterfaceC3494a.d(e(AppbarNavigationIcon.f119297b), false, new b(aVar), 2, null), PhoneList.ItemIcon.f119309c), null, false, 384, null), this.f216266a, null, null, 100, null), false, null, 6, null);
    }

    @Override // com.avito.android.phones_actualization.scenario.q
    @Y61.k
    public final a.InterfaceC3494a.d c() {
        return new a.InterfaceC3494a.d(e(AppbarNavigationIcon.f119298c), false, new t(this), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.avito.android.code_check_public.screen.c d() {
        return new com.avito.android.code_check_public.screen.c("ActualizePhonesConfirm", new com.avito.android.code_check_public.screen.i(new a.b.C3497b(null, new a.b.C3497b.C3498a(com.avito.android.printable_text.b.c(R.string.phone_is_actualized_message, new Serializable[0]), false, 2, null), null, null, null, 29, null), new a.InterfaceC3494a.C3495a(null, 1, null), new com.avito.android.code_check_public.screen.b(new a.InterfaceC3494a.C3495a(null, 1, null), AppbarNavigationIcon.f119297b, null, 4, null), null, 8, null), new r(this), new c.a(com.avito.android.printable_text.b.c(R.string.code_confirm_title, new Serializable[0]), null, new c.d.b(com.avito.android.printable_text.b.c(R.string.code_confirm_subtitle, new Serializable[0]), null, 2, 0 == true ? 1 : 0), com.avito.android.printable_text.b.c(R.string.code_confirm_hint, new Serializable[0]), null, com.avito.android.printable_text.b.c(R.string.code_confirm_request_available, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.code_confirm_request_timer, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.code_confirm_action, new Serializable[0]), 18, null), this.f216267b, this.f216266a, null, null, 192, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.avito.android.code_check_public.screen.d e(AppbarNavigationIcon appbarNavigationIcon) {
        return new com.avito.android.code_check_public.screen.d("ActualizePhonesRequest", new com.avito.android.code_check_public.screen.i(new a.InterfaceC3494a.d(d(), false, null, 6, null), new a.InterfaceC3494a.C3495a(null, 1, null), new com.avito.android.code_check_public.screen.b(new a.InterfaceC3494a.C3495a(null, 1, null), appbarNavigationIcon, null, 4, null), null, 8, null), null, this.f216266a, new d.a(com.avito.android.printable_text.b.c(R.string.phone_request_title, new Serializable[0]), null, com.avito.android.printable_text.b.c(R.string.phone_request_hint, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.phone_request_action, new Serializable[0]), new com.avito.android.code_check_public.screen.j(new C31685o(11), null, 2, 0 == true ? 1 : 0), null, null, null, null, true, 482, null), null, null, 100, null);
    }
}
