package com.avito.android.beduin.common.component.grid_snippet_skeleton;

import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinGridSnippetSkeletonLayout.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/grid_snippet_skeleton/e;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f101421b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f101422c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f101423d;

    public e(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f101423d = new ArrayList();
        LayoutInflater.from(context).inflate(R.layout.beduin_grid_snippet_skeleton, (ViewGroup) this, true);
        this.f101421b = (SimpleDraweeView) findViewById(R.id.image);
        this.f101422c = (SimpleDraweeView) findViewById(R.id.title);
    }
}
