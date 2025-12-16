package com.avito.android.widget_filters.ui.items.location;

import Y41.p;
import android.view.View;
import com.avito.android.widget_filters.analytics.LocationSelectMethod;
import com.avito.android.widget_filters.model.SuggestedLocation;
import com.avito.android.widget_filters.ui.items.location.g;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f330504b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f330505c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f330506d;

    public /* synthetic */ j(k kVar, Object obj, int i12) {
        this.f330504b = i12;
        this.f330505c = kVar;
        this.f330506d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f330504b) {
            case 0:
                p<? super NP0.l, ? super LocationSelectMethod, G0> pVar = this.f330505c.f330531v;
                if (pVar != null) {
                    SuggestedLocation suggestedLocation = (SuggestedLocation) this.f330506d;
                    ((g.f) pVar).invoke(new NP0.l(suggestedLocation.f329930a, suggestedLocation.f329932c), LocationSelectMethod.f329697c);
                    break;
                }
                break;
            case 1:
                p<? super NP0.l, ? super LocationSelectMethod, G0> pVar2 = this.f330505c.f330531v;
                if (pVar2 != null) {
                    SuggestedLocation suggestedLocation2 = (SuggestedLocation) this.f330506d;
                    ((g.f) pVar2).invoke(new NP0.l(suggestedLocation2.f329930a, suggestedLocation2.f329932c), LocationSelectMethod.f329699e);
                    break;
                }
                break;
            default:
                p<? super NP0.l, ? super LocationSelectMethod, G0> pVar3 = this.f330505c.f330530u;
                if (pVar3 != null) {
                    pVar3.invoke((NP0.l) this.f330506d, LocationSelectMethod.f329698d);
                    break;
                }
                break;
        }
    }
}
