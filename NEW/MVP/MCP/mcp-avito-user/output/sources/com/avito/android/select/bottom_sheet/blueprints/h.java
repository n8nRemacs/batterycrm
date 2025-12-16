package com.avito.android.select.bottom_sheet.blueprints;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.select.InterfaceC34610a;
import com.avito.android.util.C35829k2;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CheckableItemIconLeftView.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/h;", "Lcom/avito/android/select/bottom_sheet/blueprints/q;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f265129d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34610a f265130b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ListItemCheckmark f265131c;

    /* compiled from: CheckableItemIconLeftView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/h$a;", "", "<init>", "()V", "", "DEFAULT_ICON_HEIGHT_DP", "I", "DEFAULT_ICON_WIDTH_DP", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public h(@Y61.k ListItemCheckmark listItemCheckmark, @Y61.k InterfaceC34610a interfaceC34610a) {
        super(listItemCheckmark);
        this.f265130b = interfaceC34610a;
        this.f265131c = listItemCheckmark;
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f265131c.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(18, aVar));
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void c3(boolean z12) {
        this.f265131c.setEnabled(z12);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void gA(@Y61.l UniversalImage universalImage, @Y61.l Size size) {
        ListItemCheckmark listItemCheckmark = this.f265131c;
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(listItemCheckmark.getContext())) : null;
        if ((imageDependsOnThemeOrDefault != null ? C35829k2.c(imageDependsOnThemeOrDefault, listItemCheckmark, 1, 22).d() : null) == null) {
            listItemCheckmark.m(null);
            listItemCheckmark.k();
        } else {
            listItemCheckmark.n(D6.j(listItemCheckmark, size != null ? size.getWidth() : 32), D6.j(listItemCheckmark, size != null ? size.getHeight() : 32));
            listItemCheckmark.m(imageDependsOnThemeOrDefault);
            listItemCheckmark.l();
        }
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void l00(@Y61.k String str) {
        ListItemCheckmark listItemCheckmark = this.f265131c;
        Drawable drawableA = this.f265130b.a(listItemCheckmark.getContext(), str, null);
        listItemCheckmark.setImageColor((ColorStateList) null);
        if (drawableA == null) {
            listItemCheckmark.k();
            return;
        }
        listItemCheckmark.setImageDrawable(drawableA);
        listItemCheckmark.n(drawableA.getIntrinsicWidth(), drawableA.getIntrinsicHeight());
        listItemCheckmark.l();
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void p0() {
        ListItemCheckmark listItemCheckmark = this.f265131c;
        listItemCheckmark.m(null);
        listItemCheckmark.k();
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setChecked(boolean z12) {
        this.f265131c.setChecked(z12);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setImage(int i12) {
        ListItemCheckmark listItemCheckmark = this.f265131c;
        Drawable drawableA = this.f265130b.a(listItemCheckmark.getContext(), null, Integer.valueOf(i12));
        listItemCheckmark.setImageColor((ColorStateList) null);
        if (drawableA == null) {
            listItemCheckmark.k();
            return;
        }
        listItemCheckmark.setImageDrawable(drawableA);
        listItemCheckmark.n(drawableA.getIntrinsicWidth(), drawableA.getIntrinsicHeight());
        listItemCheckmark.l();
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setTitle(@Y61.k String str) {
        this.f265131c.setTitle(str);
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
    public final void s(@Y61.k String str) {
    }
}
