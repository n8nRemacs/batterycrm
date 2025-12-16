package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable;

import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacAvailabilityNotifiedStateStorage.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/b;", "Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/a;", "a", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f168292a;

    /* compiled from: IacAvailabilityNotifiedStateStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/b$a;", "", "<init>", "()V", "", "APP_VERSION", "Ljava/lang/String;", "DEVICE_PARAMS", "IAC_ENABLED", "MIC_ACCESS", "VOIP_PUSH_TOKEN", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public b(@Y61.k AK0.l lVar) {
        this.f168292a = lVar;
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a
    public final void a() {
        V2.f318762a.c("IacAvailabilityNotifiedStateStorage", "Clear flags on logout", null);
        f(false);
        c(false);
        h(false);
        k(null);
        e(null);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a
    public final boolean b() {
        return this.f168292a.getBoolean("iac_enabled_notified_state", false);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a
    public final void c(boolean z12) {
        this.f168292a.putBoolean("voip_push_token_notified_state", z12);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a
    public final boolean d() {
        return this.f168292a.getBoolean("voip_push_token_notified_state", false);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a
    public final void e(@Y61.l String str) {
        this.f168292a.putString("device_params_notified_State", str);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a
    public final void f(boolean z12) {
        this.f168292a.putBoolean("iac_enabled_notified_state", z12);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a
    @Y61.l
    public final String g() {
        return this.f168292a.getString("app_version_notified_state", null);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a
    public final void h(boolean z12) {
        this.f168292a.putBoolean("mic_access_notified_state", z12);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a
    @Y61.l
    public final String i() {
        return this.f168292a.getString("device_params_notified_State", null);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a
    public final boolean j() {
        return this.f168292a.getBoolean("mic_access_notified_state", false);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a
    public final void k(@Y61.l String str) {
        this.f168292a.putString("app_version_notified_state", str);
    }
}
