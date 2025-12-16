package com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image;

import android.graphics.BitmapFactory;
import android.util.Base64;
import com.avito.android.util.V2;
import java.util.concurrent.Callable;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class h implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f245180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f245181c;

    public /* synthetic */ h(String str, int i12) {
        this.f245180b = i12;
        this.f245181c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f245181c;
        switch (this.f245180b) {
            case 0:
                byte[] bArrDecode = Base64.decode(str, 0);
                return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            default:
                int i12 = com.avito.android.push.impl_module.token.providing.a.f245979e;
                V2.f318762a.c("CompositePushTokenProvider", AK.c.s(new StringBuilder("["), str, "] getPushToken()"), null);
                return G0.f406611a;
        }
    }
}
