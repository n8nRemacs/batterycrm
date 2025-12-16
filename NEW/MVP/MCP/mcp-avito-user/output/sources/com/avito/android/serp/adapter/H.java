package com.avito.android.serp.adapter;

import android.util.SparseIntArray;
import kotlin.Metadata;

/* compiled from: GridPositionProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/H;", "Lcom/avito/android/serp/adapter/h1;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class H implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public int f268504a;

    /* renamed from: b, reason: collision with root package name */
    public SparseIntArray f268505b;

    @Override // com.avito.android.ui.adapter.n
    /* renamed from: b, reason: from getter */
    public final int getF268504a() {
        return this.f268504a;
    }

    @Override // com.avito.android.serp.adapter.h1
    public final void c(@Y61.k UV0.a<? extends i1> aVar) {
        int count = aVar.getCount();
        this.f268505b = new SparseIntArray(count);
        this.f268504a = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < count; i13++) {
            int iF2 = f(aVar.getItem(i13));
            if (i12 <= 0 || iF2 < ((C34690c0) this).f269087c) {
                i12 += iF2;
                SparseIntArray sparseIntArray = this.f268505b;
                (sparseIntArray != null ? sparseIntArray : null).put(i13, this.f268504a);
                if (i12 >= ((C34690c0) this).f269087c || i13 == count - 1) {
                    this.f268504a++;
                }
            } else {
                int i14 = this.f268504a + 1;
                this.f268504a = i14;
                SparseIntArray sparseIntArray2 = this.f268505b;
                (sparseIntArray2 != null ? sparseIntArray2 : null).put(i13, i14);
                this.f268504a++;
            }
            i12 = 0;
        }
    }

    @Override // com.avito.android.ui.adapter.n
    public final int d(int i12) {
        SparseIntArray sparseIntArray = this.f268505b;
        if (sparseIntArray == null) {
            sparseIntArray = null;
        }
        return sparseIntArray.get(i12);
    }

    public abstract int f(@Y61.k i1 i1Var);
}
