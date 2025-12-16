package com.avito.android.early_access.mvi;

import androidx.compose.runtime.C22066f2;
import com.avito.android.early_access.mvi.entity.EarlyAccessState;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EarlyAccessScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class O extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessState.Content f145419l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f145420m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f145421n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f145422o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(EarlyAccessState.Content content, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f145419l = content;
        this.f145420m = (kotlin.jvm.internal.N) lVar;
        this.f145421n = vVar;
        this.f145422o = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f145422o | 1);
        ?? r02 = this.f145420m;
        A.c(this.f145419l, r02, a12, iA2);
        return G0.f406611a;
    }
}
