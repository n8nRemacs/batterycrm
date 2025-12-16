package com.avito.android.publish.input_imei;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import kotlin.Metadata;

/* compiled from: ImeiInputItemsDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/input_imei/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CategoryPublishStep.Params.ScanButtonData.Position f236224b;

    /* compiled from: ImeiInputItemsDecorator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.input_imei.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C7117a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f236225a;

        static {
            int[] iArr = new int[CategoryPublishStep.Params.ScanButtonData.Position.values().length];
            try {
                iArr[CategoryPublishStep.Params.ScanButtonData.Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CategoryPublishStep.Params.ScanButtonData.Position.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f236225a = iArr;
        }
    }

    public a(@Y61.k CategoryPublishStep.Params.ScanButtonData.Position position) {
        this.f236224b = position;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(@Y61.k android.graphics.Rect r5, @Y61.k android.view.View r6, @Y61.k androidx.recyclerview.widget.RecyclerView r7, @Y61.k androidx.recyclerview.widget.RecyclerView.z r8) {
        /*
            r4 = this;
            r7.getClass()
            int r6 = androidx.recyclerview.widget.RecyclerView.U(r6)
            int[] r7 = com.avito.android.publish.input_imei.a.C7117a.f236225a
            com.avito.android.remote.model.category_parameters.CategoryPublishStep$Params$ScanButtonData$Position r0 = r4.f236224b
            int r0 = r0.ordinal()
            r7 = r7[r0]
            r0 = 16
            r1 = 1
            r2 = 0
            if (r7 == r1) goto L3b
            r3 = 2
            if (r7 != r3) goto L35
            int r7 = r8.b()
            int r7 = r7 - r1
            if (r6 != r7) goto L26
            int r6 = com.avito.android.util.y6.b(r0)
            goto L41
        L26:
            int r7 = r8.b()
            int r7 = r7 - r3
            if (r6 != r7) goto L33
            r6 = 4
            int r6 = com.avito.android.util.y6.b(r6)
            goto L41
        L33:
            r6 = r2
            goto L41
        L35:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L3b:
            if (r6 != r1) goto L33
            int r6 = com.avito.android.util.y6.b(r0)
        L41:
            r5.set(r2, r6, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.input_imei.a.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
