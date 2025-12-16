package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
class zzbv extends zzbw {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f351803a;

    /* renamed from: b, reason: collision with root package name */
    public int f351804b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f351805c;

    public final void a(int i12) {
        Object[] objArr = this.f351803a;
        int length = objArr.length;
        if (length >= i12) {
            if (this.f351805c) {
                this.f351803a = (Object[]) objArr.clone();
                this.f351805c = false;
                return;
            }
            return;
        }
        int i13 = length + (length >> 1) + 1;
        if (i13 < i12) {
            int iHighestOneBit = Integer.highestOneBit(i12 - 1);
            i13 = iHighestOneBit + iHighestOneBit;
        }
        if (i13 < 0) {
            i13 = Integer.MAX_VALUE;
        }
        this.f351803a = Arrays.copyOf(objArr, i13);
        this.f351805c = false;
    }

    public final zzbv zza(Object obj) {
        obj.getClass();
        a(this.f351804b + 1);
        Object[] objArr = this.f351803a;
        int i12 = this.f351804b;
        this.f351804b = i12 + 1;
        objArr[i12] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbw
    public /* bridge */ /* synthetic */ zzbw zzb(Object obj) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzbw zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            a(iterable.size() + this.f351804b);
            if (iterable instanceof zzbx) {
                this.f351804b = ((zzbx) iterable).a(this.f351804b, this.f351803a);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }
}
