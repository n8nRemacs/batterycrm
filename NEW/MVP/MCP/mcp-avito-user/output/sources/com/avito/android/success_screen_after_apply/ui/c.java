package com.avito.android.success_screen_after_apply.ui;

import com.avito.android.design.State;
import com.avito.android.lib.deprecated_design.badge_bar.ImageLoadableView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageLoadableExtension.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "com/avito/android/image_loader/fresco/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ImageLoadableView f291780l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ImageLoadableView imageLoadableView) {
        super(0);
        this.f291780l = imageLoadableView;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f291780l.setState(State.f135881e);
        return G0.f406611a;
    }
}
