package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.DefaultNetworkResponseHandler;
import com.yandex.metrica.networktasks.api.ExponentialBackoffDataHolder;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.NetworkTask;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C42784z0;

/* renamed from: com.yandex.metrica.impl.ob.rd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39099rd {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C39099rd f381739c = new C39099rd();

    /* renamed from: a, reason: collision with root package name */
    private static final Map<EnumC39076qd, ExponentialBackoffDataHolder> f381737a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final String f381738b = Y21.a.a("com.yandex.mobile.metrica.sdk");

    private C39099rd() {
    }

    private final synchronized ExponentialBackoffDataHolder a(EnumC39076qd enumC39076qd) {
        ExponentialBackoffDataHolder exponentialBackoffDataHolder;
        try {
            Map<EnumC39076qd, ExponentialBackoffDataHolder> map = f381737a;
            exponentialBackoffDataHolder = map.get(enumC39076qd);
            if (exponentialBackoffDataHolder == null) {
                exponentialBackoffDataHolder = new ExponentialBackoffDataHolder(new C39052pd(F0.g().s(), enumC39076qd));
                map.put(enumC39076qd, exponentialBackoffDataHolder);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return exponentialBackoffDataHolder;
    }

    @X41.n
    @Y61.k
    public static final NetworkTask a(@Y61.k Context context, @Y61.k ConfigProvider configProvider, @Y61.k C38715c0 c38715c0, @Y61.k E4 e42, @Y61.k C38698b8 c38698b8) {
        return new NetworkTask(new Gm(), new C39027od(context), new C38952ld(f381739c.a(EnumC39076qd.DIAGNOSTIC)), new B4(configProvider, c38715c0, e42, c38698b8, new DefaultNetworkResponseHandler(), new RequestDataHolder(), new ResponseDataHolder(new C39002nd()), new FullUrlFormer(new Og(), configProvider)), Collections.singletonList(A2.a()), f381738b);
    }

    @X41.n
    @Y61.k
    public static final NetworkTask a(@Y61.k Context context, @Y61.k C38828gd c38828gd, @Y61.k C39112s2 c39112s2, @Y61.k Fc fc2) {
        C39300zm c39300zm = new C39300zm();
        Pg pg2 = new Pg(c39300zm);
        C0 c02 = new C0(c38828gd);
        return new NetworkTask(new Gm(), new C39027od(context), new C38952ld(f381739c.a(EnumC39076qd.LOCATION)), new C38728cd(context, c39112s2, fc2, pg2, c02, new RequestDataHolder(), new ResponseDataHolder(new C39002nd()), new FullUrlFormer(pg2, c02), c39300zm), Collections.singletonList(A2.a()), f381738b);
    }

    @X41.n
    @Y61.k
    public static final NetworkTask a(@Y61.k L3 l32) {
        C39300zm c39300zm = new C39300zm();
        Qg qg2 = new Qg(c39300zm);
        C38741d1 c38741d1 = new C38741d1(l32);
        return new NetworkTask(new Gm(), new C39027od(l32.g()), new C38952ld(f381739c.a(EnumC39076qd.REPORT)), new P1(l32, qg2, c38741d1, new FullUrlFormer(qg2, c38741d1), new RequestDataHolder(), new ResponseDataHolder(new C39002nd()), c39300zm), Collections.singletonList(A2.a()), f381738b);
    }

    @X41.n
    @Y61.k
    public static final NetworkTask a(@Y61.k C39104ri c39104ri, @Y61.k Mg mg2) {
        Rg rg2 = new Rg(new Kg(), F0.g().j());
        C0 c02 = new C0(mg2);
        return new NetworkTask(new Qm(), new C39027od(c39104ri.b()), new C38952ld(f381739c.a(EnumC39076qd.STARTUP)), new C39065q2(c39104ri, new FullUrlFormer(rg2, c02), new RequestDataHolder(), new ResponseDataHolder(new C39002nd()), c02), C42784z0.f406748b, f381738b);
    }
}
