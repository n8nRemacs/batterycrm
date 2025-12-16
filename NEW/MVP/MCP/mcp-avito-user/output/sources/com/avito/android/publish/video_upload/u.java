package com.avito.android.publish.video_upload;

import android.net.Uri;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VideoUploadViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$J;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/category_parameters/ParameterElement$J;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class u extends N implements Y41.l<ParameterElement.J, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f245602l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Uri f245603m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f245604n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar, Uri uri, boolean z12) {
        super(1);
        this.f245602l = sVar;
        this.f245603m = uri;
        this.f245604n = z12;
    }

    @Override // Y41.l
    public final G0 invoke(ParameterElement.J j12) {
        s sVar = this.f245602l;
        sVar.Ka(j12);
        sVar.f245585S = null;
        sVar.me(this.f245604n, this.f245603m);
        return G0.f406611a;
    }
}
