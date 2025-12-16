package com.avito.android.guests_selector;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.guests_selector.mvi.entity.state.entity.ActivePageType;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.printable_text.PrintableText;
import gI.InterfaceC40585a;
import hI.C40829c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GuestsSelectorView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/o;", "Lcom/avito/android/guests_selector/m;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f161575a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC40585a, G0> f161576b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f161577c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f161578d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f161579e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f161580f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Picker f161581g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.picker.m f161582h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public C40829c f161583i;

    /* compiled from: GuestsSelectorView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ActivePageType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActivePageType activePageType = ActivePageType.f161554b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k Y41.l<? super InterfaceC40585a, G0> lVar, @Y61.l PrintableText printableText, @Y61.k j jVar) {
        this.f161575a = dVar;
        this.f161576b = lVar;
        Context context = view.getContext();
        this.f161577c = context;
        View viewFindViewById = view.findViewById(R.id.toolbarTitle);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f161578d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.toolbarSubtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f161579e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.toolbarBackIcon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.recycler);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        this.f161580f = recyclerView;
        View viewFindViewById5 = view.findViewById(R.id.picker);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.picker.Picker");
        }
        this.f161581g = (Picker) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.accept);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById6;
        this.f161582h = new com.avito.android.lib.design.picker.m(null, false, -1, 1, null);
        recyclerView.setAdapter(dVar);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.l(jVar, -1);
        if (printableText != null) {
            button.setText(printableText.k0(context));
        }
        final int i12 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.guests_selector.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f161574c;

            {
                this.f161574c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f161574c.f161576b.invoke(InterfaceC40585a.c.f396423a);
                        break;
                    default:
                        this.f161574c.f161576b.invoke(InterfaceC40585a.C11203a.f396421a);
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.guests_selector.n

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f161574c;

            {
                this.f161574c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f161574c.f161576b.invoke(InterfaceC40585a.c.f396423a);
                        break;
                    default:
                        this.f161574c.f161576b.invoke(InterfaceC40585a.C11203a.f396421a);
                        break;
                }
            }
        });
    }
}
