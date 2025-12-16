package com.avito.android.component.user_hat.items;

import android.view.View;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.component.user_hat.ProfileStatus;
import com.avito.android.component.user_hat.ProfileType;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import hw.InterfaceC41177b;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ParticularProfile.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/component/user_hat/items/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/component/user_hat/items/j;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f125335k = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f125336b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f125337c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f125338d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f125339e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f125340f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Badge f125341g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Object f125342h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Object f125343i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Object f125344j;

    /* compiled from: ParticularProfile.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ProfileType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProfileType profileType = ProfileType.f125289b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ParticularProfile.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return com.avito.android.advert.item.delivery_suggests.l.n(l.this.f125336b, R.dimen.passport_user_hat_item_avatar_selected_size);
        }
    }

    /* compiled from: ParticularProfile.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Integer> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return com.avito.android.advert.item.delivery_suggests.l.n(l.this.f125336b, R.dimen.passport_user_hat_item_avatar_size);
        }
    }

    /* compiled from: ParticularProfile.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Integer> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return com.avito.android.advert.item.delivery_suggests.l.n(l.this.f125336b, R.dimen.passport_user_hat_item_badge_padding);
        }
    }

    public l(@Y61.k View view) {
        super(view);
        this.f125336b = view;
        this.f125337c = (SimpleDraweeView) view.findViewById(R.id.passport_profile_item_avatar);
        this.f125338d = (ImageView) view.findViewById(R.id.passport_profile_item_current_stroke);
        this.f125339e = (ImageView) view.findViewById(R.id.passport_profile_item_pending);
        this.f125340f = (ImageView) view.findViewById(R.id.passport_profile_item_error);
        this.f125341g = (Badge) view.findViewById(R.id.passport_profile_item_employee_badge);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f125342h = C42727D.b(lazyThreadSafetyMode, new c());
        this.f125343i = C42727D.b(lazyThreadSafetyMode, new b());
        this.f125344j = C42727D.b(lazyThreadSafetyMode, new d());
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.component.user_hat.items.j
    public final void B9(@Y61.k ProfileStatus profileStatus, @Y61.k ProfileType profileType) {
        int iOrdinal = profileType.ordinal();
        ImageView imageView = this.f125340f;
        ImageView imageView2 = this.f125339e;
        View view = this.f125336b;
        Badge badge = this.f125341g;
        if (iOrdinal == 0) {
            D6.w(badge);
            badge.setTranslationY(0.0f);
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
            D6.G(imageView2, profileStatus == ProfileStatus.f125285c);
            D6.G(imageView, profileStatus == ProfileStatus.f125284b);
            return;
        }
        if (iOrdinal != 1) {
            return;
        }
        D6.G(badge, true);
        ?? r82 = this.f125344j;
        badge.setTranslationY(((Number) r82.getValue()).intValue());
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ((Number) r82.getValue()).intValue());
        D6.w(imageView2);
        D6.w(imageView);
    }

    @Override // com.avito.android.component.user_hat.items.j
    public final void Jj(@Y61.k String str) {
        this.f125336b.setTag(R.id.passport_profile_user_id_tag, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.component.user_hat.items.j
    public final void Td(boolean z12) {
        int iIntValue = z12 ? ((Number) this.f125343i.getValue()).intValue() : ((Number) this.f125342h.getValue()).intValue();
        int iB2 = z12 ? y6.b(2) : 0;
        D6.G(this.f125338d, z12);
        SimpleDraweeView simpleDraweeView = this.f125337c;
        simpleDraweeView.getLayoutParams().width = iIntValue;
        simpleDraweeView.getLayoutParams().height = iIntValue;
        this.f125339e.setPadding(iB2, iB2, iB2, iB2);
        this.f125340f.setPadding(iB2, iB2, iB2, iB2);
    }

    @Override // com.avito.android.component.user_hat.f
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f125336b.setOnClickListener(new k(0, aVar));
    }

    @Override // com.avito.android.component.user_hat.items.j
    public final void l(@Y61.l Image image) {
        C35949t5.c(this.f125337c, image != null ? com.avito.android.image_loader.b.b(image) : null, null, null, null, 14);
        C29574b.a(this.f125337c);
    }
}
