package com.yandex.metrica.impl.ob;

import android.util.Pair;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.bi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38708bi {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final String f380219a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f380220b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final String f380221c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final List<Pair<String, String>> f380222d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final Long f380223e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final List<a> f380224f;

    /* renamed from: com.yandex.metrica.impl.ob.bi$a */
    public enum a {
        WIFI,
        CELL
    }

    public C38708bi(@j.P String str, @j.P String str2, @j.P String str3, @j.N List<Pair<String, String>> list, @j.P Long l12, @j.N List<a> list2) {
        this.f380219a = str;
        this.f380220b = str2;
        this.f380221c = str3;
        this.f380222d = A2.c(list);
        this.f380223e = l12;
        this.f380224f = list2;
    }
}
