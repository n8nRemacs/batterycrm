package com.avito.android.social_management.adapter.vk_group;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.social_management.adapter.SocialItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VkGroupItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/social_management/adapter/vk_group/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/social_management/adapter/vk_group/h;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f284559b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f284560c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f284561d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f284562e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f284563f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f284564g;

    /* compiled from: VkGroupItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SocialItem.VkGroupItem.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SocialItem.VkGroupItem.Type type = SocialItem.VkGroupItem.Type.f284492b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public i(@k View view) {
        super(view);
        this.f284559b = view;
        View viewFindViewById = view.findViewById(R.id.social_networks_vk_group_row_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f284560c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.social_networks_vk_group_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f284561d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.social_networks_vk_group_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f284562e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.social_networks_vk_group_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f284563f = (ImageView) viewFindViewById4;
    }

    @Override // com.avito.android.social_management.adapter.vk_group.h
    @k
    public final z<G0> A() {
        return C37722i.a(this.f284559b);
    }

    @Override // com.avito.android.social_management.adapter.vk_group.h
    public final void SV(@k SocialItem.VkGroupItem vkGroupItem) {
        I5.a(this.f284561d, vkGroupItem.f284486c, false);
        TextView textView = this.f284562e;
        I5.a(textView, vkGroupItem.f284487d, false);
        int iOrdinal = vkGroupItem.f284488e.ordinal();
        View view = this.f284560c;
        ImageView imageView = this.f284563f;
        if (iOrdinal == 0) {
            D6.w(imageView);
            textView.setTextColor(C35835l0.d(R.attr.gray48, view.getContext()));
        } else {
            if (iOrdinal != 1) {
                return;
            }
            D6.H(imageView);
            textView.setTextColor(C35835l0.d(R.attr.red700, view.getContext()));
        }
    }

    @Override // com.avito.android.social_management.adapter.vk_group.h
    public final void d(@l Y41.a<G0> aVar) {
        this.f284564g = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f284564g;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
