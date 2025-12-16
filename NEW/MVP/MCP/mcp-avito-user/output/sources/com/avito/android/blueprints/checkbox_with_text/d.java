package com.avito.android.blueprints.checkbox_with_text;

import Y41.l;
import com.avito.android.items.CheckBoxItemWithText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckBoxItemWithTextPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CheckBoxItemWithText f105830l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f105831m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CheckBoxItemWithText checkBoxItemWithText, e eVar) {
        super(1);
        this.f105830l = checkBoxItemWithText;
        this.f105831m = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        CheckBoxItemWithText checkBoxItemWithText = this.f105830l;
        checkBoxItemWithText.f173889e = zBooleanValue;
        this.f105831m.f105832b.accept(checkBoxItemWithText);
        return G0.f406611a;
    }
}
