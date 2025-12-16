package com.avito.android.lib.design.action_menu;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.PopupWindow;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.action_menu.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActionMenu.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/action_menu/a;", "Landroid/widget/PopupWindow;", "LLV/a;", "Lcom/avito/android/lib/design/action_menu/d;", "Lcom/avito/android/lib/design/action_menu/e;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends PopupWindow implements LV.a<d, e> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final e f178217b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public d f178218c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final RecyclerView f178219d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final CardView f178220e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final b f178221f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, boolean r13, int r14, kotlin.jvm.internal.C42822w r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.action_menu.a.<init>(android.content.Context, android.util.AttributeSet, int, int, boolean, int, kotlin.jvm.internal.w):void");
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        d dVar = this.f178218c;
        if (dVar != null) {
            View view = dVar.f178230a;
            List<d.a> list = dVar.f178231b;
            d dVar2 = new d(view, list, false, dVar.f178233d, dVar.f178234e, dVar.f178235f);
            if (!new com.avito.android.lib.util.c(dVar2, dVar).f181333c) {
                this.f178218c = dVar2;
                if (!new com.avito.android.lib.util.c(false, dVar != null ? Boolean.valueOf(dVar.f178232c) : null).f181333c) {
                    super.dismiss();
                }
                if (!new com.avito.android.lib.util.c(list, dVar != null ? dVar.f178231b : null).f181333c && list != null) {
                    this.f178221f.m(list);
                }
            }
        }
        super.dismiss();
    }
}
