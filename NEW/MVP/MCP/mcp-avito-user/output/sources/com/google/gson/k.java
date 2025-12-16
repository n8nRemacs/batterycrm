package com.google.gson;

import com.google.gson.internal.x;
import java.util.Map;

/* compiled from: JsonObject.java */
/* loaded from: classes6.dex */
public final class k extends i {

    /* renamed from: b, reason: collision with root package name */
    public final x<String, i> f362194b = new x<>();

    @Override // com.google.gson.i
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final k b() {
        k kVar = new k();
        for (Map.Entry<String, i> entry : this.f362194b.entrySet()) {
            kVar.t(entry.getKey(), entry.getValue().b());
        }
        return kVar;
    }

    public final i D(String str) {
        return this.f362194b.get(str);
    }

    public final f E(String str) {
        return (f) this.f362194b.get(str);
    }

    public final k I(String str) {
        return (k) this.f362194b.get(str);
    }

    public final i K(String str) {
        return this.f362194b.remove(str);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof k) && ((k) obj).f362194b.equals(this.f362194b));
    }

    public final int hashCode() {
        return this.f362194b.hashCode();
    }

    public final void t(String str, i iVar) {
        if (iVar == null) {
            iVar = j.f362193b;
        }
        this.f362194b.put(str, iVar);
    }

    public final void v(Boolean bool, String str) {
        t(str, bool == null ? j.f362193b : new m(bool));
    }

    public final void w(Number number, String str) {
        t(str, number == null ? j.f362193b : new m(number));
    }

    public final void y(String str, String str2) {
        t(str, str2 == null ? j.f362193b : new m(str2));
    }
}
