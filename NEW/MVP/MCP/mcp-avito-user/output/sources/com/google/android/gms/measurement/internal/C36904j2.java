package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36904j2 {

    /* renamed from: a, reason: collision with root package name */
    @XY0.e
    public final String f355210a;

    /* renamed from: b, reason: collision with root package name */
    public final String f355211b;

    /* renamed from: c, reason: collision with root package name */
    public final String f355212c;

    /* renamed from: d, reason: collision with root package name */
    public final long f355213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C36876f2 f355214e;

    public C36904j2(C36876f2 c36876f2, String str, long j12, C36925m2 c36925m2) {
        this.f355214e = c36876f2;
        C36729v.f(str);
        C36729v.b(j12 > 0);
        this.f355210a = str + ":start";
        this.f355211b = androidx.appcompat.app.r.q(str, ":count");
        this.f355212c = androidx.appcompat.app.r.q(str, ":value");
        this.f355213d = j12;
    }

    @j.l0
    public final void a() {
        C36876f2 c36876f2 = this.f355214e;
        c36876f2.e();
        c36876f2.f355183a.f354722n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = c36876f2.m().edit();
        editorEdit.remove(this.f355211b);
        editorEdit.remove(this.f355212c);
        editorEdit.putLong(this.f355210a, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
