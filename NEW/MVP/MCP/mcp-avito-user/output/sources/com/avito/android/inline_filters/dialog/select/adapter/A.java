package com.avito.android.inline_filters.dialog.select.adapter;

import android.graphics.drawable.Drawable;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalCheckedImage;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InlineFiltersDialogSelectItemIconLeftView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/A;", "Lcom/avito/android/inline_filters/dialog/select/adapter/m;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f172045c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ListItemCheckmark f172046b;

    /* compiled from: InlineFiltersDialogSelectItemIconLeftView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/A$a;", "", "<init>", "()V", "", "ICON_HEIGHT_DP", "I", "ICON_WIDTH_DP", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public A(@Y61.k ListItemCheckmark listItemCheckmark) {
        super(listItemCheckmark);
        this.f172046b = listItemCheckmark;
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f172046b.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(21, aVar));
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void rF(@Y61.l Boolean bool, @Y61.l UniversalImage universalImage) {
        ListItemCheckmark listItemCheckmark = this.f172046b;
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(listItemCheckmark.getContext())) : null;
        if (imageDependsOnThemeOrDefault == null && L.f(bool, Boolean.FALSE)) {
            listItemCheckmark.k();
            return;
        }
        if (imageDependsOnThemeOrDefault == null && L.f(bool, Boolean.TRUE)) {
            listItemCheckmark.l();
            listItemCheckmark.setImageResource(R.drawable.ic_stub_auto_24);
        } else {
            listItemCheckmark.n(D6.j(listItemCheckmark, 32), D6.j(listItemCheckmark, 32));
            listItemCheckmark.m(imageDependsOnThemeOrDefault);
            listItemCheckmark.l();
        }
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setChecked(boolean z12) {
        this.f172046b.setChecked(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setText(@Y61.k String str) {
        this.f172046b.setTitle(str);
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void Kd(boolean z12) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void MY(@Y61.l String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void ZH(@Y61.k Y41.a<G0> aVar) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void gE(@Y61.l String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void l(@Y61.l Image image) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setIcon(@Y61.l Drawable drawable) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void UV(@Y61.l UniversalCheckedImage universalCheckedImage, @Y61.l String str) {
    }
}
