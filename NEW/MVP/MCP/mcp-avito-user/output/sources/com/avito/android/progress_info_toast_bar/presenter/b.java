package com.avito.android.progress_info_toast_bar.presenter;

import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.progress_info_toast_bar.ProgressBarResponse;
import com.avito.android.progress_info_toast_bar.ProgressInfo;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBar;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBarData;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import fa.InterfaceC40383a;
import fd0.C40404b;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.F;
import io.reactivex.rxjava3.internal.operators.observable.N;
import java.net.SocketTimeoutException;
import javax.inject.Inject;
import jd0.C42361a;
import jd0.C42362b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.o;
import l41.s;

/* compiled from: ProgressInfoToastBarPresenterImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/presenter/b;", "Lcom/avito/android/progress_info_toast_bar/presenter/ProgressInfoToastBarPresenter;", "a", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements ProgressInfoToastBarPresenter {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f231558j = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC40383a> f231559a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f231560b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f231561c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.progress_info_toast_bar.interactor.b f231562d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BK0.a<ProgressInfoToastBarData> f231563e = new BK0.a<>();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f231564f = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f231565g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public volatile ProgressInfoToastBarPresenter.RequestData f231566h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f231567i;

    /* compiled from: ProgressInfoToastBarPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/presenter/b$a;", "", "<init>", "()V", "", "KEY_STATE", "Ljava/lang/String;", "TAG", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ProgressInfoToastBarPresenterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.progress_info_toast_bar.presenter.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C7052b {
        static {
            int[] iArr = new int[ProgressInfoToastBarPresenter.RequestType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProgressInfoToastBarPresenter.RequestType requestType = ProgressInfoToastBarPresenter.RequestType.f231550b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ProgressInfoToastBarPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/presenter/ProgressInfoToastBarPresenter$RequestData;", "data", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/progress_info_toast_bar/ProgressBarResponse;", "apply", "(Lcom/avito/android/progress_info_toast_bar/presenter/ProgressInfoToastBarPresenter$RequestData;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements o {
        public c() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ProgressInfoToastBarPresenter.RequestData requestData = (ProgressInfoToastBarPresenter.RequestData) obj;
            b.this.f231566h = requestData;
            final b bVar = b.this;
            bVar.getClass();
            int iOrdinal = requestData.f231548f.ordinal();
            String str = requestData.f231544b;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return bVar.f231559a.get().a(str, requestData.f231547e);
                }
                throw new NoWhenBranchMatchedException();
            }
            Long lZ02 = C43066x.z0(str);
            String str2 = requestData.f231546d;
            return bVar.f231562d.a(lZ02, str2 != null ? C43066x.z0(str2) : null, requestData.f231545c).d0(new o() { // from class: com.avito.android.progress_info_toast_bar.presenter.d
                @Override // l41.o
                public final Object apply(Object obj2) {
                    int i12 = b.f231558j;
                    bVar.getClass();
                    C42362b toastBar = ((C42361a) obj2).getToastBar();
                    if (toastBar == null) {
                        return new ProgressBarResponse(null);
                    }
                    int count = (int) toastBar.getCount();
                    if (count < 0) {
                        count = 0;
                    }
                    int totalCount = (int) toastBar.getTotalCount();
                    return new ProgressBarResponse(new ProgressInfo(count, totalCount >= 0 ? totalCount : 0, toastBar.getTitle(), toastBar.getSubtitle()));
                }
            });
        }
    }

    /* compiled from: ProgressInfoToastBarPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/ProgressBarResponse;", "response", "Lkotlin/G0;", "accept", "(Lcom/avito/android/progress_info_toast_bar/ProgressBarResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f231569b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ProgressInfoToastBarPresenter.RequestData f231570c;

        public d(ProgressInfoToastBarPresenter.RequestData requestData, b bVar) {
            this.f231569b = bVar;
            this.f231570c = requestData;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ProgressInfo success = ((ProgressBarResponse) obj).getSuccess();
            if (success != null) {
                BK0.a<ProgressInfoToastBarData> aVar = this.f231569b.f231563e;
                String title = success.getTitle();
                int count = success.getCount();
                int totalCount = success.getTotalCount();
                String subtitle = success.getSubtitle();
                ProgressInfoToastBarPresenter.RequestData requestData = this.f231570c;
                aVar.onNext(new ProgressInfoToastBarData(title, count, totalCount, subtitle, requestData.f231544b, requestData.f231548f));
            }
        }
    }

    /* compiled from: ProgressInfoToastBarPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "err", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ProgressInfoToastBarPresenter.RequestData f231571b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f231572c;

        public e(ProgressInfoToastBarPresenter.RequestData requestData, b bVar) {
            this.f231571b = requestData;
            this.f231572c = bVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            boolean z12;
            Throwable th2 = (Throwable) obj;
            ProgressInfoToastBarPresenter.RequestData requestData = this.f231571b;
            if (requestData.f231548f == ProgressInfoToastBarPresenter.RequestType.f231550b) {
                InterfaceC28373a interfaceC28373a = this.f231572c.f231561c;
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        z12 = false;
                        break;
                    } else {
                        if (cause instanceof SocketTimeoutException) {
                            z12 = true;
                            break;
                        }
                        cause = cause.getCause();
                    }
                }
                ProgressInfoToastBar.InitialFlow initialFlow = requestData.f231549g;
                interfaceC28373a.c(new C40404b(z12, initialFlow != null ? initialFlow.f231492b : null));
            }
            V2.f318762a.a("DEFAULT_TAG", "ProgressInfoToastBarPresenter", th2);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k h31.e<InterfaceC40383a> eVar, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC28373a interfaceC28373a, @k com.avito.android.progress_info_toast_bar.interactor.b bVar) {
        this.f231559a = eVar;
        this.f231560b = interfaceC35745a5;
        this.f231561c = interfaceC28373a;
        this.f231562d = bVar;
    }

    @Override // com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter
    public final void a(@k Bundle bundle) {
        bundle.putParcelable("PROGRESS_INFO_STATE", getState());
    }

    @Override // com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter
    public final void b(@l Bundle bundle) {
        if (bundle != null) {
            ProgressInfoToastBarPresenter.State state = (ProgressInfoToastBarPresenter.State) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("PROGRESS_INFO_STATE", ProgressInfoToastBarPresenter.State.class) : bundle.getParcelable("PROGRESS_INFO_STATE"));
            if (state != null) {
                e(state);
            }
        }
    }

    @Override // com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter
    public final void c(@k q qVar) {
        this.f231564f.e();
        this.f231565g = true;
        this.f231564f.b(qVar.n(new com.avito.android.progress_info_toast_bar.presenter.e(this), f.f231576b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter
    @k
    /* renamed from: d, reason: from getter */
    public final BK0.a getF231563e() {
        return this.f231563e;
    }

    @Override // com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter
    public final void e(@k ProgressInfoToastBarPresenter.State state) {
        ProgressInfoToastBarData progressInfoToastBarData = state.f231555c;
        if (progressInfoToastBarData != null) {
            if (progressInfoToastBarData != null) {
                this.f231563e.onNext(progressInfoToastBarData);
            }
        } else {
            ProgressInfoToastBarPresenter.RequestData requestData = state.f231554b;
            if (requestData == null || requestData == null) {
                return;
            }
            f(requestData);
        }
    }

    public final void f(final ProgressInfoToastBarPresenter.RequestData requestData) {
        this.f231566h = requestData;
        this.f231564f.b(new N(new F(new s() { // from class: com.avito.android.progress_info_toast_bar.presenter.a
            @Override // l41.s
            public final Object get() {
                int i12 = b.f231558j;
                ProgressInfoToastBarPresenter.RequestData requestData2 = requestData;
                if (requestData2.f231546d != null) {
                    return z.c0(requestData2);
                }
                return this.f231559a.get().f(null, null, requestData2.f231544b, null, null, null, null, null, P0.c()).d0(new c(requestData2));
            }
        }).y0(new c()).x0(this.f231560b.a()).j0(this.f231560b.e()), new C31684n(this, 9)).v0(new d(requestData, this), new e(requestData, this), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter
    @k
    public final ProgressInfoToastBarPresenter.State getState() {
        return new ProgressInfoToastBarPresenter.State(this.f231566h, this.f231563e.f1350c.get());
    }

    @Override // com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter
    public final void onPause() {
        if (!this.f231565g) {
            this.f231564f.e();
        }
        this.f231567i = false;
    }

    @Override // com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter
    public final void onResume() {
        ProgressInfoToastBarPresenter.RequestData requestData;
        if (this.f231565g && (requestData = this.f231566h) != null) {
            f(requestData);
        }
        this.f231565g = false;
        this.f231567i = true;
    }
}
