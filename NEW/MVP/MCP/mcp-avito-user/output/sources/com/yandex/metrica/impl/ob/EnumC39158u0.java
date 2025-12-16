package com.yandex.metrica.impl.ob;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.jvm.internal.C42822w;

/* renamed from: com.yandex.metrica.impl.ob.u0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC39158u0 {
    UNDEFINED("UNDEFINED"),
    APP(GrsBaseInfo.CountryCodeSource.APP),
    SATELLITE("SATELLITE"),
    RETAIL("RETAIL");


    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f381917g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f381918a;

    /* renamed from: com.yandex.metrica.impl.ob.u0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    EnumC39158u0(String str) {
        this.f381918a = str;
    }

    @Y61.k
    public final String a() {
        return this.f381918a;
    }
}
