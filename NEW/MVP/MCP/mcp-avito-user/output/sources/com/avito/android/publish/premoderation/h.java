package com.avito.android.publish.premoderation;

import android.widget.Button;
import androidx.compose.runtime.internal.P;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.AdvertDuplicateResult;
import com.avito.android.remote.model.AdvertImage;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P5;
import com.avito.android.util.rx3.C35896f0;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDuplicatePresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/premoderation/h;", "Lcom/avito/android/publish/premoderation/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f238302a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AdvertDuplicateResult f238303b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public AdvertDuplicateFragment f238304c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f238305d = new io.reactivex.rxjava3.disposables.c();

    public h(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k AdvertDuplicateResult advertDuplicateResult) {
        this.f238302a = interfaceC35745a5;
        this.f238303b = advertDuplicateResult;
    }

    @Override // com.avito.android.publish.premoderation.d
    public final void a(@Y61.k AdvertDuplicateFragment advertDuplicateFragment) {
        this.f238304c = advertDuplicateFragment;
    }

    @Override // com.avito.android.publish.premoderation.d
    public final void b(@Y61.k j jVar) {
        AdvertDuplicateResult advertDuplicateResult = this.f238303b;
        I5.a(jVar.f238307b, advertDuplicateResult.getTitle(), false);
        I5.a(jVar.f238308c, advertDuplicateResult.getDescription(), false);
        I5.a(jVar.f238309d, advertDuplicateResult.getHint(), false);
        SerpAdvert item = advertDuplicateResult.getItem();
        AdvertImage image = item.getImage();
        com.avito.android.image_loader.a aVarA = com.avito.android.image_loader.b.a(image != null ? image.getImage() : null);
        ImageRequest.a aVarA2 = C35949t5.a(jVar.f238310e);
        aVarA2.d(aVarA);
        aVarA2.c();
        I5.a(jVar.f238311f, item.getTitle(), false);
        I5.a(jVar.f238312g, item.getPrice(), false);
        String title = advertDuplicateResult.getAction().getTitle();
        Button button = jVar.f238313h;
        button.setText(title);
        String skipActionTitle = advertDuplicateResult.getSkipActionTitle();
        com.avito.android.lib.deprecated_design.button.c cVar = jVar.f238314i;
        cVar.b(skipActionTitle);
        z<G0> zVarA = C37722i.a(button);
        InterfaceC35745a5 interfaceC35745a5 = this.f238302a;
        y yVarG = C35896f0.g(zVarA.x0(interfaceC35745a5.e()), new e(this, advertDuplicateResult));
        io.reactivex.rxjava3.disposables.c cVar2 = this.f238305d;
        cVar2.b(yVarG);
        cVar2.b(C35896f0.g(com.avito.android.lib.deprecated_design.button.g.a(cVar).x0(interfaceC35745a5.e()), new f(this)));
        cVar2.b(C35896f0.g(P5.g(jVar.f238306a).x0(interfaceC35745a5.e()), new g(this)));
    }

    @Override // com.avito.android.publish.premoderation.d
    public final void c0() {
        this.f238304c = null;
    }

    @Override // com.avito.android.publish.premoderation.d
    public final void e0() {
        this.f238305d.e();
    }
}
