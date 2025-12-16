package com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item;

import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.serp_advert_card.i;
import com.avito.android.util.C35949t5;
import com.avito.android.util.text.j;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: MallShortcutView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/mall_shortcut_item/f;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/mall_shortcut_item/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.android.serp.c implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f273020f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f273021b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f273022c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f273023d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f273024e;

    public f(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.mall_shortcut_item_root);
        this.f273021b = viewFindViewById;
        this.f273022c = (TextView) view.findViewById(R.id.title);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.icon);
        this.f273023d = simpleDraweeView;
        this.f273024e = viewFindViewById.getContext();
        viewFindViewById.setClipToOutline(true);
        simpleDraweeView.getHierarchy().n(s.c.f340134f);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.e
    public final void Ir(@k MallShortcutItem mallShortcutItem, @k Y41.a<G0> aVar) {
        C48063a c48063a = C48063a.f437606a;
        UniversalColor universalColor = mallShortcutItem.f273004g;
        Context context = this.f273024e;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(c48063a.a(context, universalColor));
        View view = this.f273021b;
        view.setBackgroundTintList(colorStateListValueOf);
        AttributedText attributedText = mallShortcutItem.f273002e;
        if (attributedText == null) {
            attributedText = mallShortcutItem.f272999b;
        }
        j.a(this.f273022c, attributedText, null);
        UniversalImage universalImage = mallShortcutItem.f273005h;
        Image imageDependsOnTheme = universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(context)) : null;
        ImageRequest.a aVarA = C35949t5.a(this.f273023d);
        aVarA.d(com.avito.android.image_loader.b.b(imageDependsOnTheme));
        aVarA.c();
        view.setOnClickListener(new i(16, aVar));
    }
}
