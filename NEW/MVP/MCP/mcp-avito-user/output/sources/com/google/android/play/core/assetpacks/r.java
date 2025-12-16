package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class r extends com.google.android.play.core.assetpacks.internal.G {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f358476c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f358477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f358478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f358479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C37028k f358480g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ E f358481h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(E e12, C37028k c37028k, int i12, String str, String str2, int i13, C37028k c37028k2) {
        super(c37028k);
        this.f358481h = e12;
        this.f358476c = i12;
        this.f358477d = str;
        this.f358478e = str2;
        this.f358479f = i13;
        this.f358480g = c37028k2;
    }

    @Override // com.google.android.play.core.assetpacks.internal.G
    public final void a() {
        C37028k c37028k = this.f358480g;
        int i12 = this.f358479f;
        String str = this.f358478e;
        String str2 = this.f358477d;
        int i13 = this.f358476c;
        E e12 = this.f358481h;
        try {
            com.google.android.play.core.assetpacks.internal.w wVar = e12.f358111d.f358371m;
            String str3 = e12.f358108a;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i13);
            bundle.putString("module_name", str2);
            bundle.putString("slice_id", str);
            bundle.putInt("chunk_number", i12);
            wVar.P(str3, bundle, E.h(), new BinderC37183v(e12, c37028k));
        } catch (RemoteException e13) {
            E.f358106g.b("getChunkFileDescriptor(%s, %s, %d, session=%d)", str2, str, Integer.valueOf(i12), Integer.valueOf(i13));
            c37028k.c(new RuntimeException(e13));
        }
    }
}
