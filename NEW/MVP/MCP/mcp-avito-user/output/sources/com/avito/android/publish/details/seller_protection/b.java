package com.avito.android.publish.details.seller_protection;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.C;
import com.google.firebase.components.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b implements C, f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f234934b;

    public /* synthetic */ b(Object obj) {
        this.f234934b = obj;
    }

    @Override // com.google.firebase.components.f
    public Object a(com.google.firebase.components.c cVar) {
        return this.f234934b;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [Y41.l, java.lang.Object] */
    @Override // androidx.fragment.app.C
    public void k(Bundle bundle, String str) {
        Object serializable;
        if (Build.VERSION.SDK_INT >= 33) {
            serializable = bundle.getSerializable("seller_protection_result_key", SellerProtectionDialogResult.class);
        } else {
            Object serializable2 = bundle.getSerializable("seller_protection_result_key");
            if (!(serializable2 instanceof SellerProtectionDialogResult)) {
                serializable2 = null;
            }
            serializable = (SellerProtectionDialogResult) serializable2;
        }
        SellerProtectionDialogResult sellerProtectionDialogResult = (SellerProtectionDialogResult) serializable;
        if (sellerProtectionDialogResult != null) {
            this.f234934b.invoke(sellerProtectionDialogResult);
        }
    }
}
