package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37169q extends com.google.android.play.core.assetpacks.internal.G {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f358463c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C37028k f358464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E f358465e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37169q(E e12, C37028k c37028k, int i12, C37028k c37028k2) {
        super(c37028k);
        this.f358465e = e12;
        this.f358463c = i12;
        this.f358464d = c37028k2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.G
    public final void a() {
        E e12 = this.f358465e;
        try {
            com.google.android.play.core.assetpacks.internal.w wVar = e12.f358111d.f358371m;
            String str = e12.f358108a;
            int i12 = this.f358463c;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i12);
            wVar.v(str, bundle, E.h(), new A(e12, this.f358464d));
        } catch (RemoteException e13) {
            E.f358106g.c(e13, "notifySessionFailed", new Object[0]);
        }
    }
}
