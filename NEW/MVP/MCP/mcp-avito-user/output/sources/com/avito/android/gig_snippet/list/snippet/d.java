package com.avito.android.gig_snippet.list.snippet;

import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import gw.InterfaceC40743a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImageLoadableExtension.kt */
@s0
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"DM/l", "Lcom/bumptech/glide/request/target/g;", "Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", "_common_image-loader-glide_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d extends com.bumptech.glide.request.target.g<View, Drawable> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40743a f161054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f161055e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(InterfaceC40743a interfaceC40743a, f fVar) {
        super((View) interfaceC40743a);
        this.f161054d = interfaceC40743a;
        this.f161055e = fVar;
    }

    @Override // com.bumptech.glide.request.target.q
    public final void c(Object obj, com.bumptech.glide.request.transition.f fVar) {
        this.f161054d.setImage((Drawable) obj);
    }

    @Override // com.bumptech.glide.request.target.q
    public final void g(@l Drawable drawable) {
        this.f161055e.f161066h.setVisibility(8);
    }
}
