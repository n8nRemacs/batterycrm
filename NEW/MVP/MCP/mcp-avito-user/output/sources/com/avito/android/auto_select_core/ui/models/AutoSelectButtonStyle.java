package com.avito.android.auto_select_core.ui.models;

import com.avito.android.R;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoSelectButtonStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select_core/ui/models/AutoSelectButtonStyle;", "", "_avito_auto-select-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoSelectButtonStyle {

    /* renamed from: c, reason: collision with root package name */
    public static final AutoSelectButtonStyle f96077c;

    /* renamed from: d, reason: collision with root package name */
    public static final AutoSelectButtonStyle f96078d;

    /* renamed from: e, reason: collision with root package name */
    public static final AutoSelectButtonStyle f96079e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AutoSelectButtonStyle[] f96080f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f96081g;

    /* renamed from: b, reason: collision with root package name */
    public final int f96082b;

    static {
        AutoSelectButtonStyle autoSelectButtonStyle = new AutoSelectButtonStyle("PRIMARY", 0, R.attr.buttonPayMedium);
        f96077c = autoSelectButtonStyle;
        AutoSelectButtonStyle autoSelectButtonStyle2 = new AutoSelectButtonStyle("SECONDARY", 1, R.attr.buttonSecondaryMedium);
        f96078d = autoSelectButtonStyle2;
        AutoSelectButtonStyle autoSelectButtonStyle3 = new AutoSelectButtonStyle("OVERLAY_PRIMARY", 2, R.attr.buttonOverlayPrimaryMedium);
        f96079e = autoSelectButtonStyle3;
        AutoSelectButtonStyle[] autoSelectButtonStyleArr = {autoSelectButtonStyle, autoSelectButtonStyle2, autoSelectButtonStyle3};
        f96080f = autoSelectButtonStyleArr;
        f96081g = c.a(autoSelectButtonStyleArr);
    }

    public AutoSelectButtonStyle(@InterfaceC42150f String str, int i12, int i13) {
        this.f96082b = i13;
    }

    public static AutoSelectButtonStyle valueOf(String str) {
        return (AutoSelectButtonStyle) Enum.valueOf(AutoSelectButtonStyle.class, str);
    }

    public static AutoSelectButtonStyle[] values() {
        return (AutoSelectButtonStyle[]) f96080f.clone();
    }
}
