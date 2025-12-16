package com.avito.android.user_address.list.view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.user_address.CompositeLocationTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SingleAddressItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_address/list/view/SingleAddressItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SingleAddressItemView extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f307425e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CompositeLocationTextView f307426b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f307427c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f307428d;

    public SingleAddressItemView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.single_address_item_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.user_address.CompositeLocationTextView");
        }
        CompositeLocationTextView compositeLocationTextView = (CompositeLocationTextView) viewFindViewById;
        compositeLocationTextView.a(R.attr.textM20, R.attr.black);
        this.f307426b = compositeLocationTextView;
        View viewFindViewById2 = findViewById(R.id.text_location);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f307427c = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.clickable_layout);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f307428d = viewFindViewById3;
    }
}
