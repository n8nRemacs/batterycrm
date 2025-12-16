package com.avito.android.messenger.map.viewing;

import android.os.Bundle;
import com.avito.android.location.analytics.FindLocationPage;
import com.avito.android.permissions.C33035e;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lW.C43692b;

/* compiled from: PlatformMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.viewing.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32555h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatformMapFragment f196846b;

    public C32555h(PlatformMapFragment platformMapFragment) {
        this.f196846b = platformMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        PlatformMapFragment platformMapFragment = this.f196846b;
        C43692b c43692b = platformMapFragment.f196800t0;
        if (c43692b == null) {
            c43692b = null;
        }
        Bundle arguments = platformMapFragment.getArguments();
        String str = "pvz_map";
        if (arguments == null || !arguments.getBoolean("lock_bottom_sheet", false)) {
            FindLocationPage findLocationPage = FindLocationPage.f181725c;
        } else {
            FindLocationPage findLocationPage2 = FindLocationPage.f181725c;
            str = "messenger_alien_location";
        }
        c43692b.e(str);
        C33035e c33035e = platformMapFragment.f196798r0;
        platformMapFragment.f196803w0.b((c33035e != null ? c33035e : null).g());
    }
}
