package com.avito.android.search.filter.adapter.checkbox;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CheckBoxItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/checkbox/j;", "Lcom/avito/android/search/filter/adapter/checkbox/i;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f262120d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckbox f262121b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.android.blueprints.publish.multiselect.inline.i f262122c;

    /* compiled from: CheckBoxItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/search/filter/adapter/checkbox/j$a;", "", "<init>", "()V", "", "DEFAULT_ICON_HEIGHT_DP", "I", "DEFAULT_ICON_WIDTH_DP", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.filters_checkbox);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemCheckbox");
        }
        this.f262121b = (ListItemCheckbox) viewFindViewById;
    }

    @Override // com.avito.android.search.filter.adapter.checkbox.i
    public final void S1(@k Y41.l<? super Boolean, G0> lVar) {
        com.avito.android.blueprints.publish.multiselect.inline.i iVar = this.f262122c;
        ListItemCheckbox listItemCheckbox = this.f262121b;
        if (iVar != null) {
            listItemCheckbox.j(iVar);
        }
        com.avito.android.blueprints.publish.multiselect.inline.i iVar2 = new com.avito.android.blueprints.publish.multiselect.inline.i(1, lVar);
        listItemCheckbox.e(iVar2);
        this.f262122c = iVar2;
    }

    @Override // com.avito.android.search.filter.adapter.checkbox.i
    public final void c3(boolean z12) {
        this.f262121b.setEnabled(z12);
    }

    @Override // com.avito.android.search.filter.adapter.checkbox.i
    public final void dn(@l Image image, @l Size size) {
        ListItemCheckbox listItemCheckbox = this.f262121b;
        if (image == null) {
            listItemCheckbox.m(null);
            return;
        }
        listItemCheckbox.setImageColor(androidx.core.content.d.getColorStateList(listItemCheckbox.getContext(), R.color.image_right_select_toggle));
        listItemCheckbox.n(D6.j(listItemCheckbox, size != null ? size.getWidth() : 32), D6.j(listItemCheckbox, size != null ? size.getHeight() : 32));
        listItemCheckbox.m(image);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        com.avito.android.blueprints.publish.multiselect.inline.i iVar = this.f262122c;
        if (iVar != null) {
            this.f262121b.j(iVar);
        }
    }

    @Override // com.avito.android.search.filter.adapter.checkbox.i
    public final void setChecked(boolean z12) {
        this.f262121b.setChecked(z12);
    }

    @Override // com.avito.android.search.filter.adapter.checkbox.i
    public final void setText(@k String str) {
        this.f262121b.setTitle(str);
    }
}
