package com.avito.android.messenger.conversation.mvi.messages.composables.other;

import androidx.compose.animation.core.C20302n0;
import androidx.compose.animation.core.F;
import androidx.compose.animation.core.Q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TypingIndicatorContent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/n0$b;", "", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/n0$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class x extends N implements Y41.l<C20302n0.b<Float>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f192849l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f192850m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f192851n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(float f12, float f13, int i12) {
        super(1);
        this.f192849l = f12;
        this.f192850m = i12;
        this.f192851n = f13;
    }

    @Override // Y41.l
    public final G0 invoke(C20302n0.b<Float> bVar) {
        C20302n0.b<Float> bVar2 = bVar;
        bVar2.f26394a = 1200;
        float f12 = this.f192849l;
        Float fValueOf = Float.valueOf(f12);
        int i12 = this.f192850m;
        C20302n0.a aVarA = bVar2.a(i12, fValueOf);
        F f13 = Q.f26121a;
        aVarA.f26367b = f13;
        bVar2.a(i12 + 200, Float.valueOf(this.f192851n)).f26367b = f13;
        bVar2.a(i12 + 600, Float.valueOf(f12));
        return G0.f406611a;
    }
}
