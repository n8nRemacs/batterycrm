package com.avito.android.extended_profile_image_edit;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BannerImageEditView.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class l extends N implements Y41.a<Bitmap> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f151028l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar) {
        super(0);
        this.f151028l = qVar;
    }

    @Override // Y41.a
    public final Bitmap invoke() {
        return this.f151028l.f151115f.getCroppedBitmap();
    }
}
