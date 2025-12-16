package com.avito.android.service_booking_day_settings.daysettings.adapter;

import Y41.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SettingsBreakItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f276737l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SettingsBreakItem f276738m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, SettingsBreakItem settingsBreakItem) {
        super(0);
        this.f276737l = hVar;
        this.f276738m = settingsBreakItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        q<String, org.threeten.bp.g, org.threeten.bp.g, G0> qVar = this.f276737l.f276742c;
        SettingsBreakItem settingsBreakItem = this.f276738m;
        String str = settingsBreakItem.f276723b;
        org.threeten.bp.g gVar = settingsBreakItem.f276724c.f276729b;
        qVar.invoke(str, gVar, gVar);
        return G0.f406611a;
    }
}
