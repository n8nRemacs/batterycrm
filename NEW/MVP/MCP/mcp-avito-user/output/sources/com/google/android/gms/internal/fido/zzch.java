package com.google.android.gms.internal.fido;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzch extends zzcc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzci f350288d;

    public zzch(zzci zzciVar) {
        this.f350288d = zzciVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i12) {
        zzci zzciVar = this.f350288d;
        return new AbstractMap.SimpleImmutableEntry(zzciVar.f350289d.f350292d.f350311f.get(i12), zzciVar.f350289d.f350293e.get(i12));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350288d.f350289d.size();
    }
}
