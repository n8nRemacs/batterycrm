package com.avito.android.messenger.conversation.mvi.multi_message.composable;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiMessageBannerContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Image f193680l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f193681m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f193682n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f193683o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193684p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Image image, float f12, float f13, v vVar, androidx.compose.ui.i iVar, InterfaceC22374n.a.C1667a c1667a, int i12, int i13) {
        super(2);
        this.f193680l = image;
        this.f193681m = f12;
        this.f193682n = f13;
        this.f193683o = vVar;
        this.f193684p = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(441);
        v vVar = this.f193683o;
        d.c(this.f193680l, this.f193681m, this.f193682n, vVar, a12, iA2, this.f193684p);
        return G0.f406611a;
    }
}
