package com.avito.android.passport.profile_list_item;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.component.user_hat.ProfileStatus;
import com.avito.android.component.user_hat.ProfileType;
import com.avito.android.component.user_hat.items.C29574b;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.toggle.Checkmark;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import wK0.AbstractC49526a;

/* compiled from: ProfileListItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_list_item/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profile_list_item/i;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f213643m = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f213644b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f213645c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f213646d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f213647e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f213648f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Checkmark f213649g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ImageView f213650h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ImageView f213651i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Checkmark f213652j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Badge f213653k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f213654l;

    /* compiled from: ProfileListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ProfileStatus.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProfileStatus profileStatus = ProfileStatus.f125284b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ProfileType.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ProfileType profileType = ProfileType.f125289b;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public j(@Y61.k View view) {
        super(view);
        this.f213644b = view;
        this.f213645c = (TextView) view.findViewById(R.id.passport_profile_list_item_type);
        this.f213646d = (TextView) view.findViewById(R.id.passport_profile_list_item_name);
        this.f213647e = (TextView) view.findViewById(R.id.passport_profile_list_item_status);
        this.f213648f = (SimpleDraweeView) view.findViewById(R.id.passport_profile_list_item_avatar);
        this.f213649g = (Checkmark) view.findViewById(R.id.passport_profile_list_item_current_check);
        this.f213650h = (ImageView) view.findViewById(R.id.passport_profile_list_item_pending);
        this.f213651i = (ImageView) view.findViewById(R.id.passport_profile_list_item_error);
        this.f213652j = (Checkmark) view.findViewById(R.id.passport_profile_list_item_current_check);
        this.f213653k = (Badge) view.findViewById(R.id.passport_profile_employee_badge);
        Context context = view.getContext();
        this.f213654l = context;
        view.setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, null, androidx.core.content.d.getColorStateList(context, R.color.common_warm_gray_4), 0, null, 0, 125));
    }

    @Override // com.avito.android.passport.profile_list_item.i
    public final void B9(@Y61.k ProfileStatus profileStatus, @Y61.k ProfileType profileType) {
        Context context = this.f213654l;
        int iOrdinal = profileStatus.ordinal();
        this.f213647e.setTextColor(C35835l0.d(iOrdinal != 0 ? iOrdinal != 1 ? R.attr.black : R.attr.gray54 : R.attr.red600, context));
        int iOrdinal2 = profileType.ordinal();
        ImageView imageView = this.f213651i;
        ImageView imageView2 = this.f213650h;
        Badge badge = this.f213653k;
        if (iOrdinal2 == 0) {
            D6.w(badge);
            D6.G(imageView2, profileStatus == ProfileStatus.f125285c);
            D6.G(imageView, profileStatus == ProfileStatus.f125284b);
        } else {
            if (iOrdinal2 != 1) {
                return;
            }
            D6.G(badge, true);
            D6.w(imageView2);
            D6.w(imageView);
        }
    }

    @Override // com.avito.android.passport.profile_list_item.i
    public final void D(@Y61.k PrintableText printableText) {
        this.f213645c.setText(printableText.k0(this.f213644b.getContext()));
    }

    @Override // com.avito.android.passport.profile_list_item.i
    public final void J(@Y61.k String str) {
        this.f213646d.setText(str);
    }

    @Override // com.avito.android.passport.profile_list_item.i
    public final void Td(boolean z12) {
        this.f213649g.setChecked(z12);
    }

    @Override // com.avito.android.passport.profile_list_item.i
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f213644b.setOnClickListener(new C(19, aVar));
        this.f213648f.setOnClickListener(new C(20, aVar));
    }

    @Override // com.avito.android.passport.profile_list_item.i
    public final void h(@Y61.k String str) {
        I5.a(this.f213647e, str, false);
    }

    @Override // com.avito.android.passport.profile_list_item.i
    public final void kP(boolean z12) {
        this.f213652j.setChecked(z12);
    }

    @Override // com.avito.android.passport.profile_list_item.i
    public final void l(@Y61.l Image image) {
        C35949t5.c(this.f213648f, image != null ? com.avito.android.image_loader.b.b(image) : null, null, null, null, 14);
        C29574b.a(this.f213648f);
    }
}
