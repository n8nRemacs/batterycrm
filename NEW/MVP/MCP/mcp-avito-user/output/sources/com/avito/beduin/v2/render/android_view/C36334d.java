package com.avito.beduin.v2.render.android_view;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/x;", "invoke", "()Lcom/avito/beduin/v2/render/android_view/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.beduin.v2.render.android_view.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36334d extends N implements Y41.a<x> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinView f337956l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36334d(BeduinView beduinView) {
        super(0);
        this.f337956l = beduinView;
    }

    @Override // Y41.a
    public final x invoke() {
        A a12 = this.f337956l.f337913c;
        if (a12 != null) {
            return new x(a12);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
