package com.avito.android.messenger.map.viewing;

import com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PlatformMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d;", "visibility", "Lkotlin/G0;", "accept", "(Lcom/avito/android/lib/deprecated_design/bottom_sheet/BottomSheet$d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.viewing.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32558k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatformMapFragment f196849b;

    public C32558k(PlatformMapFragment platformMapFragment) {
        this.f196849b = platformMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        BottomSheet.d dVar = (BottomSheet.d) obj;
        y yVar = this.f196849b.f196796p0;
        if (yVar == null) {
            yVar = null;
        }
        yVar.M4(dVar);
    }
}
