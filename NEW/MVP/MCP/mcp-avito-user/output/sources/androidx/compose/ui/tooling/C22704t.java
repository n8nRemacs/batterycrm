package androidx.compose.ui.tooling;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import j.k0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ComposeViewAdapter.android.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010!\u001a\u00020\u00188\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010&\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020$0#¢\u0006\u0002\b%0\"8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010 ¨\u0006)"}, d2 = {"Landroidx/compose/ui/tooling/t;", "Landroid/widget/FrameLayout;", "", "Landroidx/compose/ui/tooling/U;", "b", "Ljava/util/List;", "getViewInfos$ui_tooling_release", "()Ljava/util/List;", "setViewInfos$ui_tooling_release", "(Ljava/util/List;)V", "viewInfos", "", "c", "getDesignInfoList$ui_tooling_release", "setDesignInfoList$ui_tooling_release", "designInfoList", "", "d", "Z", "getStitchTrees$ui_tooling_release", "()Z", "setStitchTrees$ui_tooling_release", "(Z)V", "stitchTrees", "Landroidx/compose/ui/tooling/animation/u;", "e", "Landroidx/compose/ui/tooling/animation/u;", "getClock$ui_tooling_release", "()Landroidx/compose/ui/tooling/animation/u;", "setClock$ui_tooling_release", "(Landroidx/compose/ui/tooling/animation/u;)V", "getClock$ui_tooling_release$annotations", "()V", "clock", "Landroidx/compose/runtime/y1;", "Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "content", "Landroidx/compose/runtime/y1;", "getContent$annotations", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.tooling.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22704t extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f42825f = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public List<U> viewInfos;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public List<String> designInfoList;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean stitchTrees;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.tooling.animation.u clock;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        super.dispatchDraw(canvas);
        throw null;
    }

    @Y61.k
    public final androidx.compose.ui.tooling.animation.u getClock$ui_tooling_release() {
        androidx.compose.ui.tooling.animation.u uVar = this.clock;
        if (uVar != null) {
            return uVar;
        }
        return null;
    }

    @Y61.k
    public final List<String> getDesignInfoList$ui_tooling_release() {
        return this.designInfoList;
    }

    /* renamed from: getStitchTrees$ui_tooling_release, reason: from getter */
    public final boolean getStitchTrees() {
        return this.stitchTrees;
    }

    @Y61.k
    public final List<U> getViewInfos$ui_tooling_release() {
        return this.viewInfos;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        throw null;
    }

    public final void setClock$ui_tooling_release(@Y61.k androidx.compose.ui.tooling.animation.u uVar) {
        this.clock = uVar;
    }

    public final void setDesignInfoList$ui_tooling_release(@Y61.k List<String> list) {
        this.designInfoList = list;
    }

    public final void setStitchTrees$ui_tooling_release(boolean z12) {
        this.stitchTrees = z12;
    }

    public final void setViewInfos$ui_tooling_release(@Y61.k List<U> list) {
        this.viewInfos = list;
    }

    @k0
    public static /* synthetic */ void getClock$ui_tooling_release$annotations() {
    }

    private static /* synthetic */ void getContent$annotations() {
    }
}
