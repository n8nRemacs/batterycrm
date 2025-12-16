package com.yandex.metrica.ecommerce;

import j.N;
import j.P;

/* loaded from: classes7.dex */
public class ECommerceReferrer {

    /* renamed from: a, reason: collision with root package name */
    @P
    public String f377682a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public String f377683b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public ECommerceScreen f377684c;

    @P
    public String getIdentifier() {
        return this.f377683b;
    }

    @P
    public ECommerceScreen getScreen() {
        return this.f377684c;
    }

    @P
    public String getType() {
        return this.f377682a;
    }

    @N
    public ECommerceReferrer setIdentifier(@P String str) {
        this.f377683b = str;
        return this;
    }

    @N
    public ECommerceReferrer setScreen(@P ECommerceScreen eCommerceScreen) {
        this.f377684c = eCommerceScreen;
        return this;
    }

    @N
    public ECommerceReferrer setType(@P String str) {
        this.f377682a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f377682a + "', identifier='" + this.f377683b + "', screen=" + this.f377684c + '}';
    }
}
