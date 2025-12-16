package ru.rustore.sdk.pushclient.provider;

import T11.f;
import Y61.k;
import ab1.l;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import bb1.u;
import bb1.v;
import cb1.C27165d;
import cb1.C27169h;
import cb1.q;
import com.vk.push.core.data.source.c;
import db1.g;
import db1.h;
import e21.C39933c;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/rustore/sdk/pushclient/provider/RuStorePushClientInitProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "a", "sdk-public-push-client_release"}, k = 1, mv = {1, 7, 0})
/* loaded from: classes9.dex */
public final class RuStorePushClientInitProvider extends ContentProvider {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f436853b = C42727D.c(new b());

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/rustore/sdk/pushclient/provider/RuStorePushClientInitProvider$a;", "", "<init>", "()V", "", "EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY", "Ljava/lang/String;", "sdk-public-push-client_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldb1/g;", "invoke", "()Ldb1/g;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class b extends N implements Y41.a<g> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final g invoke() {
            Context context = RuStorePushClientInitProvider.this.getContext();
            Application application = (Application) (context != null ? context.getApplicationContext() : null);
            if (application == null) {
                throw new IllegalStateException("applicationContext must be not null");
            }
            Ua1.a aVar = new Ua1.a("RuStorePushClient");
            C27169h c27169h = C27169h.f57985a;
            PackageManager packageManager = application.getPackageManager();
            String packageName = application.getPackageName();
            c27169h.getClass();
            C39933c c39933c = new C39933c(new c(packageManager, packageName));
            l lVar = new l(new u(application, Pa1.c.f13143a), new v(application, aVar));
            f fVar = q.f58032a;
            jb1.f fVar2 = new jb1.f(c39933c, lVar, aVar);
            f fVar3 = C27165d.f57977a;
            return new h(fVar2, aVar);
        }
    }

    static {
        new a(null);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(@k Context context, @k ProviderInfo providerInfo) {
        if ("ru.rustore.sdk.pushclient.rustorepushclientinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(@k Uri uri, @Y61.l String str, @Y61.l String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Y61.l
    public final String getType(@k Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Y61.l
    public final Uri insert(@k Uri uri, @Y61.l ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if ((context != null ? context.getApplicationContext() : null) == null) {
            return false;
        }
        ((g) this.f436853b.getValue()).a();
        return false;
    }

    @Override // android.content.ContentProvider
    @Y61.l
    public final Cursor query(@k Uri uri, @Y61.l String[] strArr, @Y61.l String str, @Y61.l String[] strArr2, @Y61.l String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@k Uri uri, @Y61.l ContentValues contentValues, @Y61.l String str, @Y61.l String[] strArr) {
        return 0;
    }
}
