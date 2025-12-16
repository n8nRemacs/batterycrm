package com.avito.android.advert_stats;

import android.view.View;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.advert_stats.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28297b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f86026c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ViewOnClickListenerC28297b(Y41.a aVar) {
        this.f86025b = 0;
        this.f86026c = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f86026c;
        switch (this.f86025b) {
            case 0:
                int i12 = AdvertStatsActivity.f85977u;
                ((N) obj).invoke();
                break;
            case 1:
                int i13 = AdvertStatsActivity.f85977u;
                ((Y41.a) obj).invoke();
                break;
            default:
                int i14 = AdvertStatsActivity.f85977u;
                ((AdvertStatsActivity) obj).finish();
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC28297b(Object obj, int i12) {
        this.f86025b = i12;
        this.f86026c = obj;
    }
}
