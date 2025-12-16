package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.file_message;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FileMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FileMessageData f192477l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f192478m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f192479n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f192480o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f192481p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FileMessageData fileMessageData, v vVar, boolean z12, Y41.a aVar, int i12) {
        super(2);
        this.f192477l = fileMessageData;
        this.f192478m = vVar;
        this.f192479n = z12;
        this.f192480o = aVar;
        this.f192481p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        c.a(this.f192477l, this.f192478m, this.f192479n, this.f192480o, a12, C22066f2.a(this.f192481p | 1));
        return G0.f406611a;
    }
}
