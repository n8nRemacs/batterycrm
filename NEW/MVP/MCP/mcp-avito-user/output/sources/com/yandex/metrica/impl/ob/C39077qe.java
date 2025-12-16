package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.yandex.metrica.impl.ob.C39026oc;
import com.yandex.metrica.impl.ob.E;

/* renamed from: com.yandex.metrica.impl.ob.qe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39077qe {

    /* renamed from: A, reason: collision with root package name */
    @j.P
    public final byte[] f381468A;

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final String f381469a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public String f381470b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final Integer f381471c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final Integer f381472d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final Integer f381473e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public final Long f381474f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public final String f381475g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public final String f381476h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public final String f381477i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public final EnumC38666a1 f381478j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public final Integer f381479k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public final String f381480l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public final String f381481m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    public final Integer f381482n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    public final Integer f381483o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    public final String f381484p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    public final String f381485q;

    /* renamed from: r, reason: collision with root package name */
    @j.N
    public final Em f381486r;

    /* renamed from: s, reason: collision with root package name */
    @j.P
    public final D0 f381487s;

    /* renamed from: t, reason: collision with root package name */
    @j.P
    public final E.b.a f381488t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    public final C39026oc.a f381489u;

    /* renamed from: v, reason: collision with root package name */
    @j.P
    public final Integer f381490v;

    /* renamed from: w, reason: collision with root package name */
    @j.P
    public final Integer f381491w;

    /* renamed from: x, reason: collision with root package name */
    @j.P
    public final EnumC39254y0 f381492x;

    /* renamed from: y, reason: collision with root package name */
    @j.P
    public final Boolean f381493y;

    /* renamed from: z, reason: collision with root package name */
    @j.P
    public final Integer f381494z;

    public C39077qe(@j.N ContentValues contentValues) {
        Integer asInteger = contentValues.getAsInteger("type");
        this.f381478j = asInteger == null ? null : EnumC38666a1.a(asInteger.intValue());
        this.f381479k = contentValues.getAsInteger("custom_type");
        this.f381469a = contentValues.getAsString("name");
        this.f381470b = contentValues.getAsString("value");
        this.f381474f = contentValues.getAsLong(CrashHianalyticsData.TIME);
        this.f381471c = contentValues.getAsInteger("number");
        this.f381472d = contentValues.getAsInteger("global_number");
        this.f381473e = contentValues.getAsInteger("number_of_type");
        this.f381476h = contentValues.getAsString("cell_info");
        this.f381475g = contentValues.getAsString("location_info");
        this.f381477i = contentValues.getAsString("wifi_network_info");
        this.f381480l = contentValues.getAsString("error_environment");
        this.f381481m = contentValues.getAsString("user_info");
        this.f381482n = contentValues.getAsInteger("truncated");
        this.f381483o = contentValues.getAsInteger("connection_type");
        this.f381484p = contentValues.getAsString("cellular_connection_type");
        this.f381485q = contentValues.getAsString("profile_id");
        this.f381486r = Em.a(contentValues.getAsInteger("encrypting_mode"));
        this.f381487s = D0.a(contentValues.getAsInteger("first_occurrence_status"));
        this.f381488t = E.b.a.a(contentValues.getAsInteger("battery_charge_type"));
        this.f381489u = C39026oc.a.a(contentValues.getAsString("collection_mode"));
        this.f381490v = contentValues.getAsInteger("has_omitted_data");
        this.f381491w = contentValues.getAsInteger("call_state");
        Integer asInteger2 = contentValues.getAsInteger(SearchParamsConverterKt.SOURCE);
        this.f381492x = asInteger2 != null ? EnumC39254y0.a(asInteger2.intValue()) : null;
        this.f381493y = contentValues.getAsBoolean("attribution_id_changed");
        this.f381494z = contentValues.getAsInteger("open_id");
        this.f381468A = contentValues.getAsByteArray("extras");
    }
}
