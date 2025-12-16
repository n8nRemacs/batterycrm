package com.avito.android.wallet_biometry;

import android.app.Activity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: WalletPinBiometryInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet_biometry/f;", "", "_avito_wallet-biometry_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface f {

    /* compiled from: WalletPinBiometryInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    Object a(boolean z12, @Y61.k Continuation<? super G0> continuation);

    @Y61.l
    Object b(@Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object c(@Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object d(boolean z12, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object e(@Y61.k Activity activity, @Y61.l AP0.b bVar, @Y61.k CP0.d dVar, @Y61.k Continuation<? super CP0.a> continuation);

    @Y61.l
    Object f(@Y61.k Activity activity, @Y61.k String str, @Y61.l AP0.b bVar, boolean z12, @Y61.k ContinuationImpl continuationImpl);
}
