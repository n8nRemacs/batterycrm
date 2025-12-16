package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.C36616a.d;
import com.google.android.gms.common.internal.C36727t;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36628c<O extends C36616a.d> {

    /* renamed from: a, reason: collision with root package name */
    public final int f349099a;

    /* renamed from: b, reason: collision with root package name */
    public final C36616a f349100b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final C36616a.d f349101c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final String f349102d;

    public C36628c(C36616a c36616a, @j.P C36616a.d dVar, @j.P String str) {
        this.f349100b = c36616a;
        this.f349101c = dVar;
        this.f349102d = str;
        this.f349099a = Arrays.hashCode(new Object[]{c36616a, dVar, str});
    }

    public final boolean equals(@j.P Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C36628c)) {
            return false;
        }
        C36628c c36628c = (C36628c) obj;
        return C36727t.a(this.f349100b, c36628c.f349100b) && C36727t.a(this.f349101c, c36628c.f349101c) && C36727t.a(this.f349102d, c36628c.f349102d);
    }

    public final int hashCode() {
        return this.f349099a;
    }
}
