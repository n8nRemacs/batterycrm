package com.avito.android.photo_picker.camera_mvi;

import Y41.l;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.CameraState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import m.C43852a;

/* compiled from: CameraFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CameraFragment f219098l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CameraState f219099m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CameraFragment cameraFragment, CameraState cameraState) {
        super(1);
        this.f219098l = cameraFragment;
        this.f219099m = cameraState;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) throws Resources.NotFoundException {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        contentPlaceholder2.setAppearance(R.style.CameraInversePlaceholder);
        CameraFragment cameraFragment = this.f219098l;
        Context contextRequireContext = cameraFragment.requireContext();
        Configuration configuration = contextRequireContext.getResources().getConfiguration();
        configuration.uiMode = (configuration.uiMode & (-49)) | 32;
        contentPlaceholder2.setImageDrawable(C43852a.a(contextRequireContext.createConfigurationContext(configuration), R.drawable.placeholders_img_general_error));
        CameraState cameraState = this.f219099m;
        contentPlaceholder2.setTitle(((CameraState.a.C6586a) cameraState.f219145a).f219172a.k0(cameraFragment.requireContext()));
        contentPlaceholder2.setSubtitle(((CameraState.a.C6586a) cameraState.f219145a).f219173b.k0(cameraFragment.requireContext()));
        return G0.f406611a;
    }
}
