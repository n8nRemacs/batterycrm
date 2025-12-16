package com.avito.android.iac_calls_history.impl_module.interactor;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.x;
import com.avito.android.util.R0;
import java.time.format.DateTimeFormatter;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CallsHistoryListInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/interactor/b;", "Lcom/avito/android/iac_calls_history/impl_module/interactor/a;", "b", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.iac_calls_history.impl_module.interactor.a {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C4819b f164712f = new C4819b(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C<DateTimeFormatter> f164713g = C42727D.c(a.f164719l);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_calls_history.impl_module.api.a f164714a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f164715b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f164716c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final x f164717d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_calls_history.impl_module.screen.h f164718e;

    /* compiled from: CallsHistoryListInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<DateTimeFormatter> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f164719l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final DateTimeFormatter invoke() {
            return DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZZZZZ");
        }
    }

    /* compiled from: CallsHistoryListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/interactor/b$b;", "", "<init>", "()V", "", "LOAD_ITEMS_COUNT", "I", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_calls_history.impl_module.interactor.b$b, reason: collision with other inner class name */
    public static final class C4819b {
        public /* synthetic */ C4819b(C42822w c42822w) {
            this();
        }

        public C4819b() {
        }
    }

    @Inject
    public b(@Y61.k com.avito.android.iac_calls_history.impl_module.api.a aVar, @Y61.k com.avito.android.server_time.f fVar, @Y61.k R0 r02, @Y61.k x xVar, @Y61.k com.avito.android.iac_calls_history.impl_module.screen.h hVar) {
        this.f164714a = aVar;
        this.f164715b = fVar;
        this.f164716c = r02;
        this.f164717d = xVar;
        this.f164718e = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.avito.android.iac_calls_history.impl_module.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.l java.time.LocalDateTime r30, @Y61.k com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTabType r31, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r32) throws com.avito.android.util.ApiException {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_calls_history.impl_module.interactor.b.a(java.time.LocalDateTime, com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTabType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
