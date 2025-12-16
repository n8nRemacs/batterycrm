package com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox;

import Y61.k;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.profile_settings_extended.adapter.phones.l;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.select.bottom_sheet.blueprints.q;
import com.avito.android.util.C35829k2;
import com.avito.android.util.D6;
import j.U;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SectionCheckableItemView.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_item/section_checkbox/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/select/bottom_sheet/blueprints/q;", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f266378e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckbox f266379b;

    /* renamed from: c, reason: collision with root package name */
    @U
    public final int f266380c;

    /* renamed from: d, reason: collision with root package name */
    @U
    public final int f266381d;

    /* compiled from: SectionCheckableItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_item/section_checkbox/h$a;", "", "<init>", "()V", "", "ICON_HEIGHT_DP", "I", "ICON_WIDTH_DP", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public h(@k ListItemCheckbox listItemCheckbox) {
        super(listItemCheckbox);
        this.f266379b = listItemCheckbox;
        this.f266380c = D6.j(listItemCheckbox, 32);
        this.f266381d = D6.j(listItemCheckbox, 32);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void a(@k Y41.a<G0> aVar) {
        this.f266379b.setOnClickListener(new l(22, aVar));
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void c3(boolean z12) {
        this.f266379b.setEnabled(z12);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void gA(@Y61.l UniversalImage universalImage, @Y61.l Size size) {
        ListItemCheckbox listItemCheckbox = this.f266379b;
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(listItemCheckbox.getContext())) : null;
        Uri uriD = imageDependsOnThemeOrDefault != null ? C35829k2.b(imageDependsOnThemeOrDefault, this.f266380c, this.f266381d, 0.0f, 1, 44).d() : null;
        if (uriD == null) {
            s.c(listItemCheckbox.getImageContainer(), null, true, null, null);
            listItemCheckbox.k();
        } else {
            s.c(listItemCheckbox.getImageContainer(), null, true, null, null);
            listItemCheckbox.n(this.f266380c, this.f266381d);
            s.c(listItemCheckbox.getImageContainer(), uriD, true, null, null);
            listItemCheckbox.l();
        }
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void p0() {
        this.f266379b.k();
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setChecked(boolean z12) {
        this.f266379b.setChecked(z12);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setTitle(@k String str) {
        this.f266379b.setTitle(str);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void HC(boolean z12) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void Kd(boolean z12) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void f(@Y61.l String str) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void iw(@Y61.l BaseListItem.Alignment alignment) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void l(@Y61.l Image image) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void l00(@k String str) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void s(@k String str) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setImage(int i12) {
    }
}
