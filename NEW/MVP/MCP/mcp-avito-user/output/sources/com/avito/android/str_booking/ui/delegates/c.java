package com.avito.android.str_booking.ui.delegates;

import Jx0.C14258a;
import Vx0.AbstractC15725a;
import Y41.r;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.str_booking.network.models.common.Prompt;
import com.avito.android.str_booking.network.models.sections.FooterContent;
import com.avito.android.util.D6;
import java.util.Map;
import kotlin.Function4;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FooterDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/ui/delegates/c;", "", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class c {

    /* compiled from: FooterDelegate.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f285993m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ View f285994n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FrameLayout frameLayout, View view) {
            super(0);
            this.f285993m = frameLayout;
            this.f285994n = view;
        }

        @Override // Y41.a
        public final G0 invoke() {
            boolean zB2 = c.this.b();
            FrameLayout frameLayout = this.f285993m;
            if (zB2) {
                frameLayout.setTranslationY(frameLayout.getHeight());
            }
            View viewFindViewById = this.f285994n.findViewById(R.id.str_booking_sections_recycler);
            viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), frameLayout.getHeight());
            return G0.f406611a;
        }
    }

    public final void a(@k View view, @l FooterContent footerContent, @l r<? super AbstractC15725a, ? super Map<String, String>, ? super Prompt, ? super C14258a, G0> rVar) {
        View viewFindViewById = view.findViewById(R.id.str_booking_footer);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        D6.l(true, frameLayout, new a(frameLayout, view));
        View viewFindViewById2 = view.findViewById(R.id.str_booking_payment_block);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        Banner banner = (Banner) viewFindViewById2;
        TextView textView = (TextView) banner.findViewById(R.id.str_payment_text);
        LinearLayout linearLayout = (LinearLayout) banner.findViewById(R.id.str_booking_footer_buttons_container);
        kotlin.c.b(textView, footerContent != null ? footerContent.getDescription() : null);
        View viewFindViewById3 = view.findViewById(R.id.str_payment_button_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
        }
        D6.H((LinearLayoutCompat) viewFindViewById3);
        Function4.b(linearLayout, footerContent != null ? footerContent.c() : null, view, rVar);
    }

    public boolean b() {
        return false;
    }

    public void c(@k View view) {
    }

    public void d(@k View view) {
    }
}
