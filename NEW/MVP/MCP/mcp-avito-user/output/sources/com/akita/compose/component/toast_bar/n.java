package com.akita.compose.component.toast_bar;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastBarHost.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class n extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC27357f f63262l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f63263m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f63264n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f63265o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC27357f interfaceC27357f, androidx.compose.ui.v vVar, C22096n c22096n, int i12) {
        super(2);
        this.f63262l = interfaceC27357f;
        this.f63263m = vVar;
        this.f63264n = c22096n;
        this.f63265o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63265o | 1);
        q.a(this.f63262l, this.f63263m, this.f63264n, a12, iA2);
        return G0.f406611a;
    }
}
