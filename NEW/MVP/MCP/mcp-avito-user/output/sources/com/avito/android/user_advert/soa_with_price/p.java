package com.avito.android.user_advert.soa_with_price;

import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: SoaWithPriceSheetDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SoaWithPriceSheetDialogFragment f311940b;

    public p(SoaWithPriceSheetDialogFragment soaWithPriceSheetDialogFragment) {
        this.f311940b = soaWithPriceSheetDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = (Q) obj;
        boolean zBooleanValue = ((Boolean) q12.f406619b).booleanValue();
        String str = (String) q12.f406620c;
        if (zBooleanValue) {
            return;
        }
        SoaWithPriceSheetDialogFragment soaWithPriceSheetDialogFragment = this.f311940b;
        InterfaceC28373a interfaceC28373a = soaWithPriceSheetDialogFragment.f311856m0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        String str2 = soaWithPriceSheetDialogFragment.f311862s0;
        interfaceC28373a.c(new jI0.b(str2 != null ? str2 : null, str));
    }
}
