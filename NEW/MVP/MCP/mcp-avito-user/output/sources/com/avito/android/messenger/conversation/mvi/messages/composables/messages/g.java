package com.avito.android.messenger.conversation.mvi.messages.composables.messages;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SystemTextMessage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f192254l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f192255m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f192256n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f192257o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, String str2, v.a aVar, int i12) {
        super(2);
        this.f192254l = str;
        this.f192255m = str2;
        this.f192256n = aVar;
        this.f192257o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192257o | 1);
        v.a aVar = this.f192256n;
        i.a(this.f192254l, this.f192255m, aVar, a12, iA2);
        return G0.f406611a;
    }
}
