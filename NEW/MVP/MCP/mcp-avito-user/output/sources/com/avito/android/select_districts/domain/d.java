package com.avito.android.select_districts.domain;

import com.avito.android.remote.model.District;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SelectDistrictsDataStore.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/domain/d;", "", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface d {
    @Y61.k
    ArrayList a();

    boolean b();

    void c(@Y61.k List<District> list);

    void clear();

    boolean d(@Y61.k String str);

    void e(@Y61.k String str);

    @Y61.k
    LinkedHashSet f();

    @Y61.k
    ArrayList g();

    void h(boolean z12);
}
