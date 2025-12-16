package com.avito.android.barcode.presentation.mvi;

import Og.InterfaceC14684a;
import Og.InterfaceC14685b;
import com.avito.android.arch.mvi.a;
import com.avito.android.barcode.presentation.mvi.entity.BarcodeState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BarcodeActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/barcode/presentation/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LOg/a;", "LOg/b;", "Lcom/avito/android/barcode/presentation/mvi/entity/BarcodeState;", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC14684a, InterfaceC14685b, BarcodeState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f98722a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f98723b;

    @Inject
    public b(@Y61.l @com.avito.android.barcode.di.f String str, @Y61.l @com.avito.android.barcode.di.e String str2) {
        this.f98722a = str;
        this.f98723b = str2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC14685b> b(InterfaceC14684a interfaceC14684a, BarcodeState barcodeState) {
        return C43175k.G(new a(interfaceC14684a, this, null));
    }
}
