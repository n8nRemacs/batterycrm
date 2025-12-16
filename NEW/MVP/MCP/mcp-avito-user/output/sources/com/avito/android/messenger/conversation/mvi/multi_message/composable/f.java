package com.avito.android.messenger.conversation.mvi.multi_message.composable;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiMessageBannerContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f193676l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f193677m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f193678n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f193679o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(UniversalImage universalImage, float f12, float f13, v vVar, int i12) {
        super(2);
        this.f193676l = universalImage;
        this.f193677m = f12;
        this.f193678n = f13;
        this.f193679o = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(441);
        float f12 = this.f193677m;
        float f13 = this.f193678n;
        d.b(this.f193676l, f12, f13, this.f193679o, a12, iA2);
        return G0.f406611a;
    }
}
