package com.geetest.captcha;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<z> f342803a = new ArrayList<>();

    public final void a(@Y61.l z zVar) {
        if (zVar == null) {
            throw new IllegalArgumentException("The observer is null.");
        }
        synchronized (this.f342803a) {
            if (this.f342803a.contains(zVar)) {
                throw new IllegalStateException(("Observer " + zVar + " is already registered.").toString());
            }
            this.f342803a.add(zVar);
        }
    }

    public final void a(@Y61.k String str, @Y61.k String str2, @Y61.k JSONObject jSONObject) {
        Iterator<z> it = this.f342803a.iterator();
        while (it.hasNext()) {
            it.next().a(str, str2, jSONObject);
        }
    }

    public final void a(boolean z12, @Y61.k String str) {
        Iterator<z> it = this.f342803a.iterator();
        while (it.hasNext()) {
            it.next().a(z12, str);
        }
    }
}
