package com.avito.android.util;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import kotlin.Metadata;

/* compiled from: GooglePlayServicesInfo.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/pm/PackageInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class J1 extends kotlin.jvm.internal.N implements Y41.a<PackageInfo> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K1 f318634l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(K1 k12) {
        super(0);
        this.f318634l = k12;
    }

    @Override // Y41.a
    public final PackageInfo invoke() {
        try {
            return this.f318634l.f318639a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
