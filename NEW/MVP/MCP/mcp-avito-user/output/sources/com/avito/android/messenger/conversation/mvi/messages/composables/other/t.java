package com.avito.android.messenger.conversation.mvi.messages.composables.other;

import androidx.compose.animation.core.C20281g0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TypingIndicatorContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class t extends N implements Y41.a<Float> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20281g0.a f192845l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C20281g0.a aVar) {
        super(0);
        this.f192845l = aVar;
    }

    @Override // Y41.a
    public final Float invoke() {
        return Float.valueOf(-((Number) this.f192845l.getF42167b()).floatValue());
    }
}
