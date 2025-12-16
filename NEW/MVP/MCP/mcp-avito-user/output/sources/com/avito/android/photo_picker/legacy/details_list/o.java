package com.avito.android.photo_picker.legacy.details_list;

import android.net.Uri;
import android.view.View;
import com.avito.android.R;
import com.avito.android.device_orientation.c;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.K4;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: PreviewItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/legacy/details_list/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_picker/legacy/details_list/n;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f219661b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f219662c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f219663d;

    public o(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.photo_preview);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f219661b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.progress_overlay);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f219662c = viewFindViewById2;
    }

    @Override // com.avito.android.photo_picker.legacy.details_list.n
    public final void J3(boolean z12) {
        D6.G(this.f219662c, z12);
    }

    @Override // com.avito.android.photo_picker.legacy.details_list.n
    public final void Km(@Y61.k Uri uri, @Y61.k com.avito.android.device_orientation.c cVar) {
        K4 eVar;
        SimpleDraweeView simpleDraweeView = this.f219661b;
        D6.H(simpleDraweeView);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uri);
        if (cVar instanceof c.a) {
            eVar = new K4.a();
        } else if (cVar instanceof c.b) {
            eVar = new K4.b();
        } else if (cVar instanceof c.C4199c) {
            eVar = new K4.c();
        } else if (cVar instanceof c.d) {
            eVar = new K4.d();
        } else {
            if (!(cVar instanceof c.e)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = new K4.e();
        }
        aVarA.f169489g = eVar;
        aVarA.c();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f219663d;
        if (aVar != null) {
            ((j) aVar).invoke();
        }
    }

    @Override // com.avito.android.photo_picker.legacy.details_list.n
    public final void p0() {
        D6.g(this.f219661b);
    }

    @Override // com.avito.android.photo_picker.legacy.details_list.n
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f219663d = aVar;
    }
}
