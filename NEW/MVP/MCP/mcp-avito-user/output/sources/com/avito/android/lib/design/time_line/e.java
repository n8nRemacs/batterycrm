package com.avito.android.lib.design.time_line;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.surface.Surface;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.google.android.material.shape.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: TimeLineAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/time_line/e;", "Landroidx/recyclerview/widget/B;", "Lcom/avito/android/lib/design/time_line/c;", "Lcom/avito/android/lib/design/time_line/e$b;", "<init>", "()V", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends B<com.avito.android.lib.design.time_line.c, b> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public LayoutInflater f181000e;

    /* compiled from: TimeLineAdapter.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/avito/android/lib/design/time_line/e$a", "Landroidx/recyclerview/widget/o$f;", "Lcom/avito/android/lib/design/time_line/c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C23424o.f<com.avito.android.lib.design.time_line.c> {
        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean a(com.avito.android.lib.design.time_line.c cVar, com.avito.android.lib.design.time_line.c cVar2) {
            return cVar.equals(cVar2);
        }

        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean b(com.avito.android.lib.design.time_line.c cVar, com.avito.android.lib.design.time_line.c cVar2) {
            return cVar.f180970a == cVar2.f180970a;
        }

        @Override // androidx.recyclerview.widget.C23424o.f
        public final Object c(com.avito.android.lib.design.time_line.c cVar, com.avito.android.lib.design.time_line.c cVar2) {
            com.avito.android.lib.design.time_line.c cVar3 = cVar;
            com.avito.android.lib.design.time_line.c cVar4 = cVar2;
            q.f181024k.getClass();
            com.avito.android.lib.design.time_line.a aVarA = r.a(cVar3.f180971b, cVar4.f180971b);
            com.avito.android.lib.design.time_line.a aVarA2 = r.a(cVar3.f180972c, cVar4.f180972c);
            com.avito.android.lib.design.time_line.a aVarA3 = r.a(cVar3.f180973d, cVar4.f180973d);
            com.avito.android.lib.design.time_line.a aVarA4 = r.a(cVar3.f180974e, cVar4.f180974e);
            boolean z12 = cVar3.f180983n;
            PK0.n nVar = z12 ? cVar3.f180977h : cVar3.f180981l;
            boolean z13 = cVar4.f180983n;
            com.avito.android.lib.design.time_line.a aVarA5 = r.a(nVar, z13 ? cVar4.f180977h : cVar4.f180981l);
            com.avito.android.lib.design.time_line.a aVarA6 = r.a(Integer.valueOf(z12 ? cVar3.f180979j : cVar3.f180982m), Integer.valueOf(z13 ? cVar4.f180979j : cVar4.f180982m));
            int i12 = cVar3.f180980k;
            int i13 = cVar3.f180978i;
            Integer numValueOf = Integer.valueOf(z12 ? i13 : i12);
            int i14 = cVar4.f180980k;
            int i15 = cVar4.f180978i;
            com.avito.android.lib.design.time_line.a aVarA7 = r.a(numValueOf, Integer.valueOf(z13 ? i15 : i14));
            if (z12) {
                i12 = i13;
            }
            Integer numValueOf2 = Integer.valueOf(i12);
            if (z13) {
                i14 = i15;
            }
            com.avito.android.lib.design.time_line.a aVarA8 = r.a(numValueOf2, Integer.valueOf(i14));
            com.avito.android.lib.design.time_line.a aVarA9 = r.a(Integer.valueOf(cVar3.a()), Integer.valueOf(cVar4.a()));
            q qVar = new q(aVarA, aVarA2, aVarA3, aVarA4, aVarA5, aVarA6, aVarA7, aVarA8, aVarA9, r.a(Integer.valueOf(cVar3.f180975f), Integer.valueOf(cVar4.f180975f)));
            List listU = C42745f0.U(aVarA, aVarA2, aVarA3, aVarA4, aVarA5, aVarA6, aVarA7, aVarA8, aVarA9);
            if (!(listU instanceof Collection) || !listU.isEmpty()) {
                Iterator it = listU.iterator();
                while (it.hasNext()) {
                    if (!((com.avito.android.lib.design.time_line.a) it.next()).getF180965a()) {
                        return qVar;
                    }
                }
            }
            return null;
        }
    }

    /* compiled from: TimeLineAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/time_line/e$b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final View f181001b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ViewGroup f181002c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Surface f181003d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Surface f181004e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ImageView f181005f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final TextView f181006g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final ConstraintLayout f181007h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final Context f181008i;

        public b(@Y61.k View view, @Y61.k ViewGroup viewGroup) {
            super(view);
            this.f181001b = view;
            this.f181002c = viewGroup;
            this.f181003d = (Surface) view.findViewById(R.id.time_line_start_line);
            this.f181004e = (Surface) view.findViewById(R.id.time_line_end_line);
            this.f181005f = (ImageView) view.findViewById(R.id.time_line_status_icon);
            this.f181006g = (TextView) view.findViewById(R.id.time_line_text);
            this.f181007h = (ConstraintLayout) view.findViewById(R.id.time_line_container);
            this.f181008i = view.getContext();
        }
    }

    /* compiled from: TimeLineAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[TimeLineAlignment.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TimeLineAlignment timeLineAlignment = TimeLineAlignment.f180954b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TimeLineAlignment timeLineAlignment2 = TimeLineAlignment.f180954b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.avito.android.lib.design.time_line.b.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                com.avito.android.lib.design.time_line.b bVar = com.avito.android.lib.design.time_line.b.f180966b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public e() {
        super(new a());
    }

    public static void n(b bVar, TimeLineAlignment timeLineAlignment) {
        int iOrdinal = timeLineAlignment.ordinal();
        if (iOrdinal == 0) {
            TextView textView = bVar.f181006g;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
            bVar2.f44217u = 0;
            bVar2.f44219w = -1;
            textView.setLayoutParams(bVar2);
            bVar.f181006g.setGravity(8388611);
        } else if (iOrdinal == 1) {
            TextView textView2 = bVar.f181006g;
            ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams2;
            ImageView imageView = bVar.f181005f;
            bVar3.f44217u = imageView.getId();
            bVar3.f44219w = imageView.getId();
            textView2.setLayoutParams(bVar3);
            bVar.f181006g.setGravity(1);
        } else if (iOrdinal == 2) {
            TextView textView3 = bVar.f181006g;
            ViewGroup.LayoutParams layoutParams3 = textView3.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams3;
            bVar4.f44217u = -1;
            bVar4.f44219w = 0;
            textView3.setLayoutParams(bVar4);
            bVar.f181006g.setGravity(8388613);
        }
        bVar.f181003d.setVisibility(timeLineAlignment != TimeLineAlignment.f180954b ? 0 : 8);
        bVar.f181004e.setVisibility(timeLineAlignment == TimeLineAlignment.f180956d ? 8 : 0);
    }

    public static void o(b bVar, int i12) {
        Surface surface = bVar.f181004e;
        com.google.android.material.shape.q qVarS = s(com.avito.android.lib.design.time_line.b.f180967c);
        C35763c0 c35763c0 = new C35763c0(i12, null, null, null, 14, null);
        C35763c0 c35763c02 = new C35763c0(i12, null, null, null, 14, null);
        int i13 = Surface.f180656i;
        surface.a(qVarS, c35763c0, c35763c02, null, null);
    }

    public static void p(b bVar, int i12) {
        for (Surface surface : C42745f0.U(bVar.f181003d, bVar.f181004e)) {
            if (surface.getLayoutParams().height != i12) {
                ViewGroup.LayoutParams layoutParams = surface.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = i12;
                surface.setLayoutParams(layoutParams);
            }
        }
    }

    public static void q(b bVar, int i12) {
        Surface surface = bVar.f181003d;
        com.google.android.material.shape.q qVarS = s(com.avito.android.lib.design.time_line.b.f180966b);
        C35763c0 c35763c0 = new C35763c0(i12, null, null, null, 14, null);
        C35763c0 c35763c02 = new C35763c0(i12, null, null, null, 14, null);
        int i13 = Surface.f180656i;
        surface.a(qVarS, c35763c0, c35763c02, null, null);
    }

    public static void r(b bVar, TimeLineItemWidthType timeLineItemWidthType) {
        int measuredWidth = bVar.f181002c.getMeasuredWidth();
        ViewGroup viewGroup = bVar.f181002c;
        int paddingStart = ((measuredWidth - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd()) / timeLineItemWidthType.f180963b;
        ConstraintLayout constraintLayout = bVar.f181007h;
        if (constraintLayout.getLayoutParams().width != paddingStart) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = paddingStart;
            constraintLayout.setLayoutParams(layoutParams);
        }
    }

    public static com.google.android.material.shape.q s(com.avito.android.lib.design.time_line.b bVar) {
        float f12;
        float f13;
        q.b bVar2 = new q.b();
        int iOrdinal = bVar.ordinal();
        float f14 = 0.0f;
        float f15 = 2.0f;
        if (iOrdinal == 0) {
            f12 = 0.0f;
            f13 = 2.0f;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            f13 = 0.0f;
            f12 = 2.0f;
            f14 = 2.0f;
            f15 = 0.0f;
        }
        bVar2.k(f14);
        bVar2.n(f15);
        bVar2.e(f12);
        bVar2.h(f13);
        return bVar2.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        Drawable drawableA;
        b bVar = (b) c12;
        com.avito.android.lib.design.time_line.c item = getItem(i12);
        r(bVar, item.f180974e);
        Context context = bVar.f181008i;
        Integer num = item.f180971b;
        if (num == null || (drawableA = C35835l0.h(num.intValue(), context)) == null) {
            drawableA = C43852a.a(context, R.drawable.expected_ic_time_line_dot);
        }
        ImageView imageView = bVar.f181005f;
        imageView.setImageDrawable(drawableA);
        int i13 = item.f180980k;
        int i14 = item.f180978i;
        boolean z12 = item.f180983n;
        imageView.setImageTintList(ColorStateList.valueOf(z12 ? i14 : i13));
        TextView textView = bVar.f181006g;
        I5.a(textView, item.f180972c, false);
        com.avito.android.lib.design.text_view.e.a(textView, z12 ? item.f180977h : item.f180981l);
        textView.setTextColor(z12 ? item.f180979j : item.f180982m);
        n(bVar, item.f180973d);
        if (z12) {
            i13 = i14;
        }
        q(bVar, i13);
        o(bVar, item.a());
        p(bVar, item.f180975f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        LayoutInflater layoutInflaterFrom = this.f181000e;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            this.f181000e = layoutInflaterFrom;
        }
        return new b(layoutInflaterFrom.inflate(R.layout.time_line_item, viewGroup, false), viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12, List list) {
        b bVar = (b) c12;
        if (list.isEmpty()) {
            super.onBindViewHolder(bVar, i12, list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof q) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            qVar.f181025a.a(new g(this, bVar));
            qVar.f181026b.a(new h(this, bVar));
            qVar.f181027c.a(new i(this, bVar));
            qVar.f181028d.a(new j(this, bVar));
            qVar.f181029e.a(new k(this, bVar));
            qVar.f181030f.a(new l(this, bVar));
            qVar.f181031g.a(new m(this, bVar));
            qVar.f181032h.a(new n(this, bVar));
            qVar.f181033i.a(new o(this, bVar));
            qVar.f181034j.a(new f(this, bVar));
        }
    }
}
