package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ni;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class l61 {

    /* renamed from: a, reason: collision with root package name */
    private final ni f387396a;

    /* renamed from: b, reason: collision with root package name */
    private final b f387397b;

    public static abstract class a extends AbstractC39321f<String> {

        /* renamed from: c, reason: collision with root package name */
        final CharSequence f387398c;

        /* renamed from: d, reason: collision with root package name */
        final ni f387399d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f387400e;

        /* renamed from: f, reason: collision with root package name */
        int f387401f = 0;

        /* renamed from: g, reason: collision with root package name */
        int f387402g;

        public a(l61 l61Var, CharSequence charSequence) {
            this.f387399d = l61Var.f387396a;
            this.f387400e = l61.b(l61Var);
            this.f387402g = l61.c(l61Var);
            this.f387398c = charSequence;
        }
    }

    public interface b {
    }

    private l61(k61 k61Var, ni niVar) {
        this.f387397b = k61Var;
        this.f387396a = niVar;
    }

    public static /* synthetic */ boolean b(l61 l61Var) {
        l61Var.getClass();
        return false;
    }

    public static /* synthetic */ int c(l61 l61Var) {
        l61Var.getClass();
        return Integer.MAX_VALUE;
    }

    public static l61 a(char c12) {
        return new l61(new k61(new ni.b(c12)), ni.d.f388304b);
    }

    public final List<String> a(CharSequence charSequence) {
        charSequence.getClass();
        k61 k61Var = (k61) this.f387397b;
        k61Var.getClass();
        j61 j61Var = new j61(k61Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (j61Var.hasNext()) {
            arrayList.add(j61Var.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
