package com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.saved_searches.presentation.items.switcher.l;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SectionSelectItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_item/radio_select/f;", "Lcom/avito/android/select/sectioned_multiselect/Items/section_item/radio_select/d;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<a> f266359b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f266360c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f266359b = cVar;
        this.f266360c = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a aVar2 = (a) aVar;
        ListItemCheckmark listItemCheckmark = ((h) eVar).f266363b;
        listItemCheckmark.setTitle(aVar2.f266351c);
        listItemCheckmark.setChecked(aVar2.f266352d);
        listItemCheckmark.setOnClickListener(new l(28, new e(this, aVar2)));
    }

    @Override // com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.d
    @k
    public final z<a> d() {
        return this.f266360c;
    }
}
