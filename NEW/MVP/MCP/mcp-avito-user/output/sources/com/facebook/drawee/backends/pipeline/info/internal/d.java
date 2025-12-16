package com.facebook.drawee.backends.pipeline.info.internal;

import DW0.l;
import aX0.C19831b;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: ImagePerfRequestListener.java */
@Nullsafe
/* loaded from: classes.dex */
public class d extends C19831b {

    /* renamed from: a, reason: collision with root package name */
    public final AwakeTimeSinceBootClock f339948a;

    /* renamed from: b, reason: collision with root package name */
    public final l f339949b;

    public d(AwakeTimeSinceBootClock awakeTimeSinceBootClock, l lVar) {
        this.f339948a = awakeTimeSinceBootClock;
        this.f339949b = lVar;
    }

    @Override // aX0.C19831b, aX0.InterfaceC19835f
    public final void d(String str) {
        this.f339948a.now();
        this.f339949b.getClass();
    }

    @Override // aX0.C19831b, aX0.InterfaceC19835f
    public final void e(ImageRequest imageRequest, String str, boolean z12) {
        this.f339948a.now();
        this.f339949b.getClass();
    }

    @Override // aX0.C19831b, aX0.InterfaceC19835f
    public final void i(ImageRequest imageRequest, Object obj, String str, boolean z12) {
        this.f339948a.now();
        l lVar = this.f339949b;
        lVar.getClass();
        lVar.f3231a = obj;
    }

    @Override // aX0.C19831b, aX0.InterfaceC19835f
    public final void k(ImageRequest imageRequest, String str, Throwable th2, boolean z12) {
        this.f339948a.now();
        this.f339949b.getClass();
    }
}
