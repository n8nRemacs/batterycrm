package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeletedMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class a extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f192456l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f192457m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f192458n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i12, androidx.compose.ui.v vVar, String str) {
        super(2);
        this.f192456l = str;
        this.f192457m = vVar;
        this.f192458n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192458n | 1);
        c.a(this.f192456l, this.f192457m, a12, iA2);
        return G0.f406611a;
    }
}
