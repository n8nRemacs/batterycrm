package com.avito.android.gallery.ui.adapter;

import Y41.l;
import android.os.Bundle;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class f extends N implements l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Image f159271l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f159272m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f159273n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Image image, boolean z12, Integer num) {
        super(1);
        this.f159271l = image;
        this.f159272m = z12;
        this.f159273n = num;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putParcelable("image", this.f159271l);
        bundle2.putBoolean("crop", this.f159272m);
        Integer num = this.f159273n;
        if (num != null) {
            bundle2.putInt("scaleType", num.intValue());
        }
        return G0.f406611a;
    }
}
