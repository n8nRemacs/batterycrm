package com.avito.android.messenger.conversation.mvi.platform_actions;

import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PlatformActionsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class y extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f194053l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar) {
        super(0);
        this.f194053l = zVar;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        z zVar = this.f194053l;
        boolean z12 = false;
        boolean zBooleanValue = zVar.f194059f.invoke(0).booleanValue();
        if (zVar.f194064k.getPaddingBottom() != 0) {
            D6.f(zVar.f194064k, 0, 0, 0, 0, 7);
        } else {
            z12 = zBooleanValue;
        }
        return Boolean.valueOf(z12);
    }
}
