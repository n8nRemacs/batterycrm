package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.gms.tasks.C37028k;
import java.util.List;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37154l extends com.google.android.play.core.assetpacks.internal.G {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f358397c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C37028k f358398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E f358399e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37154l(E e12, C37028k c37028k, List list, C37028k c37028k2) {
        super(c37028k);
        this.f358399e = e12;
        this.f358397c = list;
        this.f358398d = c37028k2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.G
    public final void a() {
        E e12 = this.f358399e;
        List list = this.f358397c;
        try {
            e12.f358111d.f358371m.w3(e12.f358108a, E.l(list), E.h(), new BinderC37180u(e12, this.f358398d));
        } catch (RemoteException e13) {
            E.f358106g.c(e13, "cancelDownloads(%s)", list);
        }
    }
}
