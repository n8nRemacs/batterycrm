package com.avito.android.advert.badge_details;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeDetailsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/badge_details/s;", "Lcom/avito/android/advert/badge_details/q;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class s implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f68813a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f68814b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f68815c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f68816d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f68817e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f68818f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f68819g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f68820h;

    public s(@Y61.k View view) {
        this.f68813a = view;
        this.f68814b = view.getContext();
        this.f68816d = view.findViewById(R.id.progress_view);
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f68817e = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f68818f = cVar2;
        this.f68819g = cVar2;
        this.f68820h = cVar;
    }
}
