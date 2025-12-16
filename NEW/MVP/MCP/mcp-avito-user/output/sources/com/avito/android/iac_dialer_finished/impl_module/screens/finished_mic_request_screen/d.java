package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen;

import Y41.l;
import Y61.k;
import ZK.a;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.iac_analytics.public_module.analytics_models.MicAccessScenario;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_mic_request_screen.IacFinishedMicRequestScreenArgument;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink;
import com.avito.android.remote.model.ParametrizedEvent;
import io.reactivex.rxjava3.internal.operators.observable.S;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kv.C43501a;
import l41.r;
import nJ.J;
import tM.C48576a;

/* compiled from: IacFinishedMicRequestScreenPermissionsRequester.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/d;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/c;", "a", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.c {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final AtomicInteger f166718d;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f166719a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f166720b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f166721c = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: IacFinishedMicRequestScreenPermissionsRequester.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicInteger;", "uniqueCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacFinishedMicRequestScreenPermissionsRequester.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PermissionSystemRequestLink f166722b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f166723c;

        public b(PermissionSystemRequestLink permissionSystemRequestLink, String str) {
            this.f166722b = permissionSystemRequestLink;
            this.f166723c = str;
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            com.avito.android.deeplink_handler.handler.bundle.a aVar = ((C43501a) obj).f413260a;
            if (L.f(aVar.f134520a, this.f166722b)) {
                if (L.f(aVar.f134521b, this.f166723c)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: IacFinishedMicRequestScreenPermissionsRequester.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<C43501a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f166724l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<ZK.a, G0> f166725m;

        /* compiled from: IacFinishedMicRequestScreenPermissionsRequester.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[PermissionSystemRequestLink.ResultValue.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    PermissionSystemRequestLink.ResultValue resultValue = PermissionSystemRequestLink.ResultValue.f169265b;
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    PermissionSystemRequestLink.ResultValue resultValue2 = PermissionSystemRequestLink.ResultValue.f169265b;
                    iArr[1] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    PermissionSystemRequestLink.ResultValue resultValue3 = PermissionSystemRequestLink.ResultValue.f169265b;
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    PermissionSystemRequestLink.ResultValue resultValue4 = PermissionSystemRequestLink.ResultValue.f169265b;
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, l<? super ZK.a, G0> lVar) {
            super(1);
            this.f166724l = str;
            this.f166725m = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(C43501a c43501a) {
            PermissionSystemRequestLink.b bVar = (PermissionSystemRequestLink.b) c43501a.f413261b;
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar2 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f166724l);
            sb2.append(" finished, resultValue=");
            PermissionSystemRequestLink.ResultValue resultValue = bVar.f169272b;
            sb2.append(resultValue);
            bVar2.a("IacFinishedMicRequestScreenPermissionsRequester", sb2.toString(), null);
            int iOrdinal = resultValue.ordinal();
            boolean z12 = true;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    z12 = false;
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3 && iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z12 = false;
                }
            }
            ((com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.a) this.f166725m).invoke(new a.c(z12));
            return G0.f406611a;
        }
    }

    static {
        new a(null);
        f166718d = new AtomicInteger(0);
    }

    @Inject
    public d(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k Resources resources) {
        this.f166719a = aVar;
        this.f166720b = resources;
    }

    @Override // com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.c
    public final void a(@k IacFinishedMicRequestScreenArgument iacFinishedMicRequestScreenArgument, @k l<? super ZK.a, G0> lVar) {
        String str = "requestMic_" + f166718d.incrementAndGet();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacFinishedMicRequestScreenPermissionsRequester", str + " started", null);
        PermissionSystemRequestLink.ResultValue resultValue = PermissionSystemRequestLink.ResultValue.f169266c;
        PermissionSystemRequestLink.ResultValue resultValue2 = PermissionSystemRequestLink.ResultValue.f169268e;
        PermissionSystemRequestLink.ResultValue resultValue3 = PermissionSystemRequestLink.ResultValue.f169269f;
        Map mapSingletonMap = Collections.singletonMap("next_key_on_need_to_show_toast", C42745f0.U(resultValue, resultValue2, resultValue3));
        Map mapSingletonMap2 = Collections.singletonMap("next_key_on_need_to_show_toast", new ToastMessageLink(this.f166720b.getString(R.string.iac_dialer_finished_impl_mic_permission_to_answer_required), ToastMessageLink.ToastType.f133734c, null, null, null, false, null, 124, null));
        Map mapG = P0.g(new Q("analytic_key_track_granted", Collections.singletonList(PermissionSystemRequestLink.ResultValue.f169267d)), new Q("analytic_key_track_denied", C42745f0.U(resultValue2, resultValue3)));
        MicAccessScenario micAccessScenario = MicAccessScenario.f164297j;
        PermissionSystemRequestLink permissionSystemRequestLink = new PermissionSystemRequestLink("android.permission.RECORD_AUDIO", (Map<String, ? extends List<? extends PermissionSystemRequestLink.ResultValue>>) mapSingletonMap, (Map<String, ? extends DeepLink>) mapSingletonMap2, (Map<String, ? extends List<? extends PermissionSystemRequestLink.ResultValue>>) mapG, (Map<String, ParametrizedEvent>) P0.g(new Q("analytic_key_track_granted", C48576a.a(new J(true, micAccessScenario, iacFinishedMicRequestScreenArgument.getItemId(), iacFinishedMicRequestScreenArgument.getCallId(), null, null, 48, null))), new Q("analytic_key_track_denied", C48576a.a(new J(false, micAccessScenario, iacFinishedMicRequestScreenArgument.getItemId(), iacFinishedMicRequestScreenArgument.getCallId(), null, null, 48, null)))));
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f166719a;
        this.f166721c.b(A1.i(new S(aVar.V9().N(new b(permissionSystemRequestLink, str))), null, new c(str, lVar), 3));
        b.a.a(aVar, permissionSystemRequestLink, str, null, 4);
    }
}
