package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37128i extends com.google.android.play.core.assetpacks.internal.G {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f358331c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C37028k f358332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E f358333e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37128i(E e12, C37028k c37028k, String str, C37028k c37028k2) {
        super(c37028k);
        this.f358333e = e12;
        this.f358331c = str;
        this.f358332d = c37028k2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.G
    public final void a() {
        String str = this.f358331c;
        E e12 = this.f358333e;
        try {
            com.google.android.play.core.assetpacks.internal.w wVar = e12.f358111d.f358371m;
            String str2 = e12.f358108a;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", 0);
            bundle.putString("module_name", str);
            wVar.z(str2, bundle, E.h(), new B(e12, this.f358332d));
        } catch (RemoteException e13) {
            E.f358106g.c(e13, "removePack(%s)", str);
        }
    }
}
