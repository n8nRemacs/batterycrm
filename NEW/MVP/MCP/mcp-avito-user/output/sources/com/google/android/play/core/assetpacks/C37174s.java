package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37174s extends com.google.android.play.core.assetpacks.internal.G {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37028k f358488c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f358489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37174s(E e12, C37028k c37028k, C37028k c37028k2) {
        super(c37028k);
        this.f358489d = e12;
        this.f358488c = c37028k2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.G
    public final void a() {
        E e12 = this.f358489d;
        try {
            e12.f358112e.f358371m.b3(e12.f358108a, E.h(), new BinderC37189x(e12, this.f358488c));
        } catch (RemoteException e13) {
            E.f358106g.c(e13, "keepAlive", new Object[0]);
        }
    }
}
