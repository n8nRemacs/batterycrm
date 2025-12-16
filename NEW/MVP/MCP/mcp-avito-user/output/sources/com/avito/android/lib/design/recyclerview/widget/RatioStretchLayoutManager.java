package com.avito.android.lib.design.recyclerview.widget;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.ranges.s;

/* compiled from: RatioStretchLayoutManager.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/lib/design/recyclerview/widget/RatioStretchLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RatioStretchLayoutManager extends LinearLayoutManager {

    /* renamed from: G, reason: collision with root package name */
    public final float f180172G;

    /* renamed from: H, reason: collision with root package name */
    public final int f180173H;

    /* compiled from: RatioStretchLayoutManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/recyclerview/widget/RatioStretchLayoutManager$a;", "", "<init>", "()V", "", "DEFAULT_RATIO", "F", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RatioStretchLayoutManager(Context context, int i12, boolean z12, float f12, int i13, int i14, C42822w c42822w) {
        i12 = (i14 & 2) != 0 ? 0 : i12;
        z12 = (i14 & 4) != 0 ? false : z12;
        f12 = (i14 & 8) != 0 ? 1.0f : f12;
        i13 = (i14 & 16) != 0 ? 0 : i13;
        super(i12, z12);
        this.f180172G = 1.0f;
        this.f180172G = s.a(f12, 0.0f);
        this.f180173H = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean K(@l RecyclerView.n nVar) {
        return nVar != null && ((ViewGroup.MarginLayoutParams) nVar).width == h2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    @k
    public final RecyclerView.n a0() {
        RecyclerView.n nVarA0 = super.a0();
        ((ViewGroup.MarginLayoutParams) nVarA0).width = h2();
        return nVarA0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @k
    public final RecyclerView.n b0(@l Context context, @l AttributeSet attributeSet) {
        RecyclerView.n nVar = new RecyclerView.n(context, attributeSet);
        ((ViewGroup.MarginLayoutParams) nVar).width = h2();
        return nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @k
    public final RecyclerView.n c0(@l ViewGroup.LayoutParams layoutParams) {
        RecyclerView.n nVarC0 = super.c0(layoutParams);
        ((ViewGroup.MarginLayoutParams) nVarC0).width = h2();
        return nVarC0;
    }

    public final int h2() {
        if (this.f53690r != 0 || o0() <= 1) {
            return -1;
        }
        return (int) ((((this.f53850p - getPaddingStart()) - getPaddingEnd()) - (this.f180173H * (this.f180172G > 0.0f ? ((int) (1.0f / r0)) - 1 : 0))) * this.f180172G);
    }

    public RatioStretchLayoutManager(@k Context context, @k AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.f180172G = 1.0f;
        this.f180173H = 0;
    }
}
