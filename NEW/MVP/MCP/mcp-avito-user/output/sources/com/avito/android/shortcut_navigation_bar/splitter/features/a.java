package com.avito.android.shortcut_navigation_bar.splitter.features;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: ShortcutBarInternalFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/splitter/features/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class a extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f283557d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f283558b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f283559c;

    static {
        h0 h0Var = new h0(a.class, "topWidgetEnabled", "getTopWidgetEnabled()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f283557d = new n[]{n0Var.i(h0Var), C0.k(a.class, "recreateBeduinComponentOnTopWidgetWhenBind", "getRecreateBeduinComponentOnTopWidgetWhenBind()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public a() {
        Owners owners = Owners.f210531q3;
        Boolean bool = Boolean.TRUE;
        this.f283558b = A0.u(this, "Показывать beduinV2 topWidget в инлайн-фильтрах", "topWidget", bool, false, 0, owners, 56);
        this.f283559c = A0.u(this, "В topWidget - пересоздавать beduin component в bind", "recreateBeduinComponentOnTopWidgetWhenBind", bool, false, 0, owners, 56);
    }
}
