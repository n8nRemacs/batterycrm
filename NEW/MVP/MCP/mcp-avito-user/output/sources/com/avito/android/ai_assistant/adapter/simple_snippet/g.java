package com.avito.android.ai_assistant.adapter.simple_snippet;

import Y61.k;
import Y61.l;
import aV.C19818a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.ai_assistant.adapter.simple_snippet.c;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SimpleSnippetView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/simple_snippet/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/konveyor/util/d;", "Lcom/avito/android/ai_assistant/adapter/simple_snippet/c;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements com.avito.konveyor.util.d<c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f88899b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f88900c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f88901d;

    /* renamed from: e, reason: collision with root package name */
    public final ShapeableImageView f88902e;

    /* renamed from: f, reason: collision with root package name */
    public final DockingBadgeContainer f88903f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f88904g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f88905h;

    /* renamed from: i, reason: collision with root package name */
    public final StrikethroughTextView f88906i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageButton f88907j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f88908k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f88909l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Drawable f88910m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Drawable f88911n;

    public g(@k e eVar, @k com.avito.android.util.text.a aVar, @k View view) {
        super(view);
        this.f88899b = eVar;
        this.f88900c = aVar;
        Context context = this.itemView.getContext();
        this.f88901d = context;
        this.f88902e = (ShapeableImageView) view.findViewById(R.id.buyer_assistant_simple_snippet_image);
        this.f88903f = (DockingBadgeContainer) view.findViewById(R.id.buyer_assistant_simple_snippet_badge_container);
        this.f88904g = (TextView) view.findViewById(R.id.buyer_assistant_simple_snippet_price);
        this.f88905h = (TextView) view.findViewById(R.id.buyer_assistant_simple_snippet_discount_rate);
        this.f88906i = (StrikethroughTextView) view.findViewById(R.id.buyer_assistant_simple_snippet_old_price);
        this.f88907j = (ImageButton) view.findViewById(R.id.buyer_assistant_simple_snippet_favorite_icon);
        this.f88908k = (TextView) view.findViewById(R.id.buyer_assistant_simple_snippet_title);
        this.f88909l = (TextView) view.findViewById(R.id.buyer_assistant_simple_snippet_more);
        this.f88910m = C35835l0.h(R.attr.ic_favorites20, context);
        this.f88911n = C35835l0.h(R.attr.ic_favoritesFilled20, context);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.itemView.setOnClickListener(null);
        this.f88907j.setOnClickListener(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        Context context;
        Image imageDependsOnThemeOrDefault;
        final c cVar = (c) aVar;
        j.a(this.f88904g, cVar.f88881e, null);
        this.f88906i.setState(new CV.a(cVar.f88882f, false, 2, null));
        I5.a(this.f88908k, cVar.f88884h, false);
        I5.a(this.f88905h, cVar.f88883g, false);
        j.a(this.f88909l, cVar.f88885i, this.f88900c);
        List<c.a> list = cVar.f88880d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            context = this.f88901d;
            if (!zHasNext) {
                break;
            }
            c.a aVar2 = (c.a) it.next();
            String str = aVar2.f88889a;
            Integer num = aVar2.f88890b;
            Integer numValueOf = num != null ? Integer.valueOf(C35835l0.d(num.intValue(), context)) : null;
            Integer num2 = aVar2.f88891c;
            arrayList.add(new DockingBadgeItem(str, new DockingBadgeType.CustomColors(R.style.Re23_DockingBadge_GreenSmall, numValueOf, num2 != null ? Integer.valueOf(C35835l0.d(num2.intValue(), context)) : null, null, null, 24, null), aVar2.f88892d, aVar2.f88893e, null, 16, null));
        }
        C19818a c19818a = new C19818a(arrayList, y6.b(2), 0, 4, null);
        DockingBadgeContainer dockingBadgeContainer = this.f88903f;
        dockingBadgeContainer.setState(c19818a);
        ShapeableImageView shapeableImageView = this.f88902e;
        UniversalImage universalImage = cVar.f88879c;
        if (universalImage != null && (imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(context))) != null) {
            com.avito.android.image_loader.glide.utils.b.d(shapeableImageView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
        }
        shapeableImageView.setVisibility(universalImage != null ? 0 : 8);
        dockingBadgeContainer.setVisibility(universalImage == null ? 8 : 0);
        Q q12 = cVar.f88886j ? new Q(this.f88911n, Integer.valueOf(R.attr.red700)) : new Q(this.f88910m, Integer.valueOf(R.attr.black));
        Drawable drawable = (Drawable) q12.f406619b;
        int iIntValue = ((Number) q12.f406620c).intValue();
        ImageButton imageButton = this.f88907j;
        imageButton.setImageDrawable(drawable);
        imageButton.setImageTintList(C35835l0.e(iIntValue, context));
        final int i12 = 0;
        this.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.ai_assistant.adapter.simple_snippet.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f88897c;

            {
                this.f88897c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f88897c.f88899b.a(cVar);
                        break;
                    default:
                        this.f88897c.f88899b.b(cVar);
                        break;
                }
            }
        });
        final int i13 = 1;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.ai_assistant.adapter.simple_snippet.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f88897c;

            {
                this.f88897c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f88897c.f88899b.a(cVar);
                        break;
                    default:
                        this.f88897c.f88899b.b(cVar);
                        break;
                }
            }
        });
    }
}
