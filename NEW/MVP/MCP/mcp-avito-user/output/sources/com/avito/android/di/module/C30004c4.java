package com.avito.android.di.module;

import com.avito.android.lib.util.darkTheme.b;
import kotlin.Metadata;

/* compiled from: DarkThemeModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/di/module/c4;", "Lcom/avito/android/lib/util/darkTheme/b$b;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.c4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30004c4 implements b.InterfaceC5330b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AK0.l f144246a;

    public C30004c4(AK0.l lVar) {
        this.f144246a = lVar;
    }

    @Override // com.avito.android.lib.util.darkTheme.b.InterfaceC5330b
    public final void a(int i12) {
        this.f144246a.a(i12, "com.avito.android.lib.design.DarkThemeState");
    }

    @Override // com.avito.android.lib.util.darkTheme.b.InterfaceC5330b
    public final int get(int i12) {
        return this.f144246a.getInt("com.avito.android.lib.design.DarkThemeState", i12);
    }
}
