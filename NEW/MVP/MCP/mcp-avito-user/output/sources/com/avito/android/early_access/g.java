package com.avito.android.early_access;

import Mx.InterfaceC14538a;
import android.annotation.SuppressLint;
import android.view.ContextThemeWrapper;
import com.avito.android.early_access.EarlyAccessDialog;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: EarlyAccessDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/g;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessDialog f145385E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ContextThemeWrapper contextThemeWrapper, EarlyAccessDialog earlyAccessDialog) {
        super(contextThemeWrapper, 0, 2, null);
        this.f145385E = earlyAccessDialog;
    }

    @Override // androidx.view.r, android.app.Dialog
    @SuppressLint({"MissingSuperCall"})
    @InterfaceC42830m
    public final void onBackPressed() {
        EarlyAccessDialog.a aVar = EarlyAccessDialog.f145055q0;
        this.f145385E.f5().accept(InterfaceC14538a.c.f11107a);
    }
}
