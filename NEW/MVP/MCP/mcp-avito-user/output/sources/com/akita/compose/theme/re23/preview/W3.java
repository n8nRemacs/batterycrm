package com.akita.compose.theme.re23.preview;

import android.content.Context;
import android.widget.Toast;
import kotlin.Metadata;

/* compiled from: TooltipPreview.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class W3 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f65557l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(Context context) {
        super(0);
        this.f65557l = context;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        Toast.makeText(this.f65557l, "Tooltip button clicked", 0).show();
        return kotlin.G0.f406611a;
    }
}
