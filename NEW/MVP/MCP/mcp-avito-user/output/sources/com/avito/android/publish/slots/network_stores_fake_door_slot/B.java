package com.avito.android.publish.slots.network_stores_fake_door_slot;

import android.net.Uri;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.publish.slots.network_stores_fake_door_slot.h;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: NetworkStoresFakeDoorSlotScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class B extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f244602l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(int i12) {
        super(2);
        this.f244602l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f244602l | 1);
        androidx.compose.runtime.B bE2 = a12.E(1750435560);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            h.b bVar = new h.b("Больше 20 сетей: федеральные и региональные", Boolean.FALSE, new UniversalImage(new Image(Collections.singletonMap(new Size(90, 90), Uri.parse("https://avito.st/static/ims/9c627aec-16d4-4703-8e0b-23f88c65773d_logopartners_light_light_90x90.png"))), new Image(Collections.singletonMap(new Size(90, 90), Uri.parse("https://avito.st/static/ims/9c627aec-16d4-4703-8e0b-23f88c65773d_logopartners_light_dark_90x90.png")))));
            C.a(new h("", "Заключите договор с сетевым арендатором", C42745f0.U(new h.a("Отправим объект напрямую тем, кто принимает решение об аренде.", "peoples"), new h.a("Отправим объект напрямую тем, кто принимает решение об аренде.", "peoples"), new h.a("Если они заинтересуются, свяжутся с вами в чате — в течение 24 часов.", "listItem")), C42745f0.U(bVar, bVar, bVar, bVar, bVar), null), bE2, 8);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new B(iA2);
        }
        return G0.f406611a;
    }
}
