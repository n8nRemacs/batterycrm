package com.avito.android.select.sectioned_multiselect.tab;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: TabListPayloadCreator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/tab/v;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v implements com.avito.android.recycler.data_aware.a {
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.recycler.data_aware.a
    @Y61.l
    public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        ?? r32;
        ?? r42;
        if ((aVar instanceof com.avito.android.select.sectioned_multiselect.Items.section_list.a) && (aVar2 instanceof com.avito.android.select.sectioned_multiselect.Items.section_list.a) && (r32 = ((com.avito.android.select.sectioned_multiselect.Items.section_list.a) aVar).f266392d) != 0 && (r42 = ((com.avito.android.select.sectioned_multiselect.Items.section_list.a) aVar2).f266392d) != 0 && r32.size() == r42.size()) {
            return new a(r42);
        }
        return null;
    }
}
