package com.avito.android.mnz_common.ui;

import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StickyRecyclerView.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/avito/android/mnz_common/ui/StickyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "dx", "getScrollDirection", "()I", "setScrollDirection", "(I)V", "scrollDirection", "a", "b", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StickyRecyclerView extends RecyclerView {

    /* renamed from: F0, reason: collision with root package name */
    public int f197986F0;

    /* compiled from: StickyRecyclerView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/mnz_common/ui/StickyRecyclerView$a;", "", "<init>", "()V", "", "SCROLL_DIRECTION_LEFT", "I", "SCROLL_DIRECTION_RIGHT", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StickyRecyclerView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mnz_common/ui/StickyRecyclerView$b;", "", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    static {
        new a(null);
    }

    public StickyRecyclerView(@k Context context, @k AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: getScrollDirection, reason: from getter */
    private final int getF197986F0() {
        return this.f197986F0;
    }

    private final void setScrollDirection(int i12) {
        this.f197986F0 = i12 >= 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean R(int i12, int i13) {
        View viewZ;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        int iM1 = linearLayoutManager.M1();
        View viewZ2 = linearLayoutManager.Z(linearLayoutManager.K1());
        if (viewZ2 != null && (viewZ = linearLayoutManager.Z(iM1)) != null) {
            int width = (getWidth() - viewZ.getWidth()) / 2;
            int width2 = viewZ2.getWidth() + ((getWidth() - viewZ2.getWidth()) / 2);
            int left = viewZ.getLeft() - width;
            int right = width2 - viewZ2.getRight();
            int i14 = this.f197986F0;
            if (i14 == 0) {
                D0(left, 0, null);
            } else if (i14 == 1) {
                D0(-right, 0, null);
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i12) {
        setScrollDirection(i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i12) {
    }
}
