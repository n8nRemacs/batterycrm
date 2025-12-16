package com.avito.android.rating_form.item.checkBox;

import com.avito.android.R;
import com.avito.android.lib.design.toggle.Toggle;
import com.avito.android.rating_form.item.checkBox.CheckableGroupItem;
import com.avito.android.rating_form.item.checkBox.e;
import j.I;
import j.f0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CheckableGroupItemAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/checkBox/c;", "Lcom/avito/android/rating_form/item/checkBox/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends b {

    /* renamed from: e, reason: collision with root package name */
    @I
    public final int f248303e;

    /* renamed from: f, reason: collision with root package name */
    @f0
    public final int f248304f;

    /* renamed from: g, reason: collision with root package name */
    @f0
    public final int f248305g;

    public c(@Y61.k List<CheckableGroupItem.a> list) {
        super(list);
        this.f248303e = R.layout.rating_form_check_box_list_item;
        this.f248304f = R.style.Design_Widget_Checkbox_LookAndFeel;
        this.f248305g = R.style.Design_Widget_Checkbox_LookAndFeel_Error;
    }

    @Override // com.avito.android.rating_form.item.checkBox.e
    /* renamed from: k, reason: from getter */
    public final int getF248303e() {
        return this.f248303e;
    }

    @Override // com.avito.android.rating_form.item.checkBox.e
    public final void m(@Y61.k e.a aVar, boolean z12) {
        int i12 = z12 ? this.f248305g : this.f248304f;
        Toggle f248302c = aVar.getF248302c();
        if (f248302c != null) {
            f248302c.setAppearance(i12);
        }
    }
}
