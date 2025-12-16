package com.avito.android.gig_apply.ui.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.design.State;
import com.avito.android.lib.deprecated_design.badge_bar.ImageLoadableView;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.C35835l0;
import gw.InterfaceC40743a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GigSlotBanner.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/gig_apply/ui/common/GigSlotBanner;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "text", "Lkotlin/G0;", "setTitle", "(Ljava/lang/String;)V", "setDescription", ContextActionHandler.Link.URL, "setImageUrl", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigSlotBanner extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f159892b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f159893c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageLoadableView f159894d;

    /* compiled from: ImageLoadableExtension.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/graphics/drawable/Drawable;", "drawable", "Lkotlin/G0;", "invoke", "(Landroid/graphics/drawable/Drawable;)V", "com/avito/android/image_loader/fresco/q", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Drawable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40743a f159895l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC40743a interfaceC40743a) {
            super(1);
            this.f159895l = interfaceC40743a;
        }

        @Override // Y41.l
        public final G0 invoke(Drawable drawable) {
            this.f159895l.setState(State.f135882f);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageLoadableExtension.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "com/avito/android/image_loader/fresco/r", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40743a f159896l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC40743a interfaceC40743a) {
            super(0);
            this.f159896l = interfaceC40743a;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f159896l.setState(State.f135881e);
            return G0.f406611a;
        }
    }

    @X41.j
    public GigSlotBanner(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setDescription(@Y61.k String text) {
        this.f159893c.setText(text);
    }

    public final void setImageUrl(@Y61.k String url) {
        Uri uri = Uri.parse(url);
        ImageLoadableView imageLoadableView = this.f159894d;
        com.avito.android.image_loader.fresco.s.c(imageLoadableView, uri, true, new a(imageLoadableView), new b(imageLoadableView));
    }

    public final void setTitle(@Y61.k String text) {
        this.f159892b.setText(text);
    }

    public GigSlotBanner(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.gig_slot_banner, (ViewGroup) this, true);
        this.f159892b = (TextView) findViewById(R.id.text_view_title);
        this.f159893c = (TextView) findViewById(R.id.text_view_description);
        this.f159894d = (ImageLoadableView) findViewById(R.id.image_view);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackground(C35835l0.h(R.attr.warmGray4, context));
        setForeground(C35835l0.h(android.R.attr.selectableItemBackground, context));
        com.avito.android.lib.util.v.b(this, R.dimen.gig_slot_banner_corner_radius);
    }
}
