package com.avito.android.list.grid_snippet.item;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GridSnippetView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/list/grid_snippet/item/i;", "Lcom/avito/android/list/grid_snippet/item/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f181587i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f181588b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f181589c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f181590d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f181591e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f181592f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final StrikethroughTextView f181593g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f181594h;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f181588b = aVar;
        this.f181589c = view;
        this.f181590d = (ImageView) view.findViewById(R.id.snippet_image);
        this.f181591e = (TextView) view.findViewById(R.id.title);
        this.f181592f = (TextView) view.findViewById(R.id.price);
        this.f181593g = (StrikethroughTextView) view.findViewById(R.id.old_price);
        this.f181594h = (TextView) view.findViewById(R.id.additional_info);
    }

    @Override // com.avito.android.list.grid_snippet.item.h
    public final void P7() {
        this.f181590d.setImageDrawable(null);
    }

    @Override // com.avito.android.list.grid_snippet.item.h
    public final void T4(@l String str) {
        StrikethroughTextView strikethroughTextView = this.f181593g;
        if (str == null || str.length() == 0) {
            D6.w(strikethroughTextView);
        } else {
            D6.H(strikethroughTextView);
            strikethroughTextView.setText(str);
        }
    }

    @Override // com.avito.android.list.grid_snippet.item.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f181589c.setOnClickListener(new C(7, aVar));
    }

    @Override // com.avito.android.list.grid_snippet.item.h
    public final void e(@k AttributedText attributedText) {
        TextView textView = this.f181591e;
        textView.setText(this.f181588b.c(textView.getContext(), attributedText));
    }

    @Override // com.avito.android.list.grid_snippet.item.h
    public final void i(@k UniversalImage universalImage) throws Resources.NotFoundException {
        ImageView imageView = this.f181590d;
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(imageView.getContext()));
        if (imageDependsOnTheme != null) {
            com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(imageDependsOnTheme);
            View view = this.f181589c;
            Resources resources = view.getResources();
            Resources.Theme theme = view.getContext().getTheme();
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
            Drawable drawable = resources.getDrawable(R.drawable.snippet_img_placeholder, theme);
            ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
            aVar.d(aVarB);
            aVar.f169492j = drawable;
            aVar.f169493k = null;
            aVar.f169485c = Integer.valueOf(R.drawable.snippet_img_placeholder);
            aVar.e(y6.b(16));
            aVar.c();
        }
    }

    @Override // com.avito.android.list.grid_snippet.item.h
    public final void p(@k String str) {
        this.f181592f.setText(str);
    }

    @Override // com.avito.android.list.grid_snippet.item.h
    public final void p4(@l AttributedText attributedText) {
        TextView textView = this.f181594h;
        if (attributedText == null) {
            D6.w(textView);
            return;
        }
        D6.H(textView);
        textView.setText(this.f181588b.c(textView.getContext(), attributedText));
    }
}
