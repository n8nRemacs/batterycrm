package com.avito.android.lib.design.chips;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.g;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AbsChipsAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/chips/b;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/lib/design/chips/u;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class b extends RecyclerView.Adapter<u> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final v f178724c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.l<h, G0> f178725d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f178726e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f178727f;

    /* renamed from: g, reason: collision with root package name */
    public final int f178728g;

    /* renamed from: h, reason: collision with root package name */
    public final int f178729h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public ArrayList f178730i = new ArrayList();

    /* compiled from: AbsChipsAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/b$a;", "Landroidx/recyclerview/widget/o$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C23424o.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f178731a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f178732b;

        public a(@Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2) {
            this.f178731a = arrayList;
            this.f178732b = arrayList2;
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final boolean areContentsTheSame(int i12, int i13) {
            return L.f(this.f178731a.get(i12), this.f178732b.get(i13));
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final boolean areItemsTheSame(int i12, int i13) {
            return L.f(((h) this.f178731a.get(i12)).getF114848c(), ((h) this.f178732b.get(i13)).getF114848c());
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final int getNewListSize() {
            return this.f178732b.size();
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public final int getOldListSize() {
            return this.f178731a.size();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@Y61.k v vVar, @Y61.l Y41.l<? super h, G0> lVar, boolean z12, boolean z13, int i12, int i13) {
        this.f178724c = vVar;
        this.f178725d = lVar;
        this.f178726e = z12;
        this.f178727f = z13;
        this.f178728g = i12;
        this.f178729h = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f178730i.size();
    }

    @Y61.l
    public final h j(int i12) {
        return (h) C42745f0.K(i12, this.f178730i);
    }

    public abstract void k(boolean z12, boolean z13, @Y61.k u uVar);

    public final void l(@Y61.k List<h> list) {
        C23424o.e eVarA = C23424o.a(new a(this.f178730i, (ArrayList) list), true);
        this.f178730i = new ArrayList(list);
        eVarA.b(this);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, final int i12) {
        boolean zC2;
        u uVar = (u) c12;
        final boolean z12 = this.f178730i.get(i12) instanceof ItemChipable;
        boolean z13 = true;
        v vVar = this.f178724c;
        if (z12) {
            zC2 = ((h) this.f178730i.get(i12)).getF262143e();
            if (!zC2) {
                vVar.d(i12, false, true);
            } else if (!vVar.c(i12)) {
                vVar.e(i12, false, true);
            }
        } else {
            zC2 = vVar.c(i12);
        }
        boolean z14 = this.f178726e && (!vVar.b() || vVar.c(i12)) && ((h) this.f178730i.get(i12)).getF287110c();
        boolean f178770j = ((h) this.f178730i.get(i12)).getF178770j();
        Button button = uVar.f178781b;
        button.setEnabled(z14);
        button.setSelected(zC2);
        k(f178770j, button.isSelected(), uVar);
        button.setText(((h) this.f178730i.get(i12)).getF114848c());
        ((h) this.f178730i.get(i12)).getClass();
        Integer f178767g = ((h) this.f178730i.get(i12)).getF178767g();
        ColorStateList colorStateListValueOf = f178767g != null ? ColorStateList.valueOf(f178767g.intValue()) : null;
        boolean zP1 = ((h) this.f178730i.get(i12)).P1();
        com.avito.android.lib.design.a.f178170a.getClass();
        if (((Boolean) com.avito.android.lib.design.a.f178174e.invoke()).booleanValue() || zP1) {
            boolean zA1 = ((h) this.f178730i.get(i12)).A1();
            e eVarE2 = ((h) this.f178730i.get(i12)).e2() != null ? ((h) this.f178730i.get(i12)).e2() : ((h) this.f178730i.get(i12)).getImage();
            e eVarQ1 = ((h) this.f178730i.get(i12)).q1();
            button.f(eVarE2 != null ? f.a(eVarE2, button.getContext()) : null, eVarQ1 != null ? f.a(eVarQ1, button.getContext()) : null, zA1, new c(this, i12));
            if (colorStateListValueOf != null) {
                button.setIconColor(colorStateListValueOf);
            }
        } else {
            e image = ((h) this.f178730i.get(i12)).getImage();
            if (image != null) {
                button.setImageDrawable(f.a(image, button.getContext()));
            }
            if (colorStateListValueOf != null) {
                button.setIconColor(colorStateListValueOf);
            }
            e eVarE22 = ((h) this.f178730i.get(i12)).e2();
            if (eVarE22 != null) {
                Button.g(button, f.a(eVarE22, button.getContext()), null, false, null, 14);
            }
            e eVarQ12 = ((h) this.f178730i.get(i12)).q1();
            if (eVarQ12 != null) {
                Button.g(button, null, f.a(eVarQ12, button.getContext()), false, new d(this, i12), 5);
            }
        }
        if (!this.f178727f) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.lib.design.chips.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f178721b.f178724c.e(i12, true, !z12);
                }
            });
        }
        ViewGroup.LayoutParams layoutParams = uVar.itemView.getLayoutParams();
        if (layoutParams instanceof FlexboxLayoutManager.LayoutParams) {
            ((FlexboxLayoutManager.LayoutParams) layoutParams).f348468f = 3.0f;
        }
        ArrayList arrayList = this.f178730i;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).Q1() != null) {
                    break;
                }
            }
            z13 = false;
        } else {
            z13 = false;
        }
        View viewFindViewById = uVar.itemView.findViewById(R.id.top_right_overlay_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        frameLayout.removeAllViews();
        if (z13) {
            View view = uVar.itemView;
            int i13 = this.f178728g;
            D6.f(view, 0, -i13, this.f178729h, 0, 9);
            g gVarQ1 = ((h) this.f178730i.get(i12)).Q1();
            if (gVarQ1 != null) {
                float fIntValue = this.f178729h;
                float fIntValue2 = i13;
                if (gVarQ1 instanceof g.b) {
                    ImageView imageView = new ImageView(frameLayout.getContext());
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    imageView.setTranslationX(fIntValue);
                    imageView.setTranslationY(fIntValue2);
                    imageView.setImageDrawable(C35835l0.h(((g.b) gVarQ1).f178745b, frameLayout.getContext()));
                    frameLayout.addView(imageView);
                    return;
                }
                if (gVarQ1 instanceof g.a) {
                    g.a aVar = (g.a) gVarQ1;
                    Integer num = aVar.f178742c;
                    if (num != null) {
                        fIntValue = num.intValue();
                    }
                    View view2 = aVar.f178741b;
                    view2.setTranslationX(fIntValue);
                    Integer num2 = aVar.f178743d;
                    if (num2 != null) {
                        fIntValue2 = num2.intValue();
                    }
                    view2.setTranslationY(fIntValue2);
                    frameLayout.addView(view2, view2.getLayoutParams());
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new u(C0.b(viewGroup, R.layout.design_button_viewholder_layout, viewGroup, false));
    }
}
