package com.avito.android.extended_profile_universal_widget_edit.edit_block;

import androidx.fragment.app.Fragment;
import com.avito.android.authorization.auth.C28629h;
import com.avito.android.extended_profile_image_edit.ExtendedProfileImageEditConfig;
import com.avito.android.extended_profile_image_edit.t;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.a;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import javax.inject.Inject;
import jb0.InterfaceC42346a;
import kB.InterfaceC42561a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalWidgetImageRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/p;", "Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/m;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fragment f154113a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PhotoPickerIntentFactory f154114b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final t f154115c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f154116d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC42561a, G0> f154117e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<a.C4497a> f154118f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<ExtendedProfileImageEditConfig> f154119g;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public p(@Y61.k Fragment fragment, @Y61.k PhotoPickerIntentFactory photoPickerIntentFactory, @Y61.k t tVar, @Y61.k @InterfaceC42346a String str, @Y61.k Y41.l<? super InterfaceC42561a, G0> lVar) {
        this.f154113a = fragment;
        this.f154114b = photoPickerIntentFactory;
        this.f154115c = tVar;
        this.f154116d = str;
        this.f154117e = lVar;
        this.f154118f = fragment.registerForActivityResult(new o(this), new C28629h(0));
        this.f154119g = fragment.registerForActivityResult(new n(this), new C28629h(0));
    }

    @Override // com.avito.android.extended_profile_universal_widget_edit.edit_block.m
    public final void a(@Y61.k ExtendedProfileImageEditConfig extendedProfileImageEditConfig) {
        this.f154119g.b(extendedProfileImageEditConfig);
    }

    @Override // com.avito.android.extended_profile_universal_widget_edit.edit_block.m
    public final void b(@Y61.k String str) {
        this.f154118f.b(new a.C4497a(str));
    }
}
