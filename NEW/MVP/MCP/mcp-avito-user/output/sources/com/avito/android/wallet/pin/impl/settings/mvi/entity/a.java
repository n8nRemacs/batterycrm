package com.avito.android.wallet.pin.impl.settings.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import kP0.C42617c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletSecuritySettingsViewState.kt */
@H0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/a;", "", "a", "b", "c", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/a$a;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/a$b;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/a$c;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: WalletSecuritySettingsViewState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/a$a;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/a;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.pin.impl.settings.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10210a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f328871a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C42617c f328872b;

        public C10210a(@k String str, @k C42617c c42617c) {
            this.f328871a = str;
            this.f328872b = c42617c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10210a)) {
                return false;
            }
            C10210a c10210a = (C10210a) obj;
            return L.f(this.f328871a, c10210a.f328871a) && L.f(this.f328872b, c10210a.f328872b);
        }

        public final int hashCode() {
            return this.f328872b.hashCode() + (this.f328871a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Content(headerTitle=" + this.f328871a + ", loginSection=" + this.f328872b + ')';
        }
    }

    /* compiled from: WalletSecuritySettingsViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/a$b;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/a;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f328873a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1472180691;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: WalletSecuritySettingsViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/a$c;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/a;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f328874a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 94234657;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
