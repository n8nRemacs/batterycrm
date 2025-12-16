package com.avito.android.edit_text_field;

import com.avito.android.lib.design.tab_group.layout.d;
import com.avito.android.profile_management_core.edit_text_field.AboutPopup;
import com.avito.android.profile_management_core.edit_text_field.PopupTab;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: EditTextFieldView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_text_field/z;", "Lcom/avito/android/lib/design/tab_group/layout/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class z implements com.avito.android.lib.design.tab_group.layout.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AboutPopup f147073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f147074b;

    public z(AboutPopup aboutPopup, y yVar) {
        this.f147073a = aboutPopup;
        this.f147074b = yVar;
    }

    @Override // com.avito.android.lib.design.tab_group.layout.b
    public final void a(@Y61.l d.c cVar) {
        ArrayList arrayList = this.f147073a.f226608b;
        y yVar = this.f147074b;
        PopupTab popupTab = (PopupTab) C42745f0.K(cVar != null ? cVar.f180792b : yVar.f147047m.getSelectedTabPosition(), arrayList);
        if (popupTab != null) {
            yVar.b(popupTab);
        }
    }
}
