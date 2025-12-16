package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AbstractMessageFromUserContentRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32156c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC32157d f193307l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193308m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193309n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f193310o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f193311p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32156c(AbstractC32157d abstractC32157d, T1.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f193307l = abstractC32157d;
        this.f193308m = dVar;
        this.f193309n = lVar;
        this.f193310o = aVar;
        this.f193311p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        this.f193307l.a(this.f193308m, this.f193309n, this.f193310o, a12, C22066f2.a(this.f193311p | 1));
        return G0.f406611a;
    }
}
