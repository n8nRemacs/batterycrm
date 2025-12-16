package com.avito.android.util;

import android.app.Application;
import android.content.pm.PackageInfo;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36688g;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: GooglePlayServicesInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/K1;", "Lcom/avito/android/util/I1;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class K1 implements I1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f318639a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C36687f f318640b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f318641c = C42727D.c(new J1(this));

    public K1(@Y61.k Application application, @Y61.k C36687f c36687f) {
        this.f318639a = application;
        this.f318640b = c36687f;
    }

    @Override // com.avito.android.util.I1
    @Y61.l
    public final Integer a() {
        PackageInfo packageInfo = (PackageInfo) this.f318641c.getValue();
        if (packageInfo != null) {
            return Integer.valueOf(packageInfo.versionCode);
        }
        return null;
    }

    @Override // com.avito.android.util.I1
    @Y61.l
    public final String b() {
        PackageInfo packageInfo = (PackageInfo) this.f318641c.getValue();
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return null;
    }

    @Override // com.avito.android.util.I1
    public final int c() {
        return C36687f.f349285c;
    }

    @Override // com.avito.android.util.I1
    public final boolean d() {
        int iC2;
        try {
            iC2 = this.f318640b.c(C36688g.f349288a, this.f318639a);
        } catch (Throwable unused) {
            iC2 = 9;
        }
        return iC2 == 0;
    }
}
