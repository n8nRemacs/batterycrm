package com.avito.android.barcode.di;

import Sg.InterfaceC15183a;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.barcode.presentation.BarcodeDetailsActivity;
import com.avito.android.barcode_encoder.BarcodeFormat;
import com.avito.android.di.InterfaceC30272y;
import h31.d;
import kotlin.Metadata;

/* compiled from: BarcodeComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode/di/a;", "", "a", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: BarcodeComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode/di/a$a;", "", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.barcode.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC2965a {
        @k
        a a(@k b bVar, @k InterfaceC15183a interfaceC15183a, @c @h31.b @k String str, @h31.b @l @f String str2, @h31.b @l @e String str3, @h31.b @k BarcodeFormat barcodeFormat, @h31.b @k C28478k c28478k);
    }

    void a(@k BarcodeDetailsActivity barcodeDetailsActivity);
}
