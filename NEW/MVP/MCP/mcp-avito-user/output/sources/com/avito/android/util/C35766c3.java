package com.avito.android.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import kotlin.Metadata;

/* compiled from: MenuItems.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.c3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35766c3 {
    public static final void a(@InterfaceC42156l int i12, @Y61.k MenuItem menuItem) {
        Drawable icon = menuItem.getIcon();
        if (icon != null) {
            Drawable drawableMutate = icon.mutate();
            drawableMutate.setTint(i12);
            menuItem.setIcon(drawableMutate);
        }
    }

    public static final void b(@Y61.k MenuItem menuItem, @Y61.k Context context, @InterfaceC42150f int i12) {
        a(C35835l0.d(i12, context), menuItem);
    }
}
