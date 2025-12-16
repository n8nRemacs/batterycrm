package com.avito.android.beduin.ui.universal;

import com.avito.android.analytics.screens.F;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: UniversalBeduinViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f104530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f104531c;

    public o(m mVar, F f12) {
        this.f104530b = mVar;
        this.f104531c = f12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        F f12 = this.f104531c;
        this.f104530b.me((P2) obj, f12);
    }
}
