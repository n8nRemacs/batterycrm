package com.avito.android.map_core.overlay;

import Y61.k;
import android.view.View;
import com.avito.android.remote.model.Overlay;
import j.I;
import kotlin.Metadata;

/* compiled from: TopOverlayAppearance.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map_core/overlay/c;", "Lcom/avito/android/remote/model/Overlay;", "T", "", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class c<T extends Overlay> {

    /* renamed from: a, reason: collision with root package name */
    public final int f185674a;

    public c(@I int i12) {
        this.f185674a = i12;
    }

    @k
    public abstract kotlin.reflect.d<T> a();

    public abstract void b(@k T t12);

    public abstract void c(@k View view);
}
