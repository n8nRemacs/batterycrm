package com.avito.android.str_cancellation_settings.domain;

import Oy0.InterfaceC14756a;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: StrCancellationSettingsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/domain/e;", "Lcom/avito/android/str_cancellation_settings/domain/d;", "a", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f288334a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14756a f288335b;

    /* compiled from: StrCancellationSettingsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_cancellation_settings/domain/e$a;", "", "<init>", "()V", "", "DEFAULT_DEBOUNCE_MILLIS", "J", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@Y61.k R0 r02, @Y61.k InterfaceC14756a interfaceC14756a) {
        this.f288334a = r02;
        this.f288335b = interfaceC14756a;
    }

    @Override // com.avito.android.str_cancellation_settings.domain.d
    @Y61.k
    public final g a(long j12, @Y61.l String str, @Y61.l String str2, boolean z12, @Y61.l Integer num, @Y61.l Boolean bool, @Y61.l Integer num2) {
        return new g(C43175k.n(new C43137a0(new i(2, null), C43175k.I(this.f288334a.a(), new f(C43175k.G(new h(this, str2, str, num, num2, bool, z12, j12, null))))), 300L));
    }

    @Override // com.avito.android.str_cancellation_settings.domain.d
    @Y61.k
    public final k b(long j12, @Y61.l String str, @Y61.l String str2) {
        return new k(C43175k.n(new C43137a0(new m(2, null), C43175k.I(this.f288334a.a(), new j(C43175k.G(new l(this, j12, str, str2, null))))), 300L));
    }
}
