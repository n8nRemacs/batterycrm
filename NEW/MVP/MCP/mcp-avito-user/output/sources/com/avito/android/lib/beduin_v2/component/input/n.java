package com.avito.android.lib.beduin_v2.component.input;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputCompose.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class n extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f175733l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f175734m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f175735n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i12, androidx.compose.ui.v vVar, String str) {
        super(2);
        this.f175733l = str;
        this.f175734m = vVar;
        this.f175735n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f175735n | 1);
        B.a(this.f175733l, this.f175734m, a12, iA2);
        return G0.f406611a;
    }
}
