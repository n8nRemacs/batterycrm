package io.ktor.util;

import java.util.Locale;
import kotlin.Metadata;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/util/w;", "", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.util.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41615w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f400552a;

    /* renamed from: b, reason: collision with root package name */
    public final int f400553b;

    public C41615w(@Y61.k String str) {
        this.f400552a = str;
        this.f400553b = str.toLowerCase(Locale.ROOT).hashCode();
    }

    public final boolean equals(@Y61.l Object obj) {
        String str;
        C41615w c41615w = obj instanceof C41615w ? (C41615w) obj : null;
        return (c41615w == null || (str = c41615w.f400552a) == null || !str.equalsIgnoreCase(this.f400552a)) ? false : true;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getF400553b() {
        return this.f400553b;
    }

    @Y61.k
    /* renamed from: toString, reason: from getter */
    public final String getF400552a() {
        return this.f400552a;
    }
}
