package com.avito.android.safety.safety_settings.ui;

import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SafetySettingsSessions.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class K extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f257832l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f257833m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> f257834n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f257835o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(int i12, Y41.l lVar, androidx.compose.ui.v vVar, AttributedText attributedText, String str) {
        super(2);
        this.f257832l = str;
        this.f257833m = attributedText;
        this.f257834n = lVar;
        this.f257835o = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(3137);
        String str = this.f257832l;
        AttributedText attributedText = this.f257833m;
        L.b(iA2, this.f257834n, a12, this.f257835o, attributedText, str);
        return G0.f406611a;
    }
}
