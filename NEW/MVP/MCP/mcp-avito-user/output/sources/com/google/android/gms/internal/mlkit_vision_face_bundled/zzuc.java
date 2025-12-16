package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.NoSuchElementException;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzuc extends zzue {

    /* renamed from: b, reason: collision with root package name */
    public int f354024b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f354025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzul f354026d;

    public zzuc(zzul zzulVar) {
        this.f354026d = zzulVar;
        this.f354025c = zzulVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f354024b < this.f354025c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzug
    public final byte zza() {
        int i12 = this.f354024b;
        if (i12 >= this.f354025c) {
            throw new NoSuchElementException();
        }
        this.f354024b = i12 + 1;
        return this.f354026d.a(i12);
    }
}
