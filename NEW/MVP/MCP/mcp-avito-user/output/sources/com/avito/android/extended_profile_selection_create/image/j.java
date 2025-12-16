package com.avito.android.extended_profile_selection_create.image;

import androidx.fragment.app.Fragment;
import com.avito.android.authorization.auth.C28629h;
import com.avito.android.extended_profile_image_edit.ExtendedProfileImageEditConfig;
import com.avito.android.extended_profile_image_edit.t;
import com.avito.android.extended_profile_selection_create.image.o;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import javax.inject.Inject;
import jb0.InterfaceC42346a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSetSelectionImageRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/j;", "Lcom/avito/android/extended_profile_selection_create/image/g;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fragment f151741a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PhotoPickerIntentFactory f151742b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final t f151743c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f151744d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<JA.a, G0> f151745e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<o.a> f151746f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<ExtendedProfileImageEditConfig> f151747g;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@Y61.k Fragment fragment, @Y61.k PhotoPickerIntentFactory photoPickerIntentFactory, @Y61.k t tVar, @Y61.k @InterfaceC42346a String str, @Y61.k Y41.l<? super JA.a, G0> lVar) {
        this.f151741a = fragment;
        this.f151742b = photoPickerIntentFactory;
        this.f151743c = tVar;
        this.f151744d = str;
        this.f151745e = lVar;
        this.f151746f = fragment.registerForActivityResult(new i(this), new C28629h(0));
        this.f151747g = fragment.registerForActivityResult(new h(this), new C28629h(0));
    }

    @Override // com.avito.android.extended_profile_selection_create.image.g
    public final void a(@Y61.k ExtendedProfileImageEditConfig extendedProfileImageEditConfig) {
        this.f151747g.b(extendedProfileImageEditConfig);
    }

    @Override // com.avito.android.extended_profile_selection_create.image.g
    public final void b(@Y61.k String str) {
        this.f151746f.b(new o.a(str));
    }
}
