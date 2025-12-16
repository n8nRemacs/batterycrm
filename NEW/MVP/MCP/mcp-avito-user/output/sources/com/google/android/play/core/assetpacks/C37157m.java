package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.C37028k;
import java.util.HashMap;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37157m extends com.google.android.play.core.assetpacks.internal.G {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashMap f358406c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C37028k f358407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E f358408e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37157m(E e12, C37028k c37028k, HashMap map, C37028k c37028k2) {
        super(c37028k);
        this.f358408e = e12;
        this.f358406c = map;
        this.f358407d = c37028k2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.G
    public final void a() {
        C37028k c37028k = this.f358407d;
        E e12 = this.f358408e;
        try {
            e12.f358111d.f358371m.f3(e12.f358108a, E.k(this.f358406c), new BinderC37186w(e12, c37028k));
        } catch (RemoteException e13) {
            E.f358106g.c(e13, "syncPacks", new Object[0]);
            c37028k.c(new RuntimeException(e13));
        }
    }
}
