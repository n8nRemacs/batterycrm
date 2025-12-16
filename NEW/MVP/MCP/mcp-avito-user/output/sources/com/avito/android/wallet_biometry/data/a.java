package com.avito.android.wallet_biometry.data;

import AK0.l;
import Y61.k;
import android.app.Application;
import com.google.gson.Gson;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: WalletPinBiometryUserStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet_biometry/data/a;", "", "a", "_avito_wallet-biometry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<Gson> f329475a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f329476b;

    /* compiled from: WalletPinBiometryUserStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/wallet_biometry/data/a$a;", "", "<init>", "()V", "", "BIOMETRY_DISABLED_KEY", "Ljava/lang/String;", "PIN_KEY", "PROMPT_SHOWN_KEY", "TAG", "_avito_wallet-biometry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet_biometry.data.a$a, reason: collision with other inner class name */
    public static final class C10234a {
        public /* synthetic */ C10234a(C42822w c42822w) {
            this();
        }

        public C10234a() {
        }
    }

    static {
        new C10234a(null);
    }

    @Inject
    public a(@k Application application, @k AK0.i iVar, @k h31.e<Gson> eVar) {
        this.f329475a = eVar;
        this.f329476b = iVar.a(application, "wallet_pin_storage");
    }

    public final void a(@k String str, boolean z12) {
        l lVar = this.f329476b;
        lVar.remove("wallet_c_text_" + str);
        if (z12) {
            Set<String> setF = lVar.f("wallet_bm_prompt_shown");
            if (setF == null) {
                setF = B0.f406639b;
            }
            lVar.putStringSet("wallet_bm_prompt_shown", b1.e(setF, str));
        }
    }
}
