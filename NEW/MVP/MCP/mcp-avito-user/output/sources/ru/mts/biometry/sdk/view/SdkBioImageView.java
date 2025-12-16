package ru.mts.biometry.sdk.view;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.avito.android.R;
import com.bumptech.glide.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import z91.c;

@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/mts/biometry/sdk/view/SdkBioImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/G0;", "setupAttrs", "(Landroid/util/AttributeSet;)V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class SdkBioImageView extends AppCompatImageView {

    /* renamed from: b, reason: collision with root package name */
    public Drawable f436536b;

    /* renamed from: c, reason: collision with root package name */
    public String f436537c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f436538d;

    @j
    public SdkBioImageView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            setupAttrs(attributeSet);
        }
        com.bumptech.glide.j jVarC = com.bumptech.glide.b.c(this);
        Object obj = this.f436536b;
        obj = obj == null ? this.f436537c : obj;
        i iVarD = jVarC.d(Drawable.class);
        iVarD.f338801A = obj;
        iVarD.f338803C = true;
        iVarD.o(this.f436538d).A(this);
    }

    private final void setupAttrs(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, c.m.f443895c);
        try {
            this.f436536b = typedArrayObtainStyledAttributes.getDrawable(0);
            this.f436537c = typedArrayObtainStyledAttributes.getString(1);
            this.f436538d = typedArrayObtainStyledAttributes.getDrawable(2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        setMeasuredDimension(View.getDefaultSize((int) getResources().getDimension(R.dimen.sdk_bio_onboarding_main_image_size), i12), View.getDefaultSize((int) getResources().getDimension(R.dimen.sdk_bio_onboarding_main_image_size), i13));
    }

    public /* synthetic */ SdkBioImageView(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }
}
