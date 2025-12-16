package com.avito.android.wallet_biometry;

import android.app.Application;
import androidx.biometric.o;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WalletPinBiometryAuthenticator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet_biometry/d;", "", "_avito_wallet-biometry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f329471a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Application f329472b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f329473c = C42727D.c(new a());

    /* compiled from: WalletPinBiometryAuthenticator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/biometric/o;", "invoke", "()Landroidx/biometric/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<o> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final o invoke() {
            return o.c(d.this.f329472b);
        }
    }

    @Inject
    public d(@Y61.k R0 r02, @Y61.k Application application) {
        this.f329471a = r02;
        this.f329472b = application;
    }
}
