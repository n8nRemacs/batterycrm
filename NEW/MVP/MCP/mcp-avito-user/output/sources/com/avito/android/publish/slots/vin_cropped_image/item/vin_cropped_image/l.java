package com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image;

import android.text.SpannableString;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.G;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: VinCroppedImageItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/vin_cropped_image/item/vin_cropped_image/l;", "Lcom/avito/android/publish/slots/vin_cropped_image/item/vin_cropped_image/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f245186b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f245187c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<f> f245188d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f245189e;

    @Inject
    public l(@Y61.k b bVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f245186b = bVar;
        this.f245187c = interfaceC35745a5;
        com.jakewharton.rxrelay3.c<f> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f245188d = cVar;
        this.f245189e = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        int I12;
        n nVar = (n) eVar;
        f fVar = (f) aVar;
        G g12 = new G(new h(fVar.f245177b, 0));
        InterfaceC35745a5 interfaceC35745a5 = this.f245187c;
        g12.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new j(nVar), new k(nVar));
        i iVar = new i(this, fVar);
        this.f245186b.getClass();
        String str = fVar.f245178c;
        if (str == null) {
            str = null;
        } else {
            String str2 = fVar.f245179d;
            if (str2 != null && (I12 = C43066x.I(str, str2, 0, false, 6)) != -1) {
                int length = str2.length() + I12;
                a aVar2 = new a(iVar);
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(aVar2.getUnderlying(), I12, length, 33);
                str = spannableString;
            }
        }
        nVar.BQ(str);
    }

    @Override // com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.g
    @Y61.k
    /* renamed from: e1, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF245189e() {
        return this.f245189e;
    }
}
