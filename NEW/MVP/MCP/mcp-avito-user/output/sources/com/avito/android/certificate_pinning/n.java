package com.avito.android.certificate_pinning;

import com.avito.android.R;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UnsafeNetworkPresenter.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/certificate_pinning/n;", "Lcom/avito/android/certificate_pinning/h;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.certificate_pinning.domain.a f117844a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f117845b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public s f117846c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public UnsafeNetworkActivity f117847d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public String f117848e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f117849f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f117850g;

    /* compiled from: UnsafeNetworkPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/NetworkState;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/certificate_pinning/NetworkState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f117852c;

        public a(boolean z12) {
            this.f117852c = z12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            s sVar;
            s sVar2;
            NetworkState networkState = (NetworkState) obj;
            long j12 = networkState.f117751b;
            n nVar = n.this;
            if (j12 == 0) {
                UnsafeNetworkActivity unsafeNetworkActivity = nVar.f117847d;
                if (unsafeNetworkActivity != null) {
                    unsafeNetworkActivity.finish();
                    return;
                }
                return;
            }
            if (j12 == 1) {
                s sVar3 = nVar.f117846c;
                if (sVar3 != null) {
                    sVar3.a();
                    D6.w(sVar3.f117858c);
                }
                nVar.f117848e = networkState.f117752c;
                return;
            }
            boolean z12 = this.f117852c;
            if (j12 != 2) {
                if (j12 != 3) {
                    if (z12 || (sVar = nVar.f117846c) == null) {
                        return;
                    }
                    sVar.d();
                    return;
                }
                if (z12 || (sVar2 = nVar.f117846c) == null) {
                    return;
                }
                D6.w(sVar2.f117858c);
                com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, sVar2.f117856a, com.avito.android.printable_text.a.a(R.string.network_unavailable_snack), null, null, null, null, 2750, null, null, false, false, null, null, 4062);
                return;
            }
            if (z12) {
                s sVar4 = nVar.f117846c;
                if (sVar4 != null) {
                    sVar4.e();
                    return;
                }
                return;
            }
            if (nVar.f117849f) {
                s sVar5 = nVar.f117846c;
                if (sVar5 != null) {
                    sVar5.e();
                }
                nVar.f117849f = false;
                return;
            }
            s sVar6 = nVar.f117846c;
            if (sVar6 != null) {
                sVar6.e();
                com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, sVar6.f117856a, com.avito.android.printable_text.a.a(R.string.still_unsafe_network_error), null, null, null, null, 0, null, null, false, false, null, null, 4094);
            }
        }
    }

    /* compiled from: UnsafeNetworkPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            s sVar = n.this.f117846c;
            if (sVar != null) {
                sVar.d();
            }
        }
    }

    @Inject
    public n(@Y61.k com.avito.android.certificate_pinning.domain.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.l Kundle kundle) {
        Boolean boolA;
        this.f117844a = aVar;
        this.f117845b = interfaceC35745a5;
        this.f117848e = kundle != null ? kundle.g("redirect_url") : null;
        this.f117849f = (kundle == null || (boolA = kundle.a("first_check")) == null) ? true : boolA.booleanValue();
        this.f117850g = new io.reactivex.rxjava3.disposables.c();
    }

    public final void a(boolean z12) {
        this.f117850g.b(this.f117844a.a().s(this.f117845b.e()).x(new a(z12), new b()));
    }
}
