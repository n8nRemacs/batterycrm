package E31;

import O41.e;
import android.content.SharedPreferences;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f3720a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f3721b;

    /* renamed from: c, reason: collision with root package name */
    public final Q51.b f3722c;

    /* renamed from: d, reason: collision with root package name */
    public final F41.a f3723d;

    /* renamed from: e, reason: collision with root package name */
    public String f3724e = "";

    public d(e eVar, O41.b bVar, SharedPreferences sharedPreferences, Q51.b bVar2, F41.a aVar) {
        this.f3720a = eVar;
        this.f3721b = sharedPreferences;
        this.f3722c = bVar2;
        this.f3723d = aVar;
        ((z31.c) bVar2).f443832b.put("SessionIDInteractor", new b(this));
        ((t31.c) aVar).b(new a(this));
    }
}
