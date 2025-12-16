package com.avito.android.component.advert_contact_bar;

import android.view.View;
import com.avito.android.component.advert_contact_bar.ContactBar;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.component.advert_contact_bar.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC29554a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f125170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f125171c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ContactBar.Button.Action f125172d;

    public /* synthetic */ ViewOnClickListenerC29554a(Y41.l lVar, ContactBar.Button.Action action, int i12) {
        this.f125170b = i12;
        this.f125171c = lVar;
        this.f125172d = action;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f125170b) {
            case 0:
                this.f125171c.invoke(this.f125172d);
                break;
            case 1:
                this.f125171c.invoke(this.f125172d);
                break;
            case 2:
                this.f125171c.invoke(this.f125172d);
                break;
            case 3:
                this.f125171c.invoke(this.f125172d);
                break;
            case 4:
                ContactBar.Button.Action action = this.f125172d;
                if (!action.f125046j) {
                    this.f125171c.invoke(action);
                    break;
                }
                break;
            case 5:
                this.f125171c.invoke(this.f125172d);
                break;
            case 6:
                this.f125171c.invoke(this.f125172d);
                break;
            default:
                ContactBar.Button.Action action2 = this.f125172d;
                if (!action2.f125046j) {
                    this.f125171c.invoke(action2);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC29554a(ContactBar.Button.Action action, Y41.l lVar, int i12) {
        this.f125170b = i12;
        this.f125172d = action;
        this.f125171c = lVar;
    }
}
