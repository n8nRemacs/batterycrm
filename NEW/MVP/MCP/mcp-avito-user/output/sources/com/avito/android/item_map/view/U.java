package com.avito.android.item_map.view;

import android.app.Activity;
import android.content.DialogInterface;
import com.avito.android.deep_linking.links.PhoneLink;
import iR.C41336a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class U implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f173542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f173543c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f173544d;

    public /* synthetic */ U(int i12, Object obj, Object obj2) {
        this.f173542b = i12;
        this.f173544d = obj;
        this.f173543c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i12) {
        switch (this.f173542b) {
            case 0:
                C41336a.C11375a.a();
                ((V) this.f173544d).f173573h.ob((PhoneLink) this.f173543c);
                break;
            case 1:
                C41336a.C11375a.a();
                ((com.avito.android.photo_gallery.A) this.f173544d).f216469f.ob((PhoneLink) this.f173543c);
                break;
            default:
                ru.cyberity.cbr.core.android.a.a((Y41.a) this.f173544d, (Activity) this.f173543c, dialogInterface, i12);
                break;
        }
    }
}
