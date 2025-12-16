package com.avito.android.extended_profile_phone_dialog.deep_linking;

import Fc1.E0;
import Ju.InterfaceC14249c;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import arrow.core.AbstractC23662a;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.extended_profile_phone_dialog.g;
import com.avito.android.remote.analytics.C34244a;
import com.avito.android.remote.analytics.n;
import com.avito.android.remote.model.ExtendedProfilePhone;
import com.avito.android.remote.model.ExtendedProfilePhoneDisclaimer;
import com.avito.android.remote.model.ExtendedProfilePhoneResponse;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import io.reactivex.rxjava3.internal.operators.single.C42023v;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.rx3.Q;

/* compiled from: ExtendedProfilePhoneRequestLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/deep_linking/d;", "Lev/a;", "Lcom/avito/android/deep_linking/links/ExtendedProfilePhoneRequestLink;", "Lcom/avito/android/deeplink_handler/handler/a;", "a", "b", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d extends AbstractC40161a<ExtendedProfilePhoneRequestLink> implements com.avito.android.deeplink_handler.handler.a {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f151566n = 0;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.g f151567f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.i f151568g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final g f151569h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f151570i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f151571j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C25719a f151572k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final n f151573l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f151574m = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ExtendedProfilePhoneRequestLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/deep_linking/d$a;", "", "<init>", "()V", "", "AUTH_SOURCE_KEY", "Ljava/lang/String;", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ExtendedProfilePhoneRequestLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/deep_linking/d$b;", "", "<init>", "()V", "a", "b", "c", "d", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: ExtendedProfilePhoneRequestLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/deep_linking/d$b$a;", "LJu/c$b;", "<init>", "()V", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f151575b = new a();
        }

        /* compiled from: ExtendedProfilePhoneRequestLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/deep_linking/d$b$b;", "LJu/c$b;", "<init>", "()V", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.extended_profile_phone_dialog.deep_linking.d$b$b, reason: collision with other inner class name */
        public static final class C4430b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4430b f151576b = new C4430b();
        }

        /* compiled from: ExtendedProfilePhoneRequestLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/deep_linking/d$b$c;", "LJu/c$a;", "<init>", "()V", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f151577b = new c();
        }

        /* compiled from: ExtendedProfilePhoneRequestLinkHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/deep_linking/d$b$d;", "LJu/c$b;", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.extended_profile_phone_dialog.deep_linking.d$b$d, reason: collision with other inner class name */
        public static final /* data */ class C4431d implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ExtendedProfilePhoneRequestLink f151578b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final com.avito.android.extended_profile_phone_dialog.f f151579c;

            public C4431d(@k ExtendedProfilePhoneRequestLink extendedProfilePhoneRequestLink, @k com.avito.android.extended_profile_phone_dialog.f fVar) {
                this.f151578b = extendedProfilePhoneRequestLink;
                this.f151579c = fVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4431d)) {
                    return false;
                }
                C4431d c4431d = (C4431d) obj;
                return L.f(this.f151578b, c4431d.f151578b) && L.f(this.f151579c, c4431d.f151579c);
            }

            public final int hashCode() {
                return this.f151579c.hashCode() + (this.f151578b.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "Success(deeplink=" + this.f151578b + ", phoneInfo=" + this.f151579c + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ExtendedProfilePhoneRequestLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/ExtendedProfilePhoneResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/ExtendedProfilePhoneResponse;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_phone_dialog.deep_linking.ExtendedProfilePhoneRequestLinkHandler$loadPhones$1", f = "ExtendedProfilePhoneRequestLinkHandler.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super ExtendedProfilePhoneResponse>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151580q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ExtendedProfilePhoneRequestLink f151582s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f151583t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ExtendedProfilePhoneRequestLink extendedProfilePhoneRequestLink, String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f151582s = extendedProfilePhoneRequestLink;
            this.f151583t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return d.this.new c(this.f151582s, this.f151583t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super ExtendedProfilePhoneResponse> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f151580q;
            if (i12 == 0) {
                C42729a0.b(obj);
                g gVar = d.this.f151569h;
                ExtendedProfilePhoneRequestLink extendedProfilePhoneRequestLink = this.f151582s;
                String str = extendedProfilePhoneRequestLink.f133319b;
                String str2 = extendedProfilePhoneRequestLink.f133322e;
                this.f151580q = 1;
                obj = gVar.b(str, extendedProfilePhoneRequestLink.f133320c, str2, this.f151583t, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: ExtendedProfilePhoneRequestLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_phone_dialog.deep_linking.d$d, reason: collision with other inner class name */
    public static final class C4432d<T> implements l41.g {
        public C4432d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            d dVar = d.this;
            dVar.f151567f.g(dVar.d(), true);
        }
    }

    /* compiled from: ExtendedProfilePhoneRequestLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfilePhoneResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/ExtendedProfilePhoneResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ExtendedProfilePhoneRequestLink f151586c;

        public e(ExtendedProfilePhoneRequestLink extendedProfilePhoneRequestLink) {
            this.f151586c = extendedProfilePhoneRequestLink;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ExtendedProfilePhoneResponse extendedProfilePhoneResponse = (ExtendedProfilePhoneResponse) obj;
            boolean z12 = extendedProfilePhoneResponse instanceof ExtendedProfilePhoneResponse.Ok;
            d dVar = d.this;
            if (!z12) {
                if (extendedProfilePhoneResponse instanceof ExtendedProfilePhoneResponse.Failure) {
                    dVar.i(b.c.f151577b, dVar.f151570i, Jd.b.a(((ExtendedProfilePhoneResponse.Failure) extendedProfilePhoneResponse).getDialogInfo()));
                }
            } else {
                ExtendedProfilePhoneResponse.Ok ok2 = (ExtendedProfilePhoneResponse.Ok) extendedProfilePhoneResponse;
                List<ExtendedProfilePhone> phones = ok2.getPhones();
                ExtendedProfilePhoneDisclaimer disclaimer = ok2.getDisclaimer();
                dVar.j(new b.C4431d(this.f151586c, new com.avito.android.extended_profile_phone_dialog.f(phones, disclaimer != null ? new ExtendedProfilePhoneDisclaimer(disclaimer.getTitle(), disclaimer.getDescription(), disclaimer.getIsAnonymous()) : null)));
            }
        }
    }

    /* compiled from: ExtendedProfilePhoneRequestLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            d dVar = d.this;
            C34244a c34244aB = dVar.f151573l.b(new AbstractC23662a.b(th2));
            String str = c34244aB != null ? c34244aB.f253104c : null;
            com.avito.android.extended_profile_ui_components.p.f153373a.getClass();
            a.i.C4057a.d(dVar.f151568g, com.avito.android.extended_profile_ui_components.p.a(str, th2).f153349a, null, null, new f.c(th2), 0, null, null, null, 2030);
            dVar.j(b.C4430b.f151576b);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@k a.g gVar, @k a.i iVar, @k g gVar2, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k InterfaceC35745a5 interfaceC35745a5, @k C25719a c25719a, @k n nVar) {
        this.f151567f = gVar;
        this.f151568g = iVar;
        this.f151569h = gVar2;
        this.f151570i = aVar;
        this.f151571j = interfaceC35745a5;
        this.f151572k = c25719a;
        this.f151573l = nVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        Object serializable;
        ExtendedProfilePhoneRequestLink extendedProfilePhoneRequestLink = (ExtendedProfilePhoneRequestLink) deepLink;
        if (!extendedProfilePhoneRequestLink.f133321d) {
            k(extendedProfilePhoneRequestLink, bundle);
            return;
        }
        AuthSource authSource = null;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable("source_key", AuthSource.class);
            } else {
                Object serializable2 = bundle.getSerializable("source_key");
                serializable = (AuthSource) (serializable2 instanceof AuthSource ? serializable2 : null);
            }
            authSource = (AuthSource) serializable;
        }
        this.f151572k.a(extendedProfilePhoneRequestLink, this, authSource, new com.avito.android.extended_profile_phone_dialog.deep_linking.e(this, extendedProfilePhoneRequestLink, bundle));
    }

    @Override // com.avito.android.deeplink_handler.handler.a
    public final void cancel() {
        j(b.a.f151575b);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f151574m.e();
    }

    public final void k(ExtendedProfilePhoneRequestLink extendedProfilePhoneRequestLink, Bundle bundle) {
        String string = bundle != null ? bundle.getString("fromSpace") : null;
        io.reactivex.rxjava3.disposables.c cVar = this.f151574m;
        cVar.e();
        C42006d c42006dA = Q.a(EmptyCoroutineContext.INSTANCE, new c(extendedProfilePhoneRequestLink, string, null));
        InterfaceC35745a5 interfaceC35745a5 = this.f151571j;
        cVar.b(new C42023v(c42006dA.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).j(new C4432d()), new E0(this, 21)).x(new e(extendedProfilePhoneRequestLink), new f()));
    }
}
