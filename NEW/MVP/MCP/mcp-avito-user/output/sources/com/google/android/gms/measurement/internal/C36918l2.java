package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.l2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36918l2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f355252a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f355253b;

    /* renamed from: c, reason: collision with root package name */
    public String f355254c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36876f2 f355255d;

    public C36918l2(C36876f2 c36876f2, String str) {
        this.f355255d = c36876f2;
        C36729v.f(str);
        this.f355252a = str;
    }

    @j.l0
    public final String a() {
        if (!this.f355253b) {
            this.f355253b = true;
            this.f355254c = this.f355255d.m().getString(this.f355252a, null);
        }
        return this.f355254c;
    }

    @j.l0
    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f355255d.m().edit();
        editorEdit.putString(this.f355252a, str);
        editorEdit.apply();
        this.f355254c = str;
    }
}
