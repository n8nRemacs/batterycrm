package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import java.io.Serializable;

/* compiled from: PropertyMetadata.java */
/* loaded from: classes4.dex */
public class u implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final u f342512i = new u(Boolean.TRUE, null, null, null, null, null, null);

    /* renamed from: j, reason: collision with root package name */
    public static final u f342513j = new u(Boolean.FALSE, null, null, null, null, null, null);

    /* renamed from: k, reason: collision with root package name */
    public static final u f342514k = new u(null, null, null, null, null, null, null);
    private static final long serialVersionUID = -1;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f342515b;

    /* renamed from: c, reason: collision with root package name */
    public final String f342516c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f342517d;

    /* renamed from: e, reason: collision with root package name */
    public final String f342518e;

    /* renamed from: f, reason: collision with root package name */
    public final transient a f342519f;

    /* renamed from: g, reason: collision with root package name */
    public final Nulls f342520g;

    /* renamed from: h, reason: collision with root package name */
    public final Nulls f342521h;

    /* compiled from: PropertyMetadata.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC36471j f342522a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f342523b;

        public a(AbstractC36471j abstractC36471j, boolean z12) {
            this.f342522a = abstractC36471j;
            this.f342523b = z12;
        }
    }

    public u(Boolean bool, String str, Integer num, String str2, a aVar, Nulls nulls, Nulls nulls2) {
        this.f342515b = bool;
        this.f342516c = str;
        this.f342517d = num;
        this.f342518e = (str2 == null || str2.isEmpty()) ? null : str2;
        this.f342519f = aVar;
        this.f342520g = nulls;
        this.f342521h = nulls2;
    }

    public static u a(String str, Integer num, String str2, Boolean bool) {
        return (str == null && num == null && str2 == null) ? bool == null ? f342514k : bool.booleanValue() ? f342512i : f342513j : new u(bool, str, num, str2, null, null, null);
    }

    public final u b(a aVar) {
        return new u(this.f342515b, this.f342516c, this.f342517d, this.f342518e, aVar, this.f342520g, this.f342521h);
    }

    public Object readResolve() {
        if (this.f342516c != null || this.f342517d != null || this.f342518e != null || this.f342519f != null || this.f342520g != null || this.f342521h != null) {
            return this;
        }
        Boolean bool = this.f342515b;
        return bool == null ? f342514k : bool.booleanValue() ? f342512i : f342513j;
    }
}
