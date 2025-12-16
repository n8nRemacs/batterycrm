package com.avito.konveyor.util;

import Y61.k;
import androidx.camera.camera2.internal.G;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DataSources.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/konveyor/util/e;", "T", "LUV0/a;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class e<T> implements UV0.a<T> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UV0.a<? extends T>[] f338563b;

    public e(@k UV0.a<? extends T>... aVarArr) {
        this.f338563b = aVarArr;
    }

    @Override // UV0.a
    public final int getCount() {
        int count = 0;
        for (UV0.a<? extends T> aVar : this.f338563b) {
            count += aVar.getCount();
        }
        return count;
    }

    @Override // UV0.a
    public final T getItem(int i12) {
        if (i12 < 0) {
            throw new IndexOutOfBoundsException(G.e(i12, "Illegal index: ", " – must not be negative"));
        }
        UV0.a<? extends T>[] aVarArr = this.f338563b;
        int length = aVarArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            UV0.a<? extends T> aVar = aVarArr[i13];
            int count = aVar.getCount() + i14;
            if (i12 < count) {
                return aVar.getItem(i12 - i14);
            }
            i13++;
            i14 = count;
        }
        throw new IndexOutOfBoundsException(AK.c.g(i12, "Invalid index: "));
    }

    @Override // UV0.a
    public final boolean isEmpty() {
        for (UV0.a<? extends T> aVar : this.f338563b) {
            if (!aVar.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
