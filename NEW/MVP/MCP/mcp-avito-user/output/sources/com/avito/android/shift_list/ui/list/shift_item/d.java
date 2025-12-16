package com.avito.android.shift_list.ui.list.shift_item;

import Y41.l;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig_snippet.list.snippet.GigShiftSnippetButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f281131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ShiftItem f281132c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f281133d;

    public /* synthetic */ d(l lVar, ShiftItem shiftItem) {
        this.f281131b = 0;
        this.f281133d = lVar;
        this.f281132c = shiftItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeepLink deepLink;
        DeepLink deepLink2;
        l lVar = this.f281133d;
        ShiftItem shiftItem = this.f281132c;
        switch (this.f281131b) {
            case 0:
                int i12 = g.f281138k;
                lVar.invoke(shiftItem.f281117d);
                break;
            case 1:
                int i13 = g.f281138k;
                GigShiftSnippetButton gigShiftSnippetButton = shiftItem.f281123j;
                if (gigShiftSnippetButton != null && (deepLink = gigShiftSnippetButton.f161021c) != null) {
                    lVar.invoke(deepLink);
                    break;
                }
                break;
            default:
                int i14 = g.f281138k;
                GigShiftSnippetButton gigShiftSnippetButton2 = shiftItem.f281124k;
                if (gigShiftSnippetButton2 != null && (deepLink2 = gigShiftSnippetButton2.f161021c) != null) {
                    lVar.invoke(deepLink2);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d(ShiftItem shiftItem, l lVar, int i12) {
        this.f281131b = i12;
        this.f281132c = shiftItem;
        this.f281133d = lVar;
    }
}
