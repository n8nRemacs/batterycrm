package com.avito.android.select.sectioned_multiselect.core;

import com.avito.android.lib.design.input.Input;
import com.avito.android.util.K2;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_item/section_checkbox/a;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/select/sectioned_multiselect/Items/section_item/section_checkbox/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f266680b;

    public r(K k12) {
        this.f266680b = k12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Input input;
        com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a aVar = (com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.a) obj;
        K k12 = this.f266680b;
        C34656f c34656f = k12.f266489n;
        if (c34656f != null && (input = c34656f.f266650k) != null) {
            K2.d(input, true);
        }
        k12.f266482g.Sb(aVar.getF262931b());
    }
}
