package com.avito.android.vas_performance.ui.stickers.edit;

import com.avito.android.vas_performance.ui.stickers.edit.StickersEditVasFragment;
import kotlin.Metadata;
import xZ.C49899a;

/* compiled from: StickersEditVasFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StickersEditVasFragment f322028b;

    public h(StickersEditVasFragment stickersEditVasFragment) {
        this.f322028b = stickersEditVasFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        StickersEditVasFragment.a aVar = StickersEditVasFragment.f322004B0;
        this.f322028b.s5().l(new C49899a(iIntValue), -1);
    }
}
