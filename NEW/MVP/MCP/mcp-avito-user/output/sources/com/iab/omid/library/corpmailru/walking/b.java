package com.iab.omid.library.corpmailru.walking;

import android.support.annotation.VisibleForTesting;
import com.iab.omid.library.corpmailru.walking.a.b;
import com.iab.omid.library.corpmailru.walking.a.d;
import com.iab.omid.library.corpmailru.walking.a.e;
import com.iab.omid.library.corpmailru.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b implements b.InterfaceC10766b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f364053a;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.corpmailru.walking.a.c f364054b;

    public b(com.iab.omid.library.corpmailru.walking.a.c cVar) {
        this.f364054b = cVar;
    }

    public void a() {
        this.f364054b.b(new d(this));
    }

    @Override // com.iab.omid.library.corpmailru.walking.a.b.InterfaceC10766b
    @VisibleForTesting
    public JSONObject b() {
        return this.f364053a;
    }

    @Override // com.iab.omid.library.corpmailru.walking.a.b.InterfaceC10766b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f364053a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j12) {
        this.f364054b.b(new e(this, hashSet, jSONObject, j12));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j12) {
        this.f364054b.b(new f(this, hashSet, jSONObject, j12));
    }
}
