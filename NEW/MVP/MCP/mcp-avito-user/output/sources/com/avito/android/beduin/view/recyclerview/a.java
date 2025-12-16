package com.avito.android.beduin.view.recyclerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f105189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f105190c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f105191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin_shared.model.action.custom.e f105192e;

    public a(f fVar, RecyclerView recyclerView, int i12, com.avito.android.beduin_shared.model.action.custom.e eVar) {
        this.f105189b = fVar;
        this.f105190c = recyclerView;
        this.f105191d = i12;
        this.f105192e = eVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        view.removeOnLayoutChangeListener(this);
        f.a(this.f105189b, this.f105190c, this.f105191d, this.f105192e.f105292e);
    }
}
