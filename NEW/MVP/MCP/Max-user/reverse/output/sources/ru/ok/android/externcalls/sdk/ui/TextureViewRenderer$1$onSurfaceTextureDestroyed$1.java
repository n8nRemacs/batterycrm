package ru.ok.android.externcalls.sdk.ui;

import defpackage.cm6;
import defpackage.qqg;
import defpackage.u08;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class TextureViewRenderer$1$onSurfaceTextureDestroyed$1 extends u08 implements cm6 {
    final /* synthetic */ CountDownLatch $completionLatch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewRenderer$1$onSurfaceTextureDestroyed$1(CountDownLatch countDownLatch) {
        super(0);
        this.$completionLatch = countDownLatch;
    }

    @Override // defpackage.cm6
    public /* bridge */ /* synthetic */ Object invoke() {
        m151invoke();
        return qqg.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m151invoke() {
        this.$completionLatch.countDown();
    }
}
