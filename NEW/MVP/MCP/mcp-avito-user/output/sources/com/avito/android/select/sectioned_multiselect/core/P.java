package com.avito.android.select.sectioned_multiselect.core;

import Zp0.InterfaceC19587b;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/core/P;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface P {
    /* renamed from: Bb */
    boolean getF266519L();

    @Y61.l
    /* renamed from: E2 */
    Integer getF266523P();

    @Y61.l
    /* renamed from: F3 */
    String getF266524Q();

    void Fd(@Y61.k SectionedMultiselectParameter sectionedMultiselectParameter, @Y61.k List<SectionedMultiselectParameter.Value> list);

    void G6(@Y61.k List<SectionedMultiselectParameter.Value> list);

    @Y61.k
    C41981q0 Gb();

    void J9();

    @Y61.k
    C41981q0 K9();

    void Sb(@Y61.k String str);

    void T4(@Y61.l InterfaceC19587b interfaceC19587b);

    @Y61.k
    C41981q0 Td();

    @Y61.k
    /* renamed from: U8 */
    com.jakewharton.rxrelay3.c getF266535b0();

    @Y61.l
    /* renamed from: b7 */
    String getF266522O();

    @Y61.l
    /* renamed from: cd */
    String getF266521N();

    void f4(@Y61.k String str);

    @Y61.k
    List<SectionedMultiselectParameter.Value> j8(@Y61.l String str);

    @Y61.k
    /* renamed from: l7 */
    LinkedHashMap getF266530W();

    @Y61.l
    Set<ParcelableEntity<String>> m5();

    boolean o2();

    @Y61.l
    List<SectionedMultiselectParameter.Tab> p4();

    void p6(boolean z12);

    /* renamed from: q9 */
    int getF266518K();

    @Y61.l
    Set<ParcelableEntity<String>> r8();

    void s5(@Y61.k List<SectionedMultiselectParameter.Value> list);

    /* renamed from: sa */
    boolean getF266525R();

    @Y61.l
    /* renamed from: sb */
    InterfaceC19587b getF266527T();

    /* renamed from: ta */
    boolean getF266526S();

    @Y61.l
    List<String> y6();
}
