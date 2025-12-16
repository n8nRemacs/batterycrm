package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.shortcut_navigation_bar.InlineAction;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.shortcut_navigation_bar.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC34987d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f283375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C34989f f283376c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InlineAction f283377d;

    public /* synthetic */ ViewOnClickListenerC34987d(InlineAction inlineAction, C34989f c34989f, int i12) {
        this.f283375b = i12;
        this.f283377d = inlineAction;
        this.f283376c = c34989f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f283375b) {
            case 0:
                this.f283376c.f283398l.accept(((InlineAction.InlineFilter) this.f283377d).f283110d);
                break;
            case 1:
                this.f283376c.f283398l.accept(((InlineAction.InlineFilter) this.f283377d).f283110d);
                break;
            case 2:
                this.f283376c.f283396j.accept(((InlineAction.Predefined) this.f283377d).f283115f);
                break;
            case 3:
                DeepLink deepLink = ((InlineAction.Predefined) this.f283377d).f283115f;
                if (deepLink != null) {
                    this.f283376c.f283396j.accept(deepLink);
                    break;
                }
                break;
            case 4:
                this.f283376c.f283396j.accept(((InlineAction.Predefined) this.f283377d).f283115f);
                break;
            default:
                DeepLink deepLink2 = ((InlineAction.Predefined) this.f283377d).f283115f;
                if (deepLink2 != null) {
                    this.f283376c.f283396j.accept(deepLink2);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC34987d(C34989f c34989f, InlineAction inlineAction, int i12) {
        this.f283375b = i12;
        this.f283376c = c34989f;
        this.f283377d = inlineAction;
    }
}
