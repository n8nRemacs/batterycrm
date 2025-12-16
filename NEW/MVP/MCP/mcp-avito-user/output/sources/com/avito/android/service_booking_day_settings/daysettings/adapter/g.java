package com.avito.android.service_booking_day_settings.daysettings.adapter;

import Y41.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SettingsBreakItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f276739l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SettingsBreakItem f276740m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, SettingsBreakItem settingsBreakItem) {
        super(0);
        this.f276739l = hVar;
        this.f276740m = settingsBreakItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        q<String, org.threeten.bp.g, org.threeten.bp.g, G0> qVar = this.f276739l.f276743d;
        SettingsBreakItem settingsBreakItem = this.f276740m;
        qVar.invoke(settingsBreakItem.f276723b, settingsBreakItem.f276725d.f276729b, settingsBreakItem.f276724c.f276729b);
        return G0.f406611a;
    }
}
