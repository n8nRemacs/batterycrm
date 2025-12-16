package com.avito.android.ai_assistant.adapter.segment_buttons;

import VU.b;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.ai_assistant.adapter.segment_buttons.a;
import com.avito.android.lib.design.button.Button;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestButtonsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/segment_buttons/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/konveyor/util/d;", "Lcom/avito/android/ai_assistant/adapter/segment_buttons/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements com.avito.konveyor.util.d<a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f88868b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f88869c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewGroup f88870d;

    public g(@k View view, @k e eVar) {
        super(view);
        this.f88868b = eVar;
        this.f88869c = view.getContext();
        this.f88870d = (ViewGroup) view.findViewById(R.id.suggest_buttons_item_container);
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        ViewGroup viewGroup;
        VU.b bVarB;
        a aVar2 = (a) aVar;
        ArrayList arrayList = aVar2.f88852f;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            viewGroup = this.f88870d;
            if (i12 >= size) {
                break;
            }
            a.C2619a c2619a = (a.C2619a) arrayList.get(i12);
            View childAt = viewGroup.getChildAt(i12);
            Button button = childAt instanceof Button ? (Button) childAt : null;
            Context context = this.f88869c;
            if (button == null) {
                button = new Button(context, null, 0, 0, 14, null);
                viewGroup.addView(button);
            }
            String str = c2619a.f88854b;
            if (str != null) {
                VU.b.f17147t.getClass();
                bVarB = b.a.b(context, str);
            } else {
                VU.b.f17147t.getClass();
                bVarB = b.a.b(context, aVar2.f88850d);
            }
            button.setStyle(bVarB);
            button.setState(new UU.a(c2619a.f88853a, null, false, false, false, new f(this, c2619a, aVar2), null, null, null, false, 990, null));
            i12++;
        }
        int childCount = viewGroup.getChildCount();
        for (int size2 = arrayList.size(); size2 < childCount; size2++) {
            viewGroup.removeViewAt(size2);
        }
        this.f88868b.b(aVar2);
    }
}
