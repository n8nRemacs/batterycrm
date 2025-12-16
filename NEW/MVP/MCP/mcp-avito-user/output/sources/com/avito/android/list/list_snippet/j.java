package com.avito.android.list.list_snippet;

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

/* compiled from: ListSnippetView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/list/list_snippet/j;", "Lcom/avito/android/list/list_snippet/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f181607i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f181608b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f181609c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f181610d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f181611e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f181612f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final StrikethroughTextView f181613g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f181614h;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f181608b = aVar;
        this.f181609c = view;
        this.f181610d = (ImageView) view.findViewById(R.id.snippet_image);
        this.f181611e = (TextView) view.findViewById(R.id.title);
        this.f181612f = (TextView) view.findViewById(R.id.price);
        this.f181613g = (StrikethroughTextView) view.findViewById(R.id.old_price);
        this.f181614h = (TextView) view.findViewById(R.id.additional_info);
    }

    @Override // com.avito.android.list.list_snippet.i
    public final void P7() {
        this.f181610d.setImageDrawable(null);
    }

    @Override // com.avito.android.list.list_snippet.i
    public final void T4(@l String str) {
        StrikethroughTextView strikethroughTextView = this.f181613g;
        if (str == null || str.length() == 0) {
            D6.w(strikethroughTextView);
        } else {
            D6.H(strikethroughTextView);
            strikethroughTextView.setText(str);
        }
    }

    @Override // com.avito.android.list.list_snippet.i
    public final void a(@k Y41.a<G0> aVar) {
        this.f181609c.setOnClickListener(new C(8, aVar));
    }

    @Override // com.avito.android.list.list_snippet.i
    public final void e(@k AttributedText attributedText) {
        TextView textView = this.f181611e;
        textView.setText(this.f181608b.c(textView.getContext(), attributedText));
    }

    @Override // com.avito.android.list.list_snippet.i
    public final void i(@k UniversalImage universalImage) throws Resources.NotFoundException {
        ImageView imageView = this.f181610d;
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(imageView.getContext()));
        if (imageDependsOnTheme != null) {
            com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(imageDependsOnTheme);
            View view = this.f181609c;
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

    @Override // com.avito.android.list.list_snippet.i
    public final void p(@k String str) {
        this.f181612f.setText(str);
    }

    @Override // com.avito.android.list.list_snippet.i
    public final void p4(@l AttributedText attributedText) {
        TextView textView = this.f181614h;
        if (attributedText == null) {
            D6.w(textView);
            return;
        }
        D6.H(textView);
        textView.setText(this.f181608b.c(textView.getContext(), attributedText));
    }
}
