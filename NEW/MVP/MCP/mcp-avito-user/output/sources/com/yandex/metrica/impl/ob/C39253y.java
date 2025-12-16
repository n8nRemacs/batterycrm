package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.metrica.DoNotInline;
import com.yandex.metrica.impl.ob.C39277z;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/yandex/metrica/impl/ob/y;", "", "Landroid/content/Context;", "context", "Lcom/yandex/metrica/impl/ob/v;", "converter", "Lcom/yandex/metrica/impl/ob/z;", "a", "(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/v;)Lcom/yandex/metrica/impl/ob/z;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, k = 1, mv = {1, 1, 15})
@TargetApi(AvailableCode.APP_IS_BACKGROUND_OR_LOCKED)
@DoNotInline
/* renamed from: com.yandex.metrica.impl.ob.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39253y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C39253y f382211a = new C39253y();

    /* renamed from: com.yandex.metrica.impl.ob.y$a */
    public static final class a<T, R> implements InterfaceC39036om<UsageStatsManager, C39277z.a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C39181v f382212a;

        public a(C39181v c39181v) {
            this.f382212a = c39181v;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39036om
        public C39277z.a a(UsageStatsManager usageStatsManager) {
            C39181v c39181v = this.f382212a;
            int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
            c39181v.getClass();
            if (A2.a(28)) {
                if (A2.a(30) && appStandbyBucket == 45) {
                    return C39277z.a.RESTRICTED;
                }
                if (appStandbyBucket == 10) {
                    return C39277z.a.ACTIVE;
                }
                if (appStandbyBucket == 20) {
                    return C39277z.a.WORKING_SET;
                }
                if (appStandbyBucket == 30) {
                    return C39277z.a.FREQUENT;
                }
                if (appStandbyBucket == 40) {
                    return C39277z.a.RARE;
                }
            }
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.y$b */
    public static final class b<T, R> implements InterfaceC39036om<ActivityManager, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f382213a = new b();

        @Override // com.yandex.metrica.impl.ob.InterfaceC39036om
        public Boolean a(ActivityManager activityManager) {
            return Boolean.valueOf(activityManager.isBackgroundRestricted());
        }
    }

    private C39253y() {
    }

    @X41.n
    @Y61.k
    public static final C39277z a(@Y61.k Context context, @Y61.k C39181v converter) {
        return new C39277z((C39277z.a) A2.a(new a(converter), context, "usagestats", "getting app standby bucket", "usageStatsManager"), (Boolean) A2.a(b.f382213a, context, "activity", "getting is background restricted", "activityManager"));
    }
}
