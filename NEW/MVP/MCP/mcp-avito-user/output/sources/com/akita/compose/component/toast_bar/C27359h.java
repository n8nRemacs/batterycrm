package com.akita.compose.component.toast_bar;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastBarHost.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.component.toast_bar.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27359h extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC27357f f63250l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27359h(InterfaceC27357f interfaceC27357f) {
        super(0);
        this.f63250l = interfaceC27357f;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        this.f63250l.dismiss();
        return Boolean.TRUE;
    }
}
