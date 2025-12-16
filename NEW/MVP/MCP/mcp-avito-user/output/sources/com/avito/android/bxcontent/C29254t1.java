package com.avito.android.bxcontent;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.avito.android.bxcontent.utils.BxContentBottomSheetBehavior;
import kotlin.Metadata;
import z80.InterfaceC50396b;

/* compiled from: BxContentView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/t1;", "Lz80/b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.t1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29254t1 implements InterfaceC50396b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C29240o1 f113000a;

    public C29254t1(C29240o1 c29240o1) {
        this.f113000a = c29240o1;
    }

    @Override // z80.InterfaceC50396b
    public final void a(@Y61.l ImageView imageView) {
        C29240o1 c29240o1 = this.f113000a;
        BxContentBottomSheetBehavior<FrameLayout> bxContentBottomSheetBehavior = c29240o1.f112668H0;
        if (bxContentBottomSheetBehavior != null) {
            bxContentBottomSheetBehavior.f355974K = false;
        }
        c29240o1.f112691T.f272230O = false;
    }

    @Override // z80.InterfaceC50396b
    public final void b(@Y61.l ImageView imageView) {
        C29240o1 c29240o1 = this.f113000a;
        BxContentBottomSheetBehavior<FrameLayout> bxContentBottomSheetBehavior = c29240o1.f112668H0;
        if (bxContentBottomSheetBehavior != null) {
            bxContentBottomSheetBehavior.f355974K = true;
        }
        c29240o1.f112691T.f272230O = true;
    }
}
