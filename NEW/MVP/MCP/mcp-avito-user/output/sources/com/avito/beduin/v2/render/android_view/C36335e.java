package com.avito.beduin.v2.render.android_view;

import android.view.View;
import fU0.AbstractC40338a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinViewDataStorage.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/e;", "Lcom/avito/beduin/v2/render/android_view/I;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.render.android_view.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36335e implements I {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public C36332b f337988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36336f f337989c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC40338a[] f337990d;

    public C36335e(C36332b c36332b, C36336f c36336f, AbstractC40338a[] abstractC40338aArr) {
        this.f337989c = c36336f;
        this.f337990d = abstractC40338aArr;
        this.f337988b = c36332b;
    }

    @Override // com.avito.beduin.v2.render.android_view.I
    public final void a() {
        this.f337988b = null;
        C36339i c36339i = this.f337989c.f337991a;
        AbstractC40338a[] abstractC40338aArr = this.f337990d;
        c36339i.f337998a.keySet().removeAll(C42745f0.s(C42756l.l0(abstractC40338aArr)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
        C36332b c36332b = this.f337988b;
        if (c36332b != null) {
            LinkedHashMap linkedHashMap = this.f337989c.f337991a.f337998a;
            AbstractC40338a[] abstractC40338aArr = this.f337990d;
            int iF2 = P0.f(abstractC40338aArr.length);
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF2);
            for (AbstractC40338a abstractC40338a : abstractC40338aArr) {
                linkedHashMap2.put(abstractC40338a, c36332b);
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        C36339i c36339i = this.f337989c.f337991a;
        AbstractC40338a[] abstractC40338aArr = this.f337990d;
        c36339i.f337998a.keySet().removeAll(C42745f0.s(C42756l.l0(abstractC40338aArr)));
    }
}
