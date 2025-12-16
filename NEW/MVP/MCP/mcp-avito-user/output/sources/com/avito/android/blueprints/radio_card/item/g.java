package com.avito.android.blueprints.radio_card.item;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.Checkmark;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RadioCardSelectItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/radio_card/item/g;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f106522k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ConstraintLayout f106523b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f106524c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f106525d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f106526e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f106527f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f106528g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f106529h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Checkmark f106530i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f106531j;

    public g(@k View view) {
        super(view);
        this.f106523b = (ConstraintLayout) view.findViewById(R.id.container);
        this.f106524c = (TextView) view.findViewById(R.id.title);
        this.f106525d = (TextView) view.findViewById(R.id.subheading);
        this.f106526e = (SimpleDraweeView) view.findViewById(R.id.image);
        this.f106527f = (TextView) view.findViewById(R.id.description);
        this.f106528g = (LinearLayout) view.findViewById(R.id.paragraphs);
        this.f106529h = (TextView) view.findViewById(R.id.link_button);
        this.f106530i = (Checkmark) view.findViewById(R.id.checkmark);
        this.f106531j = view.getContext();
    }
}
