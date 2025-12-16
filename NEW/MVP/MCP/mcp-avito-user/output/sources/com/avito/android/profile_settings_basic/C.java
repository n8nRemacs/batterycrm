package com.avito.android.profile_settings_basic;

import Qb0.InterfaceC14878a;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.profile_settings_basic.K;
import com.avito.android.remote.model.AvatarShape;
import javax.inject.Inject;
import jb0.InterfaceC42346a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BasicProfileSettingsRouter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/C;", "Lcom/avito/android/profile_settings_basic/A;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class C implements A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fragment f228533a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PhotoPickerIntentFactory f228534b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f228535c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14878a, G0> f228536d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<K.a> f228537e;

    @Inject
    public C(@Y61.k Y41.l lVar, @Y61.k Fragment fragment, @Y61.k PhotoPickerIntentFactory photoPickerIntentFactory, @Y61.k @InterfaceC42346a String str) {
        this.f228533a = fragment;
        this.f228534b = photoPickerIntentFactory;
        this.f228535c = str;
        this.f228536d = lVar;
        this.f228537e = fragment.registerForActivityResult(new B(this), new L91.o(this, 23));
    }

    @Override // com.avito.android.profile_settings_basic.A
    public final void a(@Y61.k AvatarShape avatarShape) {
        this.f228537e.b(new K.a(avatarShape));
    }
}
