package com.avito.android.password_tip;

import Y61.k;
import kotlin.Metadata;
import kotlin.text.C43059p;

/* compiled from: PasswordTipExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_tns-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C43059p f213968a = new C43059p("[0-9]");

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C43059p f213969b = new C43059p("[a-zA-Z]");

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C43059p f213970c = new C43059p("[а-яА-Я\\u0401\\u0451]");

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C43059p f213971d = new C43059p("^.{8,}$");

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C43059p f213972e = new C43059p("(?i)^[а-яА-Я\\u0401\\u0451a-z0-9\\Q!@#$%^&*()-_+=;:,./?`|\\~[]{}\"'<>№\\E]*$");

    @k
    public static final b a(@k String str) {
        return new b(f213971d.e(str), f213968a.a(str), f213969b.a(str) && !f213970c.a(str), f213972e.e(str));
    }
}
