package com.avito.android.items;

import JO.i;
import JO.j;
import JO.k;
import com.avito.android.category_parameters.g;
import com.avito.android.category_parameters.l;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import kotlin.Metadata;

/* compiled from: InputItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/items/d;", "Lcom/avito/android/items/a;", "Lcom/avito/android/items/e;", "Lcom/avito/android/items/ItemWithState;", "LJO/i;", "LJO/j;", "Lcom/avito/android/category_parameters/l;", "Lcom/avito/android/items/f;", "Lcom/avito/android/items/ItemWithAdditionalButton;", "Lcom/avito/android/category_parameters/g;", "LJO/k;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface d extends com.avito.android.items.a, e, ItemWithState, i, j, l, f, ItemWithAdditionalButton, g, k {

    /* compiled from: InputItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    /* renamed from: C1 */
    CharParameter.AutoDescription getF117500y();

    @Y61.l
    /* renamed from: J */
    Integer getF117473A();

    /* renamed from: J1 */
    boolean getF117476D();

    /* renamed from: L0 */
    int getF117484i();

    @Y61.l
    /* renamed from: P0 */
    CharParameter.AutoBeautification getF117501z();

    @Y61.l
    /* renamed from: b1 */
    String getF117485j();

    @Y61.l
    /* renamed from: getDescription */
    String getF117477E();

    @Y61.l
    /* renamed from: getDisplayingOptions */
    DisplayingOptions getF117489n();

    @Y61.k
    /* renamed from: getInputType */
    FormatterType getF117493r();

    @Y61.l
    /* renamed from: getPlaceholder */
    String getF117490o();

    @Y61.k
    /* renamed from: getTitle */
    String getF117480e();

    @Override // com.avito.android.items.a
    @Y61.l
    /* renamed from: getValue */
    String getF117481f();

    /* renamed from: h0 */
    boolean getF117498w();

    @Y61.l
    /* renamed from: j1 */
    PriceParameter.AbnormalPriceData getF117478F();

    @Y61.l
    /* renamed from: l */
    ItemWithAdditionalButton.AdditionalButton getF117488m();

    @Override // com.avito.android.items.a
    void m(@Y61.l String str);

    void o();

    @Y61.l
    /* renamed from: q0 */
    String getF117486k();

    @Y61.l
    /* renamed from: t */
    Boolean getF117499x();
}
