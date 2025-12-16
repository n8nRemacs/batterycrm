package com.iab.omid.library.corpmailru.walking.a;

import com.iab.omid.library.corpmailru.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet<String> f364042a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f364043b;

    /* renamed from: c, reason: collision with root package name */
    public final long f364044c;

    public a(b.InterfaceC10766b interfaceC10766b, HashSet<String> hashSet, JSONObject jSONObject, long j12) {
        super(interfaceC10766b);
        this.f364042a = new HashSet<>(hashSet);
        this.f364043b = jSONObject;
        this.f364044c = j12;
    }
}
