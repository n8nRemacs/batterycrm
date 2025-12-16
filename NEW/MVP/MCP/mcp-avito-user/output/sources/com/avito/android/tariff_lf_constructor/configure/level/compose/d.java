package com.avito.android.tariff_lf_constructor.configure.level.compose;

import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35949t5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mD0.C43950b;

/* compiled from: ConstructorConfigureLevelItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/fresco/SimpleDraweeView;", "view", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/fresco/SimpleDraweeView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements Y41.l<SimpleDraweeView, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C43950b f299758l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C43950b c43950b) {
        super(1);
        this.f299758l = c43950b;
    }

    @Override // Y41.l
    public final G0 invoke(SimpleDraweeView simpleDraweeView) {
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(this.f299758l.f414414b);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(aVarB);
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.c();
        return G0.f406611a;
    }
}
