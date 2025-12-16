package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TarifikatorMainInternalAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/AlertReason;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AlertReason {

    /* renamed from: b, reason: collision with root package name */
    public static final AlertReason f135635b;

    /* renamed from: c, reason: collision with root package name */
    public static final AlertReason f135636c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AlertReason[] f135637d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f135638e;

    static {
        AlertReason alertReason = new AlertReason("UNSAVED_EXIT", 0);
        f135635b = alertReason;
        AlertReason alertReason2 = new AlertReason("UNSAVED_REFRESH", 1);
        f135636c = alertReason2;
        AlertReason[] alertReasonArr = {alertReason, alertReason2};
        f135637d = alertReasonArr;
        f135638e = c.a(alertReasonArr);
    }

    public AlertReason() {
        throw null;
    }

    public static AlertReason valueOf(String str) {
        return (AlertReason) Enum.valueOf(AlertReason.class, str);
    }

    public static AlertReason[] values() {
        return (AlertReason[]) f135637d.clone();
    }
}
