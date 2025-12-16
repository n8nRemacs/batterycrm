package com.avito.android.profile.pro.impl.screen.item.avatar;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.component.user_hat.items.C29574b;
import com.avito.android.image_loader.n;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.profile.pro.impl.screen.item.avatar.ProfileProAvatarItem;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProAvatarView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avatar/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/avatar/f;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f222995e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f222996b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Badge f222997c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f222998d;

    /* compiled from: ProfileProAvatarView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ProfileProAvatarItem.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProfileProAvatarItem.Type type = ProfileProAvatarItem.Type.f222985b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ProfileProAvatarView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f222999l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f222999l = view;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(this.f222999l.getContext().getResources().getDimensionPixelSize(R.dimen.profile_pro_avatar_employee_badge_padding));
        }
    }

    public g(@k View view) {
        super(view);
        this.f222996b = (SimpleDraweeView) view.findViewById(R.id.avatar);
        this.f222997c = (Badge) view.findViewById(R.id.profile_pro_avatar_employee_badge);
        this.f222998d = C42727D.b(LazyThreadSafetyMode.f406616d, new b(view));
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.profile.pro.impl.screen.item.avatar.f
    public final void LM(@k ProfileProAvatarItem profileProAvatarItem, @k l<? super D90.a, G0> lVar) {
        C35949t5.c(this.f222996b, n.a(profileProAvatarItem.f222982c), null, null, null, 14);
        SimpleDraweeView simpleDraweeView = this.f222996b;
        C29574b.a(simpleDraweeView);
        simpleDraweeView.setOnClickListener(new ViewOnClickListenerC31042l(13, lVar));
        int iOrdinal = profileProAvatarItem.f222984e.ordinal();
        Badge badge = this.f222997c;
        if (iOrdinal == 0) {
            D6.w(badge);
            badge.setTranslationY(0.0f);
            View view = this.itemView;
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
            return;
        }
        if (iOrdinal != 1) {
            return;
        }
        D6.G(badge, true);
        ?? r82 = this.f222998d;
        badge.setTranslationY(((Number) r82.getValue()).intValue());
        View view2 = this.itemView;
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), ((Number) r82.getValue()).intValue());
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f222996b.setOnClickListener(null);
    }
}
