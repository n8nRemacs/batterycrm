package com.avito.beduin.v2.render.android_view;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;

/* compiled from: Styles.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"android-view_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class D {
    public static final <R, T extends com.avito.beduin.v2.theme.m> R a(@Y61.k com.avito.beduin.v2.theme.l<T> lVar, @Y61.k com.avito.beduin.v2.theme.k kVar) {
        return (R) kVar.f338363a.e(lVar).b(lVar.a(), kVar);
    }

    public static final <R, T extends com.avito.beduin.v2.theme.m> R b(@Y61.k com.avito.beduin.v2.theme.l<T> lVar, @Y61.k com.avito.beduin.v2.theme.k kVar, @Y61.l Object obj) {
        return (R) kVar.f338363a.e(lVar).a(kVar, lVar.a(), obj);
    }

    @Y61.k
    public static final Drawable c(@Y61.k com.avito.beduin.v2.theme.k kVar, @Y61.k String str, @Y61.l String str2, @Y61.l Integer num) {
        Drawable drawable = (Drawable) kVar.f338363a.c(str, str2);
        drawable.mutate();
        if (num != null) {
            drawable.setTint(num.intValue());
        }
        return drawable;
    }
}
