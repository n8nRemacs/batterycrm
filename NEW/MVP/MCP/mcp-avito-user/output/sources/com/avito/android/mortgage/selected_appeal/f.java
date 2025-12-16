package com.avito.android.mortgage.selected_appeal;

import Y61.k;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectedAppealHeaderView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/f;", "", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ImageView f203433a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f203434b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f203435c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f203436d;

    /* compiled from: SelectedAppealHeaderView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/f$a;", "Landroid/view/ViewOutlineProvider;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(@k View view, @k Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), view.getHeight() / 2.0f);
        }
    }

    public f(@k View view) {
        View viewFindViewById = view.findViewById(R.id.close_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f203433a = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById2;
        this.f203434b = imageView;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f203435c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f203436d = (TextView) viewFindViewById4;
        imageView.setOutlineProvider(new a());
        imageView.setClipToOutline(true);
    }
}
