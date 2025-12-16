package org.hamcrest.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: DescribedAs.java */
/* loaded from: classes7.dex */
public class d<T> extends org.hamcrest.b<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f420413a = Pattern.compile("%([0-9]+)");

    @Override // org.hamcrest.m
    public final void a(org.hamcrest.a aVar) {
        Matcher matcher = f420413a.matcher(null);
        if (!matcher.find()) {
            throw null;
        }
        matcher.start();
        throw null;
    }
}
