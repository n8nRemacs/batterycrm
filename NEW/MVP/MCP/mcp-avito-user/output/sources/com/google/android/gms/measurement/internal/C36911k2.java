package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.k2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36911k2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f355235a;

    /* renamed from: b, reason: collision with root package name */
    public final long f355236b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f355237c;

    /* renamed from: d, reason: collision with root package name */
    public long f355238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C36876f2 f355239e;

    public C36911k2(C36876f2 c36876f2, String str, long j12) {
        this.f355239e = c36876f2;
        C36729v.f(str);
        this.f355235a = str;
        this.f355236b = j12;
    }

    @j.l0
    public final long a() {
        if (!this.f355237c) {
            this.f355237c = true;
            this.f355238d = this.f355239e.m().getLong(this.f355235a, this.f355236b);
        }
        return this.f355238d;
    }

    @j.l0
    public final void b(long j12) {
        SharedPreferences.Editor editorEdit = this.f355239e.m().edit();
        editorEdit.putLong(this.f355235a, j12);
        editorEdit.apply();
        this.f355238d = j12;
    }
}
