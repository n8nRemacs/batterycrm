package com.avito.android.safety.safety_settings.ui;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SafetySettingsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.safety.safety_settings.ui.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34452l extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> f257875l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f257876m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f257877n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f257878o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34452l(int i12, Y41.l lVar, androidx.compose.ui.v vVar, String str) {
        super(2);
        this.f257875l = lVar;
        this.f257876m = str;
        this.f257877n = vVar;
        this.f257878o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f257878o | 1);
        androidx.compose.ui.v vVar = this.f257877n;
        z.b(iA2, this.f257875l, a12, vVar, this.f257876m);
        return G0.f406611a;
    }
}
