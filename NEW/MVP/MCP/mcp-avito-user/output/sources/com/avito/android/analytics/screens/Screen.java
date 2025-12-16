package com.avito.android.analytics.screens;

import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Screen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/Screen;", "Landroid/os/Parcelable;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class Screen implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f90471b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f90472c;

    public Screen(@Y61.k String str, boolean z12) {
        this.f90471b = str;
        this.f90472c = z12;
    }

    public /* synthetic */ Screen(String str, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? true : z12);
    }
}
