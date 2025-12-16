package com.avito.beduin.v2.component.common.lazy;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import kotlin.Metadata;

/* compiled from: LazyComponentViewHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/e;", "Landroidx/recyclerview/widget/RecyclerView$C;", "lazy-container_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class e extends RecyclerView.C {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f335691b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC36343m f335692c;

    public e(@k View view, @k InterfaceC36343m interfaceC36343m) {
        super(view);
        this.f335691b = view;
        this.f335692c = interfaceC36343m;
    }

    @l
    public abstract String B80();
}
