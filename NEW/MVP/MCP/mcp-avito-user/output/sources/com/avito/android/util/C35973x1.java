package com.avito.android.util;

import androidx.appcompat.widget.Toolbar;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.util.x1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C35973x1 implements l41.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f319124b;

    public /* synthetic */ C35973x1(Object obj, int i12) {
        this.f319123a = i12;
        this.f319124b = obj;
    }

    @Override // l41.f
    public final void cancel() {
        Object obj = this.f319124b;
        switch (this.f319123a) {
            case 0:
                C35987z1 c35987z1 = C35987z1.f319133a;
                ((com.facebook.datasource.c) obj).close();
                break;
            default:
                ((Toolbar) obj).setNavigationOnClickListener(null);
                break;
        }
    }
}
