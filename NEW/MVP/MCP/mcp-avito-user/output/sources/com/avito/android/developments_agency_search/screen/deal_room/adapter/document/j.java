package com.avito.android.developments_agency_search.screen.deal_room.adapter.document;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DocumentItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/document/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/document/h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f137370b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f137371c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f137372d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f137373e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Spinner f137374f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f137375g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Y41.a<G0> f137376h;

    public j(@k View view) {
        super(view);
        this.f137370b = view;
        View viewFindViewById = view.findViewById(R.id.document_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137371c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.document_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f137372d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.document_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById3;
        button.setImageResource(R.drawable.common_ic_file_20);
        final int i12 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.developments_agency_search.screen.deal_room.adapter.document.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f137369c;

            {
                this.f137369c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        Y41.a<G0> aVar = this.f137369c.f137375g;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 1:
                        Y41.a<G0> aVar2 = this.f137369c.f137375g;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar3 = this.f137369c.f137376h;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        View viewFindViewById4 = view.findViewById(R.id.right_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f137373e = imageView;
        View viewFindViewById5 = view.findViewById(R.id.loading_progress_spinner);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f137374f = (Spinner) viewFindViewById5;
        final int i13 = 1;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.developments_agency_search.screen.deal_room.adapter.document.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f137369c;

            {
                this.f137369c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        Y41.a<G0> aVar = this.f137369c.f137375g;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 1:
                        Y41.a<G0> aVar2 = this.f137369c.f137375g;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar3 = this.f137369c.f137376h;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.developments_agency_search.screen.deal_room.adapter.document.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f137369c;

            {
                this.f137369c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        Y41.a<G0> aVar = this.f137369c.f137375g;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    case 1:
                        Y41.a<G0> aVar2 = this.f137369c.f137375g;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar3 = this.f137369c.f137376h;
                        if (aVar3 != null) {
                            aVar3.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.document.h
    public final void JO(@k Y41.a<G0> aVar) {
        this.f137376h = aVar;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.document.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f137375g = aVar;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.document.h
    public final void h(@l String str) {
        I5.a(this.f137372d, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.document.h
    public final void ib(@InterfaceC42150f @l Integer num) {
        ImageView imageView = this.f137373e;
        if (num == null) {
            imageView.setImageDrawable(null);
        } else {
            imageView.setImageResource(C35835l0.j(num.intValue(), imageView.getContext()));
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f137375g = null;
        this.f137376h = null;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.document.h
    public final void setOpacity(float f12) {
        this.f137370b.setAlpha(f12);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.document.h
    public final void setTitle(@k String str) {
        I5.a(this.f137371c, str, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.document.h
    public final void uu(boolean z12) {
        D6.G(this.f137374f, z12);
    }
}
