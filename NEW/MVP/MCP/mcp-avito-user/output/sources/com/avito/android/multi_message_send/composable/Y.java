package com.avito.android.multi_message_send.composable;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MultiSendTitleItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class Y extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f206505l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f206506m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f206507n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(String str, v.a aVar, int i12) {
        super(2);
        this.f206505l = str;
        this.f206506m = aVar;
        this.f206507n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f206507n | 1);
        a0.a(this.f206505l, this.f206506m, a12, iA2);
        return G0.f406611a;
    }
}
