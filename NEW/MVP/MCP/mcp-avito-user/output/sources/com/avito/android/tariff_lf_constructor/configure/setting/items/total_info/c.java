package com.avito.android.tariff_lf_constructor.configure.setting.items.total_info;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_lf_constructor.configure.setting.items.model.ConfigureAttributeModel;
import kotlin.Metadata;
import wD0.C49488b;

/* compiled from: ConstructorSettingTotalInfoItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/setting/items/total_info/c;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f300143b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ConfigureAttributeModel f300144c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ConfigureAttributeModel f300145d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ConfigureAttributeModel f300146e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ConfigureAttributeModel f300147f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f300148g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ButtonAction f300149h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final C49488b f300150i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final AttributedText f300151j;

    public c(@Y61.k String str, @l ConfigureAttributeModel configureAttributeModel, @l ConfigureAttributeModel configureAttributeModel2, @l ConfigureAttributeModel configureAttributeModel3, @l ConfigureAttributeModel configureAttributeModel4, @l AttributedText attributedText, @Y61.k ButtonAction buttonAction, @l C49488b c49488b, @l AttributedText attributedText2) {
        this.f300143b = str;
        this.f300144c = configureAttributeModel;
        this.f300145d = configureAttributeModel2;
        this.f300146e = configureAttributeModel3;
        this.f300147f = configureAttributeModel4;
        this.f300148g = attributedText;
        this.f300149h = buttonAction;
        this.f300150i = c49488b;
        this.f300151j = attributedText2;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80342e() {
        return 1701190857;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF224291b() {
        return "total_info_item";
    }
}
