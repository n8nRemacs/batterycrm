package com.avito.android.publish.items.video_upload;

import android.graphics.drawable.Animatable;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: VideoUploadItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/video_upload/l;", "Lcom/facebook/drawee/controller/d;", "LYW0/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.facebook.drawee.controller.d<YW0.f> {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f237359c;

    public l(k kVar) {
        this.f237359c = kVar;
    }

    @Override // com.facebook.drawee.controller.d, com.facebook.drawee.controller.e
    public final void f(String str, Object obj, Animatable animatable) {
        YW0.f fVar = (YW0.f) obj;
        if (fVar != null) {
            k kVar = this.f237359c;
            if (kVar.f237323L) {
                return;
            }
            SimpleDraweeView simpleDraweeView = kVar.f237318G;
            D6.B(new m(fVar, simpleDraweeView, kVar), simpleDraweeView);
            kVar.f237323L = true;
        }
    }
}
