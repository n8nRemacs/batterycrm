package com.avito.android.dialog;

import android.graphics.drawable.Drawable;
import com.avito.android.design.State;
import gw.InterfaceC40743a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageLoadableExtension.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/graphics/drawable/Drawable;", "drawable", "Lkotlin/G0;", "invoke", "(Landroid/graphics/drawable/Drawable;)V", "com/avito/android/image_loader/fresco/q", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class p extends N implements Y41.l<Drawable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40743a f144793l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InterfaceC40743a interfaceC40743a) {
        super(1);
        this.f144793l = interfaceC40743a;
    }

    @Override // Y41.l
    public final G0 invoke(Drawable drawable) {
        this.f144793l.setState(State.f135882f);
        return G0.f406611a;
    }
}
