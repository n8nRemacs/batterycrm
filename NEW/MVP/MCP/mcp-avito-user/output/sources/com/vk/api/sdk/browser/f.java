package com.vk.api.sdk.browser;

import j.P;

/* compiled from: VersionRange.java */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f366536a;

    public f(@P e eVar) {
        this.f366536a = eVar;
    }

    public final String toString() {
        e eVar = this.f366536a;
        if (eVar == null) {
            return "any version";
        }
        return eVar.toString() + " or higher";
    }
}
