package com.avito.android.barcode_scanner_impl.domain;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.barcode_scanner_public.BarcodeScannerType;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BarcodeRawValueInterceptorProviderImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/domain/f;", "Lcom/avito/android/barcode_scanner_impl/domain/e;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements e {

    /* compiled from: BarcodeRawValueInterceptorProviderImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98910a;

        static {
            int[] iArr = new int[BarcodeScannerType.values().length];
            try {
                Parcelable.Creator<BarcodeScannerType> creator = BarcodeScannerType.CREATOR;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f98910a = iArr;
        }
    }

    @Inject
    public f() {
    }

    @Override // com.avito.android.barcode_scanner_impl.domain.e
    @l
    public final h a(@k BarcodeScannerType barcodeScannerType) {
        if (a.f98910a[barcodeScannerType.ordinal()] == 1) {
            return new h();
        }
        return null;
    }
}
