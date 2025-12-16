package com.avito.android.beduin.common.component.favorite_button;

import android.view.View;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.util.V2;
import com.google.android.material.internal.CheckableImageButton;
import io.reactivex.rxjava3.kotlin.A1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f101180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f101181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f101182d;

    public /* synthetic */ a(b bVar, boolean z12, CheckableImageButton checkableImageButton) {
        this.f101180b = bVar;
        this.f101181c = z12;
        this.f101182d = checkableImageButton;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f101180b;
        BeduinFavoriteButtonModel beduinFavoriteButtonModel = bVar.f101183e;
        if (beduinFavoriteButtonModel.getAdvertId() == null) {
            ?? r12 = beduinFavoriteButtonModel.f101176c;
            if (r12 != 0) {
                r12.invoke(Boolean.valueOf(this.f101182d.f356716b));
                return;
            }
            return;
        }
        String advertId = beduinFavoriteButtonModel.getAdvertId();
        String analyticsSource = beduinFavoriteButtonModel.getAnalyticsSource();
        String fromSpace = beduinFavoriteButtonModel.getFromSpace();
        j jVar = bVar.f101185g;
        jVar.getClass();
        AbstractC30567a.m mVar = new AbstractC30567a.m(null);
        com.avito.android.favorite.h hVar = jVar.f101202a;
        boolean z12 = this.f101181c;
        jVar.f101204c.b(A1.g(hVar.g(advertId, mVar, z12, null, null, (2016 & 32) != 0 ? null : analyticsSource, (2016 & 64) != 0 ? null : null, (2016 & 128) != 0 ? null : null, (2016 & 256) != 0 ? null : null, (2016 & 512) != 0 ? null : fromSpace, (2016 & 1024) != 0), new i(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), null, 2));
        jVar.f101203b.b(advertId, z12);
    }
}
