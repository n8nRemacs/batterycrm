package com.avito.android.user_adverts.tab_actions.host.items;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.user_adverts.tab_actions.host.items.UserAdvertSingleActionItem;
import com.avito.android.util.C35835l0;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertActionItemViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/items/r;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f314348h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f314349b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f314350c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Spinner f314351d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f314352e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f314353f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f314354g;

    /* compiled from: UserAdvertActionItemViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[UserAdvertSingleActionItem.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UserAdvertSingleActionItem.Type type = UserAdvertSingleActionItem.Type.f314310b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: UserAdvertActionItemViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/res/ColorStateList;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ColorStateList> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ColorStateList invoke() {
            return ColorStateList.valueOf(C35835l0.d(R.attr.text_error, r.this.f314349b));
        }
    }

    /* compiled from: UserAdvertActionItemViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/res/ColorStateList;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<ColorStateList> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final ColorStateList invoke() {
            return ColorStateList.valueOf(C35835l0.d(R.attr.text_primary, r.this.f314349b));
        }
    }

    public r(@Y61.k View view) {
        super(view);
        this.f314349b = view.getContext();
        this.f314350c = (TextView) view.findViewById(R.id.user_adverts_actions_item_name);
        this.f314351d = (Spinner) view.findViewById(R.id.user_adverts_action_item_loading);
        this.f314352e = (ImageView) view.findViewById(R.id.user_adverts_action_item_icon);
        b bVar = new b();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f314353f = C42727D.b(lazyThreadSafetyMode, bVar);
        this.f314354g = C42727D.b(lazyThreadSafetyMode, new c());
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.itemView.setOnClickListener(null);
    }
}
