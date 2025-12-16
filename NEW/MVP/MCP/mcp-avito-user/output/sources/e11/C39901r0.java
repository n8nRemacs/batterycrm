package e11;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e11.r0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39901r0 {

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public String f394770g;

    /* renamed from: i, reason: collision with root package name */
    public int f394772i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    public volatile String f394773j;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final f11.c f394764a = new f11.c();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final Map<String, com.my.target.mediation.b> f394765b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c, reason: collision with root package name */
    public final long f394766c = 86400000;

    /* renamed from: d, reason: collision with root package name */
    public boolean f394767d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f394768e = true;

    /* renamed from: f, reason: collision with root package name */
    public final int f394769f = 360;

    /* renamed from: h, reason: collision with root package name */
    public int f394771h = 0;

    public C39901r0(int i12, @j.N String str) {
        this.f394772i = i12;
        this.f394773j = str;
    }

    @j.P
    public final com.my.target.mediation.b a(@j.N String str) {
        return this.f394765b.get(str.toLowerCase());
    }
}
