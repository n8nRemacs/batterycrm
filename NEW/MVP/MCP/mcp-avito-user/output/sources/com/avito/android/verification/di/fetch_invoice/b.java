package com.avito.android.verification.di.fetch_invoice;

import Y61.k;
import android.content.res.Resources;
import androidx.view.S0;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.verification.verification_fetch_invoice.VerificationFetchInvoiceArgs;
import com.avito.android.verification.verification_fetch_invoice.VerificationFetchInvoiceFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: VerificationFetchInvoiceComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/di/fetch_invoice/b;", "", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: VerificationFetchInvoiceComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/di/fetch_invoice/b$a;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k r rVar, @h31.b @k Resources resources, @h31.b @k VerificationFetchInvoiceArgs verificationFetchInvoiceArgs, @h31.b @k S0 s02, @h31.b @k com.avito.android.verification.inn.r rVar2, @k c cVar, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k VerificationFetchInvoiceFragment verificationFetchInvoiceFragment);
}
