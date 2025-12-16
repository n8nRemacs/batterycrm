package com.avito.android.delivery_tarifikator.domain;

import android.content.Context;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SelectableTariffsProvider.kt */
@kotlin.jvm.internal.s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/E;", "Lcom/avito/android/delivery_tarifikator/domain/D;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes12.dex */
public final class E implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f135236a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h0 f135237b;

    @Inject
    public E(@Y61.k Context context, @Y61.k h0 h0Var) {
        this.f135236a = context;
        this.f135237b = h0Var;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.D
    @Y61.k
    public final ArrayList a() {
        ArrayList arrayListF = this.f135237b.f();
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListF, 10));
        int i12 = 0;
        for (Object obj : arrayListF) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Ov.k kVar = (Ov.k) obj;
            arrayList.add(new com.avito.android.lib.design.bottom_sheet.k(String.valueOf(i12), kVar.getF12669b().k0(this.f135236a), null, kVar.getF12670c(), null, null, null, null, null, null, null, null, 4084, null));
            i12 = i13;
        }
        return arrayList;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.D
    @Y61.k
    public final List<com.avito.android.lib.design.bottom_sheet.k> b() {
        return C42745f0.x(a());
    }

    @Override // com.avito.android.delivery_tarifikator.domain.D
    @Y61.l
    public final Ov.k c(@Y61.k String str) {
        try {
            return (Ov.k) C42745f0.K(Integer.parseInt(str), this.f135237b.f());
        } catch (Throwable unused) {
            return null;
        }
    }
}
