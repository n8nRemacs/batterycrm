package com.avito.android.extended_profile_selection_create.image.mvi;

import JA.a;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.extended_profile_image_edit.ExtendedProfileImageEditConfig;
import com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageConfig;
import com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileSetSelectionImageActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LJA/a;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "LJA/c;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.arch.mvi.a<JA.a, ExtendedProfileSetSelectionImageInternalAction, JA.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f151763a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSetSelectionImageConfig f151764b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_selection_create.image.e f151765c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_management_core.images.a f151766d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final E f151767e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f151768f;

    @Inject
    public d(@Y61.k Resources resources, @Y61.k ExtendedProfileSetSelectionImageConfig extendedProfileSetSelectionImageConfig, @Y61.k com.avito.android.extended_profile_selection_create.image.e eVar, @Y61.k com.avito.android.profile_management_core.images.a aVar, @Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f151763a = resources;
        this.f151764b = extendedProfileSetSelectionImageConfig;
        this.f151765c = eVar;
        this.f151766d = aVar;
        this.f151767e = e12;
        this.f151768f = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ExtendedProfileSetSelectionImageInternalAction> b(JA.a aVar, JA.c cVar) {
        String strA;
        JA.a aVar2 = aVar;
        JA.c cVar2 = cVar;
        boolean z12 = aVar2 instanceof a.b;
        boolean z13 = cVar2.f8840d;
        InterfaceC28373a interfaceC28373a = this.f151768f;
        E e12 = this.f151767e;
        ExtendedProfileSetSelectionImageConfig extendedProfileSetSelectionImageConfig = this.f151764b;
        if (z12) {
            if (z13) {
                String strA2 = e12.a();
                if (strA2 != null) {
                    interfaceC28373a.c(new IA.b(strA2, true, extendedProfileSetSelectionImageConfig.f151629e));
                }
                return this.f151765c.b();
            }
            if (!extendedProfileSetSelectionImageConfig.f151629e && (strA = e12.a()) != null) {
                interfaceC28373a.c(new IA.b(strA, true, false));
            }
            return new C43210w(ExtendedProfileSetSelectionImageInternalAction.CloseScreen.f151769b);
        }
        if (aVar2 instanceof a.e) {
            return new C43210w(new ExtendedProfileSetSelectionImageInternalAction.ImageUpdate(null));
        }
        if (aVar2 instanceof a.f) {
            String strA3 = e12.a();
            if (strA3 != null) {
                interfaceC28373a.c(new IA.a(strA3, extendedProfileSetSelectionImageConfig.f151629e));
            }
            return new C43210w(new ExtendedProfileSetSelectionImageInternalAction.OpenPhotoPicker(extendedProfileSetSelectionImageConfig.f151626b));
        }
        if (aVar2 instanceof a.d) {
            String str = extendedProfileSetSelectionImageConfig.f151626b;
            Resources resources = this.f151763a;
            return new C43210w(new ExtendedProfileSetSelectionImageInternalAction.OpenImageEditor(new ExtendedProfileImageEditConfig(str, 936, 936, false, resources.getString(R.string.extended_profile_set_selection_image_edit_warning_header), resources.getString(R.string.extended_profile_set_selection_image_edit_warning_body, 936, 936), resources.getString(R.string.extended_profile_set_selection_image_editor_save_button), resources.getString(R.string.extended_profile_set_selection_image_editor_cancel_button), 8, null)));
        }
        if (aVar2 instanceof a.c) {
            return C43175k.G(new c(this, ((a.c) aVar2).f8826a, null));
        }
        if (!(aVar2 instanceof a.C0513a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z13) {
            return new C43210w(ExtendedProfileSetSelectionImageInternalAction.CloseScreen.f151769b);
        }
        UploadImage.ImageFromPhotoPicker imageFromPhotoPicker = cVar2.f8839c;
        if (imageFromPhotoPicker == null) {
            return C43175k.w();
        }
        String strA4 = e12.a();
        if (strA4 != null) {
            interfaceC28373a.c(new IA.b(strA4, false, extendedProfileSetSelectionImageConfig.f151629e));
        }
        return new a(this.f151766d.f(imageFromPhotoPicker, new b(this)));
    }
}
