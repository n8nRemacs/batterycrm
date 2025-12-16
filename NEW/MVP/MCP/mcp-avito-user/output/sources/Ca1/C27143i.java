package ca1;

import Au.ViewOnClickListenerC13080b;
import android.view.ViewGroup;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;

/* renamed from: ca1.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27143i extends B {

    /* renamed from: f, reason: collision with root package name */
    public static final C27142h f57946f = new C27142h();

    /* renamed from: e, reason: collision with root package name */
    public final C27135a f57947e;

    public C27143i(C27135a c27135a) {
        super(f57946f);
        this.f57947e = c27135a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        C27141g c27141g = (C27141g) c12;
        I91.d dVar = (I91.d) getItem(i12);
        Ca1.d.a(new ViewOnClickListenerC13080b(27, c27141g.f57945c, dVar), c27141g.itemView);
        c27141g.f57944b.setText(dVar.f8028a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new C27141g(this, C0.b(viewGroup, R.layout.sdk_bio_item_address_search, viewGroup, false));
    }
}
