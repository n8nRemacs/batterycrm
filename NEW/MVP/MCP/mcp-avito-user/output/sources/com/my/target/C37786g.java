package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.H;
import com.my.target.c7;
import e11.C39867f1;
import e11.C39922y0;
import e11.C39924z;
import java.util.ArrayList;

/* renamed from: com.my.target.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37786g extends RecyclerView.Adapter<b> {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Context f364838c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final ArrayList f364839d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public c7.b f364840e;

    /* renamed from: com.my.target.g$a */
    public static class a extends FrameLayout {
        @Override // android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i12, int i13) {
            int size = View.MeasureSpec.getSize(i12);
            int size2 = View.MeasureSpec.getSize(i13);
            int mode = View.MeasureSpec.getMode(i12);
            int mode2 = View.MeasureSpec.getMode(i13);
            if (size == 0) {
                size = 0;
            }
            if (size2 == 0) {
                size2 = 0;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
        }
    }

    /* renamed from: com.my.target.g$b */
    public static class b extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final C39922y0 f364841b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        public final FrameLayout f364842c;

        public b(@j.N a aVar, @j.N C39922y0 c39922y0, @j.N FrameLayout frameLayout) {
            super(aVar);
            this.f364841b = c39922y0;
            this.f364842c = frameLayout;
        }
    }

    /* renamed from: com.my.target.g$c */
    public interface c extends View.OnClickListener {
    }

    public C37786g(@j.N Context context) {
        this.f364838c = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f364839d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        if (i12 == 0) {
            return 1;
        }
        return i12 == this.f364839d.size() - 1 ? 2 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@j.N RecyclerView.C c12, int i12) {
        c7 c7Var;
        H.a aVar;
        b bVar = (b) c12;
        c7.b bVar2 = this.f364840e;
        if (bVar2 != null && (aVar = (c7Var = c7.this).f364767J0) != null) {
            aVar.b(i12, c7Var.getContext());
        }
        ArrayList arrayList = this.f364839d;
        C39867f1 c39867f1 = i12 < arrayList.size() ? (C39867f1) arrayList.get(i12) : null;
        com.my.target.common.models.b bVar3 = c39867f1 != null ? c39867f1.f394716o : null;
        if (bVar3 != null) {
            C39922y0 c39922y0 = bVar.f364841b;
            int i13 = bVar3.f394305b;
            int i14 = bVar3.f394306c;
            c39922y0.f394908e = i13;
            c39922y0.f394907d = i14;
            Bitmap bitmapA = bVar3.a();
            C39922y0 c39922y02 = bVar.f364841b;
            if (bitmapA != null) {
                c39922y02.setImageBitmap(bitmapA);
            } else {
                C37802o.c(bVar3, c39922y02, null);
            }
        }
        bVar.f364841b.setContentDescription("card_" + i12);
        bVar.f364842c.setOnClickListener(this.f364840e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @j.N
    public final RecyclerView.C onCreateViewHolder(@j.N ViewGroup viewGroup, int i12) {
        Context context = this.f364838c;
        a aVar = new a(context);
        aVar.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        C39922y0 c39922y0 = new C39922y0(context);
        C39924z.m(c39922y0, "card_media_view");
        aVar.addView(c39922y0, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        if (viewGroup.isClickable()) {
            C39924z.g(frameLayout, 0, 1153821432);
        }
        aVar.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return new b(aVar, c39922y0, frameLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewRecycled(@j.N androidx.recyclerview.widget.RecyclerView.C r5) {
        /*
            r4 = this;
            com.my.target.g$b r5 = (com.my.target.C37786g.b) r5
            int r0 = r5.getAdapterPosition()
            r1 = 0
            if (r0 <= 0) goto L18
            java.util.ArrayList r2 = r4.f364839d
            int r3 = r2.size()
            if (r0 >= r3) goto L18
            java.lang.Object r0 = r2.get(r0)
            e11.f1 r0 = (e11.C39867f1) r0
            goto L19
        L18:
            r0 = r1
        L19:
            e11.y0 r2 = r5.f364841b
            r2.setImageData(r1)
            if (r0 == 0) goto L23
            com.my.target.common.models.b r0 = r0.f394716o
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == 0) goto L29
            com.my.target.C37802o.b(r0, r2)
        L29:
            android.widget.FrameLayout r5 = r5.f364842c
            r5.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.C37786g.onViewRecycled(androidx.recyclerview.widget.RecyclerView$C):void");
    }
}
