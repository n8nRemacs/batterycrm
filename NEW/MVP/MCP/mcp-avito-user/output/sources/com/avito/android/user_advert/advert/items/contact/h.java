package com.avito.android.user_advert.advert.items.contact;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V0;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertContactItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/contact/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/contact/g;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Context f309310b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f309311c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f309312d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f309313e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Drawable f309314f;

    /* renamed from: g, reason: collision with root package name */
    public final int f309315g;

    /* compiled from: MyAdvertContactItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f309316a;

        static {
            int[] iArr = new int[UserIconType.values().length];
            try {
                iArr[UserIconType.PRIVATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserIconType.COMPANY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserIconType.SHOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f309316a = iArr;
        }
    }

    public h(@k View view) {
        super(view);
        Context context = view.getContext();
        this.f309310b = context;
        this.f309311c = (SimpleDraweeView) view.findViewById(R.id.icon);
        this.f309312d = (TextView) view.findViewById(R.id.title);
        this.f309313e = (TextView) view.findViewById(R.id.subtitle);
        this.f309314f = androidx.core.content.d.getDrawable(context, R.drawable.bg_btn_circle_gray);
        this.f309315g = C35835l0.d(R.attr.gray28, context);
    }

    @Override // com.avito.android.user_advert.advert.items.contact.g
    public final void Ic(@l Image image) {
        if (image != null) {
            com.avito.android.advert.item.delivery_suggests.l.w(image, C35949t5.a(this.f309311c));
        }
    }

    @Override // com.avito.android.user_advert.advert.items.contact.g
    public final void YC(@l UserIconType userIconType) {
        int i12;
        SimpleDraweeView simpleDraweeView = this.f309311c;
        if (userIconType == null) {
            D6.g(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        int i13 = a.f309316a[userIconType.ordinal()];
        if (i13 == 1) {
            i12 = R.drawable.ic_user_24;
        } else if (i13 == 2) {
            i12 = R.drawable.ic_company_24;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.drawable.ic_shop_24;
        }
        Drawable drawable = androidx.core.content.d.getDrawable(this.f309310b, i12);
        if (drawable != null) {
            V0.a(drawable, this.f309315g);
        }
        if (drawable != null) {
            simpleDraweeView.getHierarchy().o(drawable, 1);
        }
        Drawable drawable2 = this.f309314f;
        if (drawable2 != null) {
            simpleDraweeView.getHierarchy().o(drawable2, 0);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.contact.g
    public final void b(@l String str) {
        I5.a(this.f309312d, str, false);
    }

    @Override // com.avito.android.user_advert.advert.items.contact.g
    public final void j(@l String str) {
        I5.a(this.f309313e, str, false);
    }
}
