package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.i2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36897i2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f355190a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f355191b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f355192c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f355193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C36876f2 f355194e;

    public C36897i2(C36876f2 c36876f2, String str, boolean z12) {
        this.f355194e = c36876f2;
        C36729v.f(str);
        this.f355190a = str;
        this.f355191b = z12;
    }

    @j.l0
    public final void a(boolean z12) {
        SharedPreferences.Editor editorEdit = this.f355194e.m().edit();
        editorEdit.putBoolean(this.f355190a, z12);
        editorEdit.apply();
        this.f355193d = z12;
    }

    @j.l0
    public final boolean b() {
        if (!this.f355192c) {
            this.f355192c = true;
            this.f355193d = this.f355194e.m().getBoolean(this.f355190a, this.f355191b);
        }
        return this.f355193d;
    }
}
