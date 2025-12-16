package com.avito.android.favorite_sellers.adapter.seller;

import Y61.k;
import Y61.l;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SellerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/seller/SellerItemViewImpl;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorite_sellers/adapter/seller/h;", "NewItemsIndicatorState", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerItemViewImpl extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f155733k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f155734b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f155735c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f155736d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f155737e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f155738f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f155739g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ViewGroup f155740h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ImageView f155741i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final b f155742j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SellerItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/seller/SellerItemViewImpl$NewItemsIndicatorState;", "", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NewItemsIndicatorState {

        /* renamed from: b, reason: collision with root package name */
        public static final NewItemsIndicatorState f155743b;

        /* renamed from: c, reason: collision with root package name */
        public static final NewItemsIndicatorState f155744c;

        /* renamed from: d, reason: collision with root package name */
        public static final NewItemsIndicatorState f155745d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ NewItemsIndicatorState[] f155746e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f155747f;

        static {
            NewItemsIndicatorState newItemsIndicatorState = new NewItemsIndicatorState("RED", 0);
            f155743b = newItemsIndicatorState;
            NewItemsIndicatorState newItemsIndicatorState2 = new NewItemsIndicatorState("GRAY", 1);
            f155744c = newItemsIndicatorState2;
            NewItemsIndicatorState newItemsIndicatorState3 = new NewItemsIndicatorState("HIDDEN", 2);
            f155745d = newItemsIndicatorState3;
            NewItemsIndicatorState[] newItemsIndicatorStateArr = {newItemsIndicatorState, newItemsIndicatorState2, newItemsIndicatorState3};
            f155746e = newItemsIndicatorStateArr;
            f155747f = kotlin.enums.c.a(newItemsIndicatorStateArr);
        }

        public NewItemsIndicatorState() {
            throw null;
        }

        public static NewItemsIndicatorState valueOf(String str) {
            return (NewItemsIndicatorState) Enum.valueOf(NewItemsIndicatorState.class, str);
        }

        public static NewItemsIndicatorState[] values() {
            return (NewItemsIndicatorState[]) f155746e.clone();
        }
    }

    /* compiled from: SellerItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[NewItemsIndicatorState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NewItemsIndicatorState newItemsIndicatorState = NewItemsIndicatorState.f155743b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                NewItemsIndicatorState newItemsIndicatorState2 = NewItemsIndicatorState.f155743b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SellerItemViewImpl(@k View view) {
        super(view);
        this.f155734b = view;
        View viewFindViewById = view.findViewById(R.id.user_avatar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f155735c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.shop_avatar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f155736d = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f155737e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f155738f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.btn_more);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f155739g = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.content);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f155740h = (ViewGroup) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.new_items_indicator);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f155741i = (ImageView) viewFindViewById7;
        this.f155742j = new b();
    }

    @Override // com.avito.android.favorite_sellers.adapter.seller.h
    public final void Dd(@l com.avito.android.image_loader.a aVar) {
        D6.w(this.f155736d);
        D6.H(this.f155735c);
        C35949t5.c(this.f155735c, aVar, null, null, null, 14);
    }

    @Override // com.avito.android.favorite_sellers.adapter.seller.h
    public final void G9(@l com.avito.android.image_loader.a aVar) {
        D6.w(this.f155735c);
        SimpleDraweeView simpleDraweeView = this.f155736d;
        D6.H(simpleDraweeView);
        C35949t5.b(simpleDraweeView, aVar, this.f155742j);
    }

    @Override // com.avito.android.favorite_sellers.adapter.seller.h
    public final void Gd(boolean z12) {
        this.f155740h.setAlpha(z12 ? 0.5f : 1.0f);
    }

    @Override // com.avito.android.favorite_sellers.adapter.seller.h
    public final void a(@l Y41.a<G0> aVar) {
        com.avito.android.extended_profile_widgets.adapter.header.k kVar = aVar != null ? new com.avito.android.extended_profile_widgets.adapter.header.k(19, aVar) : null;
        View view = this.f155734b;
        view.setOnClickListener(kVar);
        view.setClickable(aVar != null);
    }

    @Override // com.avito.android.favorite_sellers.adapter.seller.h
    public final void ef(@k Y41.a<G0> aVar) {
        this.f155739g.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(20, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f155734b.setOnClickListener(null);
        this.f155739g.setOnClickListener(null);
    }

    @Override // com.avito.android.favorite_sellers.adapter.seller.h
    public final void qh(@k NewItemsIndicatorState newItemsIndicatorState) {
        int iOrdinal = newItemsIndicatorState.ordinal();
        ImageView imageView = this.f155741i;
        if (iOrdinal == 0) {
            imageView.setImageResource(R.drawable.new_items_indicator_red);
            D6.H(imageView);
        } else if (iOrdinal == 1) {
            imageView.setImageResource(R.drawable.new_items_indicator_gray);
            D6.H(imageView);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            D6.w(imageView);
        }
    }

    @Override // com.avito.android.favorite_sellers.adapter.seller.h
    public final void setTitle(@l CharSequence charSequence) {
        I5.a(this.f155737e, charSequence, false);
    }

    @Override // com.avito.android.favorite_sellers.adapter.seller.h
    public final void vI(int i12, @l String str) {
        TextView textView = this.f155738f;
        I5.a(textView, str, false);
        textView.setMaxLines(i12);
        textView.setSingleLine(i12 == 1);
    }

    /* compiled from: SellerItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/favorite_sellers/adapter/seller/SellerItemViewImpl$b", "Lcom/avito/android/image_loader/i;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements i {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ColorDrawable f155748b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ColorDrawable f155749c;

        public b() {
            this.f155748b = new ColorDrawable(C35835l0.d(R.attr.white, SellerItemViewImpl.this.f155734b.getContext()));
            this.f155749c = new ColorDrawable(C35835l0.d(R.attr.gray8, SellerItemViewImpl.this.f155734b.getContext()));
        }

        @Override // com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            SellerItemViewImpl.this.f155736d.getHierarchy().o(this.f155748b, 0);
        }

        @Override // com.avito.android.image_loader.i
        public final void S2() {
            SellerItemViewImpl.this.f155736d.getHierarchy().o(this.f155749c, 0);
        }

        @Override // com.avito.android.image_loader.i
        public final void b2(@l Throwable th2) {
        }
    }
}
