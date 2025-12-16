package com.yandex.div.core.resources;

import Y61.k;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import j.f0;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: ContextThemeWrapperWithResourceCache.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/resources/b;", "Landroidx/appcompat/view/d;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b extends androidx.appcompat.view.d {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42726C f367642g;

    public b(@k ContextThemeWrapper contextThemeWrapper, @f0 int i12) {
        super(contextThemeWrapper, i12);
        this.f367642g = C42727D.c(new a(this));
    }

    @Override // androidx.appcompat.view.d, android.content.ContextWrapper, android.content.Context
    @k
    public final Resources getResources() {
        return (Resources) this.f367642g.getValue();
    }
}
