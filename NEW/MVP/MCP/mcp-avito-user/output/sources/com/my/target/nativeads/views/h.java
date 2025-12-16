package com.my.target.nativeads.views;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.C37802o;
import com.my.target.H;
import com.my.target.nativeads.views.j;
import e11.C39922y0;
import j.N;
import j.P;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class h extends RecyclerView implements H, j.a {

    /* renamed from: F0, reason: collision with root package name */
    @P
    public H.a f365035F0;

    /* renamed from: G0, reason: collision with root package name */
    @P
    public c f365036G0;

    public class a implements b {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }
    }

    public interface b extends View.OnClickListener {
    }

    public static abstract class c extends RecyclerView.Adapter<e> {

        /* renamed from: c, reason: collision with root package name */
        @N
        public final ArrayList f365037c = new ArrayList();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f365037c.size();
        }

        @N
        public abstract k j();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@N RecyclerView.C c12, int i12) {
            k11.d dVar;
            String str;
            e eVar = (e) c12;
            ArrayList arrayList = this.f365037c;
            if (i12 < arrayList.size() && (dVar = (k11.d) arrayList.get(i12)) != null) {
                k kVar = eVar.f365038b;
                com.my.target.common.models.b bVar = dVar.f406022d;
                if (bVar != null) {
                    kVar.getMediaAdView().b(bVar.f394305b, bVar.f394306c);
                    if (bVar.a() != null) {
                        kVar.getMediaAdView().getImageView().setImageBitmap(bVar.a());
                    } else {
                        C37802o.c(bVar, kVar.getMediaAdView().getImageView(), null);
                    }
                }
                kVar.getTitleTextView().setText(dVar.f406019a);
                kVar.getDescriptionTextView().setText(dVar.f406020b);
                Button ctaButtonView = kVar.getCtaButtonView();
                String str2 = dVar.f406021c;
                ctaButtonView.setText(str2);
                kVar.getCtaButtonView().setContentDescription(str2);
                if ((kVar instanceof l) && (str = dVar.f406023e) != null) {
                    ((l) kVar).a().setText(str);
                }
            }
            eVar.f365038b.getView().setContentDescription("card_" + i12);
            k kVar2 = eVar.f365038b;
            kVar2.getView().setOnClickListener(null);
            kVar2.getCtaButtonView().setOnClickListener(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @N
        public final RecyclerView.C onCreateViewHolder(@N ViewGroup viewGroup, int i12) {
            return new e(j());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(@N RecyclerView.C c12) {
            k11.d dVar;
            com.my.target.common.models.b bVar;
            e eVar = (e) c12;
            int layoutPosition = eVar.getLayoutPosition();
            k kVar = eVar.f365038b;
            C39922y0 c39922y0 = (C39922y0) kVar.getMediaAdView().getImageView();
            c39922y0.setImageData(null);
            if (layoutPosition > 0) {
                ArrayList arrayList = this.f365037c;
                if (layoutPosition < arrayList.size() && (dVar = (k11.d) arrayList.get(layoutPosition)) != null && (bVar = dVar.f406022d) != null) {
                    C37802o.b(bVar, c39922y0);
                }
            }
            kVar.getView().setOnClickListener(null);
            kVar.getCtaButtonView().setOnClickListener(null);
            super.onViewRecycled(eVar);
        }
    }

    public static final class d extends RecyclerView.l {
        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void getItemOffsets(@N Rect rect, @N View view, @N RecyclerView recyclerView, @N RecyclerView.z zVar) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            recyclerView.getClass();
            int iU2 = RecyclerView.U(view);
            if (zVar.b() == 1) {
                return;
            }
            if (iU2 == 0) {
                rect.right = 0;
            } else if (iU2 == zVar.b() - 1) {
                rect.left = 0;
            } else {
                rect.right = 0;
                rect.left = 0;
            }
        }
    }

    public static class e extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @N
        public final k f365038b;

        public e(@N k kVar) {
            super(kVar.getView());
            kVar.getView().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            this.f365038b = kVar;
        }
    }

    @Override // com.my.target.H
    public final void a(@N Parcelable parcelable) {
        throw null;
    }

    @Override // com.my.target.H
    @P
    public Parcelable getState() {
        throw null;
    }

    @Override // com.my.target.H
    @N
    public int[] getVisibleCardNumbers() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i12) {
        if (i12 == 0) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        if (adapter instanceof c) {
            setPromoCardAdapter((c) adapter);
        }
    }

    public void setPromoCardAdapter(@P c cVar) {
        if (cVar == null) {
            return;
        }
        this.f365036G0 = cVar;
        setLayoutManager(null);
        K0(this.f365036G0, true);
    }

    @Override // com.my.target.H
    public void setPromoCardSliderListener(@P H.a aVar) {
        this.f365035F0 = aVar;
    }

    @Override // com.my.target.H
    public final void dispose() {
    }
}
