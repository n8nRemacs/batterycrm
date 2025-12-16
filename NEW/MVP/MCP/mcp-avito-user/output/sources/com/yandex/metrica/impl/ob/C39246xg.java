package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.huawei.hms.common.PackageConstants;
import com.yandex.metrica.impl.ob.C38756dg;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C42745f0;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.xg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39246xg {

    /* renamed from: a, reason: collision with root package name */
    private final Zl<C38756dg.a, Integer> f382197a;

    /* renamed from: b, reason: collision with root package name */
    private final long f382198b;

    /* renamed from: c, reason: collision with root package name */
    private final String f382199c;

    /* renamed from: d, reason: collision with root package name */
    private final String f382200d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f382201e;

    /* renamed from: f, reason: collision with root package name */
    private final C38987mn f382202f;

    /* renamed from: g, reason: collision with root package name */
    private final M0 f382203g;

    /* renamed from: com.yandex.metrica.impl.ob.xg$a */
    public static final class a<T> implements Comparator<T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b((Comparable) ((kotlin.Q) t12).f406620c, (Comparable) ((kotlin.Q) t13).f406620c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xg$b */
    public static final class b<T> implements Comparator<C38756dg> {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(C38756dg c38756dg, C38756dg c38756dg2) {
            int iSignum = Long.signum(c38756dg.f380377c - c38756dg2.f380377c);
            return iSignum == 0 ? ((Number) C39246xg.this.f382197a.a(c38756dg.f380378d)).intValue() - ((Number) C39246xg.this.f382197a.a(c38756dg2.f380378d)).intValue() : iSignum;
        }
    }

    public C39246xg(@Y61.k Context context, @Y61.k C38987mn c38987mn, @Y61.k M0 m02) {
        this.f382201e = context;
        this.f382202f = c38987mn;
        this.f382203g = m02;
        Zl<C38756dg.a, Integer> zl2 = new Zl<>(0);
        zl2.a(C38756dg.a.HMS, 1);
        zl2.a(C38756dg.a.GP, 2);
        this.f382197a = zl2;
        this.f382198b = TimeUnit.DAYS.toSeconds(1L);
        this.f382199c = "com.android.vending";
        this.f382200d = PackageConstants.SERVICES_PACKAGE_APPMARKET;
    }

    private final JSONObject c(C38756dg c38756dg) {
        return new JSONObject().put(Constants.REFERRER, c38756dg.f380375a).put("install_timestamp_seconds", c38756dg.f380377c).put("click_timestamp_seconds", c38756dg.f380376b).put(SearchParamsConverterKt.SOURCE, c38756dg.f380378d.f380383a);
    }

    public final boolean b(@Y61.l C38756dg c38756dg) {
        String str = c38756dg != null ? c38756dg.f380375a : null;
        return !(str == null || str.length() == 0);
    }

    public final boolean a(@Y61.l C38756dg c38756dg) {
        String strA;
        if (c38756dg == null) {
            return false;
        }
        C38987mn c38987mn = this.f382202f;
        Context context = this.f382201e;
        String packageName = context.getPackageName();
        c38987mn.getClass();
        try {
            PackageManager packageManager = context.getPackageManager();
            strA = A2.a(30) ? C39012nn.a(packageManager, packageName) : packageManager.getInstallerPackageName(packageName);
        } catch (Throwable unused) {
            strA = null;
        }
        int iOrdinal = c38756dg.f380378d.ordinal();
        if (iOrdinal == 1) {
            return kotlin.jvm.internal.L.f(this.f382199c, strA);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f382200d, strA);
    }

    public /* synthetic */ C39246xg(Context context, C38987mn c38987mn, M0 m02, int i12) {
        this(context, (i12 & 2) != 0 ? new C38987mn() : null, (i12 & 4) != 0 ? C39031oh.a() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public final C38756dg a(@Y61.k List<C38756dg> list) {
        C38756dg c38756dg = null;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        C38987mn c38987mn = this.f382202f;
        Context context = this.f382201e;
        PackageInfo packageInfoB = c38987mn.b(context, context.getPackageName(), 0);
        if (packageInfoB != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfoB.firstInstallTime);
            a aVar = new a();
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                C38756dg c38756dg2 = (C38756dg) it.next();
                kotlin.Q q12 = new kotlin.Q(c38756dg2, Long.valueOf(Math.abs(c38756dg2.f380377c - seconds)));
                while (it.hasNext()) {
                    C38756dg c38756dg3 = (C38756dg) it.next();
                    kotlin.Q q13 = new kotlin.Q(c38756dg3, Long.valueOf(Math.abs(c38756dg3.f380377c - seconds)));
                    if (aVar.compare(q12, q13) > 0) {
                        q12 = q13;
                    }
                }
                C38756dg c38756dg4 = (C38756dg) q12.f406619b;
                if (((Number) q12.f406620c).longValue() < this.f382198b) {
                    c38756dg = c38756dg4;
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        if (c38756dg == null) {
            b bVar = new b();
            Iterator<T> it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            C38756dg c38756dg5 = (C38756dg) it2.next();
            while (it2.hasNext()) {
                C38756dg c38756dg6 = (C38756dg) it2.next();
                if (bVar.compare(c38756dg5, c38756dg6) < 0) {
                    c38756dg5 = c38756dg6;
                }
            }
            c38756dg = c38756dg5;
        }
        this.f382203g.reportEvent("several_filled_referrers", a(list, c38756dg, packageInfoB).toString());
        return c38756dg;
    }

    private final JSONObject a(List<C38756dg> list, C38756dg c38756dg, PackageInfo packageInfo) {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c((C38756dg) it.next()));
        }
        return jSONObject.put("candidates", Tl.b((List<?>) arrayList)).put("chosen", c(c38756dg)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null);
    }
}
