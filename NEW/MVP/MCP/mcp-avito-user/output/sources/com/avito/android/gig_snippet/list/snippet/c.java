package com.avito.android.gig_snippet.list.snippet;

import Y41.l;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f161051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GigShiftSnippetListItem f161052c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f161053d;

    public /* synthetic */ c(l lVar, GigShiftSnippetListItem gigShiftSnippetListItem) {
        this.f161051b = 0;
        this.f161053d = lVar;
        this.f161052c = gigShiftSnippetListItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeepLink deepLink;
        DeepLink deepLink2;
        l lVar = this.f161053d;
        GigShiftSnippetListItem gigShiftSnippetListItem = this.f161052c;
        switch (this.f161051b) {
            case 0:
                int i12 = f.f161059l;
                lVar.invoke(gigShiftSnippetListItem.f161031d);
                break;
            case 1:
                int i13 = f.f161059l;
                GigShiftSnippetButton gigShiftSnippetButton = gigShiftSnippetListItem.f161037j;
                if (gigShiftSnippetButton != null && (deepLink = gigShiftSnippetButton.f161021c) != null) {
                    lVar.invoke(deepLink);
                    break;
                }
                break;
            default:
                int i14 = f.f161059l;
                GigShiftSnippetButton gigShiftSnippetButton2 = gigShiftSnippetListItem.f161038k;
                if (gigShiftSnippetButton2 != null && (deepLink2 = gigShiftSnippetButton2.f161021c) != null) {
                    lVar.invoke(deepLink2);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c(GigShiftSnippetListItem gigShiftSnippetListItem, l lVar, int i12) {
        this.f161051b = i12;
        this.f161052c = gigShiftSnippetListItem;
        this.f161053d = lVar;
    }
}
