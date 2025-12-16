package com.avito.android.user_advert.advert.delegate.auto_select_close;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.o;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectDetailsDialogView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/auto_select_close/f;", "Lcom/avito/android/user_advert/advert/delegate/auto_select_close/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f308547a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f308548b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f308549c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f308550d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f308551e;

    /* compiled from: AutoSelectDetailsDialogView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_advert/advert/delegate/auto_select_close/f$a", "Lcom/avito/android/image_loader/o;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends o {
        public a() {
        }

        @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            f fVar = f.this;
            ViewGroup.LayoutParams layoutParams = fVar.f308547a.getLayoutParams();
            layoutParams.height = i13;
            layoutParams.width = i12;
            fVar.f308547a.setLayoutParams(layoutParams);
        }
    }

    public f(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f308547a = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f308548b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f308549c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f308550d = (Button) viewFindViewById4;
        this.f308551e = com.avito.android.lib.util.darkTheme.c.b(view.getContext());
    }

    public final void a(UniversalImage universalImage) {
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, this.f308551e) : null;
        SimpleDraweeView simpleDraweeView = this.f308547a;
        Uri uriD = C35829k2.b(imageDependsOnThemeOrDefault, simpleDraweeView.getWidth(), 0, 0.0f, 2, 44).d();
        if (imageDependsOnThemeOrDefault == null || uriD == null) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uriD);
        aVarA.f169490h = new a();
        aVarA.c();
    }
}
