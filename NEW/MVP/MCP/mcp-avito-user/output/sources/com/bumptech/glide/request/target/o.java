package com.bumptech.glide.request.target;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.N;

/* compiled from: SimpleTarget.java */
@Deprecated
/* loaded from: classes5.dex */
public abstract class o<Z> extends b<Z> {

    /* renamed from: c, reason: collision with root package name */
    public final int f339614c = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: d, reason: collision with root package name */
    public final int f339615d = BeduinInputModel.MIN_TEXT_VERSION;

    @Override // com.bumptech.glide.request.target.q
    public final void j(@N com.bumptech.glide.request.i iVar) {
        int i12 = this.f339614c;
        int i13 = this.f339615d;
        if (!com.bumptech.glide.util.m.i(i12, i13)) {
            throw new IllegalArgumentException(androidx.appcompat.app.r.l(i12, i13, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: ", ", either provide dimensions in the constructor or call override()"));
        }
        iVar.c(i12, i13);
    }

    @Override // com.bumptech.glide.request.target.q
    public final void h(@N com.bumptech.glide.request.i iVar) {
    }
}
