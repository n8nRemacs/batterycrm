package com.avito.android.saved_searches.presentation.settings;

import Fo0.InterfaceC13822a;
import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SavedSearchSettingsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/settings/e;", "", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f258747a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13822a, G0> f258748b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f258749c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f258750d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k View view, @k Dialog dialog, @k j jVar, @k com.avito.konveyor.adapter.a aVar, @k l<? super InterfaceC13822a, G0> lVar) {
        this.f258747a = aVar;
        this.f258748b = lVar;
        Context context = view.getContext();
        View viewFindViewById = view.findViewById(R.id.settings_back);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.settings_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f258749c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.settings_list);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f258750d = recyclerView;
        Button button = (Button) dialog.findViewById(R.id.main_button);
        Button button2 = (Button) dialog.findViewById(R.id.secondary_button);
        recyclerView.setAdapter(jVar);
        recyclerView.l(com.avito.android.saved_searches.presentation.core.e.f258402b, -1);
        final int i12 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.saved_searches.presentation.settings.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f258746c;

            {
                this.f258746c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f258746c.f258748b.invoke(InterfaceC13822a.C0303a.f5981a);
                        break;
                    default:
                        this.f258746c.f258748b.invoke(InterfaceC13822a.e.f5986a);
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.saved_searches.presentation.settings.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f258746c;

            {
                this.f258746c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f258746c.f258748b.invoke(InterfaceC13822a.C0303a.f5981a);
                        break;
                    default:
                        this.f258746c.f258748b.invoke(InterfaceC13822a.e.f5986a);
                        break;
                }
            }
        });
        com.avito.android.lib.design.button.b.a(button, context.getString(R.string.saved_search_save_button_title), false);
        D6.w(button2);
    }
}
