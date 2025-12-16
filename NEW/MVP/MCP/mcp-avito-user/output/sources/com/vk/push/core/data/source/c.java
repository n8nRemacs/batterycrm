package com.vk.push.core.data.source;

import Y61.k;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: ManifestDataSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/push/core/data/source/c;", "", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PackageManager f367023a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f367024b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f367025c = C42727D.c(new b());

    /* compiled from: ManifestDataSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/vk/push/core/data/source/c$a;", "", "<init>", "()V", "", "DEFAULT_ICON_KEY", "Ljava/lang/String;", "DEFAULT_NOTIFICATION_COLOR_KEY", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ManifestDataSource.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Bundle> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Bundle invoke() {
            Object bVar;
            c cVar = c.this;
            PackageManager packageManager = cVar.f367023a;
            try {
                int i12 = Z.f406624c;
                bVar = packageManager.getApplicationInfo(cVar.f367024b, 128);
            } catch (Throwable th2) {
                int i13 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            if (bVar instanceof Z.b) {
                bVar = null;
            }
            ApplicationInfo applicationInfo = (ApplicationInfo) bVar;
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            return null;
        }
    }

    static {
        new a(null);
    }

    public c(@k PackageManager packageManager, @k String str) {
        this.f367023a = packageManager;
        this.f367024b = str;
    }
}
