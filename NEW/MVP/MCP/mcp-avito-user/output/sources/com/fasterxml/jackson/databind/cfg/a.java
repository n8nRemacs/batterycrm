package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.introspect.t;
import com.fasterxml.jackson.databind.introspect.y;
import com.fasterxml.jackson.databind.introspect.z;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: BaseSettings.java */
/* loaded from: classes4.dex */
public final class a implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final TimeZone f341473j = TimeZone.getTimeZone("UTC");
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.type.n f341474b;

    /* renamed from: c, reason: collision with root package name */
    public final t f341475c;

    /* renamed from: d, reason: collision with root package name */
    public final z f341476d;

    /* renamed from: e, reason: collision with root package name */
    public final y.c f341477e;

    /* renamed from: f, reason: collision with root package name */
    public final PolymorphicTypeValidator f341478f;

    /* renamed from: g, reason: collision with root package name */
    public final DateFormat f341479g;

    /* renamed from: h, reason: collision with root package name */
    public final Locale f341480h;

    /* renamed from: i, reason: collision with root package name */
    public final Base64Variant f341481i;

    public a(t tVar, z zVar, com.fasterxml.jackson.databind.type.n nVar, DateFormat dateFormat, Locale locale, Base64Variant base64Variant, PolymorphicTypeValidator polymorphicTypeValidator, y.c cVar) {
        this.f341475c = tVar;
        this.f341476d = zVar;
        this.f341474b = nVar;
        this.f341479g = dateFormat;
        this.f341480h = locale;
        this.f341481i = base64Variant;
        this.f341478f = polymorphicTypeValidator;
        this.f341477e = cVar;
    }
}
