package com.google.android.gms.internal.mlkit_vision_face;

import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzan extends zzal implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzao f352960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzao zzaoVar) {
        super(zzaoVar);
        this.f352960e = zzaoVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zzao zzaoVar = this.f352960e;
        boolean zIsEmpty = zzaoVar.isEmpty();
        a();
        ((ListIterator) this.f352952b).add(obj);
        zzaoVar.f352961g.f352963e++;
        if (zIsEmpty) {
            zzaoVar.b();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f352952b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f352952b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f352952b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f352952b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f352952b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzao zzaoVar, int i12) {
        super(zzaoVar, ((List) zzaoVar.f352956c).listIterator(i12));
        this.f352960e = zzaoVar;
    }
}
