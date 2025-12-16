package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzls extends zzma {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzlo f350974c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzls(zzlo zzloVar, zzlr zzlrVar) {
        super(zzloVar, null);
        this.f350974c = zzloVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzma, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzlq(this.f350974c, null);
    }
}
