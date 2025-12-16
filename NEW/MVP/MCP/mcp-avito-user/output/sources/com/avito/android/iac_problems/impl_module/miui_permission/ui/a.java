package com.avito.android.iac_problems.impl_module.miui_permission.ui;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.v;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AsyncUniversalImageOrSpacer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f168814l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f168815m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f168816n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f168817o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22374n.a.d f168818p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UniversalImage universalImage, float f12, float f13, v vVar, InterfaceC22374n.a.d dVar, int i12) {
        super(2);
        this.f168814l = universalImage;
        this.f168815m = f12;
        this.f168816n = f13;
        this.f168817o = vVar;
        this.f168818p = dVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(24585);
        b.a(this.f168814l, this.f168815m, this.f168816n, this.f168818p, a12, iA2);
        return G0.f406611a;
    }
}
